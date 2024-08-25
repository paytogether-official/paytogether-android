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

public val IconPack.Logofacebook: ImageVector
    get() {
        if (_logofacebook != null) {
            return _logofacebook!!
        }
        _logofacebook = Builder(name = "Logofacebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0016f, 2.1f)
                curveTo(6.5368f, 2.1f, 2.1016f, 6.5352f, 2.1016f, 12.0f)
                curveTo(2.1016f, 16.9401f, 5.725f, 21.0387f, 10.4572f, 21.7812f)
                verticalLineTo(14.8611f)
                horizontalLineTo(7.9426f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.4572f)
                verticalLineTo(9.822f)
                curveTo(10.4572f, 7.3371f, 11.9323f, 5.9709f, 14.1994f, 5.9709f)
                curveTo(15.2785f, 5.9709f, 16.417f, 6.1689f, 16.417f, 6.1689f)
                verticalLineTo(8.6043f)
                horizontalLineTo(15.1696f)
                curveTo(13.942f, 8.6043f, 13.5559f, 9.3666f, 13.5559f, 10.1487f)
                verticalLineTo(12.0099f)
                horizontalLineTo(16.2982f)
                lineTo(15.8626f, 14.871f)
                horizontalLineTo(13.5559f)
                verticalLineTo(21.7911f)
                curveTo(18.2881f, 21.0486f, 21.9016f, 16.9401f, 21.9016f, 12.0f)
                curveTo(21.9016f, 6.5352f, 17.4763f, 2.1099f, 12.0115f, 2.1099f)
                lineTo(12.0016f, 2.1f)
                close()
            }
        }
        .build()
        return _logofacebook!!
    }

private var _logofacebook: ImageVector? = null
