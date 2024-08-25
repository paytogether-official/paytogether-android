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

public val IconPack.Logoyoutube: ImageVector
    get() {
        if (_logoyoutube != null) {
            return _logoyoutube!!
        }
        _logoyoutube = Builder(name = "Logoyoutube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.3192f, 4.9925f)
                curveTo(21.2351f, 5.2374f, 21.9593f, 5.9616f, 22.2043f, 6.8775f)
                curveTo(22.6516f, 8.5389f, 22.6516f, 12.0002f, 22.6516f, 12.0002f)
                curveTo(22.6516f, 12.0002f, 22.6516f, 15.4614f, 22.2043f, 17.1228f)
                curveTo(21.9593f, 18.0387f, 21.2351f, 18.7629f, 20.3192f, 19.0079f)
                curveTo(18.6578f, 19.4552f, 12.0016f, 19.4552f, 12.0016f, 19.4552f)
                curveTo(12.0016f, 19.4552f, 5.3453f, 19.4552f, 3.6839f, 19.0079f)
                curveTo(2.768f, 18.7629f, 2.0438f, 18.0387f, 1.7989f, 17.1228f)
                curveTo(1.3516f, 15.4614f, 1.3516f, 12.0002f, 1.3516f, 12.0002f)
                curveTo(1.3516f, 12.0002f, 1.3516f, 8.5389f, 1.7989f, 6.8775f)
                curveTo(2.0438f, 5.9616f, 2.768f, 5.2374f, 3.6839f, 4.9925f)
                curveTo(5.3453f, 4.5452f, 12.0016f, 4.5452f, 12.0016f, 4.5452f)
                curveTo(12.0016f, 4.5452f, 18.6578f, 4.5452f, 20.3192f, 4.9925f)
                close()
                moveTo(9.8716f, 8.8054f)
                verticalLineTo(15.1954f)
                lineTo(15.4096f, 12.0004f)
                lineTo(9.8716f, 8.8054f)
                close()
            }
        }
        .build()
        return _logoyoutube!!
    }

private var _logoyoutube: ImageVector? = null
