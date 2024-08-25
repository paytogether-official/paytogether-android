package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.1017f, 4.4f)
                horizontalLineTo(6.0016f)
                verticalLineTo(2.6f)
                horizontalLineTo(8.9969f)
                lineTo(9.0017f, 2.6f)
                horizontalLineTo(15.0017f)
                lineTo(15.0064f, 2.6f)
                horizontalLineTo(18.0016f)
                verticalLineTo(4.4f)
                horizontalLineTo(15.9017f)
                verticalLineTo(10.1275f)
                lineTo(19.2219f, 14.5604f)
                curveTo(19.4262f, 14.8331f, 19.4589f, 15.1979f, 19.3064f, 15.5027f)
                curveTo(19.1539f, 15.8074f, 18.8424f, 15.9999f, 18.5016f, 15.9999f)
                horizontalLineTo(12.9018f)
                verticalLineTo(21.9999f)
                lineTo(12.0018f, 22.9999f)
                lineTo(11.1018f, 21.9999f)
                verticalLineTo(15.9999f)
                horizontalLineTo(5.5016f)
                curveTo(5.1608f, 15.9999f, 4.8492f, 15.8074f, 4.6967f, 15.5027f)
                curveTo(4.5442f, 15.1979f, 4.5769f, 14.8331f, 4.7812f, 14.5604f)
                lineTo(8.1017f, 10.1275f)
                verticalLineTo(4.4f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
