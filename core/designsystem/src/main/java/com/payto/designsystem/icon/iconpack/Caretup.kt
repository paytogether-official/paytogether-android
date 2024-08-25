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

public val IconPack.Caretup: ImageVector
    get() {
        if (_caretup != null) {
            return _caretup!!
        }
        _caretup = Builder(name = "Caretup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2164f, 9.4173f)
                curveTo(12.7979f, 8.9291f, 12.5886f, 8.6849f, 12.3396f, 8.5955f)
                curveTo(12.1211f, 8.517f, 11.882f, 8.517f, 11.6635f, 8.5955f)
                curveTo(11.4145f, 8.6849f, 11.2052f, 8.9291f, 10.7868f, 9.4173f)
                lineTo(8.2655f, 12.3588f)
                curveTo(7.5451f, 13.1992f, 7.1849f, 13.6195f, 7.1761f, 13.9752f)
                curveTo(7.1684f, 14.2844f, 7.3043f, 14.5798f, 7.544f, 14.7752f)
                curveTo(7.8199f, 15.0f, 8.3734f, 15.0f, 9.4803f, 15.0f)
                horizontalLineTo(14.5228f)
                curveTo(15.6298f, 15.0f, 16.1832f, 15.0f, 16.4591f, 14.7752f)
                curveTo(16.6989f, 14.5798f, 16.8347f, 14.2844f, 16.827f, 13.9752f)
                curveTo(16.8182f, 13.6195f, 16.458f, 13.1992f, 15.7376f, 12.3588f)
                lineTo(13.2164f, 9.4173f)
                close()
            }
        }
        .build()
        return _caretup!!
    }

private var _caretup: ImageVector? = null
