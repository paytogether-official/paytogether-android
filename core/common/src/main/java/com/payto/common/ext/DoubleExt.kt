package com.payto.common.ext

import java.text.DecimalFormat


fun Double.numberFormat(): String {
    val formatter = DecimalFormat("#,###")
    return formatter.format(this)
}
