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

public val IconPack.Menufill: ImageVector
    get() {
        if (_menufill != null) {
            return _menufill!!
        }
        _menufill = Builder(name = "Menufill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.75f, 4.3096f, 3.3096f, 3.75f, 4.0f, 3.75f)
                horizontalLineTo(20.0f)
                curveTo(20.6904f, 3.75f, 21.25f, 4.3096f, 21.25f, 5.0f)
                curveTo(21.25f, 5.6903f, 20.6904f, 6.25f, 20.0f, 6.25f)
                horizontalLineTo(4.0f)
                curveTo(3.3096f, 6.25f, 2.75f, 5.6903f, 2.75f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 19.0f)
                curveTo(2.75f, 18.3096f, 3.3096f, 17.75f, 4.0f, 17.75f)
                horizontalLineTo(20.0f)
                curveTo(20.6904f, 17.75f, 21.25f, 18.3096f, 21.25f, 19.0f)
                curveTo(21.25f, 19.6903f, 20.6904f, 20.25f, 20.0f, 20.25f)
                horizontalLineTo(4.0f)
                curveTo(3.3096f, 20.25f, 2.75f, 19.6903f, 2.75f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.75f)
                curveTo(3.3096f, 10.75f, 2.75f, 11.3096f, 2.75f, 12.0f)
                curveTo(2.75f, 12.6903f, 3.3096f, 13.25f, 4.0f, 13.25f)
                horizontalLineTo(20.0f)
                curveTo(20.6904f, 13.25f, 21.25f, 12.6903f, 21.25f, 12.0f)
                curveTo(21.25f, 11.3096f, 20.6904f, 10.75f, 20.0f, 10.75f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _menufill!!
    }

private var _menufill: ImageVector? = null
