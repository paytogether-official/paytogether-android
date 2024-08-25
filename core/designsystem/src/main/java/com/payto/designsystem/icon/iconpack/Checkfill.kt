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

public val IconPack.Checkfill: ImageVector
    get() {
        if (_checkfill != null) {
            return _checkfill!!
        }
        _checkfill = Builder(name = "Checkfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.388f, 6.8635f)
                curveTo(19.7394f, 7.2149f, 19.7394f, 7.7848f, 19.388f, 8.1362f)
                lineTo(10.388f, 17.1362f)
                curveTo(10.0365f, 17.4877f, 9.4666f, 17.4877f, 9.1152f, 17.1362f)
                lineTo(4.6152f, 12.6362f)
                curveTo(4.2637f, 12.2848f, 4.2637f, 11.7149f, 4.6152f, 11.3635f)
                curveTo(4.9666f, 11.012f, 5.5365f, 11.012f, 5.888f, 11.3635f)
                lineTo(9.7516f, 15.2271f)
                lineTo(18.1152f, 6.8635f)
                curveTo(18.4666f, 6.512f, 19.0365f, 6.512f, 19.388f, 6.8635f)
                close()
            }
        }
        .build()
        return _checkfill!!
    }

private var _checkfill: ImageVector? = null
