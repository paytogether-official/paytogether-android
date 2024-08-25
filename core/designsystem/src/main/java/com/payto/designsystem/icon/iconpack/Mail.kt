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

public val IconPack.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.3218f, 3.8549f)
                curveTo(4.0675f, 3.8548f, 3.8254f, 3.8548f, 3.6215f, 3.8715f)
                curveTo(3.3991f, 3.8897f, 3.144f, 3.932f, 2.889f, 4.062f)
                curveTo(2.5315f, 4.2441f, 2.2408f, 4.5348f, 2.0587f, 4.8923f)
                curveTo(1.9287f, 5.1473f, 1.8864f, 5.4024f, 1.8682f, 5.6248f)
                curveTo(1.8515f, 5.8287f, 1.8515f, 6.0708f, 1.8516f, 6.3251f)
                verticalLineTo(17.6846f)
                curveTo(1.8515f, 17.9389f, 1.8515f, 18.181f, 1.8682f, 18.3849f)
                curveTo(1.8864f, 18.6074f, 1.9287f, 18.8625f, 2.0587f, 19.1174f)
                curveTo(2.2408f, 19.475f, 2.5315f, 19.7656f, 2.889f, 19.9478f)
                curveTo(3.144f, 20.0777f, 3.3991f, 20.1201f, 3.6215f, 20.1382f)
                curveTo(3.8254f, 20.1549f, 4.0675f, 20.1549f, 4.3218f, 20.1549f)
                horizontalLineTo(19.6813f)
                curveTo(19.9356f, 20.1549f, 20.1777f, 20.1549f, 20.3817f, 20.1382f)
                curveTo(20.6041f, 20.1201f, 20.8592f, 20.0777f, 21.1141f, 19.9478f)
                curveTo(21.4717f, 19.7656f, 21.7623f, 19.475f, 21.9445f, 19.1174f)
                curveTo(22.0744f, 18.8625f, 22.1168f, 18.6074f, 22.135f, 18.3849f)
                curveTo(22.1516f, 18.181f, 22.1516f, 17.939f, 22.1516f, 17.6847f)
                verticalLineTo(6.3251f)
                curveTo(22.1516f, 6.0708f, 22.1516f, 5.8287f, 22.135f, 5.6248f)
                curveTo(22.1168f, 5.4024f, 22.0744f, 5.1473f, 21.9445f, 4.8923f)
                curveTo(21.7623f, 4.5348f, 21.4717f, 4.2441f, 21.1141f, 4.062f)
                curveTo(20.8592f, 3.932f, 20.6041f, 3.8897f, 20.3817f, 3.8715f)
                curveTo(20.1777f, 3.8548f, 19.9356f, 3.8548f, 19.6813f, 3.8549f)
                horizontalLineTo(4.3218f)
                close()
                moveTo(3.6512f, 5.7466f)
                curveTo(3.6512f, 5.6913f, 3.696f, 5.6466f, 3.7512f, 5.6466f)
                horizontalLineTo(20.2512f)
                curveTo(20.3064f, 5.6466f, 20.3512f, 5.6913f, 20.3512f, 5.7466f)
                verticalLineTo(18.2465f)
                curveTo(20.3512f, 18.3018f, 20.3064f, 18.3465f, 20.2512f, 18.3465f)
                horizontalLineTo(3.7512f)
                curveTo(3.696f, 18.3465f, 3.6512f, 18.3018f, 3.6512f, 18.2465f)
                verticalLineTo(5.7466f)
                close()
                moveTo(6.8055f, 7.5414f)
                curveTo(6.4139f, 7.2352f, 5.8483f, 7.3044f, 5.5421f, 7.696f)
                curveTo(5.2359f, 8.0876f, 5.3052f, 8.6532f, 5.6967f, 8.9594f)
                lineTo(12.0067f, 13.8932f)
                lineTo(18.3061f, 8.9589f)
                curveTo(18.6974f, 8.6524f, 18.7661f, 8.0867f, 18.4596f, 7.6954f)
                curveTo(18.1531f, 7.3041f, 17.5874f, 7.2353f, 17.1961f, 7.5419f)
                lineTo(12.0057f, 11.6075f)
                lineTo(6.8055f, 7.5414f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
