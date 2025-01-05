package com.payto.feature.createjourney

import com.payto.feature.common.UiEvent

sealed interface CreateJourneyEvent : UiEvent

data object ClickAddPerson : CreateJourneyEvent
data class OnJourneyTitleChange(val title: String) : CreateJourneyEvent
