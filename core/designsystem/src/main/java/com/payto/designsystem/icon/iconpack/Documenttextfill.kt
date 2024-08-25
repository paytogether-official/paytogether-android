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

public val IconPack.Documenttextfill: ImageVector
    get() {
        if (_documenttextfill != null) {
            return _documenttextfill!!
        }
        _documenttextfill = Builder(name = "Documenttextfill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0718f, 2.0996f)
                curveTo(5.8175f, 2.0996f, 5.5754f, 2.0996f, 5.3715f, 2.1162f)
                curveTo(5.1491f, 2.1344f, 4.894f, 2.1768f, 4.639f, 2.3067f)
                curveTo(4.2815f, 2.4889f, 3.9908f, 2.7795f, 3.8087f, 3.137f)
                curveTo(3.6787f, 3.392f, 3.6363f, 3.6471f, 3.6182f, 3.8695f)
                curveTo(3.6015f, 4.0735f, 3.6015f, 4.3155f, 3.6016f, 4.5698f)
                verticalLineTo(19.4294f)
                curveTo(3.6015f, 19.6837f, 3.6015f, 19.9257f, 3.6182f, 20.1297f)
                curveTo(3.6363f, 20.3521f, 3.6787f, 20.6072f, 3.8087f, 20.8622f)
                curveTo(3.9908f, 21.2197f, 4.2815f, 21.5104f, 4.639f, 21.6925f)
                curveTo(4.894f, 21.8224f, 5.1491f, 21.8648f, 5.3715f, 21.883f)
                curveTo(5.5754f, 21.8997f, 5.8175f, 21.8996f, 6.0718f, 21.8996f)
                horizontalLineTo(17.9313f)
                curveTo(18.1856f, 21.8996f, 18.4277f, 21.8997f, 18.6316f, 21.883f)
                curveTo(18.8541f, 21.8648f, 19.1092f, 21.8224f, 19.3641f, 21.6925f)
                curveTo(19.7216f, 21.5104f, 20.0123f, 21.2197f, 20.1945f, 20.8622f)
                curveTo(20.3244f, 20.6072f, 20.3668f, 20.3521f, 20.3849f, 20.1297f)
                curveTo(20.4016f, 19.9257f, 20.4016f, 19.6837f, 20.4016f, 19.4294f)
                verticalLineTo(8.8996f)
                horizontalLineTo(13.7016f)
                verticalLineTo(2.0996f)
                lineTo(6.0718f, 2.0996f)
                close()
                moveTo(12.5015f, 15.3f)
                horizontalLineTo(7.5015f)
                verticalLineTo(13.5f)
                horizontalLineTo(12.5015f)
                verticalLineTo(15.3f)
                close()
                moveTo(7.5015f, 18.3f)
                horizontalLineTo(12.5015f)
                verticalLineTo(16.5f)
                horizontalLineTo(7.5015f)
                verticalLineTo(18.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7761f, 2.8454f)
                lineTo(19.5662f, 6.825f)
                horizontalLineTo(15.7761f)
                verticalLineTo(2.8454f)
                close()
            }
        }
        .build()
        return _documenttextfill!!
    }

private var _documenttextfill: ImageVector? = null
