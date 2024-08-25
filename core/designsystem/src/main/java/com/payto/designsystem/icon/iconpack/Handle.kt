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

public val IconPack.Handle: ImageVector
    get() {
        if (_handle != null) {
            return _handle!!
        }
        _handle = Builder(name = "Handle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1016f, 10.0f)
                curveTo(3.1016f, 9.5029f, 3.5045f, 9.1f, 4.0016f, 9.1f)
                horizontalLineTo(20.0015f)
                curveTo(20.4986f, 9.1f, 20.9015f, 9.5029f, 20.9015f, 10.0f)
                curveTo(20.9015f, 10.497f, 20.4986f, 10.9f, 20.0015f, 10.9f)
                horizontalLineTo(4.0016f)
                curveTo(3.5045f, 10.9f, 3.1016f, 10.497f, 3.1016f, 10.0f)
                close()
                moveTo(3.1016f, 14.0f)
                curveTo(3.1016f, 13.5029f, 3.5045f, 13.1f, 4.0016f, 13.1f)
                horizontalLineTo(20.0015f)
                curveTo(20.4986f, 13.1f, 20.9015f, 13.5029f, 20.9015f, 14.0f)
                curveTo(20.9015f, 14.497f, 20.4986f, 14.9f, 20.0015f, 14.9f)
                horizontalLineTo(4.0016f)
                curveTo(3.5045f, 14.9f, 3.1016f, 14.497f, 3.1016f, 14.0f)
                close()
            }
        }
        .build()
        return _handle!!
    }

private var _handle: ImageVector? = null
