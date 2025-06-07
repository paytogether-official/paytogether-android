package com.payto.model

import androidx.compose.runtime.Stable
import com.payto.common.ext.toLocalDate
import java.time.LocalDate

@Stable
data class JourneyInfoModel(
    val id: String = "",
    val title: String = "",
    val currency: String = "",
    val isClosed: Boolean = false,
    private val startDate: String = "", // 2025-03-21
    private val endDate: String = "",
    val members: List<Member> = listOf(),
) {
    data class Member(val name: String)

    val startLocalDate = startDate.toLocalDate()
    val endLocalDate = endDate.toLocalDate()
}

fun JourneyInfoModel.asMemberAmountList(): List<JourneyExpenseModel.MemberAmount> {
    return members.map {
        JourneyExpenseModel.MemberAmount(name = it.name)
    }
}

@Stable
data class JourneyExpenseModel(
    val journeyId: String = "",
    val id: Int = 0,
    val payer: String = "",
    val category: ExpenseCategory = ExpenseCategory.list.first(),
    val categoryDescription: String? = null,
    val amount: Double? = null, // 총 지출 금액
    val memo: String = "",
    val membersAmount: List<MemberAmount> = listOf(), // 개인별 금액
    val currency: String = "",
    val expenseDate: LocalDate? = null,
) {

    data class MemberAmount(
        val name: String,
        val amount: Double? = null,
    )

    fun isFullyFilled(): Boolean {
        return expenseDate != null &&
                amount != null &&
                amount != 0.0
    }

    fun getAmountErrorText(): String {
        return when {
            amount == null -> ""
            kotlin.math.abs(amount) >= 10_000_000_000 -> "숫자는 10자리 까지 입력 가능합니다."
            else -> ""
        }
    }
}

fun JourneyExpenseModel.updateMemberAmount(name: String, newAmount: Double?): JourneyExpenseModel {
    val updatedMembers = membersAmount.map {
        if (it.name == name) it.copy(amount = newAmount) else it
    }
    return this.copy(
        membersAmount = updatedMembers,
        amount = updatedMembers.sumOf { it.amount ?: 0.0 })
}

@Stable
data class JourneyModel(
    val infoModel: JourneyInfoModel = JourneyInfoModel(),
    val createExpenseModel: JourneyExpenseModel = JourneyExpenseModel(),
    val detailInfoList: List<JourneyDetailInfo> = listOf(),
    val params: ExpenseParams = ExpenseParams(),
) {
    val detailModel = JourneyDetailModel(infoModel, detailInfoList, params)

    fun updateOrder(order: JourneyDetailOrder): JourneyModel {
        return this.copy(params = params.copy(order = order))
    }

    fun updateCurrency(currency: String): JourneyModel {
        return this.copy(params = params.copy(quoteCurrency = currency))
    }
}

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

        fun fromName(name: String): ExpenseCategory {
            return map[name] ?: ETC
        }
    }
}
