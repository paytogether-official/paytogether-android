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

public val IconPack.Circle: ImageVector
    get() {
        if (_circle != null) {
            return _circle!!
        }
        _circle = Builder(name = "Circle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 3.9f)
                curveTo(7.5281f, 3.9f, 3.9016f, 7.5265f, 3.9016f, 12.0f)
                curveTo(3.9016f, 16.4735f, 7.5281f, 20.1f, 12.0016f, 20.1f)
                curveTo(16.4751f, 20.1f, 20.1016f, 16.4735f, 20.1016f, 12.0f)
                curveTo(20.1016f, 7.5265f, 16.4751f, 3.9f, 12.0016f, 3.9f)
                close()
                moveTo(2.1016f, 12.0f)
                curveTo(2.1016f, 6.5324f, 6.5339f, 2.1f, 12.0016f, 2.1f)
                curveTo(17.4692f, 2.1f, 21.9016f, 6.5324f, 21.9016f, 12.0f)
                curveTo(21.9016f, 17.4676f, 17.4692f, 21.9f, 12.0016f, 21.9f)
                curveTo(6.5339f, 21.9f, 2.1016f, 17.4676f, 2.1016f, 12.0f)
                close()
            }
        }
        .build()
        return _circle!!
    }

private var _circle: ImageVector? = null
