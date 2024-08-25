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

public val IconPack.Lockopen: ImageVector
    get() {
        if (_lockopen != null) {
            return _lockopen!!
        }
        _lockopen = Builder(name = "Lockopen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9016f, 6.8889f)
                curveTo(8.9016f, 5.2619f, 10.2654f, 3.9f, 12.0016f, 3.9f)
                curveTo(13.7377f, 3.9f, 15.1016f, 5.2619f, 15.1016f, 6.8889f)
                lineTo(15.1016f, 7.5001f)
                lineTo(16.9016f, 7.4999f)
                lineTo(16.9016f, 6.8889f)
                curveTo(16.9015f, 4.2203f, 14.6837f, 2.1f, 12.0016f, 2.1f)
                curveTo(9.3195f, 2.1f, 7.1016f, 4.2203f, 7.1016f, 6.8889f)
                verticalLineTo(10.1001f)
                horizontalLineTo(6.5718f)
                curveTo(6.3175f, 10.1001f, 6.0754f, 10.1f, 5.8715f, 10.1167f)
                curveTo(5.6491f, 10.1349f, 5.394f, 10.1772f, 5.139f, 10.3072f)
                curveTo(4.7815f, 10.4893f, 4.4908f, 10.78f, 4.3087f, 11.1375f)
                curveTo(4.1787f, 11.3925f, 4.1364f, 11.6476f, 4.1182f, 11.87f)
                curveTo(4.1015f, 12.074f, 4.1015f, 12.316f, 4.1016f, 12.5703f)
                lineTo(4.1016f, 12.6001f)
                lineTo(4.1016f, 19.4298f)
                curveTo(4.1015f, 19.6842f, 4.1015f, 19.9262f, 4.1182f, 20.1302f)
                curveTo(4.1364f, 20.3526f, 4.1787f, 20.6077f, 4.3087f, 20.8627f)
                curveTo(4.4908f, 21.2202f, 4.7815f, 21.5108f, 5.139f, 21.693f)
                curveTo(5.394f, 21.8229f, 5.6491f, 21.8653f, 5.8715f, 21.8835f)
                curveTo(6.0754f, 21.9001f, 6.3175f, 21.9001f, 6.5718f, 21.9001f)
                horizontalLineTo(17.4313f)
                curveTo(17.6857f, 21.9001f, 17.9277f, 21.9001f, 18.1317f, 21.8835f)
                curveTo(18.3541f, 21.8653f, 18.6092f, 21.8229f, 18.8642f, 21.693f)
                curveTo(19.2217f, 21.5108f, 19.5123f, 21.2202f, 19.6945f, 20.8627f)
                curveTo(19.8244f, 20.6077f, 19.8668f, 20.3526f, 19.885f, 20.1302f)
                curveTo(19.9016f, 19.9262f, 19.9016f, 19.6842f, 19.9016f, 19.4298f)
                verticalLineTo(12.5703f)
                curveTo(19.9016f, 12.316f, 19.9016f, 12.074f, 19.885f, 11.87f)
                curveTo(19.8668f, 11.6476f, 19.8244f, 11.3925f, 19.6945f, 11.1375f)
                curveTo(19.5123f, 10.78f, 19.2217f, 10.4893f, 18.8642f, 10.3072f)
                curveTo(18.6092f, 10.1772f, 18.3541f, 10.1349f, 18.1317f, 10.1167f)
                curveTo(17.9277f, 10.1f, 17.6857f, 10.1001f, 17.4314f, 10.1001f)
                horizontalLineTo(8.9016f)
                verticalLineTo(6.8889f)
                close()
                moveTo(6.0016f, 11.8999f)
                curveTo(5.9464f, 11.8999f, 5.9016f, 11.9446f, 5.9016f, 11.9999f)
                verticalLineTo(19.9999f)
                curveTo(5.9016f, 20.0551f, 5.9464f, 20.0999f, 6.0016f, 20.0999f)
                horizontalLineTo(18.0016f)
                curveTo(18.0569f, 20.0999f, 18.1016f, 20.0551f, 18.1016f, 19.9999f)
                verticalLineTo(11.9999f)
                curveTo(18.1016f, 11.9447f, 18.0569f, 11.8999f, 18.0016f, 11.8999f)
                horizontalLineTo(6.0016f)
                close()
            }
        }
        .build()
        return _lockopen!!
    }

private var _lockopen: ImageVector? = null
