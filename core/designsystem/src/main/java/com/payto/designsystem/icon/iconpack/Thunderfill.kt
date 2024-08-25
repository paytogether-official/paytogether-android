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

public val IconPack.Thunderfill: ImageVector
    get() {
        if (_thunderfill != null) {
            return _thunderfill!!
        }
        _thunderfill = Builder(name = "Thunderfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.7146f, 2.033f)
                curveTo(15.0744f, 2.1751f, 15.3031f, 2.5313f, 15.2827f, 2.9176f)
                lineTo(14.9358f, 9.47f)
                horizontalLineTo(18.7516f)
                curveTo(19.109f, 9.47f, 19.4325f, 9.6815f, 19.5759f, 10.0088f)
                curveTo(19.7193f, 10.3362f, 19.6555f, 10.7174f, 19.4132f, 10.9801f)
                lineTo(9.4867f, 21.7448f)
                curveTo(9.2176f, 22.0367f, 8.789f, 22.1177f, 8.4319f, 21.9443f)
                curveTo(8.0748f, 21.7708f, 7.8735f, 21.3839f, 7.9365f, 20.9919f)
                lineTo(8.9601f, 14.623f)
                horizontalLineTo(5.2516f)
                curveTo(4.9016f, 14.623f, 4.5833f, 14.4201f, 4.4356f, 14.1028f)
                curveTo(4.2879f, 13.7854f, 4.3376f, 13.4113f, 4.5629f, 13.1435f)
                lineTo(13.6953f, 2.2905f)
                curveTo(13.9444f, 1.9945f, 14.3548f, 1.8908f, 14.7146f, 2.033f)
                close()
                moveTo(7.1851f, 12.823f)
                horizontalLineTo(10.0163f)
                curveTo(10.2799f, 12.823f, 10.5303f, 12.9386f, 10.7013f, 13.1392f)
                curveTo(10.8723f, 13.3399f, 10.9467f, 13.6055f, 10.9049f, 13.8658f)
                lineTo(10.1875f, 18.3297f)
                lineTo(16.6974f, 11.27f)
                horizontalLineTo(13.9869f)
                curveTo(13.7399f, 11.27f, 13.5038f, 11.1685f, 13.3339f, 10.9894f)
                curveTo(13.1639f, 10.8102f, 13.0751f, 10.569f, 13.0881f, 10.3224f)
                lineTo(13.3432f, 5.5047f)
                lineTo(7.1851f, 12.823f)
                close()
            }
        }
        .build()
        return _thunderfill!!
    }

private var _thunderfill: ImageVector? = null
