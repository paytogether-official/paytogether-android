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

public val IconPack.Eyeslash: ImageVector
    get() {
        if (_eyeslash != null) {
            return _eyeslash!!
        }
        _eyeslash = Builder(name = "Eyeslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.1309f, 18.1295f)
                lineTo(18.7652f, 20.7638f)
                lineTo(20.038f, 19.491f)
                lineTo(3.7746f, 3.2275f)
                lineTo(2.5018f, 4.5003f)
                lineTo(5.2877f, 7.2863f)
                curveTo(3.7609f, 8.4007f, 2.5215f, 9.8855f, 1.7018f, 11.6085f)
                curveTo(1.5838f, 11.8564f, 1.5838f, 12.1442f, 1.7018f, 12.3921f)
                curveTo(3.5326f, 16.2403f, 7.4566f, 18.9003f, 12.0018f, 18.9003f)
                curveTo(13.4581f, 18.9003f, 14.8506f, 18.6272f, 16.1309f, 18.1295f)
                close()
                moveTo(13.5726f, 15.5711f)
                lineTo(12.0996f, 14.0981f)
                curveTo(12.0672f, 14.0996f, 12.0346f, 14.1004f, 12.0018f, 14.1004f)
                curveTo(10.842f, 14.1004f, 9.9018f, 13.1602f, 9.9018f, 12.0004f)
                curveTo(9.9018f, 11.9676f, 9.9025f, 11.935f, 9.904f, 11.9026f)
                lineTo(8.431f, 10.4296f)
                curveTo(8.2193f, 10.9101f, 8.1018f, 11.4415f, 8.1018f, 12.0004f)
                curveTo(8.1018f, 14.1543f, 9.8479f, 15.9004f, 12.0018f, 15.9004f)
                curveTo(12.5606f, 15.9004f, 13.092f, 15.7828f, 13.5726f, 15.5711f)
                close()
                moveTo(15.8244f, 12.7773f)
                lineTo(19.303f, 16.2558f)
                curveTo(20.5614f, 15.2053f, 21.5899f, 13.8885f, 22.3018f, 12.3921f)
                curveTo(22.4198f, 12.1442f, 22.4198f, 11.8564f, 22.3018f, 11.6085f)
                curveTo(20.4709f, 7.7603f, 16.547f, 5.1003f, 12.0018f, 5.1003f)
                curveTo(10.8348f, 5.1003f, 9.7088f, 5.2757f, 8.6486f, 5.6015f)
                lineTo(11.2249f, 8.1777f)
                curveTo(11.476f, 8.127f, 11.7358f, 8.1004f, 12.0018f, 8.1004f)
                curveTo(14.1557f, 8.1004f, 15.9018f, 9.8465f, 15.9018f, 12.0004f)
                curveTo(15.9018f, 12.2664f, 15.8752f, 12.5262f, 15.8244f, 12.7773f)
                close()
            }
        }
        .build()
        return _eyeslash!!
    }

private var _eyeslash: ImageVector? = null
