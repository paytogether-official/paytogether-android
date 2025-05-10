package com.payto.common.ext

import java.text.DecimalFormat
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun Long.numberFormat(): String {
    val formatter = DecimalFormat("#,###")
    return formatter.format(this)
}

fun Long.toKoreanDateString(format: String = "yyyy-MM-dd"): String {
    val formatter = DateTimeFormatter.ofPattern(format)
    return Instant.ofEpochMilli(this)
        .atZone(ZoneId.of("Asia/Seoul"))
        .toLocalDate()
        .format(formatter)
}