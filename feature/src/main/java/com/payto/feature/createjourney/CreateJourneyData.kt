package com.payto.feature.createjourney

import androidx.compose.runtime.Stable
import com.payto.model.Country
import com.payto.model.ExchangeRateModel

@Stable
data class CreateJourneyData(
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
                people.isNotEmpty()
    }

    fun hasDuplicateName(): Boolean {
        return people.size != people.distinct().size
    }
}
