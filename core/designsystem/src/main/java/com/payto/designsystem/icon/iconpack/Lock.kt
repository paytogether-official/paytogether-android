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

public val IconPack.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9016f, 6.8888f)
                curveTo(8.9016f, 5.2619f, 10.2654f, 3.9f, 12.0016f, 3.9f)
                curveTo(13.7377f, 3.9f, 15.1016f, 5.2619f, 15.1016f, 6.8888f)
                verticalLineTo(10.1001f)
                lineTo(8.9016f, 10.1002f)
                verticalLineTo(6.8888f)
                close()
                moveTo(7.1016f, 10.1001f)
                verticalLineTo(6.8888f)
                curveTo(7.1016f, 4.2203f, 9.3195f, 2.1f, 12.0016f, 2.1f)
                curveTo(14.6837f, 2.1f, 16.9016f, 4.2203f, 16.9016f, 6.8888f)
                verticalLineTo(10.1f)
                curveTo(17.0782f, 10.1f, 17.2548f, 10.1f, 17.4313f, 10.1f)
                curveTo(17.6856f, 10.1f, 17.9277f, 10.1f, 18.1317f, 10.1167f)
                curveTo(18.3541f, 10.1348f, 18.6092f, 10.1772f, 18.8642f, 10.3071f)
                curveTo(19.2217f, 10.4893f, 19.5123f, 10.7799f, 19.6945f, 11.1375f)
                curveTo(19.8244f, 11.3924f, 19.8668f, 11.6475f, 19.885f, 11.8699f)
                curveTo(19.9016f, 12.0739f, 19.9016f, 12.3159f, 19.9016f, 12.5703f)
                verticalLineTo(19.4298f)
                curveTo(19.9016f, 19.6841f, 19.9016f, 19.9261f, 19.885f, 20.1301f)
                curveTo(19.8668f, 20.3525f, 19.8244f, 20.6076f, 19.6945f, 20.8626f)
                curveTo(19.5123f, 21.2201f, 19.2217f, 21.5107f, 18.8642f, 21.6929f)
                curveTo(18.6092f, 21.8228f, 18.3541f, 21.8652f, 18.1317f, 21.8834f)
                curveTo(17.9277f, 21.9f, 17.6857f, 21.9f, 17.4313f, 21.9f)
                horizontalLineTo(6.5718f)
                curveTo(6.3175f, 21.9f, 6.0754f, 21.9f, 5.8715f, 21.8834f)
                curveTo(5.6491f, 21.8652f, 5.394f, 21.8228f, 5.139f, 21.6929f)
                curveTo(4.7815f, 21.5107f, 4.4908f, 21.2201f, 4.3087f, 20.8626f)
                curveTo(4.1787f, 20.6076f, 4.1364f, 20.3525f, 4.1182f, 20.1301f)
                curveTo(4.1015f, 19.9261f, 4.1015f, 19.6841f, 4.1016f, 19.4298f)
                lineTo(4.1016f, 12.6f)
                lineTo(4.1016f, 12.5703f)
                curveTo(4.1015f, 12.3159f, 4.1015f, 12.0739f, 4.1182f, 11.8699f)
                curveTo(4.1364f, 11.6475f, 4.1787f, 11.3924f, 4.3087f, 11.1375f)
                curveTo(4.4908f, 10.7799f, 4.7815f, 10.4893f, 5.139f, 10.3071f)
                curveTo(5.394f, 10.1772f, 5.6491f, 10.1348f, 5.8715f, 10.1167f)
                curveTo(6.0754f, 10.1f, 6.3175f, 10.1f, 6.5718f, 10.1f)
                curveTo(6.7484f, 10.1001f, 6.925f, 10.1001f, 7.1016f, 10.1001f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
