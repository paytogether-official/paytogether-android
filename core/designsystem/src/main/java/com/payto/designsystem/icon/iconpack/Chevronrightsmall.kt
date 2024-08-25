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

public val IconPack.Chevronrightsmall: ImageVector
    get() {
        if (_chevronrightsmall != null) {
            return _chevronrightsmall!!
        }
        _chevronrightsmall = Builder(name = "Chevronrightsmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8652f, 4.8635f)
                curveTo(8.5137f, 5.2149f, 8.5137f, 5.7848f, 8.8652f, 6.1363f)
                lineTo(14.7288f, 11.9999f)
                lineTo(8.8652f, 17.8635f)
                curveTo(8.5137f, 18.2149f, 8.5137f, 18.7848f, 8.8652f, 19.1362f)
                curveTo(9.2166f, 19.4877f, 9.7865f, 19.4877f, 10.138f, 19.1362f)
                lineTo(16.638f, 12.6362f)
                curveTo(16.9894f, 12.2848f, 16.9894f, 11.7149f, 16.638f, 11.3635f)
                lineTo(10.138f, 4.8635f)
                curveTo(9.7865f, 4.512f, 9.2166f, 4.512f, 8.8652f, 4.8635f)
                close()
            }
        }
        .build()
        return _chevronrightsmall!!
    }

private var _chevronrightsmall: ImageVector? = null
