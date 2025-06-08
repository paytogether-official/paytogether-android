package com.payto.data.network.dto

import com.payto.common.ext.toLocalDate
import com.payto.common.ext.truncateToTwoDecimalPlaces
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
    val baseCurrency: String,
    val quoteCurrency: String? = null,
    val categoryDescription: String?,
    val amount: Double,
    val members: List<MemberExpenseDTO> = listOf(),
    private val remainingAmount: Double = (amount - members.sumOf { it.amount }).truncateToTwoDecimalPlaces(),
    val memo: String,
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
        baseCurrency = this.infoModel.baseCurrency,
        amount = this.createExpenseModel.amount ?: 0.0,
        members = this.createExpenseModel.membersAmount.map {
            MemberExpenseDTO(it.name, it.amount?.truncateToTwoDecimalPlaces() ?: 0.0)
        },
        memo = this.createExpenseModel.memo,
        categoryDescription = this.createExpenseModel.categoryDescription
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
        quoteCurrency = this.quoteCurrency ?: "",
        baseCurrency = this.baseCurrency,
        categoryDescription = this.categoryDescription?.takeIf { it.isNotEmpty() }
    )
}
