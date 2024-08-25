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

public val IconPack.Chevronleftthicksmall: ImageVector
    get() {
        if (_chevronleftthicksmall != null) {
            return _chevronleftthicksmall!!
        }
        _chevronleftthicksmall = Builder(name = "Chevronleftthicksmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4184f, 4.5807f)
                curveTo(15.9261f, 5.0884f, 15.9261f, 5.9115f, 15.4184f, 6.4192f)
                lineTo(9.8377f, 12.0f)
                lineTo(15.4184f, 17.5807f)
                curveTo(15.9261f, 18.0884f, 15.9261f, 18.9115f, 15.4184f, 19.4192f)
                curveTo(14.9108f, 19.9269f, 14.0877f, 19.9269f, 13.58f, 19.4192f)
                lineTo(7.08f, 12.9192f)
                curveTo(6.5723f, 12.4115f, 6.5723f, 11.5884f, 7.08f, 11.0807f)
                lineTo(13.58f, 4.5807f)
                curveTo(14.0877f, 4.073f, 14.9108f, 4.073f, 15.4184f, 4.5807f)
                close()
            }
        }
        .build()
        return _chevronleftthicksmall!!
    }

private var _chevronleftthicksmall: ImageVector? = null
