package com.payto.model

import androidx.compose.runtime.Stable

@Stable
data class CreateJourneyModel(
    val title: String? = null,
    val journeyDate: JourneyDate? = null,
    val country: Country? = null,
    val exchangeRateModel: ExchangeRateModel = ExchangeRateModel(),
    val members: List<Member> = emptyList(),
) {
    data class JourneyDate(val startTimeMill: Long, val endTimeMill: Long)
    data class Member(val name: String, val enable: Boolean = true)

    fun isFullyFilled(): Boolean {
        return !title.isNullOrBlank() &&
                journeyDate != null &&
                country != null &&
                exchangeRateModel.exchangeRate.isNotEmpty() &&
                members.isNotEmpty()
    }

    fun hasDuplicateName(): Boolean {
        return members.size != members.distinct().size
    }

    fun hasEmptyName(): Boolean {
        return members.any { it.name.isBlank() }
    }

    fun over30Member(): Boolean {
        return members.size > 30
    }
}
