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

public val IconPack.Chevrondownthick: ImageVector
    get() {
        if (_chevrondownthick != null) {
            return _chevrondownthick!!
        }
        _chevrondownthick = Builder(name = "Chevrondownthick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.08f, 7.5808f)
                curveTo(3.5877f, 7.0731f, 4.4108f, 7.0731f, 4.9185f, 7.5808f)
                lineTo(11.9992f, 14.6615f)
                lineTo(19.08f, 7.5808f)
                curveTo(19.5876f, 7.0731f, 20.4108f, 7.0731f, 20.9184f, 7.5808f)
                curveTo(21.4261f, 8.0885f, 21.4261f, 8.9116f, 20.9184f, 9.4192f)
                lineTo(12.9184f, 17.4193f)
                curveTo(12.4108f, 17.9269f, 11.5877f, 17.9269f, 11.08f, 17.4193f)
                lineTo(3.08f, 9.4192f)
                curveTo(2.5723f, 8.9116f, 2.5723f, 8.0885f, 3.08f, 7.5808f)
                close()
            }
        }
        .build()
        return _chevrondownthick!!
    }

private var _chevrondownthick: ImageVector? = null
