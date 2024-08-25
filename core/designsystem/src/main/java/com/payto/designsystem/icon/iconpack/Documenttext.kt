package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Documenttext: ImageVector
    get() {
        if (_documenttext != null) {
            return _documenttext!!
        }
        _documenttext = Builder(name = "Documenttext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3715f, 2.1166f)
                curveTo(5.5754f, 2.0999f, 5.8175f, 2.1f, 6.0718f, 2.1f)
                horizontalLineTo(15.0658f)
                lineTo(20.4016f, 7.7025f)
                lineTo(20.4016f, 19.4297f)
                curveTo(20.4016f, 19.6841f, 20.4016f, 19.9261f, 20.3849f, 20.1301f)
                curveTo(20.3668f, 20.3525f, 20.3244f, 20.6076f, 20.1945f, 20.8626f)
                curveTo(20.0123f, 21.2201f, 19.7216f, 21.5107f, 19.3641f, 21.6929f)
                curveTo(19.1092f, 21.8228f, 18.8541f, 21.8652f, 18.6316f, 21.8834f)
                curveTo(18.4277f, 21.9f, 18.1856f, 21.9f, 17.9313f, 21.9f)
                horizontalLineTo(6.0718f)
                curveTo(5.8175f, 21.9f, 5.5754f, 21.9f, 5.3715f, 21.8834f)
                curveTo(5.1491f, 21.8652f, 4.894f, 21.8228f, 4.639f, 21.6929f)
                curveTo(4.2815f, 21.5107f, 3.9908f, 21.2201f, 3.8087f, 20.8626f)
                curveTo(3.6787f, 20.6076f, 3.6363f, 20.3525f, 3.6182f, 20.1301f)
                curveTo(3.6015f, 19.9261f, 3.6015f, 19.6841f, 3.6016f, 19.4297f)
                verticalLineTo(4.5702f)
                curveTo(3.6015f, 4.3159f, 3.6015f, 4.0739f, 3.6182f, 3.8699f)
                curveTo(3.6363f, 3.6475f, 3.6787f, 3.3924f, 3.8087f, 3.1374f)
                curveTo(3.9908f, 2.7799f, 4.2815f, 2.4892f, 4.639f, 2.3071f)
                curveTo(4.894f, 2.1772f, 5.1491f, 2.1348f, 5.3715f, 2.1166f)
                close()
                moveTo(5.4015f, 3.9998f)
                curveTo(5.4015f, 3.9446f, 5.4463f, 3.8998f, 5.5016f, 3.8998f)
                horizontalLineTo(13.1016f)
                verticalLineTo(8.9002f)
                horizontalLineTo(18.6015f)
                verticalLineTo(19.9998f)
                curveTo(18.6015f, 20.055f, 18.5568f, 20.0998f, 18.5015f, 20.0998f)
                horizontalLineTo(5.5016f)
                curveTo(5.4463f, 20.0998f, 5.4015f, 20.055f, 5.4015f, 19.9998f)
                verticalLineTo(3.9998f)
                close()
                moveTo(14.9016f, 7.1002f)
                verticalLineTo(4.5373f)
                lineTo(17.3424f, 7.1002f)
                horizontalLineTo(14.9016f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5016f, 15.3004f)
                horizontalLineTo(7.5016f)
                verticalLineTo(13.5004f)
                horizontalLineTo(12.5016f)
                verticalLineTo(15.3004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5016f, 18.3004f)
                horizontalLineTo(12.5016f)
                verticalLineTo(16.5004f)
                horizontalLineTo(7.5016f)
                verticalLineTo(18.3004f)
                close()
            }
        }
        .build()
        return _documenttext!!
    }

private var _documenttext: ImageVector? = null
