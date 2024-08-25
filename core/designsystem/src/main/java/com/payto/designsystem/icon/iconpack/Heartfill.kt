package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Heartfill: ImageVector
    get() {
        if (_heartfill != null) {
            return _heartfill!!
        }
        _heartfill = Builder(name = "Heartfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0015f, 4.9681f)
                curveTo(14.169f, 2.567f, 17.8407f, 2.3017f, 20.3156f, 4.5106f)
                curveTo(22.9591f, 6.8701f, 23.1103f, 11.0531f, 20.6533f, 13.6116f)
                lineTo(20.6431f, 13.622f)
                lineTo(13.1715f, 21.1548f)
                curveTo(12.5278f, 21.8183f, 11.4753f, 21.8183f, 10.8315f, 21.1548f)
                lineTo(3.3599f, 13.622f)
                lineTo(3.3498f, 13.6116f)
                curveTo(0.8928f, 11.0531f, 1.044f, 6.8701f, 3.6875f, 4.5106f)
                curveTo(6.1623f, 2.3017f, 9.834f, 2.567f, 12.0015f, 4.9681f)
                close()
            }
        }
        .build()
        return _heartfill!!
    }

private var _heartfill: ImageVector? = null
