package com.payto.data.repository

import com.payto.data.network.datasource.PaytoDatasource
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyResultModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import javax.inject.Inject


class ResultRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource
) {
    private suspend fun getJourneyInfoData(id: String, quoteCurrency: String): JourneyInfoModel {
        return dataSource.getJourney(id, quoteCurrency = quoteCurrency).asModel()
    }

    suspend fun getSettlement(id: String, quoteCurrency: String): JourneyResultModel =
        withContext(Dispatchers.IO) {

            val info = async { getJourneyInfoData(id, quoteCurrency) }
            // todo quoteCurrency: String
            val result = dataSource.getSettlement(id)

            return@withContext JourneyResultModel(
                infoModel = info.await(),
                ratioModel = result.asRatioModelList(),
                settlementSummaryModel = result.asSettlementSummaryModelList()
            )
        }
}
