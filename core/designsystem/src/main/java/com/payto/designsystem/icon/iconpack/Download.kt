package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.9016f, 15.0f)
                lineTo(20.9016f, 18.4304f)
                curveTo(20.9016f, 18.6847f, 20.9016f, 18.9267f, 20.8849f, 19.1307f)
                curveTo(20.8668f, 19.3531f, 20.8244f, 19.6082f, 20.6945f, 19.8632f)
                curveTo(20.5123f, 20.2207f, 20.2216f, 20.5113f, 19.8641f, 20.6935f)
                curveTo(19.6092f, 20.8234f, 19.354f, 20.8658f, 19.1316f, 20.884f)
                curveTo(18.9277f, 20.9006f, 18.6857f, 20.9006f, 18.4314f, 20.9006f)
                horizontalLineTo(5.5718f)
                curveTo(5.3175f, 20.9006f, 5.0754f, 20.9006f, 4.8715f, 20.884f)
                curveTo(4.6491f, 20.8658f, 4.394f, 20.8234f, 4.139f, 20.6935f)
                curveTo(3.7815f, 20.5113f, 3.4908f, 20.2207f, 3.3087f, 19.8632f)
                curveTo(3.1787f, 19.6082f, 3.1363f, 19.3531f, 3.1182f, 19.1307f)
                curveTo(3.1015f, 18.9267f, 3.1015f, 18.6847f, 3.1016f, 18.4303f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.9016f)
                verticalLineTo(19.0003f)
                curveTo(4.9016f, 19.0555f, 4.9463f, 19.1003f, 5.0016f, 19.1003f)
                horizontalLineTo(19.0016f)
                curveTo(19.0568f, 19.1003f, 19.1016f, 19.0555f, 19.1016f, 19.0003f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.9016f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1014f, 4.0006f)
                verticalLineTo(13.4186f)
                lineTo(8.3683f, 10.8462f)
                curveTo(8.0063f, 10.5055f, 7.4367f, 10.5228f, 7.0961f, 10.8847f)
                curveTo(6.7554f, 11.2467f, 6.7727f, 11.8163f, 7.1346f, 12.1569f)
                lineTo(11.3846f, 16.1569f)
                curveTo(11.7312f, 16.4831f, 12.2717f, 16.4831f, 12.6183f, 16.1569f)
                lineTo(16.8683f, 12.1569f)
                curveTo(17.2302f, 11.8163f, 17.2475f, 11.2467f, 16.9068f, 10.8847f)
                curveTo(16.5662f, 10.5228f, 15.9966f, 10.5055f, 15.6346f, 10.8462f)
                lineTo(12.9014f, 13.4186f)
                verticalLineTo(4.0006f)
                curveTo(12.9014f, 3.5035f, 12.4985f, 3.1006f, 12.0014f, 3.1006f)
                curveTo(11.5044f, 3.1006f, 11.1014f, 3.5035f, 11.1014f, 4.0006f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
