package com.payto.feature.journeydetail.item

import com.payto.feature.common.UiEvent


sealed interface ExpenseItemEvent : UiEvent

data class OnChangeCurrency(
    val currency: String
) : ExpenseItemEvent
