package com.payto.model

import androidx.compose.runtime.Stable
import com.payto.common.ext.toDateString
import com.payto.common.ext.toLocalDate

@Stable
data class JourneyInfoModel(
    val id: String,
    val title: String,
    val currency: String,
    val isClosed: Boolean = false,
    private val startDate: String = "", // 2025-03-21
    private val endDate: String = "",
    val members: List<Member>,
) {
    data class Member(val name: String)

    val startLocalDate = startDate.toLocalDate()
    val endLocalDate = endDate.toLocalDate()
}

@Stable
data class JourneyExpenseModel(
    val payer: String = "",
    val category: ExpenseCategory = ExpenseCategory.list.first(),
    private val expenseDateMillis: Long? = null,
    val amount: Double? = null, // 총 지출 금액
    val memo: String = "",
    val membersAmount: List<MemberAmount> = listOf(), // 개인별 금액
) {
    val expenseDate: String = expenseDateMillis?.toDateString() ?: ""

    data class MemberAmount(
        val name: String,
        val amount: Double? = null,
    )

    fun getAmountErrorText(): String {
        return when {
            amount == null -> ""
            kotlin.math.abs(amount) >= 10_000_000_000 -> "숫자는 10자리 까지 입력 가능합니다."
            else -> ""
        }
    }
}

@Stable
data class JourneyModel(
    val infoModel: JourneyInfoModel,
    val expenseModel: JourneyExpenseModel
)

enum class ExpenseCategory(val displayName: String) {
    ETC("기타"),
    FOOD("식비"),
    TRANSPORT("교통"),
    TICKET("티켓"),
    SHOPPING("쇼핑"),
    ACCOMMODATION("숙소"),
    FLIGHT("항공"),
    ;

    companion object {
        val list = ExpenseCategory.entries.toList()
        private val map = list.associateBy(ExpenseCategory::displayName)

        fun fromName(name: String): ExpenseCategory? {
            return map[name]
        }
    }
}
