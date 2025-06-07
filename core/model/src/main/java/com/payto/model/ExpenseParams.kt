package com.payto.model

data class ExpenseParams(
    val order: JourneyDetailOrder = JourneyDetailOrder.OLDEST,
    val quoteCurrency: String = "KRW"
)
