package com.payto.model

import androidx.compose.runtime.Stable

@Stable
data class CreateJourneyModel(
    val title: String? = null,
    val journeyDate: JourneyDate? = null,
    val country: Country? = null,
    val exchangeRateModel: ExchangeRateModel = ExchangeRateModel(),
    val people: List<String> = emptyList(),
) {
    data class JourneyDate(val startTimeMill: Long, val endTimeMill: Long)

    fun isFullyFilled(): Boolean {
        return !title.isNullOrBlank() &&
                journeyDate != null &&
                country != null &&
                exchangeRateModel.exchangeRate.isNotEmpty() &&
                people.isNotEmpty()
    }

    fun hasDuplicateName(): Boolean {
        return people.size != people.distinct().size
    }

    fun hasEmptyName(): Boolean {
        return people.any { it.isBlank() }
    }

    fun over30People(): Boolean {
        return people.size > 30
    }
}

data class JourneyModel(val id: String, val isClosed: Boolean)
