package com.payto.feature.pastjourney

data class PastJourneyList(
    val list: List<PastJourneyData>
)

data class PastJourneyData(
    val date: String,
    val list: List<PastJourneyInfo>
)

data class PastJourneyInfo(
    val title: String,
)
