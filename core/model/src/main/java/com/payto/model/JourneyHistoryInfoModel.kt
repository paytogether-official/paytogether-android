package com.payto.model

data class JourneyHistoryModel(
    val date: String,
    val list: List<JourneyInfoModel>
)
