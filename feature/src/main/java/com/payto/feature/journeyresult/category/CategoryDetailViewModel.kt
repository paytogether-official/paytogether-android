package com.payto.feature.journeyresult.category

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.data.repository.CategoryDetailRepository
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.feature.journey.OnChangeCurrency
import com.payto.model.CategoryDetailModel
import com.payto.model.ExpenseParams
import com.payto.model.navigate.CategoryDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CategoryDetailViewModel @Inject constructor(
    saveStateHandle: SavedStateHandle,
    private val repository: CategoryDetailRepository,
    private val journeyRepository: JourneyRepository,
) : BaseViewModel() {

    private val route = saveStateHandle.toRoute<CategoryDetail>()
    private val params = MutableStateFlow<ExpenseParams>(
        ExpenseParams(
            quoteCurrency = route.quoteCurrency,
            category = route.category
        )
    )
    val model = MutableStateFlow<CategoryDetailModel?>(null)

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            runCatching {
                val categoryList = repository.getCategories(route.journeyId)
                val expenseInfoModel = repository.getExpenses(route.journeyId, params.value)
                val journeyInfo =
                    journeyRepository.getJourneyInfoData(route.journeyId, route.quoteCurrency)
                model.value = CategoryDetailModel(
                    id = route.journeyId,
                    baseCurrency = journeyInfo.baseCurrency,
                    params = params.value,
                    expenseInfoModel = expenseInfoModel,
                    categoryList = categoryList,
                )
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    private fun fetchExpensesData() {
        viewModelScope.launch {
            runCatching {
                val expenseParams = params.value
                val expenseInfoModel = repository.getExpenses(route.journeyId, expenseParams)
                model.value =
                    model.value?.copy(
                        expenseInfoModel = expenseInfoModel,
                        params = params.value
                    )
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    override fun onEvent(event: UiEvent) {
        when (event) {
            is OnChangeCategory -> {
                params.value = params.value.copy(category = event.category)
                fetchExpensesData()
            }

            is OnChangeCurrency -> {
                params.value = params.value.copy(quoteCurrency = event.currency)
                fetchExpensesData()
            }
        }
    }
}
