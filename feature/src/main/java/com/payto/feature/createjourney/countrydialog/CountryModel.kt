package com.payto.feature.createjourney.countrydialog

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilterState(
    val continent: Continent? = null,
    val query: String = ""
) : Parcelable

@Parcelize
enum class Country(
    val continent: Continent,
    val currency: String,
    val koreanName: String,
) : Parcelable {
    SouthKorea(Continent.ASIA, "KRW", "대한민국"),
    Japan(Continent.ASIA, "JPY", "일본"),
    Vietnam(Continent.ASIA, "VND", "베트남"),
    Thailand(Continent.ASIA, "THB", "태국"),
    UnitedStates(Continent.AMERICA, "USD", "미국"),
    Philippines(Continent.ASIA, "PHP", "필리핀"),
    Taiwan(Continent.ASIA, "TWD", "대만"),
    Singapore(Continent.ASIA, "SGD", "싱가포르"),
    NewZealand(Continent.OCEANIA, "NZD", "뉴질랜드"),
    HongKong(Continent.ASIA, "HKD", "홍콩"),
    Malaysia(Continent.ASIA, "MYR", "말레이시아"),
    China(Continent.ASIA, "CNH", "중국"),
    Indonesia(Continent.ASIA, "IDR", "인도네시아"),
    Guam(Continent.OCEANIA, "USD", "괌(미국령)"),
    Spain(Continent.EUROPE, "EUR", "스페인"),
    Macao(Continent.ASIA, "MOP", "마카오"),
    Germany(Continent.EUROPE, "EUR", "독일"),
    Austria(Continent.EUROPE, "EUR", "오스트리아"),
    Australia(Continent.OCEANIA, "AUD", "호주"),
    Cambodia(Continent.ASIA, "KHR", "캄보디아"),
    Turkey(Continent.ASIA, "TRY", "튀르키예"),
    Canada(Continent.AMERICA, "CAD", "캐나다"),
    Mongolia(Continent.ASIA, "MNT", "몽골"),
    Mexico(Continent.AMERICA, "MXN", "멕시코"),
    NorthernMariana(Continent.OCEANIA, "USD", "북마리아나(사이판)"),
    UnitedKingdom(Continent.EUROPE, "GBP", "영국"),
    Maldives(Continent.ASIA, "MVR", "몰디브"),
    Israel(Continent.ASIA, "ILS", "이스라엘"),
    Slovenia(Continent.EUROPE, "EUR", "슬로베니아"),
    DominicanRepublic(Continent.AMERICA, "DOP", "도미니카공화국"),
    Finland(Continent.EUROPE, "EUR", "핀란드"),
    Bosnia(Continent.EUROPE, "BAM", "보스니아"),
    Eurozone(Continent.EUROPE, "EUR", "유로존"),
    France(Continent.EUROPE, "EUR", "프랑스"),
    Denmark(Continent.EUROPE, "DKK", "덴마크"),
    WestAfrica(Continent.AFRICA, "XOF", "서아프리카"),
    Italy(Continent.EUROPE, "EUR", "이탈리아"),
    Netherlands(Continent.EUROPE, "EUR", "네덜란드"),
    Belgium(Continent.EUROPE, "EUR", "벨기에"),
    Switzerland(Continent.EUROPE, "CHF", "스위스");
}

@Parcelize
enum class Continent(val koreanName: String) : Parcelable {
    ASIA("아시아"),
    EUROPE("유럽"),
    AMERICA("아메리카"),
    OCEANIA("오세아니아"),
    AFRICA("아프리카")
}

