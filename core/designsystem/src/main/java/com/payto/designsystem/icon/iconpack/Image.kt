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

public val IconPack.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF171719)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0718f, 2.5995f)
                curveTo(4.8175f, 2.5995f, 4.5754f, 2.5994f, 4.3715f, 2.6161f)
                curveTo(4.1491f, 2.6343f, 3.894f, 2.6767f, 3.639f, 2.8066f)
                curveTo(3.2815f, 2.9887f, 2.9908f, 3.2794f, 2.8087f, 3.6369f)
                curveTo(2.6787f, 3.8919f, 2.6363f, 4.147f, 2.6182f, 4.3694f)
                curveTo(2.6015f, 4.5734f, 2.6015f, 4.8154f, 2.6016f, 5.0697f)
                verticalLineTo(18.9292f)
                curveTo(2.6015f, 19.1836f, 2.6015f, 19.4256f, 2.6182f, 19.6296f)
                curveTo(2.6363f, 19.852f, 2.6787f, 20.1071f, 2.8087f, 20.3621f)
                curveTo(2.9908f, 20.7196f, 3.2815f, 21.0102f, 3.639f, 21.1924f)
                curveTo(3.894f, 21.3223f, 4.1491f, 21.3647f, 4.3715f, 21.3829f)
                curveTo(4.5754f, 21.3995f, 4.8175f, 21.3995f, 5.0718f, 21.3995f)
                horizontalLineTo(18.9313f)
                curveTo(19.1856f, 21.3995f, 19.4277f, 21.3995f, 19.6317f, 21.3829f)
                curveTo(19.8541f, 21.3647f, 20.1092f, 21.3223f, 20.3641f, 21.1924f)
                curveTo(20.7217f, 21.0102f, 21.0123f, 20.7196f, 21.1945f, 20.3621f)
                curveTo(21.3244f, 20.1071f, 21.3668f, 19.852f, 21.385f, 19.6296f)
                curveTo(21.4016f, 19.4256f, 21.4016f, 19.1836f, 21.4016f, 18.9293f)
                verticalLineTo(5.0697f)
                curveTo(21.4016f, 4.8154f, 21.4016f, 4.5733f, 21.385f, 4.3694f)
                curveTo(21.3668f, 4.147f, 21.3244f, 3.8919f, 21.1945f, 3.6369f)
                curveTo(21.0123f, 3.2794f, 20.7217f, 2.9887f, 20.3641f, 2.8066f)
                curveTo(20.1092f, 2.6767f, 19.8541f, 2.6343f, 19.6317f, 2.6161f)
                curveTo(19.4277f, 2.5994f, 19.1856f, 2.5995f, 18.9313f, 2.5995f)
                horizontalLineTo(5.0718f)
                close()
                moveTo(4.4016f, 4.4995f)
                curveTo(4.4016f, 4.4442f, 4.4464f, 4.3994f, 4.5016f, 4.3994f)
                horizontalLineTo(19.5016f)
                curveTo(19.5568f, 4.3994f, 19.6016f, 4.4442f, 19.6016f, 4.4995f)
                verticalLineTo(13.8272f)
                lineTo(17.0014f, 11.2271f)
                lineTo(13.5014f, 14.7271f)
                lineTo(8.5014f, 9.7271f)
                lineTo(4.4016f, 13.8269f)
                verticalLineTo(4.4995f)
                close()
                moveTo(4.4016f, 16.3725f)
                verticalLineTo(19.4994f)
                curveTo(4.4016f, 19.5547f, 4.4464f, 19.5994f, 4.5016f, 19.5994f)
                horizontalLineTo(19.5016f)
                curveTo(19.5568f, 19.5994f, 19.6016f, 19.5547f, 19.6016f, 19.4994f)
                verticalLineTo(16.3728f)
                lineTo(17.0014f, 13.7727f)
                lineTo(13.5014f, 17.2727f)
                lineTo(8.5014f, 12.2727f)
                lineTo(4.4016f, 16.3725f)
                close()
                moveTo(17.2514f, 7.9999f)
                curveTo(17.2514f, 8.6902f, 16.6918f, 9.2499f, 16.0014f, 9.2499f)
                curveTo(15.3111f, 9.2499f, 14.7514f, 8.6902f, 14.7514f, 7.9999f)
                curveTo(14.7514f, 7.3095f, 15.3111f, 6.7499f, 16.0014f, 6.7499f)
                curveTo(16.6918f, 6.7499f, 17.2514f, 7.3095f, 17.2514f, 7.9999f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
