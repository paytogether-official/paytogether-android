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

public val IconPack.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1016f, 12.0f)
                curveTo(2.1016f, 11.6731f, 2.1174f, 11.3496f, 2.1485f, 11.0303f)
                lineTo(3.94f, 11.2047f)
                curveTo(3.9146f, 11.4661f, 3.9016f, 11.7314f, 3.9016f, 12.0f)
                curveTo(3.9016f, 16.4735f, 7.5281f, 20.1f, 12.0016f, 20.1f)
                curveTo(16.4751f, 20.1f, 20.1016f, 16.4735f, 20.1016f, 12.0f)
                curveTo(20.1016f, 7.5265f, 16.4751f, 3.9f, 12.0016f, 3.9f)
                curveTo(11.733f, 3.9f, 11.4677f, 3.913f, 11.2062f, 3.9385f)
                lineTo(11.0319f, 2.1469f)
                curveTo(11.3512f, 2.1158f, 11.6746f, 2.1f, 12.0016f, 2.1f)
                curveTo(17.4692f, 2.1f, 21.9016f, 6.5324f, 21.9016f, 12.0f)
                curveTo(21.9016f, 17.4676f, 17.4692f, 21.9f, 12.0016f, 21.9f)
                curveTo(6.5339f, 21.9f, 2.1016f, 17.4676f, 2.1016f, 12.0f)
                close()
                moveTo(9.1271f, 2.524f)
                curveTo(8.5006f, 2.7138f, 7.9003f, 2.964f, 7.3333f, 3.2677f)
                lineTo(8.1832f, 4.8545f)
                curveTo(8.6468f, 4.6061f, 9.1373f, 4.4017f, 9.6491f, 4.2466f)
                lineTo(9.1271f, 2.524f)
                close()
                moveTo(5.7206f, 4.3472f)
                curveTo(5.2198f, 4.7586f, 4.7602f, 5.2183f, 4.3488f, 5.719f)
                lineTo(5.7396f, 6.8617f)
                curveTo(6.0766f, 6.4515f, 6.4531f, 6.075f, 6.8633f, 5.738f)
                lineTo(5.7206f, 4.3472f)
                close()
                moveTo(3.2693f, 7.3317f)
                curveTo(2.9656f, 7.8987f, 2.7154f, 8.499f, 2.5255f, 9.1256f)
                lineTo(4.2482f, 9.6475f)
                curveTo(4.4033f, 9.1357f, 4.6077f, 8.6453f, 4.856f, 8.1816f)
                lineTo(3.2693f, 7.3317f)
                close()
                moveTo(10.6016f, 7.5f)
                verticalLineTo(13.0f)
                verticalLineTo(13.3559f)
                lineTo(10.845f, 13.6155f)
                lineTo(13.845f, 16.8155f)
                lineTo(15.1582f, 15.5844f)
                lineTo(12.4016f, 12.6441f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.6016f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
