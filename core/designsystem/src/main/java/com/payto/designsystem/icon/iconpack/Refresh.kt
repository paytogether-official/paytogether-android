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

public val IconPack.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6337f, 5.187f)
                curveTo(10.2603f, 4.3829f, 12.1209f, 4.1873f, 13.8792f, 4.6356f)
                curveTo(15.42f, 5.0284f, 16.7931f, 5.893f, 17.8111f, 7.1f)
                lineTo(16.0017f, 7.1f)
                curveTo(15.5047f, 7.1f, 15.1017f, 7.5029f, 15.1017f, 8.0f)
                curveTo(15.1017f, 8.4971f, 15.5047f, 8.9f, 16.0017f, 8.9f)
                lineTo(20.0017f, 8.9f)
                curveTo(20.4988f, 8.9f, 20.9017f, 8.4971f, 20.9017f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(20.9017f, 3.5029f, 20.4988f, 3.1f, 20.0017f, 3.1f)
                curveTo(19.5047f, 3.1f, 19.1017f, 3.5029f, 19.1017f, 4.0f)
                verticalLineTo(5.8398f)
                curveTo(17.8517f, 4.399f, 16.1869f, 3.3664f, 14.3239f, 2.8914f)
                curveTo(12.1492f, 2.3369f, 9.8479f, 2.5788f, 7.836f, 3.5733f)
                curveTo(5.8241f, 4.5679f, 4.2345f, 6.2494f, 3.3544f, 8.3139f)
                curveTo(2.4744f, 10.3785f, 2.362f, 12.6898f, 3.0377f, 14.8299f)
                curveTo(3.7133f, 16.9701f, 5.1324f, 18.7979f, 7.0383f, 19.9829f)
                curveTo(8.9443f, 21.1678f, 11.2113f, 21.6318f, 13.4295f, 21.2909f)
                curveTo(15.6477f, 20.95f, 17.6708f, 19.8267f, 19.1329f, 18.124f)
                curveTo(20.595f, 16.4214f, 21.3998f, 14.2518f, 21.4016f, 12.0076f)
                curveTo(21.402f, 11.5105f, 20.9993f, 11.1072f, 20.5023f, 11.1068f)
                curveTo(20.0052f, 11.1064f, 19.602f, 11.509f, 19.6016f, 12.0061f)
                curveTo(19.6001f, 13.8206f, 18.9495f, 15.5747f, 17.7673f, 16.9513f)
                curveTo(16.5852f, 18.3279f, 14.9495f, 19.2361f, 13.1561f, 19.5118f)
                curveTo(11.3626f, 19.7874f, 9.5297f, 19.4123f, 7.9887f, 18.4542f)
                curveTo(6.4478f, 17.4961f, 5.3004f, 16.0183f, 4.7542f, 14.288f)
                curveTo(4.2079f, 12.5577f, 4.2987f, 10.689f, 5.0103f, 9.0198f)
                curveTo(5.7218f, 7.3506f, 7.0071f, 5.991f, 8.6337f, 5.187f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
