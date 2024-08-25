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

public val IconPack.Chevronright: ImageVector
    get() {
        if (_chevronright != null) {
            return _chevronright!!
        }
        _chevronright = Builder(name = "Chevronright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8652f, 3.3627f)
                curveTo(7.5137f, 3.7142f, 7.5137f, 4.284f, 7.8652f, 4.6355f)
                lineTo(15.2288f, 11.9991f)
                lineTo(7.8652f, 19.3627f)
                curveTo(7.5137f, 19.7142f, 7.5137f, 20.284f, 7.8652f, 20.6355f)
                curveTo(8.2166f, 20.987f, 8.7865f, 20.987f, 9.138f, 20.6355f)
                lineTo(17.138f, 12.6355f)
                curveTo(17.4894f, 12.284f, 17.4894f, 11.7142f, 17.138f, 11.3627f)
                lineTo(9.138f, 3.3627f)
                curveTo(8.7865f, 3.0113f, 8.2166f, 3.0113f, 7.8652f, 3.3627f)
                close()
            }
        }
        .build()
        return _chevronright!!
    }

private var _chevronright: ImageVector? = null
