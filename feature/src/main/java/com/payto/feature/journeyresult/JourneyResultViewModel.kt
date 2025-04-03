package com.payto.feature.journeyresult

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class JourneyResultViewModel @Inject constructor() : ViewModel() {

    val model = MutableStateFlow(
        JourneyResultModel(
            ratioModel = listOf(
                ResultRatioModel("title", 0.333, "123453436"),
                ResultRatioModel("title", 0.5, "123456"),
                ResultRatioModel("title", 0.22, "333"),
                ResultRatioModel("title", 0.8, "123456"),
            ),
            settlementSummaryModel = listOf(
                SettlementSummaryModel("sender", 3434, "receiver"),
                SettlementSummaryModel("sender", 1455, "receiver"),
                SettlementSummaryModel("sender", 9999999, "receiver"),
            )
        )
    )
}