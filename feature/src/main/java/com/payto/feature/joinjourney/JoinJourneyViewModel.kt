package com.payto.feature.joinjourney

import com.payto.common.navigate.JourneyDetail
import com.payto.feature.common.Navigate
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JoinJourneyViewModel @Inject constructor() : BaseViewModel() {

    override fun onEvent(event: UiEvent) {
        if (event !is JoinJourneyEvent) return

        when (event) {
            is CheckInviteCode -> {
                val isValid = isValidInviteCode(event.code)
                showSnackbar(
                    message = if (isValid) "초대된 여정으로 이동합니다" else "초대코드를 확인해주세요.",
                    status = if (isValid) ShowSnackbar.Status.SUCCESS else ShowSnackbar.Status.FAIL
                )
                if (isValid) {
                    sendSideEffectEvent(Navigate(JourneyDetail(journeyId = "33"))) // TODO 여정 생성 완료 화면임 (진행중)
                }
            }
        }
    }

    private fun isValidInviteCode(code: String): Boolean {
        return listOf(true, false).random() // TODO 서버 확인
    }
}
