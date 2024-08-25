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

public val IconPack.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.72f)
                curveTo(6.6609f, 2.72f, 2.1016f, 6.5161f, 2.1016f, 11.451f)
                curveTo(2.1016f, 13.652f, 3.0321f, 15.6474f, 4.5242f, 17.1653f)
                lineTo(3.9777f, 20.2201f)
                curveTo(3.9159f, 20.5655f, 4.0605f, 20.9154f, 4.3481f, 21.1163f)
                curveTo(4.6358f, 21.3173f, 5.014f, 21.3328f, 5.3171f, 21.156f)
                lineTo(8.1679f, 19.493f)
                curveTo(9.3499f, 19.9308f, 10.6439f, 20.182f, 12.0016f, 20.182f)
                curveTo(17.3422f, 20.182f, 21.9015f, 16.3859f, 21.9015f, 11.451f)
                curveTo(21.9015f, 6.5161f, 17.3422f, 2.72f, 12.0016f, 2.72f)
                close()
                moveTo(12.0016f, 4.52f)
                curveTo(7.4111f, 4.52f, 3.9016f, 7.7377f, 3.9016f, 11.451f)
                curveTo(3.9016f, 13.2556f, 4.7217f, 14.9269f, 6.1014f, 16.1863f)
                curveTo(6.3296f, 16.3946f, 6.435f, 16.7053f, 6.3806f, 17.0095f)
                lineTo(6.0925f, 18.6198f)
                lineTo(7.6377f, 17.7184f)
                curveTo(7.8814f, 17.5763f, 8.1776f, 17.5566f, 8.4379f, 17.6653f)
                curveTo(9.5234f, 18.1184f, 10.7301f, 18.382f, 12.0016f, 18.382f)
                curveTo(16.592f, 18.382f, 20.1015f, 15.1643f, 20.1015f, 11.451f)
                curveTo(20.1015f, 7.7377f, 16.592f, 4.52f, 12.0016f, 4.52f)
                close()
                moveTo(9.0016f, 11.62f)
                curveTo(9.0016f, 12.1723f, 8.5538f, 12.62f, 8.0016f, 12.62f)
                curveTo(7.4493f, 12.62f, 7.0016f, 12.1723f, 7.0016f, 11.62f)
                curveTo(7.0016f, 11.0677f, 7.4493f, 10.62f, 8.0016f, 10.62f)
                curveTo(8.5538f, 10.62f, 9.0016f, 11.0677f, 9.0016f, 11.62f)
                close()
                moveTo(13.0016f, 11.62f)
                curveTo(13.0016f, 12.1723f, 12.5538f, 12.62f, 12.0016f, 12.62f)
                curveTo(11.4493f, 12.62f, 11.0016f, 12.1723f, 11.0016f, 11.62f)
                curveTo(11.0016f, 11.0677f, 11.4493f, 10.62f, 12.0016f, 10.62f)
                curveTo(12.5538f, 10.62f, 13.0016f, 11.0677f, 13.0016f, 11.62f)
                close()
                moveTo(17.0015f, 11.62f)
                curveTo(17.0015f, 12.1723f, 16.5538f, 12.62f, 16.0015f, 12.62f)
                curveTo(15.4493f, 12.62f, 15.0016f, 12.1723f, 15.0016f, 11.62f)
                curveTo(15.0016f, 11.0677f, 15.4493f, 10.62f, 16.0015f, 10.62f)
                curveTo(16.5538f, 10.62f, 17.0015f, 11.0677f, 17.0015f, 11.62f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
