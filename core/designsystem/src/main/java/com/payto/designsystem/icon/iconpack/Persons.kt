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

public val IconPack.Persons: ImageVector
    get() {
        if (_persons != null) {
            return _persons!!
        }
        _persons = Builder(name = "Persons", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0019f, 4.1001f)
                curveTo(12.848f, 4.1001f, 11.1019f, 5.8462f, 11.1019f, 8.0001f)
                curveTo(11.1019f, 10.154f, 12.848f, 11.9001f, 15.0019f, 11.9001f)
                curveTo(17.1559f, 11.9001f, 18.9019f, 10.154f, 18.9019f, 8.0001f)
                curveTo(18.9019f, 5.8462f, 17.1559f, 4.1001f, 15.0019f, 4.1001f)
                close()
                moveTo(15.0018f, 13.6f)
                curveTo(12.9159f, 13.6f, 10.9868f, 14.162f, 9.5529f, 15.118f)
                curveTo(8.1252f, 16.0698f, 7.1018f, 17.4835f, 7.1018f, 19.1667f)
                lineTo(7.1018f, 19.1838f)
                curveTo(7.1017f, 19.2413f, 7.1017f, 19.3198f, 7.1081f, 19.3938f)
                curveTo(7.1779f, 20.1915f, 7.8103f, 20.8239f, 8.608f, 20.8937f)
                curveTo(8.682f, 20.9002f, 8.7605f, 20.9001f, 8.818f, 20.9f)
                lineTo(8.8352f, 20.9f)
                horizontalLineTo(21.1685f)
                lineTo(21.1856f, 20.9f)
                curveTo(21.2431f, 20.9001f, 21.3217f, 20.9002f, 21.3956f, 20.8937f)
                curveTo(22.1933f, 20.8239f, 22.8258f, 20.1915f, 22.8956f, 19.3938f)
                curveTo(22.902f, 19.3198f, 22.9019f, 19.2413f, 22.9019f, 19.1838f)
                lineTo(22.9018f, 19.1667f)
                curveTo(22.9018f, 17.4835f, 21.8785f, 16.0698f, 20.4508f, 15.118f)
                curveTo(19.0169f, 14.162f, 17.0877f, 13.6f, 15.0018f, 13.6f)
                close()
                moveTo(5.3019f, 19.1667f)
                curveTo(5.3019f, 17.5554f, 5.9404f, 16.1839f, 6.8694f, 15.1011f)
                curveTo(5.386f, 15.1241f, 4.008f, 15.5335f, 2.9668f, 16.2276f)
                curveTo(1.9011f, 16.938f, 1.1016f, 18.0184f, 1.1016f, 19.3334f)
                curveTo(1.1016f, 20.1985f, 1.8029f, 20.8999f, 2.668f, 20.8999f)
                horizontalLineTo(5.7216f)
                curveTo(5.4999f, 20.4932f, 5.3576f, 20.0366f, 5.3151f, 19.5507f)
                curveTo(5.3006f, 19.3853f, 5.3016f, 19.2162f, 5.3019f, 19.1745f)
                lineTo(5.3019f, 19.1667f)
                close()
                moveTo(3.6017f, 10.0f)
                curveTo(3.6017f, 8.3984f, 4.9001f, 7.1f, 6.5017f, 7.1f)
                curveTo(8.1033f, 7.1f, 9.4017f, 8.3984f, 9.4017f, 10.0f)
                curveTo(9.4017f, 11.6016f, 8.1033f, 12.9f, 6.5017f, 12.9f)
                curveTo(4.9001f, 12.9f, 3.6017f, 11.6016f, 3.6017f, 10.0f)
                close()
            }
        }
        .build()
        return _persons!!
    }

private var _persons: ImageVector? = null
