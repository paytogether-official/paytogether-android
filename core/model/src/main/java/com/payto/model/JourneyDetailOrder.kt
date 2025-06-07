package com.payto.model

enum class JourneyDetailOrder(
    val orderName: String,
    val sortName: String
) {
    OLDEST("오래된 순", "asc"),
    NEWEST("최신 순", "desc"),
//    PRICE_HIGH("가격 높은 순"),
//    PRICE_LOW("가격 낮은 순")
    ;

    companion object {
        val default = OLDEST
    }
}
