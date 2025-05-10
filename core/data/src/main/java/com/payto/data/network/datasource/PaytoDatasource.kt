package com.payto.data.network.datasource

import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.data.network.service.PaytoService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class PaytoDatasource @Inject constructor(
    private val service: PaytoService
) {
    suspend fun getExchangeRate() = service.getExchangeRate()

    suspend fun getLocales() = service.getLocales()

    suspend fun createJourney(createJourneyDTO: CreateJourneyDTO) =
        service.createJourney(createJourneyDTO)

    suspend fun getJourneys(ids: List<String>): List<JourneyInfoDTO> {
        val journeyIds = ids.joinToString(",")
        return service.getJourneys(journeyIds)
    }

    suspend fun getJourneys(id: String) = service.getJourney(id)
}
