package com.payto.model

data class JourneyInfoModel(
    val id: String,
    val title: String,
    val currency: String,
    val isClosed: Boolean = false
)

data class JourneyExpenseModel(
    val payer: String = "",
    val category: ExpenseCategory = ExpenseCategory.list.first(),
    val expenseDate: String = "", // TODO
    val amount: Double? = null,
    val memo: String = "",
) {
    fun getAmountErrorText(): String {
        return when {
            amount == null -> ""
            kotlin.math.abs(amount) >= 10_000_000_000 -> "숫자는 10자리 까지 입력 가능합니다."
            else -> ""
        }
    }
}

data class JourneyModel(
    val infoModel: JourneyInfoModel,
    val expenseModel: JourneyExpenseModel? = null
)

enum class ExpenseCategory(val displayName: String) {
    ETC("기타"),
    FOOD("식비"),
    TRANSPORT("교통"),
    TOURISM("관광"),
    SHOPPING("쇼핑"),
    ACCOMMODATION("숙소"),
    ;

    companion object {
        val list = ExpenseCategory.entries.toList()
        private val map = list.associateBy(ExpenseCategory::displayName)

        fun fromName(name: String): ExpenseCategory? {
            return map[name]
        }
    }
}
