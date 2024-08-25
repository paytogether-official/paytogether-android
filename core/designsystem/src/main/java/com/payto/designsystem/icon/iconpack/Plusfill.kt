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

public val IconPack.Plusfill: ImageVector
    get() {
        if (_plusfill != null) {
            return _plusfill!!
        }
        _plusfill = Builder(name = "Plusfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9992f, 1.95f)
                curveTo(12.7172f, 1.95f, 13.2992f, 2.532f, 13.2992f, 3.25f)
                verticalLineTo(10.7f)
                horizontalLineTo(20.7492f)
                curveTo(21.4672f, 10.7f, 22.0492f, 11.282f, 22.0492f, 12.0f)
                curveTo(22.0492f, 12.718f, 21.4672f, 13.3f, 20.7492f, 13.3f)
                horizontalLineTo(13.2992f)
                verticalLineTo(20.75f)
                curveTo(13.2992f, 21.468f, 12.7172f, 22.05f, 11.9992f, 22.05f)
                curveTo(11.2812f, 22.05f, 10.6992f, 21.468f, 10.6992f, 20.75f)
                verticalLineTo(13.3f)
                horizontalLineTo(3.2492f)
                curveTo(2.5313f, 13.3f, 1.9492f, 12.718f, 1.9492f, 12.0f)
                curveTo(1.9492f, 11.282f, 2.5313f, 10.7f, 3.2492f, 10.7f)
                horizontalLineTo(10.6992f)
                verticalLineTo(3.25f)
                curveTo(10.6992f, 2.532f, 11.2812f, 1.95f, 11.9992f, 1.95f)
                close()
            }
        }
        .build()
        return _plusfill!!
    }

private var _plusfill: ImageVector? = null
