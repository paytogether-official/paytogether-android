package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Likefill: ImageVector
    get() {
        if (_likefill != null) {
            return _likefill!!
        }
        _likefill = Builder(name = "Likefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4289f, 4.578f)
                curveTo(14.4289f, 3.2572f, 13.358f, 2.19f, 12.0395f, 2.19f)
                curveTo(11.0607f, 2.19f, 10.1809f, 2.787f, 9.8192f, 3.6965f)
                lineTo(7.0289f, 10.7139f)
                verticalLineTo(21.8052f)
                lineTo(18.1339f, 21.8052f)
                curveTo(18.3503f, 21.8052f, 18.5595f, 21.8053f, 18.7377f, 21.7918f)
                curveTo(18.9346f, 21.777f, 19.1574f, 21.7425f, 19.3864f, 21.6404f)
                curveTo(19.7121f, 21.4951f, 19.9904f, 21.261f, 20.1893f, 20.9649f)
                curveTo(20.3292f, 20.7568f, 20.4013f, 20.5431f, 20.4496f, 20.3518f)
                curveTo(20.4933f, 20.1784f, 20.5291f, 19.9723f, 20.5661f, 19.7591f)
                lineTo(21.617f, 13.7101f)
                curveTo(21.7232f, 13.0986f, 21.8128f, 12.583f, 21.8492f, 12.1589f)
                curveTo(21.8869f, 11.7177f, 21.8779f, 11.2796f, 21.7206f, 10.85f)
                curveTo(21.4867f, 10.2106f, 21.0352f, 9.674f, 20.4454f, 9.3341f)
                curveTo(20.049f, 9.1056f, 19.6189f, 9.0217f, 19.1778f, 8.9834f)
                curveTo(18.7537f, 8.9466f, 18.2304f, 8.9466f, 17.6097f, 8.9466f)
                lineTo(14.4289f, 8.9466f)
                verticalLineTo(4.578f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2289f, 21.8052f)
                verticalLineTo(10.8018f)
                lineTo(3.8068f, 10.8018f)
                curveTo(3.6866f, 10.8018f, 3.5483f, 10.8017f, 3.4272f, 10.8116f)
                curveTo(3.2882f, 10.823f, 3.0948f, 10.8517f, 2.8933f, 10.9544f)
                curveTo(2.6299f, 11.0886f, 2.4157f, 11.3028f, 2.2815f, 11.5662f)
                curveTo(2.1788f, 11.7677f, 2.1501f, 11.9611f, 2.1387f, 12.1001f)
                curveTo(2.1288f, 12.2212f, 2.1289f, 12.3595f, 2.1289f, 12.4797f)
                lineTo(2.1289f, 20.1273f)
                curveTo(2.1289f, 20.2476f, 2.1288f, 20.3859f, 2.1387f, 20.5069f)
                curveTo(2.1501f, 20.6459f, 2.1788f, 20.8393f, 2.2815f, 21.0408f)
                curveTo(2.4157f, 21.3042f, 2.6299f, 21.5184f, 2.8933f, 21.6526f)
                curveTo(3.0948f, 21.7553f, 3.2882f, 21.7841f, 3.4272f, 21.7954f)
                curveTo(3.5482f, 21.8053f, 3.6865f, 21.8053f, 3.8068f, 21.8052f)
                horizontalLineTo(5.2289f)
                close()
            }
        }
        .build()
        return _likefill!!
    }

private var _likefill: ImageVector? = null
