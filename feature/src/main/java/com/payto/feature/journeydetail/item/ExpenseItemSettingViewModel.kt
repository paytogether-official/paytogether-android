package com.payto.feature.journeydetail.item

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.common.ext.safeDiv
import com.payto.common.ext.toLocalDate
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.feature.journey.ClickAddExpense
import com.payto.feature.journey.JourneyEvent
import com.payto.feature.journey.OnCategoryDescriptionChange
import com.payto.feature.journey.OnChangeCurrency
import com.payto.feature.journey.OnChangeOrder
import com.payto.feature.journey.OnClickClose
import com.payto.feature.journey.OnClickDate
import com.payto.feature.journey.OnClickUpdateExpenseItem
import com.payto.feature.journey.OnExpenseAmountChange
import com.payto.feature.journey.OnExpenseCategoryChange
import com.payto.feature.journey.OnExpenseDateChange
import com.payto.feature.journey.OnExpenseModeChange
import com.payto.feature.journey.OnMemoChange
import com.payto.model.ExpenseParams
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyModel
import com.payto.model.asMemberAmountList
import com.payto.model.navigate.ExpenseItemSetting
import com.payto.model.updateMemberAmount
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class ExpenseItemSettingViewModel @Inject constructor(
    stateHandle: SavedStateHandle,
    private val repository: JourneyRepository,
) : BaseViewModel() {

    val route = stateHandle.toRoute<ExpenseItemSetting>()

    val journeyData = MutableStateFlow<JourneyModel?>(null)

    init {
        setInitData()
    }

    fun setInitData() {
        viewModelScope.launch {
            runCatching {
                val data = fetchInitData()
                journeyData.value = data
            }.onFailure {
                showSnackbar("오류가 발생했습니다.", ShowSnackbar.Status.FAIL)
            }
        }
    }

    private suspend fun fetchInitData() = withContext(Dispatchers.IO) {
        val journeyInfo = repository.getJourneyInfoData(route.journeyId, "KRW")
        val expenseDeferred = async {
            repository.getExpenseItemInfo(
                id = route.journeyId,
                expenseId = route.expenseId,
                quoteCurrency = journeyInfo.baseCurrency,
            )
        }
        val payerDeferred = async { repository.getJourneyPayer(route.journeyId) }

        val payer = payerDeferred.await()
        val expenseData = expenseDeferred.await()

        val expenseModel = JourneyExpenseModel(
            payer = payer,
            membersAmount = expenseData.asMemberAmountList(),
            expenseDate = expenseData.expenseDate,
            category = expenseData.category,
            categoryDescription = expenseData.categoryDescription,
            amount = expenseData.amount,
            memo = expenseData.memo,
            id = expenseData.id,
            quoteCurrency = expenseData.quoteCurrency,
            baseCurrency = expenseData.baseCurrency
        )
        JourneyModel(
            infoModel = journeyInfo,
            createExpenseModel = expenseModel,
            params = journeyData.value?.params ?: ExpenseParams()
        )
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

            is OnCategoryDescriptionChange -> {
                val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
                journeyData.value = journeyData.value?.copy(
                    createExpenseModel = expenseModel.copy(categoryDescription = event.description)
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
                    createExpenseModel = expenseModel.copy(expenseDate = event.dateMillis?.toLocalDate())
                )
            }

            is OnExpenseModeChange -> {
                when (event.splitMode) {
                    OnExpenseAmountChange.SplitMode.EQUAL -> equalAmount(
                        journeyData.value?.createExpenseModel?.amount ?: ""
                    )

                    OnExpenseAmountChange.SplitMode.CUSTOM -> equalAmount("")
                }
            }

            is OnChangeCurrency -> {
                journeyData.value = journeyData.value?.updateCurrency(event.currency)
                setInitData()
            }

            is OnChangeOrder -> {
                journeyData.value = journeyData.value?.updateOrder(event.order)
                setInitData()
            }

            OnClickClose -> {
                closeJourney()
            }

            is OnClickDate -> {
                journeyData.value = journeyData.value?.updateDate(event.date)
                setInitData()
            }

            is OnClickUpdateExpenseItem -> {
                updateExpense()
            }

            else -> {}
        }
    }

    private fun updateExpense() {
        viewModelScope.launch {
            runCatching {
                journeyData.value?.let {
                    repository.updateJourneyExpense(it)
                    setInitData()
                    showSnackbar("지출이 수정되었습니다.", ShowSnackbar.Status.SUCCESS)
                }
            }.onFailure {
                showSnackbar("오류가 발생했습니다.", ShowSnackbar.Status.FAIL)
            }
        }
    }

    private fun customAmount(amount: String, memberName: String) {
        val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
        val amount = amount.filter { it.isDigit() }.takeIf { it.isNotEmpty() }
        journeyData.value = journeyData.value?.copy(
            createExpenseModel = expenseModel.updateMemberAmount(memberName, amount)
        )
    }

    private fun equalAmount(amount: String) {
        val expenseModel = journeyData.value?.createExpenseModel ?: JourneyExpenseModel()
        val totalAmount = amount.filter { it.isDigit() }.takeIf { it.isNotEmpty() }

        journeyData.value = journeyData.value?.copy(
            createExpenseModel = expenseModel.copy(
                amount = totalAmount,
                membersAmount = expenseModel.membersAmount.map {
                    it.copy(amount = totalAmount?.safeDiv(expenseModel.membersAmount.size))
                }
            )
        )
    }

    private fun closeJourney() {
        viewModelScope.launch {
            runCatching {
                repository.closeJourney(route.journeyId)
            }.onSuccess {
                // TODO 여정 결과로 이동
            }
        }
    }
}