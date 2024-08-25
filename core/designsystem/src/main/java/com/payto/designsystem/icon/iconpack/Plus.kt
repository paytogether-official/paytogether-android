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

public val IconPack.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0016f, 2.35f)
                curveTo(12.4986f, 2.35f, 12.9016f, 2.7529f, 12.9016f, 3.25f)
                verticalLineTo(11.1f)
                horizontalLineTo(20.7516f)
                curveTo(21.2486f, 11.1f, 21.6516f, 11.5029f, 21.6516f, 12.0f)
                curveTo(21.6516f, 12.497f, 21.2486f, 12.9f, 20.7516f, 12.9f)
                horizontalLineTo(12.9016f)
                verticalLineTo(20.75f)
                curveTo(12.9016f, 21.247f, 12.4986f, 21.65f, 12.0016f, 21.65f)
                curveTo(11.5045f, 21.65f, 11.1016f, 21.247f, 11.1016f, 20.75f)
                verticalLineTo(12.9f)
                horizontalLineTo(3.2516f)
                curveTo(2.7545f, 12.9f, 2.3516f, 12.497f, 2.3516f, 12.0f)
                curveTo(2.3516f, 11.5029f, 2.7545f, 11.1f, 3.2516f, 11.1f)
                horizontalLineTo(11.1016f)
                verticalLineTo(3.25f)
                curveTo(11.1016f, 2.7529f, 11.5045f, 2.35f, 12.0016f, 2.35f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
