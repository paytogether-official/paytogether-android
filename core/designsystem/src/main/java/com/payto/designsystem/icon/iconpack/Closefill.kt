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

public val IconPack.Closefill: ImageVector
    get() {
        if (_closefill != null) {
            return _closefill!!
        }
        _closefill = Builder(name = "Closefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6152f, 4.6137f)
                curveTo(4.9666f, 4.2622f, 5.5365f, 4.2622f, 5.888f, 4.6137f)
                lineTo(12.0016f, 10.7273f)
                lineTo(18.1152f, 4.6137f)
                curveTo(18.4666f, 4.2622f, 19.0365f, 4.2622f, 19.3879f, 4.6137f)
                curveTo(19.7394f, 4.9652f, 19.7394f, 5.535f, 19.3879f, 5.8865f)
                lineTo(13.2743f, 12.0001f)
                lineTo(19.3879f, 18.1137f)
                curveTo(19.7394f, 18.4652f, 19.7394f, 19.035f, 19.3879f, 19.3865f)
                curveTo(19.0365f, 19.738f, 18.4666f, 19.738f, 18.1152f, 19.3865f)
                lineTo(12.0016f, 13.2729f)
                lineTo(5.888f, 19.3865f)
                curveTo(5.5365f, 19.738f, 4.9666f, 19.738f, 4.6152f, 19.3865f)
                curveTo(4.2637f, 19.035f, 4.2637f, 18.4652f, 4.6152f, 18.1137f)
                lineTo(10.7288f, 12.0001f)
                lineTo(4.6152f, 5.8865f)
                curveTo(4.2637f, 5.535f, 4.2637f, 4.9652f, 4.6152f, 4.6137f)
                close()
            }
        }
        .build()
        return _closefill!!
    }

private var _closefill: ImageVector? = null
