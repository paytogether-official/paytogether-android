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

public val IconPack.Logogoogleplay: ImageVector
    get() {
        if (_logogoogleplay != null) {
            return _logogoogleplay!!
        }
        _logogoogleplay = Builder(name = "Logogoogleplay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7178f, 7.7244f)
                lineTo(7.2295f, 2.803f)
                curveTo(6.9117f, 2.6109f, 6.5348f, 2.5f, 6.1283f, 2.5f)
                curveTo(5.2988f, 2.5f, 4.5798f, 2.979f, 4.229f, 3.6705f)
                lineTo(12.0034f, 11.4407f)
                lineTo(15.7178f, 7.7244f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0008f, 4.5735f)
                curveTo(4.0003f, 4.5917f, 4.0f, 4.61f, 4.0f, 4.6284f)
                verticalLineTo(19.3865f)
                curveTo(4.0f, 19.407f, 4.0002f, 19.4273f, 4.0008f, 19.4475f)
                lineTo(11.4378f, 12.0066f)
                lineTo(4.0008f, 4.5735f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2354f, 20.3445f)
                curveTo(4.5884f, 21.032f, 5.3038f, 21.5001f, 6.1283f, 21.5001f)
                curveTo(6.52f, 21.5001f, 6.8895f, 21.3966f, 7.2073f, 21.2045f)
                lineTo(7.2295f, 21.1897f)
                lineTo(15.7237f, 16.2903f)
                lineTo(12.0037f, 12.5721f)
                lineTo(4.2354f, 20.3445f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4487f, 15.8837f)
                lineTo(19.8961f, 13.8956f)
                curveTo(20.5613f, 13.5335f, 21.0121f, 12.8314f, 21.0121f, 12.0259f)
                curveTo(21.0121f, 11.2204f, 20.5686f, 10.5183f, 19.9035f, 10.1636f)
                verticalLineTo(10.1562f)
                horizontalLineTo(19.8961f)
                lineTo(16.4333f, 8.1401f)
                lineTo(12.5692f, 12.0063f)
                lineTo(16.4487f, 15.8837f)
                close()
            }
        }
        .build()
        return _logogoogleplay!!
    }

private var _logogoogleplay: ImageVector? = null
