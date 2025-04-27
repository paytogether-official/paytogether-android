package com.payto.data.repository

import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.asCountryModel
import com.payto.model.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreateJourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
) {

    suspend fun getExchangeRate() = dataSource.getExchangeRate()

    suspend fun getLocales(): List<Country> = withContext(Dispatchers.IO) {
        return@withContext dataSource.getLocales().map { it.asCountryModel() }
    }
}
