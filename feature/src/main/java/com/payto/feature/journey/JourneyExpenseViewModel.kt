package com.payto.feature.journey

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.common.ext.safeDiv
import com.payto.common.navigate.Journey
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JourneyExpenseViewModel @Inject constructor(
    stateHandle: SavedStateHandle,
    private val repository: JourneyRepository,
) : BaseViewModel() {

    val journey = stateHandle.toRoute<Journey>()

    val journeyData = MutableStateFlow<JourneyModel?>(null)

    init {
        setInitData()
    }

    private fun setInitData() {
        viewModelScope.launch {
            runCatching {
                val journeyInfo = repository.getJourneyInfoData(journey.journeyId)
                val payer = repository.getJourneyPayer(journey.journeyId)
                val expenseModel = JourneyExpenseModel(
                    payer = payer,
                    membersAmount = journeyInfo.members.map {
                        JourneyExpenseModel.MemberAmount(name = it.name)
                    }
                )
                journeyData.value = JourneyModel(journeyInfo, expenseModel)
            }.onFailure {
                showSnackbar("오류가 발생했습니다.", ShowSnackbar.Status.FAIL)
            }
        }
    }

    override fun onEvent(event: UiEvent) {
        if (event !is JourneyEvent) return

        when (event) {
            is OnExpenseAmountChange -> {
                val expenseModel = journeyData.value?.expenseModel ?: JourneyExpenseModel()
                val totalAmount = event.amount.filter { it.isDigit() }.toDoubleOrNull()

                journeyData.value = journeyData.value?.copy(
                    expenseModel = expenseModel.copy(
                        amount = totalAmount,
                        membersAmount = expenseModel.membersAmount.map {
                            it.copy(amount = totalAmount?.safeDiv(expenseModel.membersAmount.size.toDouble()))
                        }
                    )
                )
            }
        }
    }
}
