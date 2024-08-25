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

public val IconPack.Eyeslashfill: ImageVector
    get() {
        if (_eyeslashfill != null) {
            return _eyeslashfill!!
        }
        _eyeslashfill = Builder(name = "Eyeslashfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.7134f, 16.7115f)
                lineTo(13.5725f, 15.5706f)
                curveTo(13.092f, 15.7823f, 12.5606f, 15.8998f, 12.0018f, 15.8998f)
                curveTo(9.8479f, 15.8998f, 8.1018f, 14.1538f, 8.1018f, 11.9998f)
                curveTo(8.1018f, 11.441f, 8.2193f, 10.9097f, 8.431f, 10.4291f)
                lineTo(6.579f, 8.5771f)
                curveTo(5.3034f, 9.4519f, 4.2497f, 10.6267f, 3.5197f, 11.9999f)
                curveTo(5.1327f, 15.0339f, 8.326f, 17.0998f, 12.0018f, 17.0998f)
                curveTo(12.9435f, 17.0998f, 13.8535f, 16.9642f, 14.7134f, 16.7115f)
                close()
                moveTo(16.5198f, 15.9723f)
                lineTo(8.2207f, 7.6732f)
                curveTo(9.381f, 7.1755f, 10.6592f, 6.8999f, 12.0018f, 6.8999f)
                curveTo(15.6776f, 6.8999f, 18.8709f, 8.9658f, 20.4839f, 11.9999f)
                curveTo(19.5877f, 13.6857f, 18.2035f, 15.0726f, 16.5198f, 15.9723f)
                close()
                moveTo(17.8406f, 17.2931f)
                curveTo(19.7702f, 16.1402f, 21.3305f, 14.4331f, 22.3018f, 12.3917f)
                curveTo(22.4198f, 12.1437f, 22.4198f, 11.856f, 22.3018f, 11.6081f)
                curveTo(20.4709f, 7.7599f, 16.547f, 5.0999f, 12.0018f, 5.0999f)
                curveTo(10.1545f, 5.0999f, 8.4099f, 5.5392f, 6.8667f, 6.3192f)
                lineTo(3.7746f, 3.2271f)
                lineTo(2.5018f, 4.4999f)
                lineTo(5.2877f, 7.2858f)
                curveTo(3.7609f, 8.4003f, 2.5215f, 9.8851f, 1.7018f, 11.6081f)
                curveTo(1.5838f, 11.856f, 1.5838f, 12.1437f, 1.7018f, 12.3917f)
                curveTo(3.5326f, 16.2399f, 7.4566f, 18.8998f, 12.0018f, 18.8998f)
                curveTo(13.4581f, 18.8998f, 14.8506f, 18.6268f, 16.1309f, 18.129f)
                lineTo(18.7652f, 20.7633f)
                lineTo(20.038f, 19.4905f)
                lineTo(17.8406f, 17.2931f)
                close()
                moveTo(9.904f, 11.9021f)
                lineTo(12.0995f, 14.0976f)
                curveTo(12.0671f, 14.0991f, 12.0345f, 14.0998f, 12.0018f, 14.0998f)
                curveTo(10.842f, 14.0998f, 9.9018f, 13.1596f, 9.9018f, 11.9998f)
                curveTo(9.9018f, 11.9671f, 9.9025f, 11.9345f, 9.904f, 11.9021f)
                close()
                moveTo(15.8244f, 12.7768f)
                curveTo(15.8751f, 12.5257f, 15.9018f, 12.2659f, 15.9018f, 11.9998f)
                curveTo(15.9018f, 9.8459f, 14.1557f, 8.0998f, 12.0018f, 8.0998f)
                curveTo(11.7357f, 8.0998f, 11.4759f, 8.1265f, 11.2249f, 8.1772f)
                lineTo(15.8244f, 12.7768f)
                close()
            }
        }
        .build()
        return _eyeslashfill!!
    }

private var _eyeslashfill: ImageVector? = null
