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

public val IconPack.Chevrondownthicksmall: ImageVector
    get() {
        if (_chevrondownthicksmall != null) {
            return _chevrondownthicksmall!!
        }
        _chevrondownthicksmall = Builder(name = "Chevrondownthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.08f, 8.0808f)
                curveTo(4.5877f, 7.5731f, 5.4108f, 7.5731f, 5.9185f, 8.0808f)
                lineTo(11.9992f, 14.1615f)
                lineTo(18.08f, 8.0808f)
                curveTo(18.5877f, 7.5731f, 19.4108f, 7.5731f, 19.9185f, 8.0808f)
                curveTo(20.4261f, 8.5885f, 20.4261f, 9.4116f, 19.9185f, 9.9192f)
                lineTo(12.9185f, 16.9193f)
                curveTo(12.4108f, 17.4269f, 11.5877f, 17.4269f, 11.08f, 16.9193f)
                lineTo(4.08f, 9.9192f)
                curveTo(3.5723f, 9.4116f, 3.5723f, 8.5885f, 4.08f, 8.0808f)
                close()
            }
        }
        .build()
        return _chevrondownthicksmall!!
    }

private var _chevrondownthicksmall: ImageVector? = null
