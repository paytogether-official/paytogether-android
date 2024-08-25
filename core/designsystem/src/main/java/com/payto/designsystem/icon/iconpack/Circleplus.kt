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

public val IconPack.Circleplus: ImageVector
    get() {
        if (_circleplus != null) {
            return _circleplus!!
        }
        _circleplus = Builder(name = "Circleplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.1016f, 12.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.9016f)
                verticalLineTo(12.9f)
                horizontalLineTo(17.0015f)
                verticalLineTo(11.1f)
                horizontalLineTo(12.9016f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.1016f)
                verticalLineTo(11.1f)
                horizontalLineTo(7.0016f)
                verticalLineTo(12.9f)
                horizontalLineTo(11.1016f)
                close()
            }
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
        }
        .build()
        return _circleplus!!
    }

private var _circleplus: ImageVector? = null
