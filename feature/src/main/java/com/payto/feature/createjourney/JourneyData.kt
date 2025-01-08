package com.payto.feature.createjourney

import androidx.compose.runtime.Stable

@Stable
data class JourneyData(
    val title: String? = null,
    val journeyDate: JourneyDate? = null,
    val country: String? = null,
    val people: List<String> = emptyList(),
) {
    data class JourneyDate(val startTimeMill: Long, val endTimeMill: Long)

    fun isFullyFilled(): Boolean {
        return !title.isNullOrBlank() &&
                journeyDate != null &&
                !country.isNullOrBlank() &&
                people.isNotEmpty()
    }

    fun hasDuplicateName(): Boolean {
        return people.size != people.distinct().size
    }
}
