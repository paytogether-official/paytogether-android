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

public val IconPack.Chevronupthicksmall: ImageVector
    get() {
        if (_chevronupthicksmall != null) {
            return _chevronupthicksmall!!
        }
        _chevronupthicksmall = Builder(name = "Chevronupthicksmall", defaultWidth = 25.0.dp,
                defaultHeight = 25.0.dp, viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2521f, 16.5825f)
                curveTo(4.7809f, 17.1113f, 5.6383f, 17.1113f, 6.1672f, 16.5825f)
                lineTo(12.5013f, 10.2484f)
                lineTo(18.8354f, 16.5825f)
                curveTo(19.3642f, 17.1113f, 20.2217f, 17.1113f, 20.7505f, 16.5825f)
                curveTo(21.2793f, 16.0537f, 21.2793f, 15.1963f, 20.7505f, 14.6674f)
                lineTo(13.4588f, 7.3758f)
                curveTo(12.93f, 6.8469f, 12.0726f, 6.8469f, 11.5438f, 7.3758f)
                lineTo(4.2521f, 14.6674f)
                curveTo(3.7233f, 15.1963f, 3.7233f, 16.0537f, 4.2521f, 16.5825f)
                close()
            }
        }
        .build()
        return _chevronupthicksmall!!
    }

private var _chevronupthicksmall: ImageVector? = null
