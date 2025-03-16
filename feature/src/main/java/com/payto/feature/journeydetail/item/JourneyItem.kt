package com.payto.feature.journeydetail.item

data class JourneyItemData(
    val title: String,
    val list: List<ParticipantInfo>,
    val memo: String? = null
)

data class ParticipantInfo(
    val name: String,
    val amount: Long,
)
