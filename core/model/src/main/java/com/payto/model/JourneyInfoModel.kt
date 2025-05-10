package com.payto.model

data class JourneyInfoModel(
    val id: String,
    val title: String,
    val isClosed: Boolean
)

data class JourneyExpenseModel(
    val payer: String,
    val category: String,
    val expenseDate: String, // TODO
    val currency: String,
    val amount: Double,
    val memo: String,
)

data class JourneyModel(
    val journeyModel: JourneyInfoModel,
    val expenseModel: JourneyExpenseModel? = null
)
