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

public val IconPack.Externallink: ImageVector
    get() {
        if (_externallink != null) {
            return _externallink!!
        }
        _externallink = Builder(name = "Externallink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5015f, 3.1001f)
                curveTo(14.0044f, 3.1001f, 13.6015f, 3.503f, 13.6015f, 4.0001f)
                curveTo(13.6015f, 4.4972f, 14.0044f, 4.9001f, 14.5015f, 4.9001f)
                horizontalLineTo(17.8287f)
                lineTo(8.3651f, 14.3637f)
                curveTo(8.0136f, 14.7152f, 8.0136f, 15.285f, 8.3651f, 15.6365f)
                curveTo(8.7166f, 15.988f, 9.2864f, 15.988f, 9.6379f, 15.6365f)
                lineTo(19.1015f, 6.1729f)
                verticalLineTo(9.5001f)
                curveTo(19.1015f, 9.9972f, 19.5044f, 10.4001f, 20.0015f, 10.4001f)
                curveTo(20.4985f, 10.4001f, 20.9015f, 9.9972f, 20.9015f, 9.5001f)
                verticalLineTo(4.0001f)
                curveTo(20.9015f, 3.503f, 20.4985f, 3.1001f, 20.0015f, 3.1001f)
                horizontalLineTo(14.5015f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8849f, 19.1302f)
                curveTo(20.9015f, 18.9262f, 20.9015f, 18.6842f, 20.9015f, 18.4299f)
                lineTo(20.9015f, 14.0001f)
                lineTo(19.1015f, 14.0009f)
                verticalLineTo(19.0009f)
                curveTo(19.1015f, 19.0561f, 19.0568f, 19.1009f, 19.0015f, 19.1009f)
                horizontalLineTo(5.0016f)
                curveTo(4.9463f, 19.1009f, 4.9015f, 19.0561f, 4.9015f, 19.0009f)
                verticalLineTo(5.0009f)
                curveTo(4.9015f, 4.9457f, 4.9463f, 4.9009f, 5.0016f, 4.9009f)
                horizontalLineTo(10.0015f)
                lineTo(10.0015f, 3.1001f)
                lineTo(5.5718f, 3.1001f)
                curveTo(5.3174f, 3.1001f, 5.0754f, 3.1f, 4.8714f, 3.1167f)
                curveTo(4.649f, 3.1349f, 4.3939f, 3.1773f, 4.1389f, 3.3072f)
                curveTo(3.7814f, 3.4894f, 3.4908f, 3.78f, 3.3086f, 4.1375f)
                curveTo(3.1787f, 4.3925f, 3.1363f, 4.6476f, 3.1181f, 4.87f)
                curveTo(3.1014f, 5.074f, 3.1015f, 5.316f, 3.1015f, 5.5703f)
                verticalLineTo(18.4299f)
                curveTo(3.1015f, 18.6842f, 3.1014f, 18.9262f, 3.1181f, 19.1302f)
                curveTo(3.1363f, 19.3526f, 3.1787f, 19.6077f, 3.3086f, 19.8627f)
                curveTo(3.4908f, 20.2202f, 3.7814f, 20.5109f, 4.1389f, 20.693f)
                curveTo(4.3939f, 20.8229f, 4.649f, 20.8653f, 4.8714f, 20.8835f)
                curveTo(5.0754f, 20.9002f, 5.3174f, 20.9001f, 5.5717f, 20.9001f)
                horizontalLineTo(18.4313f)
                curveTo(18.6856f, 20.9001f, 18.9276f, 20.9002f, 19.1316f, 20.8835f)
                curveTo(19.354f, 20.8653f, 19.6091f, 20.8229f, 19.8641f, 20.693f)
                curveTo(20.2216f, 20.5109f, 20.5122f, 20.2202f, 20.6944f, 19.8627f)
                curveTo(20.8243f, 19.6077f, 20.8667f, 19.3526f, 20.8849f, 19.1302f)
                close()
            }
        }
        .build()
        return _externallink!!
    }

private var _externallink: ImageVector? = null
