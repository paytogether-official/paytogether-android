package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.model.JourneyInfoModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OngoingJourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getOngoingJourney(): List<JourneyInfoModel> {
        val ids = dao.getOngoingJourneys().map { it.id }
        if (ids.isEmpty()) return emptyList()

        val list = dataSource.getJourneys(ids)
        dao.insertAll(
            list.map {
                val localData = dao.getJourney(it.journeyId)
                it.asEntity(localData.payer, localData.memberInfo)
            }
        )
        return list
            .filter { it.isOngoing() }
            .map(JourneyInfoDTO::asModel)
    }
}