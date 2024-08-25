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

public val IconPack.Change: ImageVector
    get() {
        if (_change != null) {
            return _change!!
        }
        _change = Builder(name = "Change", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.1305f, 4.3064f)
                curveTo(14.7474f, 3.9897f, 14.1801f, 4.0436f, 13.8635f, 4.4268f)
                curveTo(13.5468f, 4.8099f, 13.6007f, 5.3772f, 13.9838f, 5.6938f)
                lineTo(17.5f, 8.6001f)
                horizontalLineTo(4.0016f)
                curveTo(3.5045f, 8.6001f, 3.1016f, 9.0031f, 3.1016f, 9.5001f)
                curveTo(3.1016f, 9.9972f, 3.5045f, 10.4001f, 4.0016f, 10.4001f)
                horizontalLineTo(20.0016f)
                curveTo(20.3812f, 10.4001f, 20.72f, 10.162f, 20.8485f, 9.8048f)
                curveTo(20.977f, 9.4476f, 20.8676f, 9.0482f, 20.575f, 8.8064f)
                lineTo(15.1305f, 4.3064f)
                close()
                moveTo(8.8727f, 19.6938f)
                curveTo(9.2558f, 20.0105f, 9.8231f, 19.9566f, 10.1398f, 19.5735f)
                curveTo(10.4564f, 19.1904f, 10.4026f, 18.6231f, 10.0194f, 18.3064f)
                lineTo(6.5032f, 15.4001f)
                horizontalLineTo(20.0016f)
                curveTo(20.4987f, 15.4001f, 20.9016f, 14.9972f, 20.9016f, 14.5001f)
                curveTo(20.9016f, 14.0031f, 20.4987f, 13.6001f, 20.0016f, 13.6001f)
                horizontalLineTo(4.0016f)
                curveTo(3.622f, 13.6001f, 3.2833f, 13.8383f, 3.1548f, 14.1954f)
                curveTo(3.0262f, 14.5526f, 3.1356f, 14.952f, 3.4282f, 15.1938f)
                lineTo(8.8727f, 19.6938f)
                close()
            }
        }
        .build()
        return _change!!
    }

private var _change: ImageVector? = null
