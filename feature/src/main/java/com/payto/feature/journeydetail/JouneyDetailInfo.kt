package com.payto.feature.journeydetail

data class JourneyDetailData(
    val date: String,
    val list: List<JourneyDetailInfo>
)

data class JourneyDetailInfo(
    val title: String,
)
