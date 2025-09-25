package com.payto.feature.common

import android.net.Uri
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
data class NavigateUri(val uri: Uri) : SideEffectEvent
data object PopBackStack : SideEffectEvent
