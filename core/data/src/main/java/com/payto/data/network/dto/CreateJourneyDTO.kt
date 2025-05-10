package com.payto.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class CreateJourneyDTO(
    val baseCurrency: String,
    val exchangeRate: String,
    val title: String,
    val startDate: String,
    val endDate: String,
    val localeCode: String,
    val members: List<Member>,
) {
    @Serializable
    data class Member(
        val name: String
    )
}
