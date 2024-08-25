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

public val IconPack.Chevronrightthicksmall: ImageVector
    get() {
        if (_chevronrightthicksmall != null) {
            return _chevronrightthicksmall!!
        }
        _chevronrightthicksmall = Builder(name = "Chevronrightthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.58f, 4.581f)
                curveTo(8.0723f, 5.0886f, 8.0723f, 5.9117f, 8.58f, 6.4194f)
                lineTo(14.1607f, 12.0002f)
                lineTo(8.58f, 17.581f)
                curveTo(8.0723f, 18.0886f, 8.0723f, 18.9118f, 8.58f, 19.4194f)
                curveTo(9.0877f, 19.9271f, 9.9108f, 19.9271f, 10.4185f, 19.4194f)
                lineTo(16.9184f, 12.9194f)
                curveTo(17.4261f, 12.4118f, 17.4261f, 11.5886f, 16.9184f, 11.081f)
                lineTo(10.4185f, 4.581f)
                curveTo(9.9108f, 4.0733f, 9.0877f, 4.0733f, 8.58f, 4.581f)
                close()
            }
        }
        .build()
        return _chevronrightthicksmall!!
    }

private var _chevronrightthicksmall: ImageVector? = null
