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

public val IconPack.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5236f, 12.0f)
                curveTo(5.1366f, 8.9659f, 8.3299f, 6.9f, 12.0057f, 6.9f)
                curveTo(15.6815f, 6.9f, 18.8748f, 8.9659f, 20.4878f, 12.0f)
                curveTo(18.8748f, 15.034f, 15.6815f, 17.0999f, 12.0057f, 17.0999f)
                curveTo(8.3299f, 17.0999f, 5.1366f, 15.034f, 3.5236f, 12.0f)
                close()
                moveTo(22.3057f, 12.3918f)
                curveTo(22.4237f, 12.1438f, 22.4237f, 11.8561f, 22.3057f, 11.6081f)
                curveTo(20.4748f, 7.76f, 16.5509f, 5.1f, 12.0057f, 5.1f)
                curveTo(7.4605f, 5.1f, 3.5365f, 7.76f, 1.7057f, 11.6081f)
                curveTo(1.5877f, 11.8561f, 1.5877f, 12.1438f, 1.7057f, 12.3918f)
                curveTo(3.5365f, 16.2399f, 7.4605f, 18.8999f, 12.0057f, 18.8999f)
                curveTo(16.5509f, 18.8999f, 20.4748f, 16.2399f, 22.3057f, 12.3918f)
                close()
                moveTo(9.9057f, 12.0f)
                curveTo(9.9057f, 10.8402f, 10.8459f, 9.9f, 12.0057f, 9.9f)
                curveTo(13.1655f, 9.9f, 14.1057f, 10.8402f, 14.1057f, 12.0f)
                curveTo(14.1057f, 13.1598f, 13.1655f, 14.1f, 12.0057f, 14.1f)
                curveTo(10.8459f, 14.1f, 9.9057f, 13.1598f, 9.9057f, 12.0f)
                close()
                moveTo(12.0057f, 8.1f)
                curveTo(9.8518f, 8.1f, 8.1057f, 9.8461f, 8.1057f, 12.0f)
                curveTo(8.1057f, 14.1539f, 9.8518f, 15.9f, 12.0057f, 15.9f)
                curveTo(14.1596f, 15.9f, 15.9057f, 14.1539f, 15.9057f, 12.0f)
                curveTo(15.9057f, 9.8461f, 14.1596f, 8.1f, 12.0057f, 8.1f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
