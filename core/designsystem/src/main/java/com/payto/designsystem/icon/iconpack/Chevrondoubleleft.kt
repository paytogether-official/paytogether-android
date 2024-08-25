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

public val IconPack.Chevrondoubleleft: ImageVector
    get() {
        if (_chevrondoubleleft != null) {
            return _chevrondoubleleft!!
        }
        _chevrondoubleleft = Builder(name = "Chevrondoubleleft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.638f, 4.6389f)
                curveTo(11.9894f, 4.2875f, 11.9894f, 3.7176f, 11.638f, 3.3661f)
                curveTo(11.2865f, 3.0147f, 10.7166f, 3.0147f, 10.3652f, 3.3661f)
                lineTo(2.3652f, 11.3661f)
                curveTo(2.0137f, 11.7176f, 2.0137f, 12.2875f, 2.3652f, 12.6389f)
                lineTo(10.3652f, 20.6389f)
                curveTo(10.7166f, 20.9904f, 11.2865f, 20.9904f, 11.638f, 20.6389f)
                curveTo(11.9894f, 20.2875f, 11.9894f, 19.7176f, 11.638f, 19.3661f)
                lineTo(4.2744f, 12.0025f)
                lineTo(11.638f, 4.6389f)
                close()
                moveTo(21.138f, 4.6393f)
                curveTo(21.4895f, 4.2878f, 21.4895f, 3.718f, 21.138f, 3.3665f)
                curveTo(20.7865f, 3.0151f, 20.2167f, 3.0151f, 19.8652f, 3.3665f)
                lineTo(11.8652f, 11.3665f)
                curveTo(11.5137f, 11.718f, 11.5137f, 12.2879f, 11.8652f, 12.6393f)
                lineTo(19.8652f, 20.6393f)
                curveTo(20.2167f, 20.9908f, 20.7865f, 20.9908f, 21.138f, 20.6393f)
                curveTo(21.4895f, 20.2879f, 21.4895f, 19.718f, 21.138f, 19.3665f)
                lineTo(13.7744f, 12.0029f)
                lineTo(21.138f, 4.6393f)
                close()
            }
        }
        .build()
        return _chevrondoubleleft!!
    }

private var _chevrondoubleleft: ImageVector? = null
