package com.payto.feature.journeydetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.model.navigate.JourneyDetail
import com.payto.data.repository.JourneyRepository
import com.payto.feature.common.PopBackStack
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.feature.journey.OnChangeCurrency
import com.payto.feature.journey.OnChangeOrder
import com.payto.feature.journey.OnClickDate
import com.payto.feature.journey.OnDeleteJourney
import com.payto.model.ExpenseParams
import com.payto.model.JourneyDetailModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class JourneyDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: JourneyRepository,
) : BaseViewModel() {

    private val route = savedStateHandle.toRoute<JourneyDetail>()

    val model = MutableStateFlow<JourneyDetailModel?>(null)

    init {
        fetchInitData()
    }

    override fun onEvent(event: UiEvent) {
        when (event) {
            is OnChangeOrder -> {
                model.value = model.value?.updateOrder(event.order)
                fetchInitData()
            }

            is OnChangeCurrency -> {
                model.value = model.value?.updateCurrency(event.currency)
                fetchInitData()
            }

            is OnClickDate -> {
                model.value = model.value?.updateDate(event.date)
                fetchInitData()
            }

            is OnDeleteJourney -> {
                deleteJourney(event.journeyId)
            }
        }
    }

    private fun fetchInitData() {
        viewModelScope.launch {
            runCatching {
                fetchData()
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    private suspend fun fetchData() = withContext(Dispatchers.IO) {
        val journeyInfoDeferred = async {
            repository.getJourneyInfoData(
                route.journeyId,
                model.value?.params?.quoteCurrency ?: "KRW"
            )
        }
        val expenseListDeferred = async {
            repository.getExpenses(
                id = route.journeyId,
                params = model.value?.params
            )
        }

        val journeyInfo = journeyInfoDeferred.await()
        val detailInfoList = expenseListDeferred.await()

        model.value = JourneyDetailModel(
            journeyInfo = journeyInfo,
            list = detailInfoList,
            params = model.value?.params ?: ExpenseParams()
        )
    }

    private fun deleteJourney(journeyId: String) {
        viewModelScope.launch {
            runCatching {
                repository.deleteJourney(journeyId)
                sendSideEffectEvent(PopBackStack)
            }.onFailure {
                showErrorMessage()
            }
        }
    }
}
