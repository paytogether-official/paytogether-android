package com.payto.feature.journeysetting

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.data.repository.JourneySettingRepository
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.CreateJourneyModel
import com.payto.model.navigate.JourneySetting
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JourneySettingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    val repository: JourneySettingRepository,
) : BaseViewModel() {

    val route = savedStateHandle.toRoute<JourneySetting>()
    val journeyData = MutableStateFlow<CreateJourneyModel?>(null)

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            runCatching {
                repository.getJourneySettingData(route.journeyId)
            }.onSuccess {
                journeyData.value = it
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    override fun onEvent(event: UiEvent) {

    }
}
