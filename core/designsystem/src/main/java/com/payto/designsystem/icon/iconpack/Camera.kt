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

public val IconPack.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0012f, 7.35f)
                curveTo(9.295f, 7.35f, 7.1012f, 9.5438f, 7.1012f, 12.25f)
                curveTo(7.1012f, 14.9562f, 9.295f, 17.15f, 12.0012f, 17.15f)
                curveTo(14.7074f, 17.15f, 16.9012f, 14.9562f, 16.9012f, 12.25f)
                curveTo(16.9012f, 9.5438f, 14.7074f, 7.35f, 12.0012f, 7.35f)
                close()
                moveTo(8.9012f, 12.25f)
                curveTo(8.9012f, 10.5379f, 10.2891f, 9.15f, 12.0012f, 9.15f)
                curveTo(13.7133f, 9.15f, 15.1012f, 10.5379f, 15.1012f, 12.25f)
                curveTo(15.1012f, 13.9621f, 13.7133f, 15.35f, 12.0012f, 15.35f)
                curveTo(10.2891f, 15.35f, 8.9012f, 13.9621f, 8.9012f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.1117f, 2.0999f)
                curveTo(9.587f, 2.0994f, 9.1447f, 2.099f, 8.7293f, 2.2252f)
                curveTo(8.3645f, 2.336f, 8.0251f, 2.5176f, 7.7305f, 2.7597f)
                curveTo(7.3951f, 3.0355f, 7.1502f, 3.4037f, 6.8596f, 3.8406f)
                lineTo(6.0203f, 5.1f)
                lineTo(5.1662f, 5.1f)
                curveTo(4.6363f, 5.1f, 4.1851f, 5.1f, 3.8147f, 5.1302f)
                curveTo(3.4255f, 5.162f, 3.0469f, 5.2316f, 2.685f, 5.4161f)
                curveTo(2.1393f, 5.6941f, 1.6957f, 6.1377f, 1.4176f, 6.6834f)
                curveTo(1.2332f, 7.0454f, 1.1636f, 7.4239f, 1.1318f, 7.8131f)
                curveTo(1.1015f, 8.1835f, 1.1015f, 8.6347f, 1.1016f, 9.1645f)
                verticalLineTo(16.8354f)
                curveTo(1.1015f, 17.3652f, 1.1015f, 17.8164f, 1.1318f, 18.1869f)
                curveTo(1.1636f, 18.576f, 1.2332f, 18.9546f, 1.4176f, 19.3166f)
                curveTo(1.6957f, 19.8622f, 2.1393f, 20.3059f, 2.685f, 20.5839f)
                curveTo(3.0469f, 20.7683f, 3.4255f, 20.838f, 3.8147f, 20.8697f)
                curveTo(4.1851f, 20.9f, 4.6363f, 20.9f, 5.1661f, 20.9f)
                horizontalLineTo(18.837f)
                curveTo(19.3668f, 20.9f, 19.818f, 20.9f, 20.1884f, 20.8697f)
                curveTo(20.5776f, 20.838f, 20.9562f, 20.7683f, 21.3181f, 20.5839f)
                curveTo(21.8638f, 20.3059f, 22.3074f, 19.8622f, 22.5855f, 19.3166f)
                curveTo(22.7699f, 18.9546f, 22.8395f, 18.576f, 22.8713f, 18.1869f)
                curveTo(22.9016f, 17.8164f, 22.9016f, 17.3653f, 22.9016f, 16.8354f)
                verticalLineTo(9.1646f)
                curveTo(22.9016f, 8.6347f, 22.9016f, 8.1835f, 22.8713f, 7.8131f)
                curveTo(22.8395f, 7.4239f, 22.7699f, 7.0454f, 22.5855f, 6.6834f)
                curveTo(22.3074f, 6.1377f, 21.8638f, 5.6941f, 21.3181f, 5.4161f)
                curveTo(20.9562f, 5.2316f, 20.5776f, 5.162f, 20.1884f, 5.1302f)
                curveTo(19.818f, 5.1f, 19.3668f, 5.1f, 18.837f, 5.1f)
                lineTo(17.9837f, 5.1f)
                lineTo(17.1434f, 3.8399f)
                curveTo(16.8528f, 3.4031f, 16.6079f, 3.0351f, 16.2725f, 2.7595f)
                curveTo(15.978f, 2.5174f, 15.6387f, 2.3359f, 15.2739f, 2.2251f)
                curveTo(14.8586f, 2.099f, 14.4165f, 2.0994f, 13.8919f, 2.0999f)
                lineTo(10.1117f, 2.0999f)
                close()
                moveTo(9.2524f, 3.9475f)
                curveTo(9.3785f, 3.9092f, 9.5321f, 3.9f, 10.2144f, 3.9f)
                horizontalLineTo(13.7892f)
                curveTo(14.4713f, 3.9f, 14.6249f, 3.9091f, 14.7509f, 3.9474f)
                curveTo(14.8893f, 3.9894f, 15.018f, 4.0583f, 15.1297f, 4.1501f)
                curveTo(15.2315f, 4.2338f, 15.3244f, 4.3565f, 15.7028f, 4.924f)
                lineTo(16.5158f, 6.1431f)
                lineTo(16.5332f, 6.1696f)
                curveTo(16.5953f, 6.2643f, 16.7131f, 6.4439f, 16.8808f, 6.5816f)
                curveTo(17.0229f, 6.6985f, 17.1867f, 6.7861f, 17.3628f, 6.8396f)
                curveTo(17.5705f, 6.9026f, 17.7852f, 6.901f, 17.8984f, 6.9002f)
                lineTo(17.9301f, 6.9f)
                horizontalLineTo(18.8016f)
                curveTo(19.3765f, 6.9f, 19.7535f, 6.9007f, 20.0419f, 6.9243f)
                curveTo(20.3197f, 6.9469f, 20.4351f, 6.9863f, 20.501f, 7.0199f)
                curveTo(20.7079f, 7.1253f, 20.8762f, 7.2936f, 20.9817f, 7.5006f)
                curveTo(21.0152f, 7.5665f, 21.0546f, 7.6818f, 21.0773f, 7.9597f)
                curveTo(21.1009f, 8.248f, 21.1016f, 8.6251f, 21.1016f, 9.2f)
                verticalLineTo(16.8f)
                curveTo(21.1016f, 17.3749f, 21.1009f, 17.7519f, 21.0773f, 18.0403f)
                curveTo(21.0546f, 18.3181f, 21.0152f, 18.4335f, 20.9817f, 18.4994f)
                curveTo(20.8762f, 18.7064f, 20.7079f, 18.8746f, 20.501f, 18.9801f)
                curveTo(20.4351f, 19.0137f, 20.3197f, 19.053f, 20.0419f, 19.0757f)
                curveTo(19.7535f, 19.0993f, 19.3765f, 19.1f, 18.8016f, 19.1f)
                horizontalLineTo(5.2016f)
                curveTo(4.6267f, 19.1f, 4.2496f, 19.0993f, 3.9613f, 19.0757f)
                curveTo(3.6834f, 19.053f, 3.5681f, 19.0137f, 3.5022f, 18.9801f)
                curveTo(3.2952f, 18.8746f, 3.1269f, 18.7064f, 3.0215f, 18.4994f)
                curveTo(2.9879f, 18.4335f, 2.9485f, 18.3181f, 2.9258f, 18.0403f)
                curveTo(2.9023f, 17.7519f, 2.9016f, 17.3749f, 2.9016f, 16.8f)
                verticalLineTo(9.2f)
                curveTo(2.9016f, 8.6251f, 2.9023f, 8.248f, 2.9258f, 7.9597f)
                curveTo(2.9485f, 7.6818f, 2.9879f, 7.5665f, 3.0215f, 7.5006f)
                curveTo(3.1269f, 7.2936f, 3.2952f, 7.1253f, 3.5022f, 7.0199f)
                curveTo(3.5681f, 6.9863f, 3.6834f, 6.9469f, 3.9613f, 6.9243f)
                curveTo(4.2496f, 6.9007f, 4.6267f, 6.9f, 5.2016f, 6.9f)
                horizontalLineTo(6.0739f)
                lineTo(6.1056f, 6.9002f)
                curveTo(6.2188f, 6.901f, 6.4336f, 6.9026f, 6.6413f, 6.8396f)
                curveTo(6.8174f, 6.7861f, 6.9813f, 6.6984f, 7.1234f, 6.5815f)
                curveTo(7.2911f, 6.4436f, 7.4089f, 6.264f, 7.471f, 6.1693f)
                lineTo(7.4884f, 6.1428f)
                lineTo(8.3005f, 4.9244f)
                curveTo(8.6789f, 4.3567f, 8.7717f, 4.2339f, 8.8736f, 4.1502f)
                curveTo(8.9853f, 4.0584f, 9.114f, 3.9895f, 9.2524f, 3.9475f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
