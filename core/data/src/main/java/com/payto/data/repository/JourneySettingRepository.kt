package com.payto.data.repository

import com.payto.common.ext.toTimeMilli
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.model.Continent
import com.payto.model.Country
import com.payto.model.CreateJourneyModel
import com.payto.model.ExchangeRateModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class JourneySettingRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
) {
    suspend fun getJourneySettingData(id: String): CreateJourneyModel =
        withContext(Dispatchers.IO) {
            val info = dataSource.getJourney(id)
            val locale = dataSource.getLocales().find {
                it.localeCode == info.localeCode
            }
            CreateJourneyModel(
                title = info.title,
                journeyDate = CreateJourneyModel.JourneyDate(
                    startTimeMill = info.startDate.toTimeMilli() ?: System.currentTimeMillis(),
                    endTimeMill = info.endDate.toTimeMilli() ?: System.currentTimeMillis(),
                ),

                country = Country(
                    continent = Continent.from(locale?.continent),
                    currency = info.baseCurrency,
                    koreanName = locale?.countryKoreanName ?: "",
                    localeCode = info.localeCode
                ),
                exchangeRateModel = ExchangeRateModel(
                    currency = info.baseCurrency,
                    exchangeRate = info.exchangeRate
                ),
                members = info.members?.map {
                    CreateJourneyModel.Member(it.name, enable = false)
                } ?: emptyList()
            )
        }
}
