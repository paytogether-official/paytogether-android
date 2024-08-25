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

public val IconPack.Circleexclamation: ImageVector
    get() {
        if (_circleexclamation != null) {
            return _circleexclamation!!
        }
        _circleexclamation = Builder(name = "Circleexclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1016f, 12.0001f)
                curveTo(2.1016f, 6.5325f, 6.5339f, 2.1001f, 12.0016f, 2.1001f)
                curveTo(17.4692f, 2.1001f, 21.9015f, 6.5325f, 21.9015f, 12.0001f)
                curveTo(21.9015f, 17.4677f, 17.4692f, 21.9001f, 12.0016f, 21.9001f)
                curveTo(6.5339f, 21.9001f, 2.1016f, 17.4677f, 2.1016f, 12.0001f)
                close()
                moveTo(13.0015f, 16.2501f)
                curveTo(13.0015f, 16.8024f, 12.5538f, 17.2501f, 12.0015f, 17.2501f)
                curveTo(11.4493f, 17.2501f, 11.0015f, 16.8024f, 11.0015f, 16.2501f)
                curveTo(11.0015f, 15.6978f, 11.4493f, 15.2501f, 12.0015f, 15.2501f)
                curveTo(12.5538f, 15.2501f, 13.0015f, 15.6978f, 13.0015f, 16.2501f)
                close()
                moveTo(11.1015f, 6.7501f)
                verticalLineTo(13.7501f)
                horizontalLineTo(12.9015f)
                verticalLineTo(6.7501f)
                horizontalLineTo(11.1015f)
                close()
            }
        }
        .build()
        return _circleexclamation!!
    }

private var _circleexclamation: ImageVector? = null
