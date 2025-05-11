package com.payto.common.ext

import java.time.LocalDate


/**
 * 2025-03-21 형식
 * */
fun String.toLocalDate(): LocalDate? = this.split("-").let { (year, month, day) ->
    LocalDate.of(year.toInt(), month.toInt(), day.toInt())
}