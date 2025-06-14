package com.payto.model

import androidx.compose.runtime.Stable

data class CategoryDetailModel(
    val id: String = "",
    val baseCurrency: String = "",
    val params: ExpenseParams,
    val expenseInfoModel: ExpenseInfoModel = ExpenseInfoModel(),
    val categoryList: List<ExpenseCategory>,
)

@Stable
data class ExpenseInfoModel(
    val totalAmount: String = "0.0",
    val expenseList: List<ExpenseGroupByDateModel> = listOf(),
)
