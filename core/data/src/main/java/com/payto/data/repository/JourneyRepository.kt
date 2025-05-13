package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.asDTO
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
        dataSource.createExpense(model.infoModel.id, model.asDTO())
    }
}
