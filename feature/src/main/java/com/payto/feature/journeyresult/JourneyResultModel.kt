package com.payto.feature.journeyresult

data class JourneyResultModel(
    val ratioModel: List<ResultRatioModel>,
    val settlementSummaryModel: List<SettlementSummaryModel>
)

data class ResultRatioModel(
    val title: String, // todo shortcut 객체?
    val ratio: Double,
    val amount: String,
)

data class SettlementSummaryModel(
    val sender: String,
    val amount: Long,
    val receiver: String,
)
