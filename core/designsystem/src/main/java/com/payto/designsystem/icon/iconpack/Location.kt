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

public val IconPack.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6805f, 5.0503f)
                curveTo(7.3289f, 3.0884f, 9.6653f, 2.1f, 11.999f, 2.1f)
                curveTo(14.3324f, 2.1f, 16.659f, 3.0782f, 18.3178f, 5.0507f)
                curveTo(21.1827f, 8.457f, 20.7379f, 13.4827f, 17.6565f, 16.5752f)
                lineTo(17.6554f, 16.5764f)
                curveTo(15.9068f, 18.325f, 13.8946f, 20.4504f, 13.0504f, 21.3421f)
                curveTo(12.9928f, 21.4029f, 12.9407f, 21.4579f, 12.8944f, 21.5067f)
                curveTo(12.4092f, 22.0244f, 11.5888f, 22.0244f, 11.1036f, 21.5068f)
                curveTo(11.0573f, 21.458f, 11.0052f, 21.4029f, 10.9476f, 21.3421f)
                curveTo(10.1034f, 20.4504f, 8.0912f, 18.325f, 6.3426f, 16.5764f)
                lineTo(6.3415f, 16.5752f)
                curveTo(3.2608f, 13.4835f, 2.8145f, 8.4475f, 5.6805f, 5.0503f)
                close()
                moveTo(9.219f, 10.34f)
                curveTo(9.219f, 8.8029f, 10.4619f, 7.56f, 11.999f, 7.56f)
                curveTo(13.536f, 7.56f, 14.779f, 8.8029f, 14.779f, 10.34f)
                curveTo(14.779f, 11.877f, 13.536f, 13.12f, 11.999f, 13.12f)
                curveTo(10.4619f, 13.12f, 9.219f, 11.877f, 9.219f, 10.34f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
