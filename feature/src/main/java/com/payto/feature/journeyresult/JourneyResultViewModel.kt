package com.payto.feature.journeyresult

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.model.navigate.JourneyResult
import com.payto.data.repository.ResultRepository
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.feature.journey.OnChangeCurrency
import com.payto.model.JourneyResultModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JourneyResultViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: ResultRepository
) : BaseViewModel() {
    private val route = savedStateHandle.toRoute<JourneyResult>()

    val model = MutableStateFlow<JourneyResultModel?>(null)

    init {
        fetchData(route.quoteCurrency)
    }

    override fun onEvent(event: UiEvent) {
        when (event) {
            is OnChangeCurrency -> {
                fetchData(event.currency)
            }
        }
    }

    private fun fetchData(quoteCurrency: String) {
        viewModelScope.launch {
            runCatching {
                val data = repository.getSettlement(route.journeyId, quoteCurrency)
                model.value = data
            }.onFailure {
                showErrorMessage()
            }
        }
    }
}
