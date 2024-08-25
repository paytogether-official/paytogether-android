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

public val IconPack.Trianglefill: ImageVector
    get() {
        if (_trianglefill != null) {
            return _trianglefill!!
        }
        _trianglefill = Builder(name = "Trianglefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.1793f, 2.8501f)
                curveTo(12.4292f, 2.5166f, 11.5729f, 2.5166f, 10.8228f, 2.8501f)
                curveTo(10.3001f, 3.0825f, 9.9225f, 3.5084f, 9.5942f, 3.9719f)
                curveTo(9.2688f, 4.4313f, 8.9107f, 5.0498f, 8.4751f, 5.8022f)
                lineTo(2.9807f, 15.2926f)
                curveTo(2.5435f, 16.0478f, 2.1842f, 16.6684f, 1.9471f, 17.1809f)
                curveTo(1.7079f, 17.6978f, 1.5261f, 18.2388f, 1.5856f, 18.809f)
                curveTo(1.6709f, 19.6269f, 2.0994f, 20.3702f, 2.7645f, 20.8538f)
                curveTo(3.2282f, 21.1909f, 3.7875f, 21.3047f, 4.3546f, 21.3567f)
                curveTo(4.917f, 21.4083f, 5.6341f, 21.4083f, 6.5067f, 21.4082f)
                horizontalLineTo(17.4954f)
                curveTo(18.368f, 21.4083f, 19.0851f, 21.4083f, 19.6475f, 21.3567f)
                curveTo(20.2146f, 21.3047f, 20.7739f, 21.1909f, 21.2376f, 20.8538f)
                curveTo(21.9027f, 20.3702f, 22.3312f, 19.6269f, 22.4165f, 18.809f)
                curveTo(22.476f, 18.2388f, 22.2942f, 17.6977f, 22.055f, 17.1809f)
                curveTo(21.8179f, 16.6684f, 21.4586f, 16.0477f, 21.0214f, 15.2926f)
                lineTo(15.527f, 5.8022f)
                curveTo(15.0914f, 5.0498f, 14.7333f, 4.4313f, 14.4079f, 3.9719f)
                curveTo(14.0796f, 3.5084f, 13.702f, 3.0825f, 13.1793f, 2.8501f)
                close()
            }
        }
        .build()
        return _trianglefill!!
    }

private var _trianglefill: ImageVector? = null
