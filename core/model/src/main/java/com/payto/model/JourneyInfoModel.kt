package com.payto.model

import androidx.compose.runtime.Stable
import com.payto.common.ext.toLocalDate
import java.math.BigDecimal
import java.time.LocalDate

@Stable
data class JourneyInfoModel(
    val id: String = "",
    val title: String = "",
    val baseCurrency: String = "",
    val isClosed: Boolean = false,
    private val startDate: String = "", // 2025-03-21
    private val endDate: String = "",
    val members: List<Member> = listOf(),
    val totalExpenseAmount: String = "0.0",
    val totalExpenseCount: Int = 0,
    val dailyExpenseSum: List<DailySum> = listOf()
) {
    data class Member(val name: String)
    data class DailySum(
        val date: String,
        val amount: String
    ) {
        val displayName = date.toLocalDate()?.let { "${it.monthValue}월 ${it.dayOfMonth}일" } ?: "그외"
    }

    val startLocalDate = startDate.toLocalDate()
    val endLocalDate = endDate.toLocalDate()

    val dateRange by lazy {
        startLocalDate ?: return@lazy ""
        endLocalDate ?: return@lazy ""
        val startYearShort = startLocalDate.year % 100
        val endYearShort = endLocalDate.year % 100

        return@lazy if (startLocalDate.year == endLocalDate.year) {
            "${startYearShort}년 ${startLocalDate.monthValue}월 ${startLocalDate.dayOfMonth}일 - ${endLocalDate.monthValue}월 ${endLocalDate.dayOfMonth}일"
        } else {
            "${startYearShort}년 ${startLocalDate.monthValue}월 ${startLocalDate.dayOfMonth}일 - ${endYearShort}년 ${endLocalDate.monthValue}월 ${endLocalDate.dayOfMonth}일"
        }
    }
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
    val amount: String? = null, // 총 지출 금액
    val memo: String = "",
    val membersAmount: List<MemberAmount> = listOf(), // 개인별 금액
    val quoteCurrency: String = "",
    val baseCurrency: String = "",
    val expenseDate: LocalDate? = null,
) {

    data class MemberAmount(
        val name: String,
        val amount: String? = null,
    )

    fun isFullyFilled(): Boolean {
        return expenseDate != null &&
                amount != null &&
                amount.toDoubleOrNull() != 0.0
    }

    fun getAmountErrorText(): String {
        return when {
            amount.isNullOrEmpty() -> ""
            BigDecimal(amount) >= BigDecimal("10000000000") -> "숫자는 10자리까지 입력 가능합니다."
            else -> ""
        }
    }
}

fun JourneyExpenseModel.asMemberAmountList(): List<JourneyExpenseModel.MemberAmount> {
    return membersAmount.map {
        JourneyExpenseModel.MemberAmount(name = it.name, amount = it.amount)
    }
}

fun JourneyExpenseModel.updateMemberAmount(name: String, newAmount: String?): JourneyExpenseModel {
    val updatedMembers = membersAmount.map {
        if (it.name == name) it.copy(amount = newAmount) else it
    }
    return this.copy(
        membersAmount = updatedMembers,
        amount = updatedMembers.sumOf { BigDecimal(it.amount ?: "0.0") }
            .takeIf { it != BigDecimal.ZERO }?.toString()
    )
}

@Stable
data class JourneyModel(
    val infoModel: JourneyInfoModel = JourneyInfoModel(),
    val createExpenseModel: JourneyExpenseModel = JourneyExpenseModel(),
    val detailInfoList: List<ExpenseGroupByDateModel> = listOf(),
    val params: ExpenseParams = ExpenseParams(),
) {
    val detailModel = JourneyDetailModel(infoModel, detailInfoList, params)

    fun updateOrder(order: JourneyDetailOrder): JourneyModel {
        return this.copy(params = params.copy(order = order))
    }

    fun updateCurrency(currency: String): JourneyModel {
        return this.copy(params = params.copy(quoteCurrency = currency))
    }

    fun updateDate(date: String?): JourneyModel {
        return this.copy(params = params.copy(expenseDate = date))
    }
}

enum class ExpenseCategory(val displayName: String) {
    ETC("기타"),
    FOOD("식비"),
    TRANSPORT("교통"),
    SIGHTSEEING("관광"),
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
