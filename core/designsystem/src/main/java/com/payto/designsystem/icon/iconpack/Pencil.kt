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

public val IconPack.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.672f, 2.6074f)
                curveTo(18.2904f, 2.4834f, 17.8794f, 2.4834f, 17.4978f, 2.6074f)
                curveTo(17.2256f, 2.6958f, 17.0152f, 2.8463f, 16.8451f, 2.9907f)
                curveTo(16.6891f, 3.1231f, 16.518f, 3.2943f, 16.3382f, 3.4741f)
                lineTo(16.3171f, 3.4952f)
                lineTo(3.1016f, 16.7107f)
                verticalLineTo(20.9002f)
                horizontalLineTo(7.291f)
                lineTo(20.5066f, 7.6846f)
                lineTo(20.5276f, 7.6636f)
                curveTo(20.7075f, 7.4838f, 20.8786f, 7.3126f, 21.0111f, 7.1566f)
                curveTo(21.1555f, 6.9865f, 21.3059f, 6.7762f, 21.3943f, 6.504f)
                curveTo(21.5183f, 6.1224f, 21.5183f, 5.7113f, 21.3943f, 5.3297f)
                curveTo(21.3059f, 5.0576f, 21.1555f, 4.8472f, 21.0111f, 4.6771f)
                curveTo(20.8786f, 4.5211f, 20.7075f, 4.35f, 20.5276f, 4.1702f)
                lineTo(19.8316f, 3.4741f)
                curveTo(19.6518f, 3.2943f, 19.4807f, 3.1231f, 19.3247f, 2.9907f)
                curveTo(19.1545f, 2.8463f, 18.9442f, 2.6958f, 18.672f, 2.6074f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
