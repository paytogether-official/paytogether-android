package com.payto.feature.journey

import com.payto.feature.common.UiEvent
import com.payto.model.ExpenseCategory


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

data class OnExpenseCategoryChange(
    val category: ExpenseCategory,
) : JourneyEvent

data class OnMemoChange(
    val memo: String,
) : JourneyEvent
