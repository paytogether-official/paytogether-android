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

public val IconPack.Squareplusfill: ImageVector
    get() {
        if (_squareplusfill != null) {
            return _squareplusfill!!
        }
        _squareplusfill = Builder(name = "Squareplusfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.6126f, 2.35f)
                horizontalLineTo(14.3905f)
                curveTo(15.4776f, 2.35f, 16.3483f, 2.35f, 17.052f, 2.4075f)
                curveTo(17.7747f, 2.4665f, 18.4003f, 2.5907f, 18.9761f, 2.8841f)
                curveTo(19.8981f, 3.3538f, 20.6477f, 4.1035f, 21.1175f, 5.0255f)
                curveTo(21.4109f, 5.6013f, 21.535f, 6.2269f, 21.5941f, 6.9495f)
                curveTo(21.6516f, 7.6533f, 21.6516f, 8.524f, 21.6516f, 9.611f)
                verticalLineTo(14.389f)
                curveTo(21.6516f, 15.476f, 21.6516f, 16.3467f, 21.5941f, 17.0505f)
                curveTo(21.535f, 17.7732f, 21.4109f, 18.3987f, 21.1175f, 18.9746f)
                curveTo(20.6477f, 19.8966f, 19.8981f, 20.6462f, 18.9761f, 21.1159f)
                curveTo(18.4003f, 21.4093f, 17.7747f, 21.5335f, 17.052f, 21.5925f)
                curveTo(16.3483f, 21.65f, 15.4776f, 21.65f, 14.3905f, 21.65f)
                horizontalLineTo(9.6126f)
                curveTo(8.5255f, 21.65f, 7.6549f, 21.65f, 6.9511f, 21.5925f)
                curveTo(6.2284f, 21.5335f, 5.6029f, 21.4093f, 5.027f, 21.1159f)
                curveTo(4.105f, 20.6462f, 3.3554f, 19.8966f, 2.8856f, 18.9746f)
                curveTo(2.5922f, 18.3987f, 2.4681f, 17.7732f, 2.409f, 17.0505f)
                curveTo(2.3516f, 16.3467f, 2.3516f, 15.476f, 2.3516f, 14.389f)
                verticalLineTo(9.6111f)
                curveTo(2.3516f, 8.524f, 2.3516f, 7.6533f, 2.409f, 6.9495f)
                curveTo(2.4681f, 6.2269f, 2.5922f, 5.6013f, 2.8856f, 5.0255f)
                curveTo(3.3554f, 4.1035f, 4.105f, 3.3538f, 5.027f, 2.8841f)
                curveTo(5.6029f, 2.5907f, 6.2284f, 2.4665f, 6.9511f, 2.4075f)
                curveTo(7.6549f, 2.35f, 8.5255f, 2.35f, 9.6126f, 2.35f)
                close()
                moveTo(12.9016f, 7.1f)
                verticalLineTo(11.1f)
                horizontalLineTo(16.9016f)
                verticalLineTo(12.9f)
                horizontalLineTo(12.9016f)
                verticalLineTo(16.9f)
                horizontalLineTo(11.1016f)
                verticalLineTo(12.9f)
                horizontalLineTo(7.1016f)
                verticalLineTo(11.1f)
                horizontalLineTo(11.1016f)
                verticalLineTo(7.1f)
                horizontalLineTo(12.9016f)
                close()
            }
        }
        .build()
        return _squareplusfill!!
    }

private var _squareplusfill: ImageVector? = null
