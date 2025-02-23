package com.payto.feature.journeydetail

enum class JourneyDetailOrder(val orderName: String) {
    OLDEST("오래된 순"),
    NEWEST("최신 순"),
    PRICE_HIGH("가격 높은 순"),
    PRICE_LOW("가격 낮은 순")
}
