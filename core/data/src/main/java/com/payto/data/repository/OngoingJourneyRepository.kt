package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.JourneyDTO
import com.payto.model.JourneyModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OngoingJourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getOngoingJourney(): List<JourneyModel> {
        val ids = dao.getOngoingJourneys().map { it.id }
        if (ids.isEmpty()) return emptyList()

        return dataSource.getJourneys(ids)
            .filter { it.isOngoing() }
            .map(JourneyDTO::asModel)
    }
}