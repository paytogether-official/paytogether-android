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

public val IconPack.Bellplus: ImageVector
    get() {
        if (_bellplus != null) {
            return _bellplus!!
        }
        _bellplus = Builder(name = "Bellplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0988f, 20.1f)
                horizontalLineTo(14.8988f)
                verticalLineTo(21.9f)
                horizontalLineTo(9.0988f)
                verticalLineTo(20.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.8992f, 9.4998f)
                verticalLineTo(7.7998f)
                horizontalLineTo(20.4992f)
                verticalLineTo(9.4998f)
                horizontalLineTo(22.1992f)
                verticalLineTo(11.0998f)
                horizontalLineTo(20.4992f)
                verticalLineTo(12.7998f)
                horizontalLineTo(18.8992f)
                verticalLineTo(11.0998f)
                horizontalLineTo(17.1992f)
                verticalLineTo(9.4998f)
                horizontalLineTo(18.8992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.6486f, 10.2501f)
                curveTo(6.6486f, 8.1652f, 7.1759f, 6.583f, 8.0608f, 5.537f)
                curveTo(8.9283f, 4.5114f, 10.2239f, 3.9001f, 11.9986f, 3.9001f)
                curveTo(13.7734f, 3.9001f, 15.069f, 4.5114f, 15.9365f, 5.537f)
                curveTo(16.2809f, 5.9441f, 16.5712f, 6.4325f, 16.7972f, 7.0001f)
                horizontalLineTo(18.7026f)
                curveTo(18.3982f, 5.9998f, 17.9362f, 5.1138f, 17.3108f, 4.3744f)
                curveTo(16.0533f, 2.8879f, 14.2239f, 2.1001f, 11.9986f, 2.1001f)
                curveTo(9.7734f, 2.1001f, 7.944f, 2.8879f, 6.6865f, 4.3744f)
                curveTo(5.4464f, 5.8404f, 4.8486f, 7.8832f, 4.8486f, 10.2501f)
                lineTo(4.8486f, 11.0001f)
                curveTo(4.8486f, 13.4653f, 4.1654f, 14.9249f, 3.1923f, 15.8683f)
                curveTo(2.8107f, 16.2381f, 2.7711f, 16.7499f, 2.9075f, 17.1265f)
                curveTo(3.0462f, 17.5094f, 3.4263f, 17.9001f, 3.9982f, 17.9001f)
                horizontalLineTo(19.9991f)
                curveTo(20.571f, 17.9001f, 20.9511f, 17.5094f, 21.0898f, 17.1265f)
                curveTo(21.2261f, 16.7499f, 21.1865f, 16.2381f, 20.805f, 15.8683f)
                curveTo(20.3175f, 15.3957f, 19.9027f, 14.7935f, 19.6102f, 14.0002f)
                horizontalLineTo(17.7206f)
                curveTo(17.943f, 14.7969f, 18.2617f, 15.4931f, 18.6674f, 16.1001f)
                horizontalLineTo(5.3299f)
                curveTo(6.1805f, 14.8273f, 6.6486f, 13.1629f, 6.6486f, 11.0001f)
                lineTo(6.6486f, 10.2501f)
                close()
            }
        }
        .build()
        return _bellplus!!
    }

private var _bellplus: ImageVector? = null
