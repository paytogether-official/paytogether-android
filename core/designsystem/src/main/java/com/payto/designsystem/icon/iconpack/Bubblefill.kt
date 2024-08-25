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

public val IconPack.Bubblefill: ImageVector
    get() {
        if (_bubblefill != null) {
            return _bubblefill!!
        }
        _bubblefill = Builder(name = "Bubblefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 4.1501f)
                curveTo(7.6661f, 4.1501f, 4.1516f, 7.6646f, 4.1516f, 12.0001f)
                curveTo(4.1516f, 16.3355f, 7.6661f, 19.8501f, 12.0016f, 19.8501f)
                curveTo(13.3628f, 19.8501f, 14.6407f, 19.5043f, 15.7548f, 18.8966f)
                curveTo(15.9589f, 18.7852f, 16.1982f, 18.7572f, 16.4226f, 18.8184f)
                lineTo(18.537f, 19.395f)
                curveTo(18.9968f, 19.5204f, 19.2816f, 19.5972f, 19.4907f, 19.6341f)
                curveTo(19.5651f, 19.6472f, 19.6122f, 19.6516f, 19.6386f, 19.6531f)
                curveTo(19.6445f, 19.6484f, 19.6499f, 19.643f, 19.6546f, 19.6371f)
                curveTo(19.6531f, 19.6107f, 19.6487f, 19.5636f, 19.6356f, 19.4892f)
                curveTo(19.5987f, 19.2801f, 19.5219f, 18.9953f, 19.3965f, 18.5355f)
                lineTo(18.8199f, 16.4211f)
                curveTo(18.7587f, 16.1967f, 18.7867f, 15.9574f, 18.8981f, 15.7533f)
                curveTo(19.5058f, 14.6392f, 19.8515f, 13.3613f, 19.8515f, 12.0001f)
                curveTo(19.8515f, 7.6646f, 16.337f, 4.1501f, 12.0016f, 4.1501f)
                close()
                moveTo(2.3516f, 12.0001f)
                curveTo(2.3516f, 6.6705f, 6.672f, 2.35f, 12.0016f, 2.35f)
                curveTo(17.3311f, 2.35f, 21.6515f, 6.6705f, 21.6515f, 12.0001f)
                curveTo(21.6515f, 13.5384f, 21.2909f, 14.9948f, 20.6491f, 16.2872f)
                lineTo(21.1434f, 18.0998f)
                curveTo(21.2553f, 18.5099f, 21.3551f, 18.8757f, 21.4082f, 19.1763f)
                curveTo(21.4619f, 19.4808f, 21.4986f, 19.8669f, 21.3513f, 20.2526f)
                curveTo(21.1584f, 20.7578f, 20.7593f, 21.1569f, 20.2541f, 21.3498f)
                curveTo(19.8684f, 21.4971f, 19.4823f, 21.4605f, 19.1778f, 21.4067f)
                curveTo(18.8772f, 21.3536f, 18.5114f, 21.2538f, 18.1013f, 21.1419f)
                lineTo(16.2887f, 20.6476f)
                curveTo(14.9963f, 21.2894f, 13.5399f, 21.6501f, 12.0016f, 21.6501f)
                curveTo(6.672f, 21.6501f, 2.3516f, 17.3296f, 2.3516f, 12.0001f)
                close()
            }
        }
        .build()
        return _bubblefill!!
    }

private var _bubblefill: ImageVector? = null
