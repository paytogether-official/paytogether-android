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

public val IconPack.Circlepoint: ImageVector
    get() {
        if (_circlepoint != null) {
            return _circlepoint!!
        }
        _circlepoint = Builder(name = "Circlepoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 3.9f)
                curveTo(7.528f, 3.9f, 3.9016f, 7.5265f, 3.9016f, 12.0f)
                curveTo(3.9016f, 16.4735f, 7.528f, 20.1f, 12.0016f, 20.1f)
                curveTo(16.4751f, 20.1f, 20.1015f, 16.4735f, 20.1015f, 12.0f)
                curveTo(20.1015f, 7.5265f, 16.4751f, 3.9f, 12.0016f, 3.9f)
                close()
                moveTo(2.1016f, 12.0f)
                curveTo(2.1016f, 6.5324f, 6.5339f, 2.1f, 12.0016f, 2.1f)
                curveTo(17.4692f, 2.1f, 21.9015f, 6.5324f, 21.9015f, 12.0f)
                curveTo(21.9015f, 17.4676f, 17.4692f, 21.9f, 12.0016f, 21.9f)
                curveTo(6.5339f, 21.9f, 2.1016f, 17.4676f, 2.1016f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4015f, 16.4f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.8433f)
                curveTo(14.7386f, 8.0f, 15.9072f, 9.1776f, 15.9014f, 10.8889f)
                curveTo(15.9072f, 12.6235f, 14.7154f, 13.7663f, 12.7852f, 13.7663f)
                horizontalLineTo(11.3782f)
                verticalLineTo(16.4f)
                horizontalLineTo(9.4015f)
                close()
                moveTo(11.3782f, 12.2f)
                horizontalLineTo(12.4247f)
                curveTo(13.3607f, 12.2058f, 13.8549f, 11.6837f, 13.8549f, 10.8889f)
                curveTo(13.8549f, 10.1058f, 13.3607f, 9.6011f, 12.4247f, 9.6011f)
                horizontalLineTo(11.3782f)
                verticalLineTo(12.2f)
                close()
            }
        }
        .build()
        return _circlepoint!!
    }

private var _circlepoint: ImageVector? = null
