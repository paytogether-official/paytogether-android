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

public val IconPack.Chevronrightthick: ImageVector
    get() {
        if (_chevronrightthick != null) {
            return _chevronrightthick!!
        }
        _chevronrightthick = Builder(name = "Chevronrightthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.58f, 3.0802f)
                curveTo(7.0723f, 3.5879f, 7.0723f, 4.411f, 7.58f, 4.9187f)
                lineTo(14.6607f, 11.9995f)
                lineTo(7.58f, 19.0802f)
                curveTo(7.0723f, 19.5879f, 7.0723f, 20.411f, 7.58f, 20.9187f)
                curveTo(8.0877f, 21.4264f, 8.9108f, 21.4264f, 9.4185f, 20.9187f)
                lineTo(17.4184f, 12.9187f)
                curveTo(17.9261f, 12.411f, 17.9261f, 11.5879f, 17.4184f, 11.0802f)
                lineTo(9.4185f, 3.0802f)
                curveTo(8.9108f, 2.5725f, 8.0877f, 2.5725f, 7.58f, 3.0802f)
                close()
            }
        }
        .build()
        return _chevronrightthick!!
    }

private var _chevronrightthick: ImageVector? = null
