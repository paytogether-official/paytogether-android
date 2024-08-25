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

public val IconPack.Linehorizontal: ImageVector
    get() {
        if (_linehorizontal != null) {
            return _linehorizontal!!
        }
        _linehorizontal = Builder(name = "Linehorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.1016f, 12.0f)
                curveTo(5.1016f, 11.5029f, 5.5045f, 11.1f, 6.0016f, 11.1f)
                horizontalLineTo(18.0016f)
                curveTo(18.4986f, 11.1f, 18.9016f, 11.5029f, 18.9016f, 12.0f)
                curveTo(18.9016f, 12.497f, 18.4986f, 12.9f, 18.0016f, 12.9f)
                horizontalLineTo(6.0016f)
                curveTo(5.5045f, 12.9f, 5.1016f, 12.497f, 5.1016f, 12.0f)
                close()
            }
        }
        .build()
        return _linehorizontal!!
    }

private var _linehorizontal: ImageVector? = null
