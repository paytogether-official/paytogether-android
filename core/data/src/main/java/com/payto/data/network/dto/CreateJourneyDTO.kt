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
    val members: List<MemberDTO>,
)

@Serializable
internal data class MemberDTO(
    val name: String
)

@Serializable
internal data class JourneyInfoDTO(
    val journeyId: String,
    val title: String,
    val baseCurrency: String,
    val quoteCurrency: String,
    val totalExpenseAmount: Double,
    val closedAt: String?,
    val members: List<MemberDTO>,
    val startDate: String,
    val endDate: String,
) {
    fun isOngoing() = closedAt == null

    fun asEntity(): JourneyEntity {
        return JourneyEntity(
            id = journeyId,
            isClosed = closedAt != null,
            payer = members.firstOrNull()?.name ?: "",
        )
    }

    fun asModel(): JourneyInfoModel {
        return JourneyInfoModel(
            id = journeyId,
            title = title,
            isClosed = closedAt != null,
            baseCurrency = this@JourneyInfoDTO.baseCurrency,
            members = members.map {
                JourneyInfoModel.Member(it.name)
            },
            startDate = startDate,
            endDate = endDate,
            totalExpenseAmount = totalExpenseAmount,
        )
    }
}
