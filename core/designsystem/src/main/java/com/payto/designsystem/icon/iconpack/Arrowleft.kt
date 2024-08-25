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

val IconPack.ArrowLeft: ImageVector
    get() {
        if (_arrowleft != null) {
            return _arrowleft!!
        }
        _arrowleft = Builder(name = "Arrowleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.8652f, 11.3636f)
                curveTo(2.5137f, 11.715f, 2.5137f, 12.2849f, 2.8652f, 12.6364f)
                lineTo(9.8652f, 19.6364f)
                curveTo(10.2166f, 19.9878f, 10.7865f, 19.9878f, 11.138f, 19.6364f)
                curveTo(11.4894f, 19.2849f, 11.4894f, 18.715f, 11.138f, 18.3636f)
                lineTo(5.6743f, 12.9f)
                horizontalLineTo(20.5016f)
                curveTo(20.9986f, 12.9f, 21.4016f, 12.497f, 21.4016f, 12.0f)
                curveTo(21.4016f, 11.5029f, 20.9986f, 11.1f, 20.5016f, 11.1f)
                lineTo(5.6743f, 11.1f)
                lineTo(11.138f, 5.6364f)
                curveTo(11.4894f, 5.2849f, 11.4894f, 4.715f, 11.138f, 4.3636f)
                curveTo(10.7865f, 4.0121f, 10.2166f, 4.0121f, 9.8652f, 4.3636f)
                lineTo(2.8652f, 11.3636f)
                close()
            }
        }
        .build()
        return _arrowleft!!
    }

private var _arrowleft: ImageVector? = null
