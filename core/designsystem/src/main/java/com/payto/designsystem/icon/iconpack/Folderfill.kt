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

public val IconPack.Folderfill: ImageVector
    get() {
        if (_folderfill != null) {
            return _folderfill!!
        }
        _folderfill = Builder(name = "Folderfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.7148f, 4.0999f)
                curveTo(8.9022f, 4.0995f, 9.1238f, 4.099f, 9.342f, 4.1502f)
                curveTo(9.5318f, 4.1947f, 9.7135f, 4.2681f, 9.8809f, 4.3679f)
                curveTo(10.0735f, 4.4826f, 10.2326f, 4.6369f, 10.3671f, 4.7673f)
                lineTo(10.4022f, 4.8014f)
                lineTo(11.544f, 5.9036f)
                curveTo(11.6354f, 5.9918f, 11.6832f, 6.0377f, 11.7201f, 6.0702f)
                curveTo(11.731f, 6.0799f, 11.7381f, 6.0857f, 11.742f, 6.0889f)
                curveTo(11.7475f, 6.0917f, 11.7532f, 6.094f, 11.7591f, 6.0958f)
                curveTo(11.7641f, 6.0963f, 11.7733f, 6.097f, 11.7878f, 6.0976f)
                curveTo(11.8369f, 6.0998f, 11.9032f, 6.1f, 12.0302f, 6.1f)
                lineTo(20.2236f, 6.1f)
                curveTo(20.3439f, 6.1f, 20.4822f, 6.0999f, 20.6032f, 6.1098f)
                curveTo(20.7423f, 6.1212f, 20.9356f, 6.1499f, 21.1371f, 6.2526f)
                curveTo(21.4005f, 6.3868f, 21.6147f, 6.601f, 21.7489f, 6.8644f)
                curveTo(21.8516f, 7.0659f, 21.8804f, 7.2593f, 21.8917f, 7.3983f)
                curveTo(21.9016f, 7.5193f, 21.9016f, 7.6576f, 21.9015f, 7.7779f)
                lineTo(21.9016f, 18.222f)
                curveTo(21.9017f, 18.3423f, 21.9017f, 18.4806f, 21.8918f, 18.6017f)
                curveTo(21.8805f, 18.7407f, 21.8517f, 18.9341f, 21.749f, 19.1356f)
                curveTo(21.6148f, 19.399f, 21.4006f, 19.6132f, 21.1372f, 19.7474f)
                curveTo(20.9357f, 19.8501f, 20.7423f, 19.8788f, 20.6033f, 19.8902f)
                curveTo(20.4823f, 19.9001f, 20.344f, 19.9f, 20.2237f, 19.9f)
                horizontalLineTo(3.7795f)
                curveTo(3.6592f, 19.9f, 3.5209f, 19.9001f, 3.3999f, 19.8902f)
                curveTo(3.2608f, 19.8788f, 3.0675f, 19.8501f, 2.866f, 19.7474f)
                curveTo(2.6026f, 19.6132f, 2.3884f, 19.399f, 2.2542f, 19.1356f)
                curveTo(2.1515f, 18.9341f, 2.1227f, 18.7407f, 2.1114f, 18.6017f)
                curveTo(2.1015f, 18.4807f, 2.1015f, 18.3423f, 2.1016f, 18.2221f)
                lineTo(2.1016f, 5.7779f)
                curveTo(2.1016f, 5.6577f, 2.1015f, 5.5194f, 2.1114f, 5.3983f)
                curveTo(2.1228f, 5.2593f, 2.1515f, 5.0659f, 2.2542f, 4.8644f)
                curveTo(2.3884f, 4.601f, 2.6026f, 4.3868f, 2.866f, 4.2526f)
                curveTo(3.0675f, 4.1499f, 3.2609f, 4.1212f, 3.3999f, 4.1098f)
                curveTo(3.521f, 4.0999f, 3.6593f, 4.1f, 3.7795f, 4.1f)
                lineTo(8.7148f, 4.0999f)
                close()
            }
        }
        .build()
        return _folderfill!!
    }

private var _folderfill: ImageVector? = null
