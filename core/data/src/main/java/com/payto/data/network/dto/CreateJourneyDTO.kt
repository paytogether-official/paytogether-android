package com.payto.data.network.dto

import com.payto.data.database.entity.JourneyEntity
import com.payto.model.JourneyInfoModel
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
internal data class JourneyInfoDTO(
    val journeyId: String,
    val title: String,
    val closedAt: String?,
) {
    fun isOngoing() = closedAt == null

    fun asEntity(): JourneyEntity {
        return JourneyEntity(
            id = journeyId,
            isClosed = closedAt != null
        )
    }

    fun asModel(): JourneyInfoModel {
        return JourneyInfoModel(
            id = journeyId,
            title = title,
            isClosed = closedAt != null
        )
    }
}
