package com.payto.common.ext

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.time.LocalDate


/**
 * 2025-03-21 형식
 * */
fun String.toLocalDate(): LocalDate? = try {
    this.split("-").let { (year, month, day) ->
        LocalDate.of(year.toInt(), month.toInt(), day.toInt())
    }
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


fun String.safeDiv(divisor: Int): String {
    val num = BigDecimal(this.takeIf { it.isNotEmpty() } ?: "0")
    return if (BigDecimal(divisor) == BigDecimal.ZERO) this
    else num.divide(BigDecimal(divisor), 2, RoundingMode.DOWN).toString()
}
