package com.payto.feature.createjourney

import com.payto.feature.common.UiEvent
import com.payto.model.Country
import com.payto.model.ExchangeRateModel

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

data class OnDeleteMember(val index: Int) : CreateJourneyEvent

data class OnCountryChange(val country: Country) : CreateJourneyEvent

data object ClickCreate : CreateJourneyEvent

data class OnExchangeRateChange(
    val rate: String,
    val exchangeRateModel: ExchangeRateModel
) : CreateJourneyEvent
