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

public val IconPack.Chevrondown: ImageVector
    get() {
        if (_chevrondown != null) {
            return _chevrondown!!
        }
        _chevrondown = Builder(name = "Chevrondown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3652f, 7.3635f)
                curveTo(3.7166f, 7.012f, 4.2865f, 7.012f, 4.638f, 7.3635f)
                lineTo(12.0016f, 14.7271f)
                lineTo(19.3652f, 7.3635f)
                curveTo(19.7166f, 7.012f, 20.2865f, 7.012f, 20.6379f, 7.3635f)
                curveTo(20.9894f, 7.7149f, 20.9894f, 8.2848f, 20.6379f, 8.6362f)
                lineTo(12.638f, 16.6362f)
                curveTo(12.2865f, 16.9877f, 11.7166f, 16.9877f, 11.3652f, 16.6362f)
                lineTo(3.3652f, 8.6362f)
                curveTo(3.0137f, 8.2848f, 3.0137f, 7.7149f, 3.3652f, 7.3635f)
                close()
            }
        }
        .build()
        return _chevrondown!!
    }

private var _chevrondown: ImageVector? = null
