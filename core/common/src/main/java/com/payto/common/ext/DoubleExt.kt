package com.payto.common.ext

import java.text.DecimalFormat


fun Double.numberFormat(): String {
    val formatter = DecimalFormat("#,###.##")
    return formatter.format(this)
}

fun Double.safeDiv(divisor: Double): Double {
    return this / if (divisor == 0.0) 1.0 else divisor
}

fun Double.truncateToTwoDecimalPlaces(): Double {
    return kotlin.math.floor(this * 100) / 100
}
