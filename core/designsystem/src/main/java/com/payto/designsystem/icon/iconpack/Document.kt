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

public val IconPack.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3715f, 2.1167f)
                curveTo(5.5754f, 2.1f, 5.8175f, 2.1001f, 6.0718f, 2.1001f)
                lineTo(13.7016f, 2.1001f)
                verticalLineTo(8.9001f)
                horizontalLineTo(20.4015f)
                lineTo(20.4015f, 19.4299f)
                curveTo(20.4016f, 19.6842f, 20.4016f, 19.9262f, 20.3849f, 20.1302f)
                curveTo(20.3668f, 20.3526f, 20.3244f, 20.6077f, 20.1945f, 20.8627f)
                curveTo(20.0123f, 21.2202f, 19.7216f, 21.5108f, 19.3641f, 21.693f)
                curveTo(19.1092f, 21.8229f, 18.854f, 21.8653f, 18.6316f, 21.8835f)
                curveTo(18.4277f, 21.9001f, 18.1856f, 21.9001f, 17.9313f, 21.9001f)
                horizontalLineTo(6.0718f)
                curveTo(5.8175f, 21.9001f, 5.5754f, 21.9001f, 5.3715f, 21.8835f)
                curveTo(5.1491f, 21.8653f, 4.894f, 21.8229f, 4.639f, 21.693f)
                curveTo(4.2815f, 21.5108f, 3.9908f, 21.2202f, 3.8087f, 20.8627f)
                curveTo(3.6787f, 20.6077f, 3.6363f, 20.3526f, 3.6182f, 20.1302f)
                curveTo(3.6015f, 19.9262f, 3.6015f, 19.6842f, 3.6016f, 19.4299f)
                verticalLineTo(4.5703f)
                curveTo(3.6015f, 4.316f, 3.6015f, 4.074f, 3.6182f, 3.87f)
                curveTo(3.6363f, 3.6476f, 3.6787f, 3.3925f, 3.8087f, 3.1375f)
                curveTo(3.9908f, 2.78f, 4.2815f, 2.4894f, 4.639f, 2.3072f)
                curveTo(4.894f, 2.1773f, 5.1491f, 2.1349f, 5.3715f, 2.1167f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5662f, 6.8255f)
                lineTo(15.7761f, 2.8459f)
                verticalLineTo(6.8255f)
                horizontalLineTo(19.5662f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
