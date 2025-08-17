package com.payto.feature.journeyhistory

import androidx.lifecycle.viewModelScope
import com.payto.data.repository.JourneyHistoryRepository
import com.payto.feature.common.arch.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class JourneyHistoryViewModel @Inject constructor(
    private val repository: JourneyHistoryRepository,
) : BaseViewModel() {

    val journeyHistoryList =
        repository.getJourneyHistoryList()
            .stateIn(viewModelScope, SharingStarted.Eagerly, null)

}