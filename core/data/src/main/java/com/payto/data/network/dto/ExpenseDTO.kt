package com.payto.data.network.dto

import com.payto.common.ext.toLocalDate
import com.payto.data.network.dto.ExpenseDTO.MemberExpenseDTO
import com.payto.model.ExpenseCategory
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyModel
import kotlinx.serialization.Serializable

@Serializable
internal data class ExpenseDTO(
    val journeyExpenseId: Int = 0,
    val journeyId: String = "",
    val payerName: String,
    val category: String,
    val expenseDate: String,
    val currency: String,
    val amount: Double,
    val remainingAmount: Double,
    val memo: String,
    val members: List<MemberExpenseDTO> = listOf(),
) {
    @Serializable
    internal data class MemberExpenseDTO(
        val name: String,
        val amount: Double,
    )
}

internal fun JourneyModel.asDTO(): ExpenseDTO {
    return ExpenseDTO(
        journeyId = this.infoModel.id,
        payerName = this.createExpenseModel.payer,
        category = this.createExpenseModel.category.displayName,
        expenseDate = this.createExpenseModel.expenseDate.toString(),
        currency = this.infoModel.currency,
        amount = this.createExpenseModel.amount ?: 0.0,
        remainingAmount = (this.createExpenseModel.amount ?: 0.0)
                - this.createExpenseModel.membersAmount.sumOf { it.amount ?: 0.0 },
        memo = this.createExpenseModel.memo,
        members = this.createExpenseModel.membersAmount.map {
            MemberExpenseDTO(it.name, it.amount ?: 0.0)
        }
    )
}

internal fun ExpenseDTO.asExpenseModel(): JourneyExpenseModel {
    return JourneyExpenseModel(
        id = this.journeyExpenseId,
        journeyId = this.journeyId,
        payer = this.payerName,
        category = ExpenseCategory.fromName(this.category),
        expenseDate = this.expenseDate.toLocalDate(),
        amount = this.amount,
        memo = this.memo,
        membersAmount = this.members.map {
            JourneyExpenseModel.MemberAmount(it.name, it.amount)
        },
        currency = this.currency
    )
}
