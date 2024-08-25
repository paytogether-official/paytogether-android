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

public val IconPack.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = Builder(name = "List", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4f, 4.6001f)
                curveTo(2.6268f, 4.6001f, 2.0f, 5.2269f, 2.0f, 6.0001f)
                curveTo(2.0f, 6.7733f, 2.6268f, 7.4001f, 3.4f, 7.4001f)
                curveTo(4.1732f, 7.4001f, 4.8f, 6.7733f, 4.8f, 6.0001f)
                curveTo(4.8f, 5.2269f, 4.1732f, 4.6001f, 3.4f, 4.6001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4f, 16.6001f)
                curveTo(2.6268f, 16.6001f, 2.0f, 17.2269f, 2.0f, 18.0001f)
                curveTo(2.0f, 18.7733f, 2.6268f, 19.4001f, 3.4f, 19.4001f)
                curveTo(4.1732f, 19.4001f, 4.8f, 18.7733f, 4.8f, 18.0001f)
                curveTo(4.8f, 17.2269f, 4.1732f, 16.6001f, 3.4f, 16.6001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0001f)
                curveTo(2.0f, 11.2269f, 2.6268f, 10.6001f, 3.4f, 10.6001f)
                curveTo(4.1732f, 10.6001f, 4.8f, 11.2269f, 4.8f, 12.0001f)
                curveTo(4.8f, 12.7733f, 4.1732f, 13.4001f, 3.4f, 13.4001f)
                curveTo(2.6268f, 13.4001f, 2.0f, 12.7733f, 2.0f, 12.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.1f)
                curveTo(7.5029f, 5.1f, 7.1f, 5.5029f, 7.1f, 6.0f)
                curveTo(7.1f, 6.4971f, 7.5029f, 6.9f, 8.0f, 6.9f)
                horizontalLineTo(21.0f)
                curveTo(21.497f, 6.9f, 21.9f, 6.4971f, 21.9f, 6.0f)
                curveTo(21.9f, 5.5029f, 21.497f, 5.1f, 21.0f, 5.1f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1f, 18.0f)
                curveTo(7.1f, 17.5029f, 7.5029f, 17.1f, 8.0f, 17.1f)
                horizontalLineTo(21.0f)
                curveTo(21.497f, 17.1f, 21.9f, 17.5029f, 21.9f, 18.0f)
                curveTo(21.9f, 18.4971f, 21.497f, 18.9f, 21.0f, 18.9f)
                horizontalLineTo(8.0f)
                curveTo(7.5029f, 18.9f, 7.1f, 18.4971f, 7.1f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.1f)
                curveTo(7.5029f, 11.1f, 7.1f, 11.5029f, 7.1f, 12.0f)
                curveTo(7.1f, 12.4971f, 7.5029f, 12.9f, 8.0f, 12.9f)
                horizontalLineTo(21.0f)
                curveTo(21.497f, 12.9f, 21.9f, 12.4971f, 21.9f, 12.0f)
                curveTo(21.9f, 11.5029f, 21.497f, 11.1f, 21.0f, 11.1f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _list!!
    }

private var _list: ImageVector? = null
