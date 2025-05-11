package com.payto.feature.journey

import com.payto.feature.common.UiEvent


sealed interface JourneyEvent : UiEvent

data class OnExpenseAmountChange(
    val amount: String,
    val splitMode: SplitMode,
) : JourneyEvent {
    enum class SplitMode {
        EQUAL,
        CUSTOM,
        ;
    }
}

