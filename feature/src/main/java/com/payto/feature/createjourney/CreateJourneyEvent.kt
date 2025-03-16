package com.payto.feature.createjourney

import com.payto.feature.common.UiEvent
import com.payto.feature.createjourney.countrydialog.Country

sealed interface CreateJourneyEvent : UiEvent

data object ClickAddPerson : CreateJourneyEvent
data class OnJourneyTitleChange(val title: String) : CreateJourneyEvent
data class OnJourneyDateChange(
    val startTimeMill: Long?,
    val endTimeMill: Long?
) : CreateJourneyEvent

data class OnNameChange(
    val index: Int,
    val name: String,
) : CreateJourneyEvent

data class OnCountryChange(val country: Country) : CreateJourneyEvent

data object ClickCreate : CreateJourneyEvent
