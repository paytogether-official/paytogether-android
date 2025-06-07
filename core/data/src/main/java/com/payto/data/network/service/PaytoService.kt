package com.payto.data.network.service

import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.ExchangeRateDTO
import com.payto.data.network.dto.ExpenseDTO
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.data.network.dto.LocaleDTO
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

internal interface PaytoService {

    @GET("/exchange-rates")
    suspend fun getExchangeRate(): List<ExchangeRateDTO>

    @GET("/locales")
    suspend fun getLocales(): List<LocaleDTO>

    @POST("/journeys")
    suspend fun createJourney(
        @Body createJourneyDTO: CreateJourneyDTO
    ): JourneyInfoDTO

    @GET("/journeys")
    suspend fun getJourneys(
        @Query("journeyIds") journeyIds: String = "",
    ): List<JourneyInfoDTO>

    @GET("/journeys/{id}")
    suspend fun getJourney(
        @Path("id") id: String,
        @Query("quoteCurrency") quoteCurrency: String,
    ): JourneyInfoDTO

    @POST("/journeys/{id}/expenses")
    suspend fun createExpense(
        @Path("id") id: String,
        @Body createExpenseDTO: ExpenseDTO
    )

    @GET("/journeys/{id}/expenses")
    suspend fun getExpenses(
        @Path("id") id: String,
        @Query("quoteCurrency") quoteCurrency: String,
        @Query("sort") sort: String,
    ): List<ExpenseDTO>

    @GET("/journeys/{id}/expenses/{journeyExpenseId}")
    suspend fun getExpense(
        @Path("id") id: String,
        @Path("journeyExpenseId") journeyExpenseId: Int,
    ): ExpenseDTO
}
