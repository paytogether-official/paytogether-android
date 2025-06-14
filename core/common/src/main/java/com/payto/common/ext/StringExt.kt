package com.payto.common.ext

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.time.LocalDate
import java.time.ZoneId


/**
 * 2025-03-21 형식
 * */
fun String.toLocalDate(): LocalDate? = try {
    LocalDate.parse(this)
} catch (e: Exception) {
    null
}

fun String.numberFormat(): String {
    return try {
        val number = BigDecimal(this)
        val formatter = DecimalFormat("#,###.##")
        formatter.format(number)
    } catch (e: Exception) {
        this
    }
}

/**
 * 2025-03-21 형식
 * */
fun String.toTimeMilli(): Long? {
    return try {
        val localDate = LocalDate.parse(this)
        val zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault())
        return zonedDateTime.toInstant().toEpochMilli()
    } catch (e: Exception) {
        null
    }
}

fun String.safeDiv(divisor: Int): String {
    val num = BigDecimal(this.takeIf { it.isNotEmpty() } ?: "0")
    return if (BigDecimal(divisor) == BigDecimal.ZERO) this
    else num.divide(BigDecimal(divisor), 2, RoundingMode.DOWN).toString()
}
