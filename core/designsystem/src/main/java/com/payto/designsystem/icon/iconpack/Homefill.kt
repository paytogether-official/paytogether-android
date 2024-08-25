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

public val IconPack.Homefill: ImageVector
    get() {
        if (_homefill != null) {
            return _homefill!!
        }
        _homefill = Builder(name = "Homefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5483f, 2.2846f)
                curveTo(12.2256f, 2.0378f, 11.7776f, 2.0378f, 11.4549f, 2.2846f)
                lineTo(2.9549f, 8.7845f)
                curveTo(2.7322f, 8.9548f, 2.6016f, 9.2191f, 2.6016f, 9.4995f)
                lineTo(2.6016f, 18.9293f)
                curveTo(2.6015f, 19.1836f, 2.6015f, 19.4256f, 2.6182f, 19.6296f)
                curveTo(2.6363f, 19.852f, 2.6787f, 20.1071f, 2.8087f, 20.3621f)
                curveTo(2.9908f, 20.7196f, 3.2815f, 21.0103f, 3.639f, 21.1924f)
                curveTo(3.894f, 21.3223f, 4.1491f, 21.3647f, 4.3715f, 21.3829f)
                curveTo(4.5754f, 21.3996f, 4.8175f, 21.3995f, 5.0718f, 21.3995f)
                horizontalLineTo(18.9313f)
                curveTo(19.1856f, 21.3995f, 19.4277f, 21.3996f, 19.6317f, 21.3829f)
                curveTo(19.8541f, 21.3647f, 20.1092f, 21.3223f, 20.3641f, 21.1924f)
                curveTo(20.7217f, 21.0103f, 21.0123f, 20.7196f, 21.1945f, 20.3621f)
                curveTo(21.3244f, 20.1071f, 21.3668f, 19.852f, 21.385f, 19.6296f)
                curveTo(21.4016f, 19.4257f, 21.4016f, 19.1836f, 21.4016f, 18.9293f)
                lineTo(21.4016f, 9.4995f)
                curveTo(21.4016f, 9.2191f, 21.2709f, 8.9548f, 21.0483f, 8.7845f)
                lineTo(12.5483f, 2.2846f)
                close()
                moveTo(11.9408f, 4.179f)
                curveTo(11.9767f, 4.1516f, 12.0265f, 4.1516f, 12.0623f, 4.179f)
                lineTo(19.5623f, 9.9143f)
                curveTo(19.5871f, 9.9332f, 19.6016f, 9.9625f, 19.6016f, 9.9937f)
                verticalLineTo(19.4996f)
                curveTo(19.6016f, 19.5548f, 19.5568f, 19.5996f, 19.5016f, 19.5996f)
                horizontalLineTo(12.9019f)
                verticalLineTo(13.9995f)
                horizontalLineTo(11.1019f)
                verticalLineTo(19.5996f)
                horizontalLineTo(4.5016f)
                curveTo(4.4463f, 19.5996f, 4.4016f, 19.5548f, 4.4016f, 19.4996f)
                verticalLineTo(9.9937f)
                curveTo(4.4016f, 9.9625f, 4.4161f, 9.9332f, 4.4408f, 9.9143f)
                lineTo(11.9408f, 4.179f)
                close()
            }
        }
        .build()
        return _homefill!!
    }

private var _homefill: ImageVector? = null
