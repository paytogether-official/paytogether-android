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

public val IconPack.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.6126f, 2.35f)
                horizontalLineTo(14.3905f)
                curveTo(15.4776f, 2.35f, 16.3483f, 2.35f, 17.052f, 2.4075f)
                curveTo(17.7747f, 2.4665f, 18.4003f, 2.5906f, 18.9761f, 2.884f)
                curveTo(19.8981f, 3.3538f, 20.6477f, 4.1034f, 21.1175f, 5.0254f)
                curveTo(21.4109f, 5.6013f, 21.535f, 6.2268f, 21.5941f, 6.9495f)
                curveTo(21.6516f, 7.6533f, 21.6516f, 8.5239f, 21.6516f, 9.611f)
                verticalLineTo(14.3889f)
                curveTo(21.6516f, 15.476f, 21.6516f, 16.3467f, 21.5941f, 17.0505f)
                curveTo(21.535f, 17.7731f, 21.4109f, 18.3987f, 21.1175f, 18.9745f)
                curveTo(20.6477f, 19.8965f, 19.8981f, 20.6461f, 18.9761f, 21.1159f)
                curveTo(18.4003f, 21.4093f, 17.7747f, 21.5334f, 17.052f, 21.5925f)
                curveTo(16.3483f, 21.65f, 15.4776f, 21.65f, 14.3905f, 21.65f)
                horizontalLineTo(9.6126f)
                curveTo(8.5255f, 21.65f, 7.6549f, 21.65f, 6.9511f, 21.5925f)
                curveTo(6.2284f, 21.5334f, 5.6028f, 21.4093f, 5.027f, 21.1159f)
                curveTo(4.105f, 20.6461f, 3.3554f, 19.8965f, 2.8856f, 18.9745f)
                curveTo(2.5922f, 18.3987f, 2.4681f, 17.7731f, 2.409f, 17.0505f)
                curveTo(2.3516f, 16.3467f, 2.3516f, 15.476f, 2.3516f, 14.3889f)
                verticalLineTo(9.611f)
                curveTo(2.3516f, 8.5239f, 2.3516f, 7.6533f, 2.409f, 6.9495f)
                curveTo(2.4681f, 6.2268f, 2.5922f, 5.6013f, 2.8856f, 5.0254f)
                curveTo(3.3554f, 4.1034f, 4.105f, 3.3538f, 5.027f, 2.884f)
                curveTo(5.6028f, 2.5906f, 6.2284f, 2.4665f, 6.9511f, 2.4075f)
                curveTo(7.6549f, 2.35f, 8.5255f, 2.35f, 9.6126f, 2.35f)
                close()
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
