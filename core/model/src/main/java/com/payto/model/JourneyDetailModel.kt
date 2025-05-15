package com.payto.model

data class JourneyDetailModel(
    val journeyInfo: JourneyInfoModel = JourneyInfoModel(),
    val list: List<JourneyDetailInfo> = listOf()
)

data class JourneyDetailInfo(
    val date: String = "",
    val list: List<JourneyExpenseModel> = listOf()
)
