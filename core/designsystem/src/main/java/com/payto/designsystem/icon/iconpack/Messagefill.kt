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

public val IconPack.Messagefill: ImageVector
    get() {
        if (_messagefill != null) {
            return _messagefill!!
        }
        _messagefill = Builder(name = "Messagefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.72f)
                curveTo(6.6609f, 2.72f, 2.1016f, 6.5161f, 2.1016f, 11.451f)
                curveTo(2.1016f, 13.652f, 3.0321f, 15.6475f, 4.5242f, 17.1653f)
                lineTo(3.9777f, 20.2201f)
                curveTo(3.9159f, 20.5656f, 4.0605f, 20.9154f, 4.3481f, 21.1164f)
                curveTo(4.6358f, 21.3174f, 5.014f, 21.3328f, 5.3171f, 21.156f)
                lineTo(8.1679f, 19.4931f)
                curveTo(9.35f, 19.9308f, 10.6439f, 20.1821f, 12.0016f, 20.1821f)
                curveTo(17.3422f, 20.1821f, 21.9016f, 16.386f, 21.9016f, 11.451f)
                curveTo(21.9016f, 6.5161f, 17.3422f, 2.72f, 12.0016f, 2.72f)
                close()
                moveTo(8.0016f, 12.62f)
                curveTo(8.5538f, 12.62f, 9.0016f, 12.1723f, 9.0016f, 11.62f)
                curveTo(9.0016f, 11.0677f, 8.5538f, 10.62f, 8.0016f, 10.62f)
                curveTo(7.4493f, 10.62f, 7.0016f, 11.0677f, 7.0016f, 11.62f)
                curveTo(7.0016f, 12.1723f, 7.4493f, 12.62f, 8.0016f, 12.62f)
                close()
                moveTo(13.0016f, 11.62f)
                curveTo(13.0016f, 12.1723f, 12.5538f, 12.62f, 12.0016f, 12.62f)
                curveTo(11.4493f, 12.62f, 11.0016f, 12.1723f, 11.0016f, 11.62f)
                curveTo(11.0016f, 11.0677f, 11.4493f, 10.62f, 12.0016f, 10.62f)
                curveTo(12.5538f, 10.62f, 13.0016f, 11.0677f, 13.0016f, 11.62f)
                close()
                moveTo(16.0016f, 12.62f)
                curveTo(16.5538f, 12.62f, 17.0016f, 12.1723f, 17.0016f, 11.62f)
                curveTo(17.0016f, 11.0677f, 16.5538f, 10.62f, 16.0016f, 10.62f)
                curveTo(15.4493f, 10.62f, 15.0016f, 11.0677f, 15.0016f, 11.62f)
                curveTo(15.0016f, 12.1723f, 15.4493f, 12.62f, 16.0016f, 12.62f)
                close()
            }
        }
        .build()
        return _messagefill!!
    }

private var _messagefill: ImageVector? = null
