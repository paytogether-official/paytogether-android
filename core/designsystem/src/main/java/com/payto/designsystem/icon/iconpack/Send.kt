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

public val IconPack.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.52f, 3.4192f)
                curveTo(4.5945f, 2.9815f, 3.6254f, 3.9346f, 4.0476f, 4.8672f)
                lineTo(6.8693f, 11.1f)
                horizontalLineTo(14.0325f)
                verticalLineTo(12.9f)
                horizontalLineTo(6.8364f)
                lineTo(3.9573f, 19.1215f)
                curveTo(3.5255f, 20.0547f, 4.4961f, 21.0174f, 5.4257f, 20.5779f)
                lineTo(21.5152f, 12.9724f)
                curveTo(22.355f, 12.5754f, 22.3551f, 11.3806f, 21.5154f, 10.9835f)
                lineTo(5.52f, 3.4192f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
