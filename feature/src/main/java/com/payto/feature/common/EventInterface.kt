package com.payto.feature.common

import kotlinx.coroutines.flow.SharedFlow

interface EventInterface {
    val sideEffectEvent: SharedFlow<SideEffectEvent>
    fun onEvent(event: UiEvent)
}

interface UiEvent

sealed interface SideEffectEvent

data class ShowSnackbar(
    val message: String,
    val status: Status = Status.NONE
) : SideEffectEvent {
    enum class Status {
        SUCCESS, FAIL, NONE
    }
}

data class Navigate(val route: Any) : SideEffectEvent
