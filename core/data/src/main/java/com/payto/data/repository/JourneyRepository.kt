package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.ExpenseDTO
import com.payto.data.network.dto.asDTO
import com.payto.data.network.dto.asExpenseModel
import com.payto.model.ExpenseParams
import com.payto.model.ExpenseGroupByDateModel
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import javax.inject.Inject

class JourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getJourneyInfoData(id: String, quoteCurrency: String): JourneyInfoModel {
        val localMember = dao.getJourney(id)?.memberInfo
        return dataSource.getJourney(id, quoteCurrency = quoteCurrency).asModel(localMember)
    }

    suspend fun getJourneyPayer(id: String): String {
        return dao.getJourneyPayer(id)
    }

    suspend fun addJourneyExpense(model: JourneyModel) {
        dataSource.createExpense(model.asDTO())
    }

    suspend fun updateJourneyExpense(model: JourneyModel) {
        dataSource.updateExpense(model.infoModel.id, model.createExpenseModel.id, model.asDTO())
    }

    suspend fun getExpenses(
        id: String,
        params: ExpenseParams?,
    ): List<ExpenseGroupByDateModel> {
        return dataSource.getExpenses(id = id, params = params ?: ExpenseParams())
            .expenses
            .groupBy { it.expenseDate }
            .map { (date, expenses) ->
                ExpenseGroupByDateModel(date, expenses.map(ExpenseDTO::asExpenseModel))
            }
    }

    suspend fun getExpenseItemInfo(
        id: String,
        expenseId: Int,
        quoteCurrency: String
    ): JourneyExpenseModel {
        return dataSource.getExpense(id, expenseId, quoteCurrency).asExpenseModel()
    }

    suspend fun closeJourney(id: String) {
        dataSource.closeJourney(id)
    }
}
