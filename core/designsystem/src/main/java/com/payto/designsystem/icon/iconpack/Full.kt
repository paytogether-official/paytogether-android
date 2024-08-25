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

public val IconPack.Full: ImageVector
    get() {
        if (_full != null) {
            return _full!!
        }
        _full = Builder(name = "Full", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3402f, 9.8895f)
                curveTo(13.0031f, 10.2548f, 13.0259f, 10.8242f, 13.3911f, 11.1613f)
                curveTo(13.7563f, 11.4984f, 14.3257f, 11.4757f, 14.6629f, 11.1104f)
                lineTo(19.1016f, 6.3019f)
                verticalLineTo(10.0f)
                curveTo(19.1016f, 10.497f, 19.5045f, 10.9f, 20.0016f, 10.9f)
                curveTo(20.4986f, 10.9f, 20.9016f, 10.497f, 20.9016f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(20.9016f, 3.5029f, 20.4986f, 3.1f, 20.0016f, 3.1f)
                horizontalLineTo(14.5016f)
                curveTo(14.0045f, 3.1f, 13.6016f, 3.5029f, 13.6016f, 4.0f)
                curveTo(13.6016f, 4.497f, 14.0045f, 4.9f, 14.5016f, 4.9f)
                lineTo(17.946f, 4.9f)
                lineTo(13.3402f, 9.8895f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9016f, 14.0f)
                curveTo(4.9016f, 13.5029f, 4.4986f, 13.1f, 4.0016f, 13.1f)
                curveTo(3.5045f, 13.1f, 3.1016f, 13.5029f, 3.1016f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(3.1016f, 20.497f, 3.5045f, 20.9f, 4.0016f, 20.9f)
                horizontalLineTo(9.5016f)
                curveTo(9.9986f, 20.9f, 10.4016f, 20.497f, 10.4016f, 20.0f)
                curveTo(10.4016f, 19.5029f, 9.9986f, 19.1f, 9.5016f, 19.1f)
                horizontalLineTo(6.1743f)
                lineTo(10.638f, 14.6364f)
                curveTo(10.9894f, 14.2849f, 10.9894f, 13.7151f, 10.638f, 13.3636f)
                curveTo(10.2865f, 13.0121f, 9.7166f, 13.0121f, 9.3652f, 13.3636f)
                lineTo(4.9016f, 17.8272f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _full!!
    }

private var _full: ImageVector? = null
