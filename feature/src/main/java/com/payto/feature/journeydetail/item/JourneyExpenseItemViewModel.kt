package com.payto.feature.journeydetail.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.common.navigate.JourneyExpenseItemDetail
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.JourneyExpenseModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JourneyExpenseItemViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: JourneyRepository,
) : BaseViewModel() {
    private val data = savedStateHandle.toRoute<JourneyExpenseItemDetail>()
    val item = MutableStateFlow(
        JourneyExpenseModel()
    )

    init {
        fetchExpense()
    }

    private fun fetchExpense() {
        viewModelScope.launch {
            runCatching {
                item.value = repository.getExpenseItemInfo(data.journeyId, data.expenseId)
            }.onFailure {
                showErrorMessage()
            }
        }
    }
}
