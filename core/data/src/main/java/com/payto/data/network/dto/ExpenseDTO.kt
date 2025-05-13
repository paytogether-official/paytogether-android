package com.payto.data.network.dto

import com.payto.data.network.dto.CreateExpenseDTO.MemberExpenseDTO
import com.payto.model.JourneyModel
import kotlinx.serialization.Serializable

@Serializable
internal data class CreateExpenseDTO(
    val payerName: String,
    val category: String,
    val expenseDate: String,
    val currency: String,
    val amount: Double,
    val remainingAmount: Double,
    val memo: String,
    val members: List<MemberExpenseDTO>,
) {
    @Serializable
    internal data class MemberExpenseDTO(
        val name: String,
        val amount: Double,
    )
}

internal fun JourneyModel.asDTO(): CreateExpenseDTO {
    return CreateExpenseDTO(
        payerName = this.expenseModel.payer,
        category = this.expenseModel.category.displayName,
        expenseDate = this.expenseModel.expenseDate,
        currency = this.infoModel.currency,
        amount = this.expenseModel.amount ?: 0.0,
        remainingAmount = (this.expenseModel.amount ?: 0.0)
                - this.expenseModel.membersAmount.sumOf { it.amount ?: 0.0 },
        memo = this.expenseModel.memo,
        members = this.expenseModel.membersAmount.map {
            MemberExpenseDTO(it.name, it.amount ?: 0.0)
        }
    )
}
