package com.payto.common.ext

import java.text.DecimalFormat

fun Long.numberFormat(): String {
    val formatter = DecimalFormat("#,###")
    return formatter.format(this)
}