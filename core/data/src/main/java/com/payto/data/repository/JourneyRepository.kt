package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.ExpenseDTO
import com.payto.data.network.dto.asDTO
import com.payto.data.network.dto.asExpenseModel
import com.payto.model.JourneyDetailInfo
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import javax.inject.Inject

class JourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getJourneyInfoData(id: String): JourneyInfoModel {
        return dataSource.getJourneys(id).asModel()
    }

    suspend fun getJourneyPayer(id: String): String {
        return dao.getJourneyPayer(id)
    }

    suspend fun addJourneyExpense(model: JourneyModel) {
        dataSource.createExpense(model.asDTO())
    }

    suspend fun getExpenses(id: String): List<JourneyDetailInfo> {
        return dataSource.getExpenses(id)
            .groupBy { it.expenseDate }
            .map { (date, expenses) ->
                JourneyDetailInfo(date, expenses.map(ExpenseDTO::asExpenseModel))
            }
    }

    suspend fun getExpenseItemInfo(id: String, expenseId: Int): JourneyExpenseModel {
        return dataSource.getExpense(id, expenseId).asExpenseModel()
    }
}
