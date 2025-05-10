package com.payto.feature.common.arch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.payto.feature.common.EventInterface
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.SideEffectEvent
import com.payto.feature.common.UiEvent
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel(), EventInterface {
    protected val _sideEffectEvent = MutableSharedFlow<SideEffectEvent>()
    override val sideEffectEvent: SharedFlow<SideEffectEvent> = _sideEffectEvent

    override fun onEvent(event: UiEvent) {
    }

    protected fun showSnackbar(message: String, status: ShowSnackbar.Status) {
        viewModelScope.launch {
            _sideEffectEvent.emit(ShowSnackbar(message = message, status = status))
        }
    }

    protected fun sendSideEffectEvent(event: SideEffectEvent) {
        viewModelScope.launch {
            _sideEffectEvent.emit(event)
        }
    }
}
