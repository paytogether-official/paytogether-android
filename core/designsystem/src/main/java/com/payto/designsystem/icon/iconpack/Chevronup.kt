package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Chevronup: ImageVector
    get() {
        if (_chevronup != null) {
            return _chevronup!!
        }
        _chevronup = Builder(name = "Chevronup", defaultWidth = 25.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5051f, 16.8087f)
                curveTo(3.8712f, 17.1749f, 4.4648f, 17.1749f, 4.8309f, 16.8087f)
                lineTo(12.5013f, 9.1383f)
                lineTo(20.1717f, 16.8087f)
                curveTo(20.5378f, 17.1749f, 21.1314f, 17.1749f, 21.4975f, 16.8087f)
                curveTo(21.8636f, 16.4426f, 21.8636f, 15.849f, 21.4975f, 15.4829f)
                lineTo(13.1642f, 7.1496f)
                curveTo(12.7981f, 6.7835f, 12.2045f, 6.7835f, 11.8384f, 7.1496f)
                lineTo(3.5051f, 15.4829f)
                curveTo(3.1389f, 15.849f, 3.1389f, 16.4426f, 3.5051f, 16.8087f)
                close()
            }
        }
        .build()
        return _chevronup!!
    }

private var _chevronup: ImageVector? = null
