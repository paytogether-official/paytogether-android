package com.payto.feature.journey

import com.payto.feature.common.UiEvent
import com.payto.model.JourneyDetailOrder
import com.payto.model.ExpenseCategory


sealed interface JourneyEvent : UiEvent

data class OnExpenseAmountChange(
    val amount: String,
    val splitMode: SplitMode,
    val memberName: String = "",
) : JourneyEvent {
    enum class SplitMode {
        EQUAL,
        CUSTOM,
        ;
    }
}

data class OnExpenseModeChange(
    val splitMode: OnExpenseAmountChange.SplitMode,
) : JourneyEvent

data class OnExpenseCategoryChange(
    val category: ExpenseCategory,
) : JourneyEvent

data class OnCategoryDescriptionChange(
    val description: String
) : JourneyEvent

data class OnMemoChange(
    val memo: String,
) : JourneyEvent

data class OnExpenseDateChange(
    val dateMillis: Long?,
) : JourneyEvent

data object ClickAddExpense : JourneyEvent

data class OnChangeOrder(
    val order: JourneyDetailOrder
) : JourneyEvent

data class OnChangeCurrency(
    val currency: String
) : JourneyEvent
