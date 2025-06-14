package com.payto.data.repository

import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.model.JourneyState
import javax.inject.Inject


class JoinJourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {
    suspend fun getJourneyState(id: String): JourneyState {
        val info = dataSource.getJourney(id, quoteCurrency = "KRW")

        val localData = dao.getJourney(id)
        dao.insert(info.asEntity(payer = localData?.payer, memberInfo = localData?.memberInfo))

        return if (info.asModel().isClosed) JourneyState.Closed else JourneyState.InProgress
    }
}
