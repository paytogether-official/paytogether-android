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

public val IconPack.Logokakao: ImageVector
    get() {
        if (_logokakao != null) {
            return _logokakao!!
        }
        _logokakao = Builder(name = "Logokakao", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9989f, 3.1543f)
                curveTo(6.7943f, 3.1543f, 2.5703f, 6.4354f, 2.5703f, 10.4709f)
                curveTo(2.5703f, 12.9883f, 4.2015f, 15.1852f, 6.6906f, 16.524f)
                lineTo(5.644f, 20.3614f)
                curveTo(5.6243f, 20.4378f, 5.6283f, 20.5183f, 5.6557f, 20.5923f)
                curveTo(5.683f, 20.6662f, 5.7323f, 20.73f, 5.7969f, 20.7752f)
                curveTo(5.8616f, 20.8203f, 5.9385f, 20.8446f, 6.0173f, 20.8448f)
                curveTo(6.0961f, 20.845f, 6.1732f, 20.8211f, 6.238f, 20.7763f)
                lineTo(10.8203f, 17.7309f)
                curveTo(11.2069f, 17.7309f, 11.6029f, 17.7969f, 11.9989f, 17.7969f)
                curveTo(17.2035f, 17.7969f, 21.4275f, 14.5157f, 21.4275f, 10.4709f)
                curveTo(21.4275f, 6.426f, 17.2035f, 3.1543f, 11.9989f, 3.1543f)
                close()
            }
        }
        .build()
        return _logokakao!!
    }

private var _logokakao: ImageVector? = null
