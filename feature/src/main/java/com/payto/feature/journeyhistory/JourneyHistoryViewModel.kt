package com.payto.feature.journeyhistory

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class JourneyHistoryViewModel @Inject constructor() : ViewModel() {

    val journeyHistoryList = flow<List<JourneyHistoryData>> {
        emit(getJourneyHistoryList())
    }.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    init {
        Log.e("흐흐", "JourneyHistoryViewModel init ${this.hashCode()}")
    }

    private suspend fun getJourneyHistoryList(): List<JourneyHistoryData> {
        delay(300)
        return listOf(
            JourneyHistoryData(
                date = "24년 2월",
                list = List((1..5).random()) {
                    JourneyHistoryInfo("title $it")
                }
            ),
            JourneyHistoryData(
                date = "24년 1월",
                list = List((1..5).random()) {
                    JourneyHistoryInfo("title $it")
                }
            ),
            JourneyHistoryData(
                date = "23년 12월",
                list = List((1..5).random()) {
                    JourneyHistoryInfo("title $it")
                }
            )
        )
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "JourneyHistoryViewModel onCleared ${this.hashCode()}")
    }
}