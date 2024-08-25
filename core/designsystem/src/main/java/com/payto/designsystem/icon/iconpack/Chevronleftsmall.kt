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

public val IconPack.Chevronleftsmall: ImageVector
    get() {
        if (_chevronleftsmall != null) {
            return _chevronleftsmall!!
        }
        _chevronleftsmall = Builder(name = "Chevronleftsmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.138f, 4.8637f)
                curveTo(15.4894f, 5.2152f, 15.4894f, 5.785f, 15.138f, 6.1365f)
                lineTo(9.2744f, 12.0001f)
                lineTo(15.138f, 17.8637f)
                curveTo(15.4894f, 18.2152f, 15.4894f, 18.785f, 15.138f, 19.1365f)
                curveTo(14.7865f, 19.488f, 14.2166f, 19.488f, 13.8652f, 19.1365f)
                lineTo(7.3652f, 12.6365f)
                curveTo(7.0137f, 12.285f, 7.0137f, 11.7152f, 7.3652f, 11.3637f)
                lineTo(13.8652f, 4.8637f)
                curveTo(14.2166f, 4.5122f, 14.7865f, 4.5122f, 15.138f, 4.8637f)
                close()
            }
        }
        .build()
        return _chevronleftsmall!!
    }

private var _chevronleftsmall: ImageVector? = null
