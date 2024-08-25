package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9986f, 2.1001f)
                curveTo(9.7734f, 2.1001f, 7.944f, 2.8879f, 6.6865f, 4.3744f)
                curveTo(5.4464f, 5.8404f, 4.8486f, 7.8832f, 4.8486f, 10.2501f)
                lineTo(4.8486f, 11.0001f)
                curveTo(4.8486f, 13.4652f, 4.1654f, 14.9249f, 3.1923f, 15.8682f)
                curveTo(2.8107f, 16.2381f, 2.7711f, 16.7499f, 2.9075f, 17.1264f)
                curveTo(3.0462f, 17.5094f, 3.4263f, 17.9001f, 3.9982f, 17.9001f)
                horizontalLineTo(19.9991f)
                curveTo(20.5709f, 17.9001f, 20.951f, 17.5094f, 21.0897f, 17.1264f)
                curveTo(21.2261f, 16.7499f, 21.1865f, 16.2381f, 20.805f, 15.8682f)
                curveTo(19.8318f, 14.9249f, 19.1486f, 13.4652f, 19.1486f, 11.0001f)
                lineTo(19.1486f, 10.2501f)
                curveTo(19.1486f, 7.8832f, 18.5509f, 5.8404f, 17.3107f, 4.3744f)
                curveTo(16.0533f, 2.8879f, 14.2239f, 2.1001f, 11.9986f, 2.1001f)
                close()
                moveTo(6.6486f, 10.2501f)
                curveTo(6.6486f, 8.1652f, 7.1759f, 6.583f, 8.0608f, 5.5369f)
                curveTo(8.9283f, 4.5114f, 10.2239f, 3.9001f, 11.9986f, 3.9001f)
                curveTo(13.7734f, 3.9001f, 15.069f, 4.5114f, 15.9365f, 5.5369f)
                curveTo(16.8214f, 6.583f, 17.3486f, 8.1652f, 17.3486f, 10.2501f)
                lineTo(17.3486f, 11.0001f)
                curveTo(17.3486f, 13.1628f, 17.8168f, 14.8273f, 18.6673f, 16.1001f)
                horizontalLineTo(5.3299f)
                curveTo(6.1805f, 14.8273f, 6.6486f, 13.1628f, 6.6486f, 11.0001f)
                lineTo(6.6486f, 10.2501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0987f, 20.1001f)
                verticalLineTo(21.9001f)
                horizontalLineTo(14.8987f)
                verticalLineTo(20.1001f)
                horizontalLineTo(9.0987f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
