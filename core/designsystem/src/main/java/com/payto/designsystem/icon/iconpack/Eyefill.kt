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

public val IconPack.Eyefill: ImageVector
    get() {
        if (_eyefill != null) {
            return _eyefill!!
        }
        _eyefill = Builder(name = "Eyefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.2979f, 12.3918f)
                curveTo(22.4159f, 12.1438f, 22.4159f, 11.8561f, 22.2979f, 11.6081f)
                curveTo(20.467f, 7.76f, 16.5431f, 5.1f, 11.9979f, 5.1f)
                curveTo(7.4527f, 5.1f, 3.5287f, 7.76f, 1.6978f, 11.6081f)
                curveTo(1.5799f, 11.8561f, 1.5799f, 12.1438f, 1.6978f, 12.3918f)
                curveTo(3.5287f, 16.2399f, 7.4527f, 18.8999f, 11.9979f, 18.8999f)
                curveTo(16.5431f, 18.8999f, 20.467f, 16.2399f, 22.2979f, 12.3918f)
                close()
                moveTo(9.8979f, 12.0f)
                curveTo(9.8979f, 10.8402f, 10.8381f, 9.9f, 11.9979f, 9.9f)
                curveTo(13.1577f, 9.9f, 14.0979f, 10.8402f, 14.0979f, 12.0f)
                curveTo(14.0979f, 13.1598f, 13.1577f, 14.1f, 11.9979f, 14.1f)
                curveTo(10.8381f, 14.1f, 9.8979f, 13.1598f, 9.8979f, 12.0f)
                close()
                moveTo(11.9979f, 8.1f)
                curveTo(9.844f, 8.1f, 8.0979f, 9.8461f, 8.0979f, 12.0f)
                curveTo(8.0979f, 14.1539f, 9.844f, 15.9f, 11.9979f, 15.9f)
                curveTo(14.1518f, 15.9f, 15.8979f, 14.1539f, 15.8979f, 12.0f)
                curveTo(15.8979f, 9.8461f, 14.1518f, 8.1f, 11.9979f, 8.1f)
                close()
            }
        }
        .build()
        return _eyefill!!
    }

private var _eyefill: ImageVector? = null
