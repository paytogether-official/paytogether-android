package com.payto.feature.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.payto.data.repository.OngoingJourneyRepository
import com.payto.feature.common.EventInterface
import com.payto.feature.common.SideEffectEvent
import com.payto.feature.common.UiEvent
import com.payto.model.JourneyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: OngoingJourneyRepository,
) : ViewModel(), EventInterface {

    private val _sideEffectEvent = MutableSharedFlow<SideEffectEvent>()
    override val sideEffectEvent: SharedFlow<SideEffectEvent> = _sideEffectEvent

    val ongoingJourneys = MutableStateFlow(emptyList<JourneyModel>())

    fun getOngoingJourneys() {
        viewModelScope.launch {
            runCatching {
                repository.getOngoingJourney()
            }.onSuccess {
                ongoingJourneys.value = it
            }.onFailure {
                Log.e("HomeViewModel", "getOngoingJourneys: ", it)
            }
        }
    }

    override fun onEvent(event: UiEvent) {

    }
}
