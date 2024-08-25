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

public val IconPack.Chevrondownsmall: ImageVector
    get() {
        if (_chevrondownsmall != null) {
            return _chevrondownsmall!!
        }
        _chevrondownsmall = Builder(name = "Chevrondownsmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3652f, 8.3636f)
                curveTo(4.7166f, 8.0121f, 5.2865f, 8.0121f, 5.638f, 8.3636f)
                lineTo(12.0016f, 14.7272f)
                lineTo(18.3652f, 8.3636f)
                curveTo(18.7166f, 8.0121f, 19.2865f, 8.0121f, 19.638f, 8.3636f)
                curveTo(19.9894f, 8.715f, 19.9894f, 9.2849f, 19.638f, 9.6364f)
                lineTo(12.638f, 16.6364f)
                curveTo(12.2865f, 16.9878f, 11.7166f, 16.9878f, 11.3652f, 16.6364f)
                lineTo(4.3652f, 9.6364f)
                curveTo(4.0137f, 9.2849f, 4.0137f, 8.715f, 4.3652f, 8.3636f)
                close()
            }
        }
        .build()
        return _chevrondownsmall!!
    }

private var _chevrondownsmall: ImageVector? = null
