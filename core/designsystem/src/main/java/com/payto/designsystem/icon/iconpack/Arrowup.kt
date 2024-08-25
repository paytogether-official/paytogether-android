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

public val IconPack.Arrowup: ImageVector
    get() {
        if (_arrowup != null) {
            return _arrowup!!
        }
        _arrowup = Builder(name = "Arrowup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.638f, 2.8635f)
                curveTo(12.2865f, 2.512f, 11.7166f, 2.512f, 11.3652f, 2.8635f)
                lineTo(4.3652f, 9.8635f)
                curveTo(4.0137f, 10.215f, 4.0137f, 10.7848f, 4.3652f, 11.1363f)
                curveTo(4.7166f, 11.4878f, 5.2865f, 11.4878f, 5.638f, 11.1363f)
                lineTo(11.1016f, 5.6727f)
                verticalLineTo(20.4999f)
                curveTo(11.1016f, 20.997f, 11.5045f, 21.3999f, 12.0016f, 21.3999f)
                curveTo(12.4986f, 21.3999f, 12.9016f, 20.997f, 12.9016f, 20.4999f)
                verticalLineTo(5.6727f)
                lineTo(18.3652f, 11.1363f)
                curveTo(18.7166f, 11.4878f, 19.2865f, 11.4878f, 19.638f, 11.1363f)
                curveTo(19.9894f, 10.7848f, 19.9894f, 10.215f, 19.638f, 9.8635f)
                lineTo(12.638f, 2.8635f)
                close()
            }
        }
        .build()
        return _arrowup!!
    }

private var _arrowup: ImageVector? = null
