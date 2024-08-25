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

public val IconPack.Documentfill: ImageVector
    get() {
        if (_documentfill != null) {
            return _documentfill!!
        }
        _documentfill = Builder(name = "Documentfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3715f, 2.1165f)
                curveTo(5.5754f, 2.0998f, 5.8175f, 2.0998f, 6.0718f, 2.0999f)
                horizontalLineTo(15.0658f)
                lineTo(20.4016f, 7.7024f)
                verticalLineTo(19.4296f)
                curveTo(20.4016f, 19.6839f, 20.4016f, 19.926f, 20.3849f, 20.1299f)
                curveTo(20.3668f, 20.3523f, 20.3244f, 20.6075f, 20.1945f, 20.8624f)
                curveTo(20.0123f, 21.2199f, 19.7216f, 21.5106f, 19.3641f, 21.6928f)
                curveTo(19.1092f, 21.8227f, 18.8541f, 21.8651f, 18.6316f, 21.8832f)
                curveTo(18.4277f, 21.8999f, 18.1856f, 21.8999f, 17.9313f, 21.8999f)
                horizontalLineTo(6.0718f)
                curveTo(5.8175f, 21.8999f, 5.5754f, 21.8999f, 5.3715f, 21.8832f)
                curveTo(5.1491f, 21.8651f, 4.894f, 21.8227f, 4.639f, 21.6928f)
                curveTo(4.2815f, 21.5106f, 3.9908f, 21.2199f, 3.8087f, 20.8624f)
                curveTo(3.6787f, 20.6075f, 3.6363f, 20.3523f, 3.6182f, 20.1299f)
                curveTo(3.6015f, 19.926f, 3.6015f, 19.6839f, 3.6016f, 19.4296f)
                verticalLineTo(4.5701f)
                curveTo(3.6015f, 4.3158f, 3.6015f, 4.0737f, 3.6182f, 3.8698f)
                curveTo(3.6363f, 3.6474f, 3.6787f, 3.3923f, 3.8087f, 3.1373f)
                curveTo(3.9908f, 2.7798f, 4.2815f, 2.4891f, 4.639f, 2.3069f)
                curveTo(4.894f, 2.177f, 5.1491f, 2.1346f, 5.3715f, 2.1165f)
                close()
                moveTo(5.4015f, 3.9997f)
                curveTo(5.4015f, 3.9444f, 5.4463f, 3.8997f, 5.5016f, 3.8997f)
                horizontalLineTo(13.1016f)
                verticalLineTo(8.9001f)
                horizontalLineTo(18.6015f)
                verticalLineTo(19.9997f)
                curveTo(18.6015f, 20.0549f, 18.5568f, 20.0997f, 18.5015f, 20.0997f)
                horizontalLineTo(5.5016f)
                curveTo(5.4463f, 20.0997f, 5.4015f, 20.0549f, 5.4015f, 19.9997f)
                verticalLineTo(3.9997f)
                close()
                moveTo(14.9016f, 7.1f)
                verticalLineTo(4.5372f)
                lineTo(17.3424f, 7.1f)
                horizontalLineTo(14.9016f)
                close()
            }
        }
        .build()
        return _documentfill!!
    }

private var _documentfill: ImageVector? = null
