package com.payto.data.network.dto

import com.payto.model.Continent
import com.payto.model.Country
import kotlinx.serialization.Serializable

@Serializable
internal data class LocaleDTO(
    val imageUrl: String?,
    val continent: String?,
    val currency: String,
    val countryKoreanName: String,
    val countryEnglishName: String,
    val localeCode: String,
)

internal fun LocaleDTO.asCountryModel(): Country {
    return Country(
        continent = Continent.from(continent),
        currency = currency,
        koreanName = countryKoreanName,
        imageUrl = imageUrl,
        localeCode = localeCode
    )
}
