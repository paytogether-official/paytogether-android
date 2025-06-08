package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.model.ExpenseSettingModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ExpenseSettingRepository @Inject internal constructor(
    private val dao: JourneyDao,
) {
    fun getMemberList(id: String): Flow<ExpenseSettingModel> {
        return dao.getJourneyFlow(id).map { it.asExpenseSettingModel() }
    }

    suspend fun updateMemberInfo(
        id: String,
        name: String,
        exclude: Boolean
    ) {
        val memberInfo = dao.getJourney(id).memberInfo.toMutableMap().apply {
            put(name, exclude)
        }
        dao.insert(dao.getJourney(id).copy(memberInfo = memberInfo))
    }

    suspend fun updatePayer(id: String, payer: String) {
        val memberInfo = dao.getJourney(id).memberInfo.toMutableMap().apply {
            put(payer, false)
        }
        dao.insert(dao.getJourney(id).copy(memberInfo = memberInfo, payer = payer))
    }
}
