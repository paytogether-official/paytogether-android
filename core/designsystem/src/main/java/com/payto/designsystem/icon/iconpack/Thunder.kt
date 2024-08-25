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

public val IconPack.Thunder: ImageVector
    get() {
        if (_thunder != null) {
            return _thunder!!
        }
        _thunder = Builder(name = "Thunder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.363f, 2.063f)
                curveTo(14.7228f, 2.2051f, 14.9516f, 2.5613f, 14.9311f, 2.9476f)
                lineTo(14.5842f, 9.5f)
                horizontalLineTo(18.4f)
                curveTo(18.7574f, 9.5f, 19.0809f, 9.7115f, 19.2244f, 10.0389f)
                curveTo(19.3678f, 10.3662f, 19.3039f, 10.7474f, 19.0616f, 11.0102f)
                lineTo(9.1352f, 21.7749f)
                curveTo(8.866f, 22.0667f, 8.4375f, 22.1478f, 8.0803f, 21.9743f)
                curveTo(7.7232f, 21.8009f, 7.5219f, 21.4139f, 7.5849f, 21.0219f)
                lineTo(8.6085f, 14.653f)
                horizontalLineTo(4.9f)
                curveTo(4.55f, 14.653f, 4.2318f, 14.4501f, 4.0841f, 14.1328f)
                curveTo(3.9364f, 13.8155f, 3.986f, 13.4413f, 4.2114f, 13.1735f)
                lineTo(13.3437f, 2.3206f)
                curveTo(13.5928f, 2.0246f, 14.0032f, 1.9209f, 14.363f, 2.063f)
                close()
            }
        }
        .build()
        return _thunder!!
    }

private var _thunder: ImageVector? = null
