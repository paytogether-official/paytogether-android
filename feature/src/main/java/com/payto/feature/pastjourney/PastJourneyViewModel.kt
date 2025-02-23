package com.payto.feature.pastjourney

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
class PastJourneyViewModel @Inject constructor() : ViewModel() {

    val pastJourneyList = flow<List<PastJourneyData>> {
        emit(getPastJourneyList())
    }.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    init {
        Log.e("흐흐", "PastJourneyViewModel init ${this.hashCode()}")
    }

    private suspend fun getPastJourneyList(): List<PastJourneyData> {
        delay(300)
        return listOf(
            PastJourneyData(
                date = "24년 2월",
                list = List((1..5).random()) {
                    PastJourneyInfo("title $it")
                }
            ),
            PastJourneyData(
                date = "24년 1월",
                list = List((1..5).random()) {
                    PastJourneyInfo("title $it")
                }
            ),
            PastJourneyData(
                date = "23년 12월",
                list = List((1..5).random()) {
                    PastJourneyInfo("title $it")
                }
            )
        )
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "PastJourneyViewModel onCleared ${this.hashCode()}")
    }
}