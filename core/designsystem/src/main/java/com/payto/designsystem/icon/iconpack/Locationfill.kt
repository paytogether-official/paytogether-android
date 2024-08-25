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

public val IconPack.Locationfill: ImageVector
    get() {
        if (_locationfill != null) {
            return _locationfill!!
        }
        _locationfill = Builder(name = "Locationfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6766f, 5.0504f)
                curveTo(7.325f, 3.0884f, 9.6614f, 2.1f, 11.9951f, 2.1f)
                curveTo(14.3285f, 2.1f, 16.6551f, 3.0782f, 18.3138f, 5.0507f)
                curveTo(21.1788f, 8.4571f, 20.734f, 13.4828f, 17.6526f, 16.5753f)
                lineTo(17.6515f, 16.5764f)
                curveTo(15.9028f, 18.325f, 13.8906f, 20.4504f, 13.0464f, 21.3421f)
                curveTo(12.9889f, 21.4029f, 12.9368f, 21.4579f, 12.8905f, 21.5068f)
                curveTo(12.4053f, 22.0244f, 11.5849f, 22.0244f, 11.0997f, 21.5068f)
                curveTo(11.0534f, 21.458f, 11.0013f, 21.4029f, 10.9437f, 21.3421f)
                curveTo(10.0995f, 20.4504f, 8.0873f, 18.325f, 6.3387f, 16.5764f)
                lineTo(6.3375f, 16.5753f)
                curveTo(3.2569f, 13.4835f, 2.8106f, 8.4476f, 5.6766f, 5.0504f)
                close()
                moveTo(11.9951f, 3.9f)
                curveTo(10.1691f, 3.9f, 8.3457f, 4.6714f, 7.0542f, 6.2089f)
                lineTo(7.0529f, 6.2104f)
                curveTo(4.8398f, 8.833f, 5.1334f, 12.8161f, 7.612f, 15.3042f)
                curveTo(9.2203f, 16.9125f, 11.0447f, 18.8314f, 11.9951f, 19.8345f)
                curveTo(12.9454f, 18.8314f, 14.7698f, 16.9125f, 16.378f, 15.3042f)
                curveTo(18.8562f, 12.8167f, 19.1512f, 8.8428f, 16.9363f, 6.2093f)
                curveTo(15.635f, 4.6619f, 13.8216f, 3.9f, 11.9951f, 3.9f)
                close()
                moveTo(11.9951f, 9.36f)
                curveTo(11.4521f, 9.36f, 11.0151f, 9.7971f, 11.0151f, 10.34f)
                curveTo(11.0151f, 10.8829f, 11.4521f, 11.32f, 11.9951f, 11.32f)
                curveTo(12.538f, 11.32f, 12.9751f, 10.8829f, 12.9751f, 10.34f)
                curveTo(12.9751f, 9.7971f, 12.538f, 9.36f, 11.9951f, 9.36f)
                close()
                moveTo(9.2151f, 10.34f)
                curveTo(9.2151f, 8.8029f, 10.458f, 7.56f, 11.9951f, 7.56f)
                curveTo(13.5321f, 7.56f, 14.7751f, 8.8029f, 14.7751f, 10.34f)
                curveTo(14.7751f, 11.8771f, 13.5321f, 13.12f, 11.9951f, 13.12f)
                curveTo(10.458f, 13.12f, 9.2151f, 11.8771f, 9.2151f, 10.34f)
                close()
            }
        }
        .build()
        return _locationfill!!
    }

private var _locationfill: ImageVector? = null
