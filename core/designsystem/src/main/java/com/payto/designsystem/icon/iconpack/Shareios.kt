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

public val IconPack.Shareios: ImageVector
    get() {
        if (_shareios != null) {
            return _shareios!!
        }
        _shareios = Builder(name = "Shareios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.274f, 7.1267f)
                curveTo(15.9287f, 7.4843f, 15.359f, 7.4943f, 15.0014f, 7.149f)
                lineTo(12.9015f, 5.1216f)
                verticalLineTo(14.5008f)
                curveTo(12.9015f, 14.9978f, 12.4986f, 15.4008f, 12.0015f, 15.4008f)
                curveTo(11.5045f, 15.4008f, 11.1015f, 14.9978f, 11.1015f, 14.5008f)
                verticalLineTo(5.1216f)
                lineTo(9.0017f, 7.149f)
                curveTo(8.6441f, 7.4943f, 8.0743f, 7.4843f, 7.7291f, 7.1267f)
                curveTo(7.3838f, 6.7691f, 7.3938f, 6.1993f, 7.7514f, 5.8541f)
                lineTo(11.3764f, 2.3541f)
                curveTo(11.7251f, 2.0174f, 12.2779f, 2.0174f, 12.6267f, 2.3541f)
                lineTo(16.2517f, 5.8541f)
                curveTo(16.6092f, 6.1993f, 16.6192f, 6.7691f, 16.274f, 7.1267f)
                close()
                moveTo(20.9016f, 9.9994f)
                lineTo(20.9016f, 19.4298f)
                curveTo(20.9016f, 19.6841f, 20.9016f, 19.9261f, 20.8849f, 20.1301f)
                curveTo(20.8668f, 20.3525f, 20.8244f, 20.6076f, 20.6945f, 20.8626f)
                curveTo(20.5123f, 21.2201f, 20.2216f, 21.5108f, 19.8641f, 21.6929f)
                curveTo(19.6092f, 21.8228f, 19.354f, 21.8652f, 19.1316f, 21.8834f)
                curveTo(18.9277f, 21.9001f, 18.6857f, 21.9f, 18.4314f, 21.9f)
                horizontalLineTo(5.5718f)
                curveTo(5.3175f, 21.9f, 5.0754f, 21.9001f, 4.8715f, 21.8834f)
                curveTo(4.6491f, 21.8652f, 4.394f, 21.8228f, 4.139f, 21.6929f)
                curveTo(3.7815f, 21.5108f, 3.4908f, 21.2201f, 3.3087f, 20.8626f)
                curveTo(3.1787f, 20.6076f, 3.1363f, 20.3525f, 3.1182f, 20.1301f)
                curveTo(3.1015f, 19.9261f, 3.1015f, 19.6841f, 3.1016f, 19.4298f)
                verticalLineTo(9.9994f)
                horizontalLineTo(4.9016f)
                verticalLineTo(19.9997f)
                curveTo(4.9016f, 20.0549f, 4.9463f, 20.0997f, 5.0016f, 20.0997f)
                horizontalLineTo(19.0016f)
                curveTo(19.0568f, 20.0997f, 19.1016f, 20.0549f, 19.1016f, 19.9997f)
                verticalLineTo(9.9994f)
                horizontalLineTo(20.9016f)
                close()
            }
        }
        .build()
        return _shareios!!
    }

private var _shareios: ImageVector? = null
