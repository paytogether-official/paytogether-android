package com.payto.data.repository

import com.payto.common.ext.toKoreanDateString
import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.ExchangeRateDTO
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.data.network.dto.LocaleDTO
import com.payto.data.network.dto.MemberDTO
import com.payto.data.network.dto.asCountryModel
import com.payto.data.network.dto.asExchangeRateModel
import com.payto.model.Country
import com.payto.model.CreateJourneyModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreateJourneyRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
) {

    suspend fun getExchangeRate() =
        dataSource.getExchangeRate().map(ExchangeRateDTO::asExchangeRateModel)

    suspend fun getLocales(): List<Country> = withContext(Dispatchers.IO) {
        return@withContext dataSource.getLocales().map(LocaleDTO::asCountryModel)
    }

    suspend fun createJourney(journey: CreateJourneyModel) = withContext(Dispatchers.IO) {
        val data = requestJourney(journey)
        dao.insert(data.asEntity())
        return@withContext data.asModel()
    }

    private suspend fun requestJourney(journey: CreateJourneyModel): JourneyInfoDTO {
        val request = CreateJourneyDTO(
            baseCurrency = journey.country?.currency ?: "",
            exchangeRate = journey.exchangeRateModel.exchangeRate,
            title = journey.title ?: "",
            startDate = journey.journeyDate?.startTimeMill?.toKoreanDateString(),
            endDate = journey.journeyDate?.endTimeMill?.toKoreanDateString(),
            localeCode = journey.country?.localeCode ?: "",
            members = journey.members.map { MemberDTO(it) }
        )
        return dataSource.createJourney(request)
    }
}
