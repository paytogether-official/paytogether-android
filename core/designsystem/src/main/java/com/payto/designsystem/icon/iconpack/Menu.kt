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

public val IconPack.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1016f, 5.0f)
                curveTo(3.1016f, 4.5029f, 3.5045f, 4.1f, 4.0016f, 4.1f)
                horizontalLineTo(20.0016f)
                curveTo(20.4986f, 4.1f, 20.9016f, 4.5029f, 20.9016f, 5.0f)
                curveTo(20.9016f, 5.497f, 20.4986f, 5.9f, 20.0016f, 5.9f)
                horizontalLineTo(4.0016f)
                curveTo(3.5045f, 5.9f, 3.1016f, 5.497f, 3.1016f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1016f, 19.0f)
                curveTo(3.1016f, 18.5029f, 3.5045f, 18.1f, 4.0016f, 18.1f)
                horizontalLineTo(20.0016f)
                curveTo(20.4986f, 18.1f, 20.9016f, 18.5029f, 20.9016f, 19.0f)
                curveTo(20.9016f, 19.497f, 20.4986f, 19.9f, 20.0016f, 19.9f)
                horizontalLineTo(4.0016f)
                curveTo(3.5045f, 19.9f, 3.1016f, 19.497f, 3.1016f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0016f, 11.1f)
                curveTo(3.5045f, 11.1f, 3.1016f, 11.5029f, 3.1016f, 12.0f)
                curveTo(3.1016f, 12.497f, 3.5045f, 12.9f, 4.0016f, 12.9f)
                horizontalLineTo(20.0016f)
                curveTo(20.4986f, 12.9f, 20.9016f, 12.497f, 20.9016f, 12.0f)
                curveTo(20.9016f, 11.5029f, 20.4986f, 11.1f, 20.0016f, 11.1f)
                horizontalLineTo(4.0016f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
