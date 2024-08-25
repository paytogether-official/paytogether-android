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

public val IconPack.Caretdown: ImageVector
    get() {
        if (_caretdown != null) {
            return _caretdown!!
        }
        _caretdown = Builder(name = "Caretdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2164f, 14.5827f)
                curveTo(12.7979f, 15.071f, 12.5886f, 15.3151f, 12.3396f, 15.4045f)
                curveTo(12.1211f, 15.483f, 11.882f, 15.483f, 11.6635f, 15.4045f)
                curveTo(11.4145f, 15.3151f, 11.2052f, 15.071f, 10.7867f, 14.5827f)
                lineTo(8.2655f, 11.6413f)
                curveTo(7.5451f, 10.8008f, 7.1849f, 10.3806f, 7.1761f, 10.0248f)
                curveTo(7.1684f, 9.7156f, 7.3043f, 9.4202f, 7.544f, 9.2248f)
                curveTo(7.8199f, 9.0f, 8.3734f, 9.0f, 9.4803f, 9.0f)
                horizontalLineTo(14.5228f)
                curveTo(15.6298f, 9.0f, 16.1832f, 9.0f, 16.4591f, 9.2248f)
                curveTo(16.6989f, 9.4202f, 16.8347f, 9.7156f, 16.827f, 10.0248f)
                curveTo(16.8182f, 10.3806f, 16.458f, 10.8008f, 15.7376f, 11.6413f)
                lineTo(13.2164f, 14.5827f)
                close()
            }
        }
        .build()
        return _caretdown!!
    }

private var _caretdown: ImageVector? = null
