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

public val IconPack.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0017f, 14.0f)
                horizontalLineTo(15.0017f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0017f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.2016f, 4.1f)
                horizontalLineTo(6.8017f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0017f)
                verticalLineTo(4.1008f)
                curveTo(4.758f, 4.1024f, 4.537f, 4.1076f, 4.3431f, 4.1234f)
                curveTo(4.0373f, 4.1484f, 3.7204f, 4.2044f, 3.412f, 4.3616f)
                curveTo(2.9604f, 4.5917f, 2.5932f, 4.9588f, 2.3631f, 5.4104f)
                curveTo(2.206f, 5.7189f, 2.15f, 6.0357f, 2.125f, 6.3415f)
                curveTo(2.1015f, 6.6287f, 2.1015f, 6.9752f, 2.1016f, 7.3667f)
                verticalLineTo(17.6333f)
                curveTo(2.1015f, 18.0248f, 2.1015f, 18.3713f, 2.125f, 18.6585f)
                curveTo(2.15f, 18.9643f, 2.206f, 19.2811f, 2.3631f, 19.5896f)
                curveTo(2.5932f, 20.0412f, 2.9604f, 20.4083f, 3.412f, 20.6384f)
                curveTo(3.7204f, 20.7956f, 4.0373f, 20.8516f, 4.3431f, 20.8766f)
                curveTo(4.6302f, 20.9f, 4.9767f, 20.9f, 5.3681f, 20.9f)
                horizontalLineTo(18.6349f)
                curveTo(19.0264f, 20.9f, 19.3729f, 20.9f, 19.66f, 20.8766f)
                curveTo(19.9658f, 20.8516f, 20.2827f, 20.7956f, 20.5911f, 20.6384f)
                curveTo(21.0427f, 20.4083f, 21.4099f, 20.0412f, 21.64f, 19.5896f)
                curveTo(21.7971f, 19.2811f, 21.8532f, 18.9643f, 21.8781f, 18.6585f)
                curveTo(21.9016f, 18.3713f, 21.9016f, 18.0248f, 21.9016f, 17.6333f)
                verticalLineTo(7.3667f)
                curveTo(21.9016f, 6.9752f, 21.9016f, 6.6287f, 21.8781f, 6.3415f)
                curveTo(21.8532f, 6.0357f, 21.7971f, 5.7189f, 21.64f, 5.4104f)
                curveTo(21.4099f, 4.9588f, 21.0427f, 4.5917f, 20.5911f, 4.3616f)
                curveTo(20.2827f, 4.2044f, 19.9658f, 4.1484f, 19.66f, 4.1234f)
                curveTo(19.3729f, 4.1f, 19.0264f, 4.1f, 18.6349f, 4.1f)
                lineTo(18.0016f, 4.1f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.2016f)
                verticalLineTo(4.1f)
                close()
                moveTo(4.4897f, 5.9174f)
                curveTo(4.2952f, 5.9333f, 4.2416f, 5.9591f, 4.2292f, 5.9654f)
                curveTo(4.1163f, 6.0229f, 4.0245f, 6.1147f, 3.967f, 6.2276f)
                curveTo(3.9606f, 6.24f, 3.9349f, 6.2936f, 3.919f, 6.4881f)
                curveTo(3.9023f, 6.6931f, 3.9016f, 6.9651f, 3.9016f, 7.4f)
                verticalLineTo(9.2001f)
                horizontalLineTo(20.1016f)
                verticalLineTo(7.4f)
                curveTo(20.1016f, 6.9651f, 20.1009f, 6.6931f, 20.0841f, 6.4881f)
                curveTo(20.0682f, 6.2936f, 20.0425f, 6.24f, 20.0362f, 6.2276f)
                curveTo(19.9786f, 6.1147f, 19.8869f, 6.0229f, 19.774f, 5.9654f)
                curveTo(19.7615f, 5.9591f, 19.7079f, 5.9333f, 19.5135f, 5.9174f)
                curveTo(19.3085f, 5.9007f, 19.0365f, 5.9f, 18.6016f, 5.9f)
                horizontalLineTo(5.4016f)
                curveTo(4.9667f, 5.9f, 4.6946f, 5.9007f, 4.4897f, 5.9174f)
                close()
                moveTo(3.9016f, 17.6f)
                verticalLineTo(11.0001f)
                horizontalLineTo(20.1016f)
                verticalLineTo(17.6f)
                curveTo(20.1016f, 18.0349f, 20.1009f, 18.3069f, 20.0841f, 18.5119f)
                curveTo(20.0682f, 18.7064f, 20.0425f, 18.76f, 20.0362f, 18.7724f)
                curveTo(19.9786f, 18.8853f, 19.8869f, 18.9771f, 19.774f, 19.0346f)
                curveTo(19.7615f, 19.0409f, 19.7079f, 19.0667f, 19.5135f, 19.0826f)
                curveTo(19.3085f, 19.0993f, 19.0365f, 19.1f, 18.6016f, 19.1f)
                horizontalLineTo(5.4016f)
                curveTo(4.9667f, 19.1f, 4.6946f, 19.0993f, 4.4897f, 19.0826f)
                curveTo(4.2952f, 19.0667f, 4.2416f, 19.0409f, 4.2292f, 19.0346f)
                curveTo(4.1163f, 18.9771f, 4.0245f, 18.8853f, 3.967f, 18.7724f)
                curveTo(3.9606f, 18.76f, 3.9349f, 18.7064f, 3.919f, 18.5119f)
                curveTo(3.9023f, 18.3069f, 3.9016f, 18.0349f, 3.9016f, 17.6f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
