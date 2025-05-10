package com.payto.data.repository

import com.payto.data.network.datasource.PaytoDatasource
import com.payto.model.JourneyInfoModel
import javax.inject.Inject

class JourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
) {
    suspend fun getJourneyInfoData(id: String): JourneyInfoModel {
        return dataSource.getJourneys(id).asModel()
    }
}
