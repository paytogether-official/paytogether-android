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

public val IconPack.Templatefill: ImageVector
    get() {
        if (_templatefill != null) {
            return _templatefill!!
        }
        _templatefill = Builder(name = "Templatefill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0718f, 2.5996f)
                curveTo(4.8175f, 2.5996f, 4.5754f, 2.5996f, 4.3715f, 2.6162f)
                curveTo(4.1491f, 2.6344f, 3.894f, 2.6768f, 3.639f, 2.8067f)
                curveTo(3.2815f, 2.9889f, 2.9908f, 3.2795f, 2.8087f, 3.637f)
                curveTo(2.6787f, 3.892f, 2.6363f, 4.1471f, 2.6182f, 4.3695f)
                curveTo(2.6015f, 4.5735f, 2.6015f, 4.8155f, 2.6016f, 5.0698f)
                verticalLineTo(18.9294f)
                curveTo(2.6015f, 19.1837f, 2.6015f, 19.4257f, 2.6182f, 19.6297f)
                curveTo(2.6363f, 19.8521f, 2.6787f, 20.1072f, 2.8087f, 20.3622f)
                curveTo(2.9908f, 20.7197f, 3.2815f, 21.0104f, 3.639f, 21.1925f)
                curveTo(3.894f, 21.3224f, 4.1491f, 21.3648f, 4.3715f, 21.383f)
                curveTo(4.5754f, 21.3997f, 4.8175f, 21.3996f, 5.0718f, 21.3996f)
                horizontalLineTo(18.9313f)
                curveTo(19.1856f, 21.3996f, 19.4277f, 21.3997f, 19.6317f, 21.383f)
                curveTo(19.8541f, 21.3648f, 20.1092f, 21.3224f, 20.3641f, 21.1925f)
                curveTo(20.7217f, 21.0104f, 21.0123f, 20.7197f, 21.1945f, 20.3622f)
                curveTo(21.3244f, 20.1072f, 21.3668f, 19.8521f, 21.385f, 19.6297f)
                curveTo(21.4016f, 19.4258f, 21.4016f, 19.1837f, 21.4016f, 18.9294f)
                verticalLineTo(5.0698f)
                curveTo(21.4016f, 4.8155f, 21.4016f, 4.5735f, 21.385f, 4.3695f)
                curveTo(21.3668f, 4.1471f, 21.3244f, 3.892f, 21.1945f, 3.637f)
                curveTo(21.0123f, 3.2795f, 20.7217f, 2.9889f, 20.3641f, 2.8067f)
                curveTo(20.1092f, 2.6768f, 19.8541f, 2.6344f, 19.6317f, 2.6162f)
                curveTo(19.4277f, 2.5996f, 19.1856f, 2.5996f, 18.9313f, 2.5996f)
                horizontalLineTo(5.0718f)
                close()
                moveTo(4.4016f, 4.4996f)
                curveTo(4.4016f, 4.4443f, 4.4464f, 4.3996f, 4.5016f, 4.3996f)
                horizontalLineTo(19.5016f)
                curveTo(19.5568f, 4.3996f, 19.6016f, 4.4443f, 19.6016f, 4.4996f)
                verticalLineTo(8.6004f)
                horizontalLineTo(4.4016f)
                verticalLineTo(4.4996f)
                close()
                moveTo(4.4016f, 10.4004f)
                verticalLineTo(19.4996f)
                curveTo(4.4016f, 19.5548f, 4.4464f, 19.5996f, 4.5016f, 19.5996f)
                horizontalLineTo(8.6014f)
                verticalLineTo(10.4004f)
                horizontalLineTo(4.4016f)
                close()
                moveTo(10.4014f, 19.5996f)
                horizontalLineTo(19.5016f)
                curveTo(19.5568f, 19.5996f, 19.6016f, 19.5548f, 19.6016f, 19.4996f)
                verticalLineTo(10.4004f)
                horizontalLineTo(10.4014f)
                verticalLineTo(19.5996f)
                close()
            }
        }
        .build()
        return _templatefill!!
    }

private var _templatefill: ImageVector? = null
