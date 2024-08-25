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

public val IconPack.Dot: ImageVector
    get() {
        if (_dot != null) {
            return _dot!!
        }
        _dot = Builder(name = "Dot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 15.312f, 15.312f, 18.0001f, 12.0f, 18.0001f)
                curveTo(8.688f, 18.0001f, 6.0f, 15.312f, 6.0f, 12.0f)
                curveTo(6.0f, 8.688f, 8.688f, 6.0f, 12.0f, 6.0f)
                curveTo(15.312f, 6.0f, 18.0f, 8.688f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _dot!!
    }

private var _dot: ImageVector? = null
