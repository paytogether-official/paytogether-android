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

public val IconPack.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5014f, 2.6f)
                horizontalLineTo(5.6014f)
                verticalLineTo(3.5f)
                verticalLineTo(6.1f)
                horizontalLineTo(2.0016f)
                horizontalLineTo(1.1016f)
                verticalLineTo(7.0f)
                curveTo(1.1016f, 12.6097f, 5.5431f, 17.1821f, 11.1014f, 17.3924f)
                verticalLineTo(19.6f)
                horizontalLineTo(6.5014f)
                curveTo(6.0043f, 19.6f, 5.6014f, 20.0029f, 5.6014f, 20.5f)
                curveTo(5.6014f, 20.997f, 6.0043f, 21.4f, 6.5014f, 21.4f)
                horizontalLineTo(12.0014f)
                horizontalLineTo(17.5014f)
                curveTo(17.9984f, 21.4f, 18.4014f, 20.997f, 18.4014f, 20.5f)
                curveTo(18.4014f, 20.0029f, 17.9984f, 19.6f, 17.5014f, 19.6f)
                horizontalLineTo(12.9014f)
                verticalLineTo(17.3924f)
                curveTo(18.4597f, 17.1822f, 22.9013f, 12.6098f, 22.9013f, 7.0f)
                verticalLineTo(6.1f)
                horizontalLineTo(22.0013f)
                horizontalLineTo(18.4014f)
                verticalLineTo(3.5f)
                verticalLineTo(2.6f)
                horizontalLineTo(17.5014f)
                horizontalLineTo(6.5014f)
                close()
                moveTo(18.4014f, 7.9f)
                verticalLineTo(11.0f)
                curveTo(18.4014f, 12.0085f, 18.1681f, 12.9625f, 17.7526f, 13.8111f)
                curveTo(19.5661f, 12.4108f, 20.8049f, 10.3023f, 21.0547f, 7.9f)
                horizontalLineTo(18.4014f)
                close()
                moveTo(6.2502f, 13.811f)
                curveTo(5.8347f, 12.9625f, 5.6014f, 12.0085f, 5.6014f, 11.0f)
                verticalLineTo(7.9f)
                horizontalLineTo(2.9481f)
                curveTo(3.1979f, 10.3023f, 4.4367f, 12.4107f, 6.2502f, 13.811f)
                close()
                moveTo(7.4014f, 11.0f)
                verticalLineTo(4.4f)
                horizontalLineTo(16.6014f)
                verticalLineTo(11.0f)
                curveTo(16.6014f, 13.5405f, 14.5419f, 15.6f, 12.0014f, 15.6f)
                curveTo(9.4609f, 15.6f, 7.4014f, 13.5405f, 7.4014f, 11.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
