package com.payto.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRateDTO(
    val date: String,
    val currency: String,
    val exchangeRate: Double
)
