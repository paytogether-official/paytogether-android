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
    val totalExpenseAmount: String?,
    val totalExpenseCount: Int?,
    val closedAt: String?,
    val members: List<MemberDTO>?,
    val startDate: String,
    val endDate: String,
    val dailyExpenseSumByDate: List<DailySumDTO>?
) {
    fun isOngoing() = closedAt == null
    fun isClosed() = closedAt != null

    fun asEntity(payer: String? = null, memberInfo: Map<String, Boolean>? = null): JourneyEntity {
        return JourneyEntity(
            id = journeyId,
            isClosed = closedAt != null,
            payer = payer ?: members?.firstOrNull()?.name ?: "",
            memberInfo = memberInfo ?: members?.associate { it.name to false }?.toMap() ?: mapOf()
        )
    }

    fun asModel(memberInfo: Map<String, Boolean>? = null): JourneyInfoModel {
        return JourneyInfoModel(
            id = journeyId,
            title = title,
            isClosed = closedAt != null,
            baseCurrency = this@JourneyInfoDTO.baseCurrency,
            members = memberInfo?.filter { it.value == false }?.map {
                JourneyInfoModel.Member(it.key)
            } ?: members?.map { JourneyInfoModel.Member(it.name) }
            ?: listOf(),
            startDate = startDate,
            endDate = endDate,
            totalExpenseAmount = totalExpenseAmount ?: "0.0",
            totalExpenseCount = totalExpenseCount ?: 0,
            dailyExpenseSum = dailyExpenseSumByDate?.map {
                JourneyInfoModel.DailySum(
                    date = it.date,
                    amount = it.totalAmount ?: "0.0"
                )
            } ?: listOf()
        )
    }
}

@Serializable
internal data class DailySumDTO(
    val date: String, // yyyy-MM-dd | OTHER
    val totalAmount: String?
)
