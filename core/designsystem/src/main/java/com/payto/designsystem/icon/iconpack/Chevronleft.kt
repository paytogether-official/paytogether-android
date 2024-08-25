package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Chevronleft: ImageVector
    get() {
        if (_chevronleft != null) {
            return _chevronleft!!
        }
        _chevronleft = Builder(name = "Chevronleft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.138f, 3.3628f)
                curveTo(16.4894f, 3.7143f, 16.4894f, 4.2842f, 16.138f, 4.6356f)
                lineTo(8.7744f, 11.9992f)
                lineTo(16.138f, 19.3628f)
                curveTo(16.4894f, 19.7143f, 16.4894f, 20.2842f, 16.138f, 20.6356f)
                curveTo(15.7865f, 20.9871f, 15.2166f, 20.9871f, 14.8652f, 20.6356f)
                lineTo(6.8652f, 12.6356f)
                curveTo(6.5137f, 12.2842f, 6.5137f, 11.7143f, 6.8652f, 11.3628f)
                lineTo(14.8652f, 3.3628f)
                curveTo(15.2166f, 3.0114f, 15.7865f, 3.0114f, 16.138f, 3.3628f)
                close()
            }
        }
        .build()
        return _chevronleft!!
    }

private var _chevronleft: ImageVector? = null
