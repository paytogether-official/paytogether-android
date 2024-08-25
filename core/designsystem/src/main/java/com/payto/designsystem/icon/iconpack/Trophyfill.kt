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

public val IconPack.Trophyfill: ImageVector
    get() {
        if (_trophyfill != null) {
            return _trophyfill!!
        }
        _trophyfill = Builder(name = "Trophyfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6013f, 2.6004f)
                horizontalLineTo(6.5013f)
                horizontalLineTo(17.5013f)
                horizontalLineTo(18.4013f)
                verticalLineTo(3.5004f)
                verticalLineTo(6.1004f)
                horizontalLineTo(22.0013f)
                horizontalLineTo(22.9013f)
                verticalLineTo(7.0004f)
                curveTo(22.9013f, 12.6102f, 18.4598f, 17.1826f, 12.9014f, 17.3928f)
                verticalLineTo(19.6004f)
                horizontalLineTo(17.5014f)
                curveTo(17.9985f, 19.6004f, 18.4014f, 20.0033f, 18.4014f, 20.5004f)
                curveTo(18.4014f, 20.9975f, 17.9985f, 21.4004f, 17.5014f, 21.4004f)
                horizontalLineTo(12.0014f)
                horizontalLineTo(6.5014f)
                curveTo(6.0044f, 21.4004f, 5.6014f, 20.9975f, 5.6014f, 20.5004f)
                curveTo(5.6014f, 20.0033f, 6.0044f, 19.6004f, 6.5014f, 19.6004f)
                horizontalLineTo(11.1014f)
                verticalLineTo(17.3928f)
                curveTo(5.5431f, 17.1826f, 1.1016f, 12.6102f, 1.1016f, 7.0004f)
                verticalLineTo(6.1004f)
                horizontalLineTo(2.0016f)
                horizontalLineTo(5.6013f)
                verticalLineTo(3.5004f)
                verticalLineTo(2.6004f)
                close()
                moveTo(18.4013f, 11.0004f)
                verticalLineTo(7.9004f)
                horizontalLineTo(21.0548f)
                curveTo(20.8049f, 10.3028f, 19.5661f, 12.4113f, 17.7525f, 13.8116f)
                curveTo(18.168f, 12.963f, 18.4013f, 12.009f, 18.4013f, 11.0004f)
                close()
                moveTo(5.6013f, 11.0004f)
                curveTo(5.6013f, 12.0089f, 5.8346f, 12.9628f, 6.2501f, 13.8113f)
                curveTo(4.4366f, 12.4111f, 3.1979f, 10.3027f, 2.9481f, 7.9004f)
                horizontalLineTo(5.6013f)
                verticalLineTo(11.0004f)
                close()
            }
        }
        .build()
        return _trophyfill!!
    }

private var _trophyfill: ImageVector? = null
