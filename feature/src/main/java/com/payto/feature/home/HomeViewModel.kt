package com.payto.feature.home

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.payto.data.repository.OngoingJourneyRepository
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.JourneyInfoModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: OngoingJourneyRepository,
) : BaseViewModel() {

    val ongoingJourneys = MutableStateFlow(emptyList<JourneyInfoModel>())

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
}
