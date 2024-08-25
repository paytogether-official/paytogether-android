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

public val IconPack.Starfill: ImageVector
    get() {
        if (_starfill != null) {
            return _starfill!!
        }
        _starfill = Builder(name = "Starfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.903f, 2.3786f)
                curveTo(11.0923f, 2.142f, 11.4434f, 1.7933f, 12.0014f, 1.7933f)
                curveTo(12.5594f, 1.7933f, 12.9105f, 2.142f, 13.0998f, 2.3786f)
                curveTo(13.2744f, 2.5968f, 13.448f, 2.8951f, 13.6167f, 3.1849f)
                curveTo(13.6255f, 3.2001f, 13.6344f, 3.2153f, 13.6432f, 3.2305f)
                lineTo(15.9518f, 7.1941f)
                curveTo(15.9598f, 7.2078f, 15.9671f, 7.2204f, 15.974f, 7.2321f)
                curveTo(15.9872f, 7.235f, 16.0014f, 7.2381f, 16.017f, 7.2415f)
                lineTo(20.5f, 8.2122f)
                curveTo(20.5171f, 8.216f, 20.5343f, 8.2197f, 20.5515f, 8.2234f)
                curveTo(20.8792f, 8.2942f, 21.2166f, 8.3672f, 21.4781f, 8.4658f)
                curveTo(21.7616f, 8.5727f, 22.2017f, 8.7989f, 22.3741f, 9.3296f)
                curveTo(22.5466f, 9.8602f, 22.3235f, 10.3019f, 22.157f, 10.5551f)
                curveTo(22.0034f, 10.7885f, 21.7733f, 11.0459f, 21.5498f, 11.2958f)
                curveTo(21.5381f, 11.3089f, 21.5263f, 11.3221f, 21.5147f, 11.3351f)
                lineTo(18.4585f, 14.7555f)
                curveTo(18.4479f, 14.7674f, 18.4381f, 14.7783f, 18.4291f, 14.7884f)
                curveTo(18.4305f, 14.8018f, 18.4319f, 14.8164f, 18.4336f, 14.8322f)
                lineTo(18.8956f, 19.3957f)
                curveTo(18.8974f, 19.4132f, 18.8991f, 19.4307f, 18.9009f, 19.4482f)
                curveTo(18.9348f, 19.7818f, 18.9697f, 20.1252f, 18.9567f, 20.4044f)
                curveTo(18.9426f, 20.7071f, 18.8635f, 21.1955f, 18.4121f, 21.5235f)
                curveTo(17.9607f, 21.8514f, 17.4717f, 21.7758f, 17.1795f, 21.6956f)
                curveTo(16.91f, 21.6217f, 16.5942f, 21.4824f, 16.2874f, 21.3471f)
                curveTo(16.2713f, 21.34f, 16.2552f, 21.3329f, 16.2391f, 21.3258f)
                lineTo(12.0417f, 19.4762f)
                curveTo(12.0271f, 19.4697f, 12.0138f, 19.4639f, 12.0014f, 19.4584f)
                curveTo(11.989f, 19.4639f, 11.9756f, 19.4697f, 11.9611f, 19.4762f)
                lineTo(7.7637f, 21.3258f)
                curveTo(7.7476f, 21.3329f, 7.7315f, 21.34f, 7.7154f, 21.3471f)
                curveTo(7.4086f, 21.4824f, 7.0928f, 21.6217f, 6.8233f, 21.6956f)
                curveTo(6.5311f, 21.7758f, 6.0421f, 21.8514f, 5.5907f, 21.5235f)
                curveTo(5.1393f, 21.1955f, 5.0602f, 20.7071f, 5.0461f, 20.4044f)
                curveTo(5.0331f, 20.1252f, 5.068f, 19.7818f, 5.1019f, 19.4483f)
                curveTo(5.1036f, 19.4307f, 5.1054f, 19.4132f, 5.1072f, 19.3957f)
                lineTo(5.5692f, 14.8322f)
                curveTo(5.5708f, 14.8164f, 5.5723f, 14.8018f, 5.5737f, 14.7884f)
                curveTo(5.5647f, 14.7783f, 5.5549f, 14.7674f, 5.5443f, 14.7555f)
                lineTo(2.4881f, 11.3351f)
                curveTo(2.4764f, 11.3221f, 2.4647f, 11.3089f, 2.453f, 11.2958f)
                curveTo(2.2295f, 11.0459f, 1.9994f, 10.7885f, 1.8458f, 10.5551f)
                curveTo(1.6793f, 10.3019f, 1.4562f, 9.8602f, 1.6286f, 9.3296f)
                curveTo(1.8011f, 8.7989f, 2.2411f, 8.5727f, 2.5247f, 8.4658f)
                curveTo(2.7862f, 8.3672f, 3.1235f, 8.2942f, 3.4513f, 8.2234f)
                curveTo(3.4685f, 8.2197f, 3.4857f, 8.216f, 3.5028f, 8.2122f)
                lineTo(7.9858f, 7.2415f)
                curveTo(8.0013f, 7.2381f, 8.0156f, 7.235f, 8.0288f, 7.2321f)
                curveTo(8.0357f, 7.2204f, 8.043f, 7.2078f, 8.051f, 7.1941f)
                lineTo(10.3596f, 3.2305f)
                curveTo(10.3684f, 3.2153f, 10.3773f, 3.2001f, 10.3861f, 3.1849f)
                curveTo(10.5548f, 2.8951f, 10.7284f, 2.5968f, 10.903f, 2.3786f)
                close()
            }
        }
        .build()
        return _starfill!!
    }

private var _starfill: ImageVector? = null
