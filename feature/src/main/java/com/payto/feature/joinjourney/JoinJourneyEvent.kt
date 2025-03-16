package com.payto.feature.joinjourney

import com.payto.feature.common.UiEvent

sealed interface JoinJourneyEvent : UiEvent

data class CheckInviteCode(val code: String) : JoinJourneyEvent
