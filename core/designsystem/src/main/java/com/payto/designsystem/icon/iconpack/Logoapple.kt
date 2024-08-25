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

public val IconPack.Logoapple: ImageVector
    get() {
        if (_logoapple != null) {
            return _logoapple!!
        }
        _logoapple = Builder(name = "Logoapple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9556f, 21.9477f)
                curveTo(10.2363f, 21.9477f, 10.798f, 21.0602f, 12.3933f, 21.0602f)
                curveTo(13.9887f, 21.0602f, 14.3706f, 21.914f, 15.7862f, 21.914f)
                curveTo(17.2017f, 21.914f, 18.1117f, 20.5883f, 18.9993f, 19.2851f)
                curveTo(19.9879f, 17.7909f, 20.3924f, 16.3304f, 20.4261f, 16.263f)
                curveTo(20.3362f, 16.2406f, 17.6624f, 15.1059f, 17.6624f, 11.949f)
                curveTo(17.6624f, 9.2077f, 19.7745f, 7.9719f, 19.8868f, 7.8821f)
                curveTo(18.4937f, 5.8149f, 16.3704f, 5.7699f, 15.7974f, 5.7699f)
                curveTo(14.2358f, 5.7699f, 12.9551f, 6.7474f, 12.1462f, 6.7474f)
                curveTo(11.2811f, 6.7474f, 10.1352f, 5.8261f, 8.7758f, 5.8261f)
                curveTo(6.1919f, 5.8261f, 3.5742f, 8.0281f, 3.5742f, 12.1737f)
                curveTo(3.5742f, 14.7464f, 4.5516f, 17.4764f, 5.7425f, 19.2402f)
                curveTo(6.7648f, 20.7344f, 7.6636f, 21.959f, 8.9556f, 21.959f)
                verticalLineTo(21.9477f)
                close()
                moveTo(12.2473f, 5.5228f)
                curveTo(13.1798f, 5.5228f, 14.3594f, 4.8712f, 15.0559f, 4.0061f)
                curveTo(15.6851f, 3.2197f, 16.1457f, 2.1187f, 16.1457f, 1.0177f)
                curveTo(16.1457f, 0.8717f, 16.1345f, 0.7144f, 16.1007f, 0.6021f)
                curveTo(15.0559f, 0.647f, 13.8089f, 1.3211f, 13.0562f, 2.2311f)
                curveTo(12.4608f, 2.9276f, 11.9215f, 4.0061f, 11.9215f, 5.1184f)
                curveTo(11.9215f, 5.2756f, 11.944f, 5.4441f, 11.9664f, 5.5003f)
                curveTo(12.0338f, 5.5116f, 12.135f, 5.5228f, 12.2473f, 5.5228f)
                close()
            }
        }
        .build()
        return _logoapple!!
    }

private var _logoapple: ImageVector? = null
