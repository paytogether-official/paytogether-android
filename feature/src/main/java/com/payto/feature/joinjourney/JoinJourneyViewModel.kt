package com.payto.feature.joinjourney

import androidx.lifecycle.viewModelScope
import com.payto.model.navigate.Journey
import com.payto.model.navigate.JourneyDetail
import com.payto.data.repository.JoinJourneyRepository
import com.payto.feature.common.Navigate
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.JourneyState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JoinJourneyViewModel @Inject constructor(
    private val repository: JoinJourneyRepository,
) : BaseViewModel() {

    override fun onEvent(event: UiEvent) {
        if (event !is JoinJourneyEvent) return

        when (event) {
            is CheckInviteCode -> {
                checkInviteCode(event.code)
            }
        }
    }

    private fun checkInviteCode(code: String) {
        viewModelScope.launch {
            val state = runCatching {
                repository.getJourneyState(code)
            }.getOrElse { JourneyState.Invalid }

            handleJourneyState(state, code)
        }
    }

    private fun handleJourneyState(state: JourneyState, journeyId: String) {
        when (state) {
            JourneyState.Closed, JourneyState.InProgress -> {
                showSnackbar(
                    message = "초대된 여정으로 이동합니다",
                    status = ShowSnackbar.Status.SUCCESS
                )
                if (state == JourneyState.Closed) {
                    sendSideEffectEvent(Navigate(JourneyDetail(journeyId = journeyId)))
                } else {
                    sendSideEffectEvent(Navigate(Journey(journeyId = journeyId)))
                }
            }

            JourneyState.Invalid -> {
                showSnackbar(
                    message = "초대코드를 확인해주세요.",
                    status = ShowSnackbar.Status.FAIL
                )
            }
        }
    }
}
