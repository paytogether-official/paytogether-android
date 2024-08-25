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

public val IconPack.Filterfill: ImageVector
    get() {
        if (_filterfill != null) {
            return _filterfill!!
        }
        _filterfill = Builder(name = "Filterfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.6495f, 2.6009f)
                curveTo(6.1024f, 2.6008f, 5.6316f, 2.6008f, 5.2649f, 2.6336f)
                curveTo(4.9143f, 2.665f, 4.4528f, 2.7373f, 4.0863f, 3.0442f)
                curveTo(3.6267f, 3.4292f, 3.3757f, 4.0085f, 3.4092f, 4.6072f)
                curveTo(3.436f, 5.0844f, 3.6988f, 5.4706f, 3.9158f, 5.7478f)
                curveTo(4.1426f, 6.0377f, 4.4646f, 6.3811f, 4.8388f, 6.7803f)
                lineTo(9.5981f, 11.8568f)
                lineTo(9.598f, 18.2565f)
                curveTo(9.5971f, 18.3165f, 9.5942f, 18.5047f, 9.6499f, 18.688f)
                curveTo(9.6957f, 18.839f, 9.7709f, 18.9794f, 9.8711f, 19.1013f)
                curveTo(9.9927f, 19.2493f, 10.1509f, 19.3513f, 10.2013f, 19.3839f)
                lineTo(12.2732f, 20.7649f)
                curveTo(12.3756f, 20.8333f, 12.4978f, 20.9148f, 12.6083f, 20.9747f)
                curveTo(12.7184f, 21.0344f, 12.9594f, 21.1557f, 13.2696f, 21.1372f)
                curveTo(13.6199f, 21.1163f, 13.9434f, 20.9431f, 14.1551f, 20.6633f)
                curveTo(14.3426f, 20.4155f, 14.3754f, 20.1476f, 14.3868f, 20.0229f)
                curveTo(14.3982f, 19.8977f, 14.3982f, 19.7508f, 14.3981f, 19.6277f)
                lineTo(14.3981f, 11.8568f)
                lineTo(19.1573f, 6.7802f)
                curveTo(19.5315f, 6.3811f, 19.8535f, 6.0377f, 20.0803f, 5.7478f)
                curveTo(20.2972f, 5.4706f, 20.5601f, 5.0843f, 20.5868f, 4.6071f)
                curveTo(20.6204f, 4.0085f, 20.3694f, 3.4292f, 19.9097f, 3.0442f)
                curveTo(19.5433f, 2.7373f, 19.0817f, 2.665f, 18.7311f, 2.6336f)
                curveTo(18.3645f, 2.6008f, 17.8937f, 2.6008f, 17.3467f, 2.6009f)
                horizontalLineTo(6.6495f)
                close()
            }
        }
        .build()
        return _filterfill!!
    }

private var _filterfill: ImageVector? = null
