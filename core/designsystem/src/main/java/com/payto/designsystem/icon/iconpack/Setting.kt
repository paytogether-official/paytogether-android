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

public val IconPack.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.6078f, 2.0659f)
                curveTo(10.3772f, 1.8918f, 11.1781f, 1.8f, 11.9999f, 1.8f)
                curveTo(12.8218f, 1.8f, 13.6228f, 1.8918f, 14.3922f, 2.066f)
                curveTo(15.2887f, 2.2689f, 15.7252f, 3.0415f, 15.8959f, 3.5862f)
                curveTo(16.0283f, 4.0086f, 16.3215f, 4.3915f, 16.7622f, 4.6379f)
                curveTo(17.1751f, 4.8687f, 17.6403f, 4.9362f, 18.0795f, 4.8586f)
                curveTo(18.6449f, 4.7586f, 19.5006f, 4.8064f, 20.0797f, 5.4829f)
                curveTo(20.8158f, 6.3428f, 21.4103f, 7.3236f, 21.8262f, 8.3916f)
                curveTo(22.2104f, 9.3779f, 21.6423f, 10.2547f, 21.1699f, 10.694f)
                curveTo(20.8083f, 11.0303f, 20.5921f, 11.4932f, 20.5921f, 12.0f)
                curveTo(20.5921f, 12.5068f, 20.8083f, 12.9696f, 21.1699f, 13.3059f)
                curveTo(21.6423f, 13.7453f, 22.2104f, 14.622f, 21.8263f, 15.6083f)
                curveTo(21.4104f, 16.676f, 20.8162f, 17.6566f, 20.0804f, 18.5163f)
                curveTo(19.5012f, 19.193f, 18.6452f, 19.2408f, 18.0798f, 19.1407f)
                curveTo(17.6405f, 19.063f, 17.1751f, 19.1305f, 16.7622f, 19.3613f)
                curveTo(16.3213f, 19.6078f, 16.0281f, 19.9908f, 15.8958f, 20.4133f)
                curveTo(15.7251f, 20.9582f, 15.2887f, 21.7312f, 14.3918f, 21.9341f)
                curveTo(13.6225f, 22.1082f, 12.8216f, 22.2f, 11.9999f, 22.2f)
                curveTo(11.1781f, 22.2f, 10.3772f, 22.1082f, 9.6078f, 21.9341f)
                curveTo(8.7112f, 21.7312f, 8.2748f, 20.9585f, 8.104f, 20.4137f)
                curveTo(7.9716f, 19.9914f, 7.6785f, 19.6085f, 7.2377f, 19.3621f)
                curveTo(6.8249f, 19.1312f, 6.3596f, 19.0637f, 5.9203f, 19.1414f)
                curveTo(5.355f, 19.2414f, 4.4992f, 19.1936f, 3.9201f, 18.5171f)
                curveTo(3.184f, 17.6572f, 2.5896f, 16.6764f, 2.1736f, 15.6085f)
                curveTo(1.7894f, 14.6221f, 2.3575f, 13.7453f, 2.83f, 13.306f)
                curveTo(3.1916f, 12.9697f, 3.4079f, 12.5068f, 3.4079f, 12.0f)
                curveTo(3.4079f, 11.4931f, 3.1916f, 11.0303f, 2.83f, 10.694f)
                curveTo(2.3576f, 10.2546f, 1.7894f, 9.3779f, 2.1736f, 8.3915f)
                curveTo(2.5896f, 7.3235f, 3.184f, 6.3428f, 3.92f, 5.483f)
                curveTo(4.4991f, 4.8065f, 5.3549f, 4.7587f, 5.9203f, 4.8586f)
                curveTo(6.3595f, 4.9363f, 6.8248f, 4.8688f, 7.2377f, 4.638f)
                curveTo(7.6784f, 4.3916f, 7.9716f, 4.0086f, 8.104f, 3.5863f)
                curveTo(8.2747f, 3.0415f, 8.7112f, 2.2688f, 9.6078f, 2.0659f)
                close()
                moveTo(10.0439f, 3.9153f)
                curveTo(10.0404f, 3.9186f, 10.0354f, 3.9237f, 10.0289f, 3.9313f)
                curveTo(9.9957f, 3.9702f, 9.9514f, 4.0448f, 9.917f, 4.1545f)
                curveTo(9.6417f, 5.0329f, 9.0358f, 5.8095f, 8.1649f, 6.2964f)
                curveTo(7.3528f, 6.7504f, 6.4405f, 6.8801f, 5.5894f, 6.7296f)
                curveTo(5.488f, 6.7117f, 5.4111f, 6.717f, 5.3682f, 6.7273f)
                curveTo(5.3611f, 6.729f, 5.3558f, 6.7306f, 5.3521f, 6.7318f)
                curveTo(4.7616f, 7.4245f, 4.2863f, 8.2095f, 3.9524f, 9.0597f)
                curveTo(3.9537f, 9.0641f, 3.9556f, 9.0701f, 3.9584f, 9.0776f)
                curveTo(3.9789f, 9.132f, 4.0316f, 9.2168f, 4.1239f, 9.3027f)
                curveTo(4.8483f, 9.9763f, 5.3079f, 10.9337f, 5.3079f, 12.0f)
                curveTo(5.3079f, 13.0662f, 4.8483f, 14.0236f, 4.1239f, 14.6973f)
                curveTo(4.0316f, 14.7832f, 3.9789f, 14.868f, 3.9584f, 14.9223f)
                curveTo(3.9556f, 14.9299f, 3.9536f, 14.9358f, 3.9524f, 14.9402f)
                curveTo(4.2863f, 15.7905f, 4.7617f, 16.5756f, 5.3521f, 17.2682f)
                curveTo(5.3559f, 17.2695f, 5.3611f, 17.2711f, 5.3682f, 17.2728f)
                curveTo(5.4112f, 17.2831f, 5.4881f, 17.2884f, 5.5895f, 17.2704f)
                curveTo(6.4406f, 17.1199f, 7.3528f, 17.2496f, 8.1649f, 17.7036f)
                curveTo(9.0358f, 18.1905f, 9.6417f, 18.9671f, 9.9171f, 19.8455f)
                curveTo(9.9514f, 19.9552f, 9.9957f, 20.0297f, 10.0289f, 20.0686f)
                curveTo(10.0354f, 20.0762f, 10.0404f, 20.0814f, 10.044f, 20.0847f)
                curveTo(10.6714f, 20.2254f, 11.326f, 20.3f, 11.9999f, 20.3f)
                curveTo(12.6738f, 20.3f, 13.3283f, 20.2254f, 13.9557f, 20.0847f)
                curveTo(13.9592f, 20.0814f, 13.9643f, 20.0763f, 13.9708f, 20.0686f)
                curveTo(14.004f, 20.0297f, 14.0483f, 19.9551f, 14.0826f, 19.8454f)
                curveTo(14.3578f, 18.9667f, 14.9638f, 18.1899f, 15.835f, 17.7029f)
                curveTo(16.6472f, 17.2488f, 17.5596f, 17.1191f, 18.4108f, 17.2698f)
                curveTo(18.5122f, 17.2877f, 18.5891f, 17.2824f, 18.6321f, 17.2721f)
                curveTo(18.6392f, 17.2704f, 18.6445f, 17.2688f, 18.6482f, 17.2676f)
                curveTo(19.2385f, 16.575f, 19.7136f, 15.7901f, 20.0475f, 14.9401f)
                curveTo(20.0462f, 14.9357f, 20.0443f, 14.9298f, 20.0414f, 14.9222f)
                curveTo(20.0209f, 14.8679f, 19.9683f, 14.7831f, 19.8759f, 14.6972f)
                curveTo(19.1517f, 14.0235f, 18.6921f, 13.0662f, 18.6921f, 12.0f)
                curveTo(18.6921f, 10.9338f, 19.1517f, 9.9764f, 19.8759f, 9.3028f)
                curveTo(19.9683f, 9.2169f, 20.0209f, 9.1321f, 20.0414f, 9.0777f)
                curveTo(20.0443f, 9.0702f, 20.0462f, 9.0643f, 20.0474f, 9.0598f)
                curveTo(19.7135f, 8.2096f, 19.2381f, 7.4244f, 18.6477f, 6.7318f)
                curveTo(18.6439f, 6.7305f, 18.6387f, 6.7289f, 18.6316f, 6.7272f)
                curveTo(18.5886f, 6.7169f, 18.5117f, 6.7116f, 18.4103f, 6.7295f)
                curveTo(17.5593f, 6.88f, 16.6471f, 6.7503f, 15.835f, 6.2963f)
                curveTo(14.9641f, 5.8094f, 14.3582f, 5.0329f, 14.0829f, 4.1545f)
                curveTo(14.0485f, 4.0448f, 14.0042f, 3.9703f, 13.971f, 3.9314f)
                curveTo(13.9646f, 3.9238f, 13.9595f, 3.9186f, 13.956f, 3.9153f)
                curveTo(13.3285f, 3.7746f, 12.6739f, 3.7f, 11.9999f, 3.7f)
                curveTo(11.326f, 3.7f, 10.6714f, 3.7746f, 10.0439f, 3.9153f)
                close()
                moveTo(20.0499f, 9.049f)
                curveTo(20.0499f, 9.049f, 20.0499f, 9.0493f, 20.0497f, 9.0501f)
                lineTo(20.0499f, 9.049f)
                close()
                moveTo(3.95f, 14.9511f)
                curveTo(3.9499f, 14.9511f, 3.95f, 14.9507f, 3.9501f, 14.9499f)
                lineTo(3.95f, 14.9511f)
                close()
                moveTo(8.05f, 12.0f)
                curveTo(8.05f, 9.8185f, 9.8185f, 8.05f, 12.0f, 8.05f)
                curveTo(14.1816f, 8.05f, 15.95f, 9.8185f, 15.95f, 12.0f)
                curveTo(15.95f, 14.1815f, 14.1816f, 15.95f, 12.0f, 15.95f)
                curveTo(9.8185f, 15.95f, 8.05f, 14.1815f, 8.05f, 12.0f)
                close()
                moveTo(12.0f, 9.95f)
                curveTo(10.8679f, 9.95f, 9.95f, 10.8678f, 9.95f, 12.0f)
                curveTo(9.95f, 13.1322f, 10.8679f, 14.05f, 12.0f, 14.05f)
                curveTo(13.1322f, 14.05f, 14.05f, 13.1322f, 14.05f, 12.0f)
                curveTo(14.05f, 10.8678f, 13.1322f, 9.95f, 12.0f, 9.95f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
