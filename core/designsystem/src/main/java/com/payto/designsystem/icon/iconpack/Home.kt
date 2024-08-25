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

public val IconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.4549f, 2.2846f)
                curveTo(11.7776f, 2.0378f, 12.2256f, 2.0378f, 12.5483f, 2.2846f)
                lineTo(21.0483f, 8.7845f)
                curveTo(21.2709f, 8.9548f, 21.4016f, 9.2191f, 21.4016f, 9.4994f)
                lineTo(21.4016f, 18.9292f)
                curveTo(21.4016f, 19.1835f, 21.4016f, 19.4256f, 21.385f, 19.6296f)
                curveTo(21.3668f, 19.852f, 21.3244f, 20.1071f, 21.1945f, 20.3621f)
                curveTo(21.0123f, 20.7196f, 20.7217f, 21.0102f, 20.3641f, 21.1924f)
                curveTo(20.1092f, 21.3223f, 19.8541f, 21.3647f, 19.6317f, 21.3829f)
                curveTo(19.4277f, 21.3995f, 19.1857f, 21.3995f, 18.9314f, 21.3995f)
                lineTo(12.9018f, 21.3995f)
                verticalLineTo(13.9999f)
                horizontalLineTo(11.1018f)
                verticalLineTo(21.3995f)
                lineTo(5.0718f, 21.3995f)
                curveTo(4.8175f, 21.3995f, 4.5754f, 21.3995f, 4.3715f, 21.3829f)
                curveTo(4.1491f, 21.3647f, 3.894f, 21.3223f, 3.639f, 21.1924f)
                curveTo(3.2815f, 21.0102f, 2.9908f, 20.7196f, 2.8087f, 20.3621f)
                curveTo(2.6787f, 20.1071f, 2.6363f, 19.852f, 2.6182f, 19.6296f)
                curveTo(2.6015f, 19.4256f, 2.6015f, 19.1836f, 2.6016f, 18.9292f)
                lineTo(2.6016f, 9.4994f)
                curveTo(2.6016f, 9.2191f, 2.7322f, 8.9548f, 2.9549f, 8.7845f)
                lineTo(11.4549f, 2.2846f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
