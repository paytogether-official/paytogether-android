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

public val IconPack.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.3516f, 12.0001f)
                curveTo(2.3516f, 6.6705f, 6.672f, 2.3501f, 12.0016f, 2.3501f)
                curveTo(17.3311f, 2.3501f, 21.6515f, 6.6705f, 21.6515f, 12.0001f)
                curveTo(21.6515f, 13.5384f, 21.2909f, 14.9948f, 20.6491f, 16.2873f)
                lineTo(21.1434f, 18.0998f)
                curveTo(21.2553f, 18.5099f, 21.3551f, 18.8758f, 21.4082f, 19.1763f)
                curveTo(21.4619f, 19.4809f, 21.4986f, 19.867f, 21.3513f, 20.2526f)
                curveTo(21.1584f, 20.7579f, 20.7593f, 21.157f, 20.2541f, 21.3499f)
                curveTo(19.8684f, 21.4971f, 19.4823f, 21.4605f, 19.1778f, 21.4067f)
                curveTo(18.8772f, 21.3537f, 18.5114f, 21.2539f, 18.1013f, 21.142f)
                lineTo(16.2887f, 20.6476f)
                curveTo(14.9963f, 21.2895f, 13.5399f, 21.6501f, 12.0016f, 21.6501f)
                curveTo(6.672f, 21.6501f, 2.3516f, 17.3296f, 2.3516f, 12.0001f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
