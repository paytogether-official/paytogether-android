package com.payto.feature.journey.expense

import com.payto.feature.common.UiEvent


sealed interface ExpenseSettingEvent : UiEvent

data class OnParticipantsChange(
    val name: String,
    val exclude: Boolean,
) : ExpenseSettingEvent
