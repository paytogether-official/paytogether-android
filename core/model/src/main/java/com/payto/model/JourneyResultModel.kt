package com.payto.model

import androidx.compose.runtime.Stable

@Stable
data class JourneyResultModel(
    val quoteCurrency : String = "KRW",
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
