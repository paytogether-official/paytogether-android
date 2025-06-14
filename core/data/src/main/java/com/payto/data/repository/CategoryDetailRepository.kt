package com.payto.data.repository

import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.ExpenseDTO
import com.payto.data.network.dto.asExpenseModel
import com.payto.model.ExpenseCategory
import com.payto.model.ExpenseGroupByDateModel
import com.payto.model.ExpenseInfoModel
import com.payto.model.ExpenseParams
import javax.inject.Inject

class CategoryDetailRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
) {
    suspend fun getCategories(journeyId: String): List<ExpenseCategory> {
        return dataSource.getCategories(journeyId).map {
            ExpenseCategory.fromName(it)
        }.distinct()
    }

    suspend fun getExpenses(
        id: String,
        expenseParams: ExpenseParams
    ): ExpenseInfoModel {
        val expenseData = dataSource.getExpenses(id, expenseParams)
        return ExpenseInfoModel(
            totalAmount = expenseData.totalAmount,
            expenseList = expenseData.expenses
                .groupBy { it.expenseDate }
                .map { (date, expenses) ->
                    ExpenseGroupByDateModel(date, expenses.map(ExpenseDTO::asExpenseModel))
                }
        )
    }
}
