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

public val IconPack.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0016f, 2.1001f)
                curveTo(5.6385f, 2.1001f, 2.1016f, 5.6371f, 2.1016f, 10.0001f)
                curveTo(2.1016f, 14.3631f, 5.6385f, 17.9001f, 10.0016f, 17.9001f)
                curveTo(11.8589f, 17.9001f, 13.5665f, 17.2592f, 14.9152f, 16.1864f)
                lineTo(19.8653f, 21.1365f)
                curveTo(20.2168f, 21.4879f, 20.7866f, 21.4879f, 21.1381f, 21.1365f)
                curveTo(21.4896f, 20.785f, 21.4896f, 20.2151f, 21.1381f, 19.8637f)
                lineTo(16.188f, 14.9136f)
                curveTo(17.2607f, 13.5648f, 17.9015f, 11.8573f, 17.9015f, 10.0001f)
                curveTo(17.9015f, 5.6371f, 14.3646f, 2.1001f, 10.0016f, 2.1001f)
                close()
                moveTo(3.9016f, 10.0001f)
                curveTo(3.9016f, 6.6312f, 6.6326f, 3.9001f, 10.0016f, 3.9001f)
                curveTo(13.3705f, 3.9001f, 16.1016f, 6.6312f, 16.1016f, 10.0001f)
                curveTo(16.1016f, 13.369f, 13.3705f, 16.1001f, 10.0016f, 16.1001f)
                curveTo(6.6326f, 16.1001f, 3.9016f, 13.369f, 3.9016f, 10.0001f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
