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

public val IconPack.Circleclose: ImageVector
    get() {
        if (_circleclose != null) {
            return _circleclose!!
        }
        _circleclose = Builder(name = "Circleclose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1016f, 12.0001f)
                curveTo(2.1016f, 6.5325f, 6.5339f, 2.1001f, 12.0016f, 2.1001f)
                curveTo(17.4692f, 2.1001f, 21.9015f, 6.5325f, 21.9015f, 12.0001f)
                curveTo(21.9015f, 17.4677f, 17.4692f, 21.9001f, 12.0016f, 21.9001f)
                curveTo(6.5339f, 21.9001f, 2.1016f, 17.4677f, 2.1016f, 12.0001f)
                close()
                moveTo(8.5015f, 7.2273f)
                lineTo(7.2288f, 8.5001f)
                lineTo(10.7288f, 12.0001f)
                lineTo(7.2288f, 15.5001f)
                lineTo(8.5015f, 16.7729f)
                lineTo(12.0015f, 13.2729f)
                lineTo(15.5015f, 16.7729f)
                lineTo(16.7743f, 15.5001f)
                lineTo(13.2743f, 12.0001f)
                lineTo(16.7743f, 8.5001f)
                lineTo(15.5015f, 7.2273f)
                lineTo(12.0015f, 10.7273f)
                lineTo(8.5015f, 7.2273f)
                close()
            }
        }
        .build()
        return _circleclose!!
    }

private var _circleclose: ImageVector? = null
