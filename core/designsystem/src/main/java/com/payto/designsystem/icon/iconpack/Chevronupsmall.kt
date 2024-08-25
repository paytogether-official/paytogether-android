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

public val IconPack.Chevronupsmall: ImageVector
    get() {
        if (_chevronupsmall != null) {
            return _chevronupsmall!!
        }
        _chevronupsmall = Builder(name = "Chevronupsmall", defaultWidth = 25.0.dp, defaultHeight =
                25.0.dp, viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5441f, 16.288f)
                curveTo(4.9102f, 16.6541f, 5.5038f, 16.6541f, 5.8699f, 16.288f)
                lineTo(12.4987f, 9.6592f)
                lineTo(19.1274f, 16.288f)
                curveTo(19.4936f, 16.6541f, 20.0871f, 16.6541f, 20.4533f, 16.288f)
                curveTo(20.8194f, 15.9218f, 20.8194f, 15.3282f, 20.4533f, 14.9621f)
                lineTo(13.1616f, 7.6705f)
                curveTo(12.7955f, 7.3043f, 12.2019f, 7.3043f, 11.8358f, 7.6705f)
                lineTo(4.5441f, 14.9621f)
                curveTo(4.178f, 15.3282f, 4.178f, 15.9218f, 4.5441f, 16.288f)
                close()
            }
        }
        .build()
        return _chevronupsmall!!
    }

private var _chevronupsmall: ImageVector? = null
