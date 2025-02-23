package com.payto.feature.journeyhistory

data class JourneyHistoryList(
    val list: List<JourneyHistoryData>
)

data class JourneyHistoryData(
    val date: String,
    val list: List<JourneyHistoryInfo>
)

data class JourneyHistoryInfo(
    val title: String,
)
