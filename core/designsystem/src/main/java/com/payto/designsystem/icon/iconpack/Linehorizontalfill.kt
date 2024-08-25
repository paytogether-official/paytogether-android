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

public val IconPack.Linehorizontalfill: ImageVector
    get() {
        if (_linehorizontalfill != null) {
            return _linehorizontalfill!!
        }
        _linehorizontalfill = Builder(name = "Linehorizontalfill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6992f, 12.0f)
                curveTo(4.6992f, 11.282f, 5.2813f, 10.7f, 5.9992f, 10.7f)
                horizontalLineTo(17.9992f)
                curveTo(18.7172f, 10.7f, 19.2992f, 11.282f, 19.2992f, 12.0f)
                curveTo(19.2992f, 12.718f, 18.7172f, 13.3f, 17.9992f, 13.3f)
                horizontalLineTo(5.9992f)
                curveTo(5.2813f, 13.3f, 4.6992f, 12.718f, 4.6992f, 12.0f)
                close()
            }
        }
        .build()
        return _linehorizontalfill!!
    }

private var _linehorizontalfill: ImageVector? = null
