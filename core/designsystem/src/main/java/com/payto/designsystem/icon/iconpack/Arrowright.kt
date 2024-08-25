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

val IconPack.ArrowRight: ImageVector
    get() {
        if (_arrowright != null) {
            return _arrowright!!
        }
        _arrowright = Builder(name = "Arrowright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.138f, 12.6362f)
                curveTo(21.4894f, 12.2848f, 21.4894f, 11.7149f, 21.138f, 11.3635f)
                lineTo(14.138f, 4.3635f)
                curveTo(13.7865f, 4.012f, 13.2166f, 4.012f, 12.8652f, 4.3635f)
                curveTo(12.5137f, 4.7149f, 12.5137f, 5.2848f, 12.8652f, 5.6363f)
                lineTo(18.3288f, 11.0999f)
                horizontalLineTo(3.5016f)
                curveTo(3.0045f, 11.0999f, 2.6016f, 11.5028f, 2.6016f, 11.9999f)
                curveTo(2.6016f, 12.4969f, 3.0045f, 12.8999f, 3.5016f, 12.8999f)
                horizontalLineTo(18.3288f)
                lineTo(12.8652f, 18.3635f)
                curveTo(12.5137f, 18.7149f, 12.5137f, 19.2848f, 12.8652f, 19.6363f)
                curveTo(13.2166f, 19.9877f, 13.7865f, 19.9877f, 14.138f, 19.6362f)
                lineTo(21.138f, 12.6362f)
                close()
            }
        }
        .build()
        return _arrowright!!
    }

private var _arrowright: ImageVector? = null
