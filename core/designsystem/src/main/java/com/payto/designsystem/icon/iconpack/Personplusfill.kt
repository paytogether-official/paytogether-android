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

public val IconPack.Personplusfill: ImageVector
    get() {
        if (_personplusfill != null) {
            return _personplusfill!!
        }
        _personplusfill = Builder(name = "Personplusfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3238f, 7.2778f)
                curveTo(7.3238f, 4.6943f, 9.4181f, 2.6f, 12.0016f, 2.6f)
                curveTo(14.5851f, 2.6f, 16.6794f, 4.6943f, 16.6794f, 7.2778f)
                curveTo(16.6794f, 9.8612f, 14.5851f, 11.9556f, 12.0016f, 11.9556f)
                curveTo(9.4181f, 11.9556f, 7.3238f, 9.8612f, 7.3238f, 7.2778f)
                close()
                moveTo(12.0017f, 13.101f)
                curveTo(14.9338f, 13.101f, 17.807f, 13.9226f, 20.3111f, 15.4423f)
                curveTo(20.5044f, 15.5594f, 20.7384f, 15.7011f, 20.9347f, 15.9265f)
                curveTo(21.1006f, 16.1171f, 21.2366f, 16.3592f, 21.313f, 16.6f)
                curveTo(21.4035f, 16.8856f, 21.4026f, 17.1759f, 21.4019f, 17.4188f)
                lineTo(21.4018f, 18.9303f)
                curveTo(21.4018f, 19.1846f, 21.4019f, 19.4267f, 21.3852f, 19.6307f)
                curveTo(21.367f, 19.8531f, 21.3246f, 20.1082f, 21.1947f, 20.3632f)
                curveTo(21.0126f, 20.7207f, 20.7219f, 21.0113f, 20.3644f, 21.1935f)
                curveTo(20.1094f, 21.3234f, 19.8543f, 21.3658f, 19.6319f, 21.384f)
                curveTo(19.4279f, 21.4006f, 19.1859f, 21.4006f, 18.9316f, 21.4006f)
                horizontalLineTo(5.0721f)
                curveTo(4.8177f, 21.4006f, 4.5757f, 21.4006f, 4.3717f, 21.384f)
                curveTo(4.1493f, 21.3658f, 3.8942f, 21.3234f, 3.6392f, 21.1935f)
                curveTo(3.2817f, 21.0113f, 2.9911f, 20.7207f, 2.8089f, 20.3632f)
                curveTo(2.679f, 20.1082f, 2.6366f, 19.8531f, 2.6184f, 19.6307f)
                curveTo(2.6018f, 19.4267f, 2.6018f, 19.1847f, 2.6018f, 18.9303f)
                lineTo(2.6017f, 17.4186f)
                curveTo(2.601f, 17.1757f, 2.6001f, 16.8854f, 2.6907f, 16.5998f)
                curveTo(2.767f, 16.359f, 2.903f, 16.1169f, 3.0689f, 15.9263f)
                curveTo(3.2652f, 15.701f, 3.4993f, 15.5592f, 3.6926f, 15.4421f)
                curveTo(6.1966f, 13.9226f, 9.0696f, 13.101f, 12.0017f, 13.101f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.1018f, 10.1004f)
                verticalLineTo(8.5004f)
                horizontalLineTo(20.9018f)
                verticalLineTo(10.1004f)
                horizontalLineTo(22.5018f)
                verticalLineTo(11.9004f)
                horizontalLineTo(20.9018f)
                verticalLineTo(13.5004f)
                horizontalLineTo(19.1018f)
                verticalLineTo(11.9004f)
                horizontalLineTo(17.5018f)
                verticalLineTo(10.1004f)
                horizontalLineTo(19.1018f)
                close()
            }
        }
        .build()
        return _personplusfill!!
    }

private var _personplusfill: ImageVector? = null
