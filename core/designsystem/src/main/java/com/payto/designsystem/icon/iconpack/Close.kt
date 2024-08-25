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

public val IconPack.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.33f, 4.3307f)
                curveTo(4.8377f, 3.823f, 5.6608f, 3.823f, 6.1685f, 4.3307f)
                lineTo(11.9992f, 10.1615f)
                lineTo(17.83f, 4.3307f)
                curveTo(18.3376f, 3.823f, 19.1608f, 3.823f, 19.6684f, 4.3307f)
                curveTo(20.1761f, 4.8384f, 20.1761f, 5.6615f, 19.6684f, 6.1692f)
                lineTo(13.8377f, 12.0f)
                lineTo(19.6684f, 17.8307f)
                curveTo(20.1761f, 18.3384f, 20.1761f, 19.1615f, 19.6684f, 19.6692f)
                curveTo(19.1608f, 20.1769f, 18.3376f, 20.1769f, 17.83f, 19.6692f)
                lineTo(11.9992f, 13.8384f)
                lineTo(6.1685f, 19.6692f)
                curveTo(5.6608f, 20.1769f, 4.8377f, 20.1769f, 4.33f, 19.6692f)
                curveTo(3.8223f, 19.1615f, 3.8223f, 18.3384f, 4.33f, 17.8307f)
                lineTo(10.1607f, 12.0f)
                lineTo(4.33f, 6.1692f)
                curveTo(3.8223f, 5.6615f, 3.8223f, 4.8384f, 4.33f, 4.3307f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
