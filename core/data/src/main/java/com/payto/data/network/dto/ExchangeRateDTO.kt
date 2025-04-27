package com.payto.data.network.dto

import com.payto.model.ExchangeRateModel
import kotlinx.serialization.Serializable

@Serializable
internal data class ExchangeRateDTO(
    val date: String,
    val currency: String,
    val exchangeRate: Double?
)

internal fun ExchangeRateDTO.asExchangeRateModel(): ExchangeRateModel {
    return ExchangeRateModel(
        currency = currency,
        exchangeRate = exchangeRate?.toString() ?: ""
    )
}