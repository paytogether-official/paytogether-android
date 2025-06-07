package com.payto.feature.journeyhistory

import androidx.lifecycle.viewModelScope
import com.payto.data.repository.JourneyHistoryRepository
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.JourneyHistoryModel
import com.payto.model.JourneyInfoModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class JourneyHistoryViewModel @Inject constructor(
    private val repository: JourneyHistoryRepository,
) : BaseViewModel() {

    val journeyHistoryList = flow<List<JourneyHistoryModel>> {
        emit(getJourneyHistoryList())
    }.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    private suspend fun getJourneyHistoryList(): List<JourneyHistoryModel> {
        return repository.getJourneyHistoryList()
    }
}