package com.payto.model

data class JourneyResultModel(
    val infoModel: JourneyInfoModel = JourneyInfoModel(),
    val ratioModel: List<ResultRatioModel>,
    val settlementSummaryModel: List<SettlementSummaryModel>,
)

data class ResultRatioModel(
    val category: ExpenseCategory,
    val percentage: Double,
    val amount: Double,
)

data class SettlementSummaryModel(
    val sender: String,
    val amount: Double,
    val receiver: String,
)
