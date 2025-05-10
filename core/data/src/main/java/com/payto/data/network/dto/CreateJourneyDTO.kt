package com.payto.data.network.dto

import com.payto.data.database.entity.JourneyEntity
import com.payto.model.JourneyModel
import kotlinx.serialization.Serializable

@Serializable
internal data class CreateJourneyDTO(
    val baseCurrency: String,
    val exchangeRate: String,
    val title: String,
    val startDate: String?,
    val endDate: String?,
    val localeCode: String,
    val members: List<Member>,
) {
    @Serializable
    internal data class Member(
        val name: String
    )
}

@Serializable
internal data class JourneyDTO(
    val journeyId: String,
    val closedAt: String?,
) {
    fun asEntity(): JourneyEntity {
        return JourneyEntity(
            id = journeyId,
            closedAt = closedAt
        )
    }

    fun asModel(): JourneyModel {
        return JourneyModel(
            id = journeyId,
            isClosed = closedAt != null // TODO closedAt이 null이면 여행이 진행중??
        )
    }
}
