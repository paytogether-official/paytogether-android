package com.payto.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Country(
    val continent: Continent?,
    val currency: String,
    val koreanName: String,
    val imageUrl: String?
) : Parcelable

@Parcelize
enum class Continent(val koreanName: String) : Parcelable {
    ASIA("아시아"),
    EUROPE("유럽"),
    AMERICA("아메리카"),
    OCEANIA("오세아니아"),
    AFRICA("아프리카");

    companion object {
        private val map = Continent.entries.associateBy { it.koreanName }

        fun from(koreanName: String?): Continent? {
            return map[koreanName]
        }
    }
}

@Parcelize
data class FilterState(
    val continent: Continent? = null,
    val query: String = ""
) : Parcelable
