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

public val IconPack.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0014f, 22.1854f)
                curveTo(17.6265f, 22.1854f, 22.1864f, 17.6256f, 22.1864f, 12.0004f)
                curveTo(22.1864f, 6.3753f, 17.6265f, 1.8154f, 12.0014f, 1.8154f)
                curveTo(6.3763f, 1.8154f, 1.8164f, 6.3753f, 1.8164f, 12.0004f)
                curveTo(1.8164f, 17.6256f, 6.3763f, 22.1854f, 12.0014f, 22.1854f)
                close()
                moveTo(17.1043f, 7.4495f)
                curveTo(17.1834f, 7.266f, 17.1596f, 7.076f, 17.0427f, 6.9591f)
                curveTo(16.9258f, 6.8423f, 16.7358f, 6.8184f, 16.5523f, 6.8975f)
                lineTo(10.0467f, 9.6991f)
                curveTo(9.894f, 9.7647f, 9.7657f, 9.8933f, 9.7001f, 10.0457f)
                lineTo(6.8985f, 16.5514f)
                curveTo(6.8639f, 16.6317f, 6.849f, 16.713f, 6.8527f, 16.7888f)
                curveTo(6.8577f, 16.8868f, 6.8942f, 16.9758f, 6.9601f, 17.0417f)
                curveTo(7.077f, 17.1588f, 7.267f, 17.1827f, 7.4505f, 17.1036f)
                lineTo(13.9561f, 14.302f)
                curveTo(14.1088f, 14.2361f, 14.2371f, 14.1078f, 14.3027f, 13.9551f)
                lineTo(17.1043f, 7.4495f)
                close()
                moveTo(10.5609f, 10.5602f)
                curveTo(9.7655f, 11.3557f, 9.7655f, 12.6454f, 10.5609f, 13.4409f)
                curveTo(11.3564f, 14.2364f, 12.6464f, 14.2364f, 13.4419f, 13.4409f)
                curveTo(14.2373f, 12.6454f, 14.2373f, 11.3557f, 13.4419f, 10.5602f)
                curveTo(12.6464f, 9.7647f, 11.3564f, 9.7647f, 10.5609f, 10.5602f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
