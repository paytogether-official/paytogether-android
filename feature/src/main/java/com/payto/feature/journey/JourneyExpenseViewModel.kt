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
import com.payto.model.asMemberAmountList
import com.payto.model.updateMemberAmount
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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
                val data = fetchInitData()
                delay(100)
                journeyData.value = data
            }.onFailure {
                showSnackbar("오류가 발생했습니다.", ShowSnackbar.Status.FAIL)
            }
        }
    }

    private suspend fun fetchInitData() = withContext(Dispatchers.IO) {
        val journeyInfoDeferred = async { repository.getJourneyInfoData(journey.journeyId) }
        val expenseListDeferred = async { repository.getExpenses(journey.journeyId) }
        val payerDeferred = async { repository.getJourneyPayer(journey.journeyId) }

        val journeyInfo = journeyInfoDeferred.await()
        val detailInfo = expenseListDeferred.await()
        val payer = payerDeferred.await()

        val expenseModel = JourneyExpenseModel(
            payer = payer,
            membersAmount = journeyInfo.asMemberAmountList()
        )
        JourneyModel(journeyInfo, expenseModel, detailInfo)
    }

    override fun onEvent(event: UiEvent) {
        if (event !is JourneyEvent) return

        when (event) {
            is OnExpenseAmountChange -> {
                when (event.splitMode) {
                    OnExpenseAmountChange.SplitMode.EQUAL -> equalAmount(event.amount)
                    OnExpenseAmountChange.SplitMode.CUSTOM -> customAmount(
                        event.amount,
                        event.memberName
                    )
                }
            }

            is OnExpenseCategoryChange -> {
                val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
                journeyData.value = journeyData.value?.copy(
                    createExpenseModel = expenseModel.copy(category = event.category)
                )
            }

            is OnMemoChange -> {
                val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
                journeyData.value = journeyData.value?.copy(
                    createExpenseModel = expenseModel.copy(memo = event.memo)
                )
            }

            is OnExpenseDateChange -> {
                val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
                journeyData.value = journeyData.value?.copy(
                    createExpenseModel = expenseModel.copy(expenseDateMillis = event.dateMillis)
                )
            }

            ClickAddExpense -> {
                addExpense()
            }

            is OnExpenseModeChange -> {
                when (event.splitMode) {
                    OnExpenseAmountChange.SplitMode.EQUAL -> equalAmount(journeyData.value?.createExpenseModel?.amount.toString())
                    OnExpenseAmountChange.SplitMode.CUSTOM -> equalAmount("")
                }
            }
        }
    }

    private fun addExpense() {
        viewModelScope.launch {
            runCatching {
                journeyData.value?.let {
                    repository.addJourneyExpense(it)
                    setInitData()
                    showSnackbar("지출이 추가되었습니다.", ShowSnackbar.Status.SUCCESS)
                }
            }.onFailure {
                showSnackbar("오류가 발생했습니다.", ShowSnackbar.Status.FAIL)
            }
        }
    }

    private fun customAmount(amount: String, memberName: String) {
        val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
        val amount = amount.filter { it.isDigit() }.toDoubleOrNull()
        journeyData.value = journeyData.value?.copy(
            createExpenseModel = expenseModel.updateMemberAmount(memberName, amount)
        )
    }

    private fun equalAmount(amount: String) {
        val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
        val totalAmount = amount.filter { it.isDigit() }.toDoubleOrNull()

        journeyData.value = journeyData.value?.copy(
            createExpenseModel = expenseModel.copy(
                amount = totalAmount,
                membersAmount = expenseModel.membersAmount.map {
                    it.copy(amount = totalAmount?.safeDiv(expenseModel.membersAmount.size.toDouble()))
                }
            )
        )
    }
}
