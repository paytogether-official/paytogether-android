package com.payto.common.ext

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp

@Composable
fun Dp.toPx(): Float {
    val density = LocalDensity.current
    return with(density) { toPx() }
}

fun Dp.toPx(density: Density): Float = with(density) { this@toPx.toPx() }
