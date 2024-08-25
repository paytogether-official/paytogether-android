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

public val IconPack.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6685f, 6.581f)
                curveTo(20.1761f, 7.0886f, 20.1761f, 7.9117f, 19.6685f, 8.4194f)
                lineTo(10.6685f, 17.4194f)
                curveTo(10.1608f, 17.9271f, 9.3377f, 17.9271f, 8.83f, 17.4194f)
                lineTo(4.33f, 12.9194f)
                curveTo(3.8223f, 12.4118f, 3.8223f, 11.5886f, 4.33f, 11.081f)
                curveTo(4.8377f, 10.5733f, 5.6608f, 10.5733f, 6.1685f, 11.081f)
                lineTo(9.7492f, 14.6617f)
                lineTo(17.83f, 6.581f)
                curveTo(18.3377f, 6.0733f, 19.1608f, 6.0733f, 19.6685f, 6.581f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
