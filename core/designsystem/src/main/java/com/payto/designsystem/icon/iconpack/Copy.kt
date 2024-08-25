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

public val IconPack.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5718f, 2.1006f)
                curveTo(4.3175f, 2.1006f, 4.0754f, 2.1005f, 3.8715f, 2.1172f)
                curveTo(3.6491f, 2.1354f, 3.394f, 2.1778f, 3.139f, 2.3077f)
                curveTo(2.7815f, 2.4898f, 2.4908f, 2.7805f, 2.3087f, 3.138f)
                curveTo(2.1787f, 3.393f, 2.1363f, 3.6481f, 2.1182f, 3.8705f)
                curveTo(2.1015f, 4.0745f, 2.1015f, 4.3165f, 2.1016f, 4.5708f)
                verticalLineTo(15.4303f)
                curveTo(2.1015f, 15.6847f, 2.1015f, 15.9267f, 2.1182f, 16.1307f)
                curveTo(2.1363f, 16.3531f, 2.1787f, 16.6082f, 2.3087f, 16.8632f)
                curveTo(2.4908f, 17.2207f, 2.7815f, 17.5113f, 3.139f, 17.6935f)
                curveTo(3.394f, 17.8234f, 3.6491f, 17.8658f, 3.8715f, 17.884f)
                curveTo(4.0754f, 17.9006f, 4.3175f, 17.9006f, 4.5718f, 17.9006f)
                horizontalLineTo(15.4313f)
                curveTo(15.6856f, 17.9006f, 15.9277f, 17.9006f, 16.1316f, 17.884f)
                curveTo(16.3541f, 17.8658f, 16.6092f, 17.8234f, 16.8641f, 17.6935f)
                curveTo(17.2217f, 17.5113f, 17.5123f, 17.2207f, 17.6945f, 16.8632f)
                curveTo(17.8244f, 16.6082f, 17.8668f, 16.3531f, 17.8849f, 16.1307f)
                curveTo(17.9016f, 15.9267f, 17.9016f, 15.6847f, 17.9016f, 15.4303f)
                verticalLineTo(4.5708f)
                curveTo(17.9016f, 4.3165f, 17.9016f, 4.0745f, 17.8849f, 3.8705f)
                curveTo(17.8668f, 3.6481f, 17.8244f, 3.393f, 17.6945f, 3.138f)
                curveTo(17.5123f, 2.7805f, 17.2217f, 2.4898f, 16.8641f, 2.3077f)
                curveTo(16.6092f, 2.1778f, 16.3541f, 2.1354f, 16.1316f, 2.1172f)
                curveTo(15.9277f, 2.1005f, 15.6856f, 2.1006f, 15.4313f, 2.1006f)
                horizontalLineTo(4.5718f)
                close()
                moveTo(3.9016f, 4.0004f)
                curveTo(3.9016f, 3.9452f, 3.9463f, 3.9004f, 4.0016f, 3.9004f)
                horizontalLineTo(16.0015f)
                curveTo(16.0568f, 3.9004f, 16.1015f, 3.9452f, 16.1015f, 4.0004f)
                verticalLineTo(16.0004f)
                curveTo(16.1015f, 16.0556f, 16.0568f, 16.1004f, 16.0015f, 16.1004f)
                horizontalLineTo(4.0016f)
                curveTo(3.9463f, 16.1004f, 3.9016f, 16.0556f, 3.9016f, 16.0004f)
                verticalLineTo(4.0004f)
                close()
                moveTo(21.885f, 20.1311f)
                curveTo(21.9016f, 19.9271f, 21.9016f, 19.6851f, 21.9016f, 19.4307f)
                lineTo(21.9016f, 9.001f)
                lineTo(20.1016f, 9.0014f)
                verticalLineTo(20.0014f)
                curveTo(20.1016f, 20.0566f, 20.0568f, 20.1014f, 20.0016f, 20.1014f)
                horizontalLineTo(9.0016f)
                lineTo(9.0016f, 21.901f)
                lineTo(19.4313f, 21.901f)
                curveTo(19.6857f, 21.901f, 19.9277f, 21.901f, 20.1317f, 21.8844f)
                curveTo(20.3541f, 21.8662f, 20.6092f, 21.8238f, 20.8642f, 21.6939f)
                curveTo(21.2217f, 21.5117f, 21.5123f, 21.2211f, 21.6945f, 20.8636f)
                curveTo(21.8244f, 20.6086f, 21.8668f, 20.3535f, 21.885f, 20.1311f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
