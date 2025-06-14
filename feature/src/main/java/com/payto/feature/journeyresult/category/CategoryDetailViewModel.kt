package com.payto.feature.journeyresult.category

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.model.navigate.CategoryDetail
import com.payto.data.repository.CategoryDetailRepository
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.CategoryDetailModel
import com.payto.model.ExpenseParams
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
    val params = MutableStateFlow<ExpenseParams>(
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
}
