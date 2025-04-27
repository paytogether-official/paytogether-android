package com.payto.data.network.service

import com.payto.data.network.dto.ExchangeRateDTO
import com.payto.data.network.dto.LocaleDTO
import retrofit2.http.GET

internal interface PaytoService {

    @GET("/exchange-rates")
    suspend fun getExchangeRate(): List<ExchangeRateDTO>

    @GET("/locales")
    suspend fun getLocales(): List<LocaleDTO>
}
