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

public val IconPack.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3682f, 2.6001f)
                curveTo(6.9767f, 2.6001f, 6.6302f, 2.6001f, 6.3431f, 2.6235f)
                curveTo(6.0373f, 2.6485f, 5.7204f, 2.7045f, 5.412f, 2.8617f)
                curveTo(4.9604f, 3.0918f, 4.5932f, 3.4589f, 4.3632f, 3.9105f)
                curveTo(4.206f, 4.219f, 4.15f, 4.5358f, 4.125f, 4.8416f)
                curveTo(4.1015f, 5.1288f, 4.1016f, 5.4752f, 4.1016f, 5.8667f)
                lineTo(4.1016f, 21.5001f)
                curveTo(4.1016f, 21.8252f, 4.2769f, 22.125f, 4.5602f, 22.2844f)
                curveTo(4.8435f, 22.4439f, 5.1908f, 22.4381f, 5.4686f, 22.2694f)
                lineTo(12.0016f, 18.303f)
                lineTo(18.5345f, 22.2694f)
                curveTo(18.8124f, 22.4381f, 19.1596f, 22.4439f, 19.4429f, 22.2844f)
                curveTo(19.7263f, 22.125f, 19.9016f, 21.8252f, 19.9016f, 21.5001f)
                lineTo(19.9016f, 5.8668f)
                curveTo(19.9016f, 5.4753f, 19.9016f, 5.1287f, 19.8781f, 4.8416f)
                curveTo(19.8532f, 4.5358f, 19.7971f, 4.219f, 19.64f, 3.9105f)
                curveTo(19.4099f, 3.4589f, 19.0427f, 3.0918f, 18.5911f, 2.8617f)
                curveTo(18.2827f, 2.7045f, 17.9658f, 2.6485f, 17.6601f, 2.6235f)
                curveTo(17.3729f, 2.6001f, 17.0264f, 2.6001f, 16.6349f, 2.6001f)
                horizontalLineTo(7.3682f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
