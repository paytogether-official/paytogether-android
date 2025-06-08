package com.payto.data.network.dto

import com.payto.model.ExpenseCategory
import com.payto.model.ResultRatioModel
import com.payto.model.SettlementSummaryModel
import kotlinx.serialization.Serializable

@Serializable
internal data class ResultDTO(
    private val journeyId: String,
    private val settlements: List<JourneySettlementDTO>,
    private val expenseCategories: List<ExpenseCategoryDTO>,
    private val memberExpenses: List<MemberExpenseDTO>,
) {

    fun asRatioModelList(): List<ResultRatioModel> {
        return expenseCategories.map {
            ResultRatioModel(
                category = ExpenseCategory.fromName(it.name),
                amount = it.amount,
                percentage = it.percentage
            )
        }
    }

    fun asSettlementSummaryModelList(): List<SettlementSummaryModel> {
        return settlements.map {
            SettlementSummaryModel(
                sender = it.fromMemberName,
                amount = it.amount,
                receiver = it.toMemberName
            )
        }
    }
}

@Serializable
internal data class JourneySettlementDTO(
    val fromMemberId: Int,
    val fromMemberName: String,
    val toMemberId: Int,
    val toMemberName: String,
    val amount: Double,
)

@Serializable
internal data class ExpenseCategoryDTO(
    val name: String,
    val amount: Double,
    val percentage: Double,
)

@Serializable
internal data class MemberExpenseDTO(
    val name: String,
    val amount: Double,
)
