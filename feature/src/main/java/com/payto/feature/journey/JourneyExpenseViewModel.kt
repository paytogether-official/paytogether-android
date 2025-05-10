package com.payto.feature.journey

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.common.navigate.Journey
import com.payto.data.repository.JourneyRepository
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
        getJourneyInfoData()
    }

    private fun getJourneyInfoData() {
        viewModelScope.launch {
            runCatching {
                val journeyInfo = repository.getJourneyInfoData(journey.journeyId)
                journeyData.value = JourneyModel(journeyInfo)
            }.onFailure {
                // TODO
            }
        }
    }


    override fun onEvent(event: UiEvent) {
        if (event !is JourneyEvent) return

        when (event) {
            is OnExpenseAmountChange -> {
                val expenseModel = journeyData.value?.expenseModel ?: JourneyExpenseModel()
                journeyData.value = journeyData.value?.copy(
                    expenseModel = expenseModel.copy(
                        amount = event.amount.filter { it.isDigit() }.toDoubleOrNull()
                    )
                )
            }
        }
    }
}
