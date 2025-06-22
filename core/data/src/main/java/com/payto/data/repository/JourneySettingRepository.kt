package com.payto.data.repository

import com.payto.common.ext.toDateString
import com.payto.common.ext.toTimeMilli
import com.payto.data.database.dao.JourneyDao
import com.payto.data.network.datasource.PaytoDatasource
import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.MemberDTO
import com.payto.model.Continent
import com.payto.model.Country
import com.payto.model.CreateJourneyModel
import com.payto.model.ExchangeRateModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class JourneySettingRepository @Inject internal constructor(
    private val dataSource: PaytoDatasource,
    private val dao: JourneyDao,
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

    suspend fun updateJourney(id: String, journey: CreateJourneyModel?) =
        withContext(Dispatchers.IO) {
            if (journey == null) throw IllegalArgumentException("journey is null")

            val request = CreateJourneyDTO(
                baseCurrency = journey.country?.currency ?: "",
                exchangeRate = journey.exchangeRateModel.exchangeRate,
                title = journey.title ?: "",
                startDate = journey.journeyDate?.startTimeMill?.toDateString(),
                endDate = journey.journeyDate?.endTimeMill?.toDateString(),
                localeCode = journey.country?.localeCode ?: "",
                members = journey.members.map { MemberDTO(it.name) }
            )
            val data = dataSource.updateJourney(id, request)
            val payer = dao.getJourneyPayer(id)
            val memberInfo = data.members?.associate { it.name to (it.name == payer) }?.toMap()
            dao.insert(data.asEntity(memberInfo = memberInfo))
            return@withContext data.asModel()
        }
}
