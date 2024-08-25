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

val IconPack.ArrowDown: ImageVector
    get() {
        if (_arrowdown != null) {
            return _arrowdown!!
        }
        _arrowdown = Builder(name = "Arrowdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.3652f, 21.1363f)
                curveTo(11.7166f, 21.4878f, 12.2865f, 21.4878f, 12.638f, 21.1363f)
                lineTo(19.638f, 14.1363f)
                curveTo(19.9894f, 13.7848f, 19.9894f, 13.215f, 19.638f, 12.8635f)
                curveTo(19.2865f, 12.512f, 18.7166f, 12.5121f, 18.3652f, 12.8635f)
                lineTo(12.9016f, 18.3271f)
                lineTo(12.9016f, 3.4999f)
                curveTo(12.9016f, 3.0029f, 12.4986f, 2.5999f, 12.0016f, 2.5999f)
                curveTo(11.5045f, 2.5999f, 11.1016f, 3.0029f, 11.1016f, 3.4999f)
                verticalLineTo(18.3271f)
                lineTo(5.638f, 12.8635f)
                curveTo(5.2865f, 12.5121f, 4.7166f, 12.512f, 4.3652f, 12.8635f)
                curveTo(4.0137f, 13.215f, 4.0137f, 13.7848f, 4.3652f, 14.1363f)
                lineTo(11.3652f, 21.1363f)
                close()
            }
        }
        .build()
        return _arrowdown!!
    }

private var _arrowdown: ImageVector? = null
