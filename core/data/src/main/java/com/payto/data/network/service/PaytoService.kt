package com.payto.data.network.service

import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.ExchangeRateDTO
import com.payto.data.network.dto.JourneyDTO
import com.payto.data.network.dto.LocaleDTO
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

internal interface PaytoService {

    @GET("/exchange-rates")
    suspend fun getExchangeRate(): List<ExchangeRateDTO>

    @GET("/locales")
    suspend fun getLocales(): List<LocaleDTO>

    @POST("/journeys")
    suspend fun createJourney(
        @Body createJourneyDTO: CreateJourneyDTO
    ): JourneyDTO

    @GET("/journeys")
    suspend fun getJourneys(
        @Query("journeyIds") journeyIds: String = "",
    ): List<JourneyDTO>
}
