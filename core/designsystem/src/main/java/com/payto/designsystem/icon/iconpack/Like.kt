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

public val IconPack.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0395f, 3.9899f)
                curveTo(11.7981f, 3.9899f, 11.581f, 4.1372f, 11.4918f, 4.3616f)
                lineTo(8.5046f, 11.8741f)
                verticalLineTo(20.0052f)
                horizontalLineTo(18.1075f)
                curveTo(18.3602f, 20.0052f, 18.5002f, 20.0046f, 18.6025f, 19.9969f)
                curveTo(18.6341f, 19.9945f, 18.654f, 19.9918f, 18.6651f, 19.9901f)
                curveTo(18.6732f, 19.985f, 18.6805f, 19.9789f, 18.6869f, 19.9717f)
                curveTo(18.6905f, 19.9611f, 18.6965f, 19.942f, 18.7043f, 19.9112f)
                curveTo(18.7294f, 19.8117f, 18.7539f, 19.674f, 18.7972f, 19.425f)
                lineTo(19.8369f, 13.4402f)
                curveTo(19.9516f, 12.7802f, 20.0268f, 12.3421f, 20.0557f, 12.0052f)
                curveTo(20.0839f, 11.6766f, 20.0569f, 11.5414f, 20.0303f, 11.4685f)
                curveTo(19.9415f, 11.226f, 19.7703f, 11.0225f, 19.5466f, 10.8935f)
                curveTo(19.4793f, 10.8548f, 19.3507f, 10.8051f, 19.0221f, 10.7766f)
                curveTo(18.6852f, 10.7474f, 18.2407f, 10.7466f, 17.5708f, 10.7466f)
                horizontalLineTo(14.3289f)
                curveTo(14.3216f, 10.7466f, 14.3142f, 10.7466f, 14.3068f, 10.7466f)
                curveTo(14.1866f, 10.7466f, 14.0483f, 10.7467f, 13.9272f, 10.7368f)
                curveTo(13.7882f, 10.7254f, 13.5948f, 10.6966f, 13.3933f, 10.594f)
                curveTo(13.1299f, 10.4598f, 12.9157f, 10.2456f, 12.7815f, 9.9822f)
                curveTo(12.679f, 9.7809f, 12.6501f, 9.5879f, 12.6387f, 9.4487f)
                curveTo(12.6288f, 9.3278f, 12.6289f, 9.1897f, 12.6289f, 9.0699f)
                curveTo(12.6289f, 9.0625f, 12.6289f, 9.0551f, 12.6289f, 9.0478f)
                verticalLineTo(4.5779f)
                curveTo(12.6289f, 4.2535f, 12.3662f, 3.9899f, 12.0395f, 3.9899f)
                close()
                moveTo(12.0395f, 2.1899f)
                curveTo(13.358f, 2.1899f, 14.4289f, 3.2571f, 14.4289f, 4.5779f)
                verticalLineTo(8.9466f)
                lineTo(17.6097f, 8.9466f)
                curveTo(18.2304f, 8.9466f, 18.7537f, 8.9465f, 19.1777f, 8.9833f)
                curveTo(19.6189f, 9.0216f, 20.049f, 9.1055f, 20.4454f, 9.334f)
                curveTo(21.0352f, 9.674f, 21.4867f, 10.2106f, 21.7206f, 10.8499f)
                curveTo(21.8779f, 11.2795f, 21.8869f, 11.7177f, 21.8491f, 12.1589f)
                curveTo(21.8128f, 12.5829f, 21.7232f, 13.0985f, 21.617f, 13.71f)
                lineTo(20.5661f, 19.7591f)
                curveTo(20.5291f, 19.9723f, 20.4933f, 20.1783f, 20.4496f, 20.3517f)
                curveTo(20.4012f, 20.5431f, 20.3292f, 20.7567f, 20.1893f, 20.9648f)
                curveTo(19.9904f, 21.2609f, 19.7121f, 21.495f, 19.3864f, 21.6403f)
                curveTo(19.1574f, 21.7425f, 18.9346f, 21.7769f, 18.7377f, 21.7918f)
                curveTo(18.5594f, 21.8052f, 18.3503f, 21.8052f, 18.1339f, 21.8052f)
                lineTo(3.8068f, 21.8052f)
                curveTo(3.6866f, 21.8052f, 3.5483f, 21.8053f, 3.4272f, 21.7954f)
                curveTo(3.2882f, 21.784f, 3.0948f, 21.7552f, 2.8933f, 21.6526f)
                curveTo(2.6299f, 21.5183f, 2.4157f, 21.3042f, 2.2815f, 21.0408f)
                curveTo(2.1788f, 20.8393f, 2.1501f, 20.6459f, 2.1387f, 20.5069f)
                curveTo(2.1288f, 20.3858f, 2.1289f, 20.2475f, 2.1289f, 20.1273f)
                lineTo(2.1289f, 12.5018f)
                curveTo(2.1289f, 12.4945f, 2.1289f, 12.4871f, 2.1289f, 12.4797f)
                curveTo(2.1289f, 12.3594f, 2.1288f, 12.2211f, 2.1387f, 12.1001f)
                curveTo(2.1501f, 11.961f, 2.1788f, 11.7677f, 2.2815f, 11.5662f)
                curveTo(2.4157f, 11.3028f, 2.6299f, 11.0886f, 2.8933f, 10.9544f)
                curveTo(3.0948f, 10.8517f, 3.2882f, 10.8229f, 3.4272f, 10.8116f)
                curveTo(3.5483f, 10.8017f, 3.6866f, 10.8017f, 3.8068f, 10.8018f)
                curveTo(3.8142f, 10.8018f, 3.8216f, 10.8018f, 3.8289f, 10.8018f)
                horizontalLineTo(6.9939f)
                lineTo(9.8192f, 3.6965f)
                curveTo(10.1809f, 2.7869f, 11.0607f, 2.1899f, 12.0395f, 2.1899f)
                close()
                moveTo(6.7046f, 12.6018f)
                horizontalLineTo(3.9289f)
                lineTo(3.9289f, 20.0052f)
                horizontalLineTo(6.7046f)
                verticalLineTo(12.6018f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null
