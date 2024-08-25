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

public val IconPack.Circleinfo: ImageVector
    get() {
        if (_circleinfo != null) {
            return _circleinfo!!
        }
        _circleinfo = Builder(name = "Circleinfo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.1001f)
                curveTo(6.5339f, 2.1001f, 2.1016f, 6.5325f, 2.1016f, 12.0001f)
                curveTo(2.1016f, 17.4677f, 6.5339f, 21.9001f, 12.0016f, 21.9001f)
                curveTo(17.4692f, 21.9001f, 21.9015f, 17.4677f, 21.9015f, 12.0001f)
                curveTo(21.9015f, 6.5325f, 17.4692f, 2.1001f, 12.0016f, 2.1001f)
                close()
                moveTo(12.0015f, 7.0001f)
                curveTo(11.4493f, 7.0001f, 11.0015f, 7.4478f, 11.0015f, 8.0001f)
                curveTo(11.0015f, 8.5524f, 11.4493f, 9.0001f, 12.0015f, 9.0001f)
                curveTo(12.5538f, 9.0001f, 13.0015f, 8.5524f, 13.0015f, 8.0001f)
                curveTo(13.0015f, 7.4478f, 12.5538f, 7.0001f, 12.0015f, 7.0001f)
                close()
                moveTo(11.1015f, 17.0001f)
                verticalLineTo(10.5001f)
                horizontalLineTo(12.9015f)
                verticalLineTo(17.0001f)
                horizontalLineTo(11.1015f)
                close()
            }
        }
        .build()
        return _circleinfo!!
    }

private var _circleinfo: ImageVector? = null
