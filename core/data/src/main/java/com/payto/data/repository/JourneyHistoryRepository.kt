package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.model.JourneyHistoryModel
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class JourneyHistoryRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getJourneyHistoryList(): List<JourneyHistoryModel> {
        val ids = dao.getJourneys().map { it.id }
        if (ids.isEmpty()) return emptyList()

        val list = dataSource.getJourneys(ids)
        dao.insertAll(
            list.map {
                val localData = dao.getJourney(it.journeyId)
                it.asEntity(localData.payer, localData.memberInfo)
            }
        )
        return list.filter { it.isClosed() }
            .let(::groupByStartYearMonth)
    }

    private fun groupByStartYearMonth(journeys: List<JourneyInfoDTO>): List<JourneyHistoryModel> {
        val inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return journeys.groupBy { journey ->
            val date = LocalDate.parse(journey.startDate, inputFormatter)
            "${date.year % 100}년 ${date.monthValue}월"
        }.map { (date, list) ->
            JourneyHistoryModel(date, list.map(JourneyInfoDTO::asModel))
        }.sortedBy { it.date } // 날짜순 정렬 (필요시)
    }
}
