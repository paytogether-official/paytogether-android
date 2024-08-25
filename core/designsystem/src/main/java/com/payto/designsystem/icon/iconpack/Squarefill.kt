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

public val IconPack.Squarefill: ImageVector
    get() {
        if (_squarefill != null) {
            return _squarefill!!
        }
        _squarefill = Builder(name = "Squarefill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(6.2284f, 21.5335f, 5.6028f, 21.4093f, 5.027f, 21.1159f)
                curveTo(4.105f, 20.6462f, 3.3554f, 19.8966f, 2.8856f, 18.9746f)
                curveTo(2.5922f, 18.3987f, 2.4681f, 17.7732f, 2.409f, 17.0505f)
                curveTo(2.3516f, 16.3467f, 2.3516f, 15.476f, 2.3516f, 14.389f)
                verticalLineTo(9.6111f)
                curveTo(2.3516f, 8.524f, 2.3516f, 7.6533f, 2.409f, 6.9495f)
                curveTo(2.4681f, 6.2269f, 2.5922f, 5.6013f, 2.8856f, 5.0255f)
                curveTo(3.3554f, 4.1035f, 4.105f, 3.3538f, 5.027f, 2.8841f)
                curveTo(5.6028f, 2.5907f, 6.2284f, 2.4665f, 6.9511f, 2.4075f)
                curveTo(7.6549f, 2.35f, 8.5255f, 2.35f, 9.6126f, 2.35f)
                close()
                moveTo(7.0977f, 4.2015f)
                curveTo(6.4863f, 4.2515f, 6.124f, 4.3453f, 5.8442f, 4.4879f)
                curveTo(5.2609f, 4.7851f, 4.7867f, 5.2593f, 4.4894f, 5.8426f)
                curveTo(4.3469f, 6.1224f, 4.253f, 6.4847f, 4.2031f, 7.0961f)
                curveTo(4.1523f, 7.718f, 4.1516f, 8.515f, 4.1516f, 9.65f)
                verticalLineTo(14.35f)
                curveTo(4.1516f, 15.485f, 4.1523f, 16.2821f, 4.2031f, 16.9039f)
                curveTo(4.253f, 17.5153f, 4.3469f, 17.8776f, 4.4894f, 18.1574f)
                curveTo(4.7867f, 18.7407f, 5.2609f, 19.2149f, 5.8442f, 19.5121f)
                curveTo(6.124f, 19.6547f, 6.4863f, 19.7485f, 7.0977f, 19.7985f)
                curveTo(7.7195f, 19.8493f, 8.5166f, 19.85f, 9.6516f, 19.85f)
                horizontalLineTo(14.3516f)
                curveTo(15.4865f, 19.85f, 16.2836f, 19.8493f, 16.9055f, 19.7985f)
                curveTo(17.5168f, 19.7485f, 17.8791f, 19.6547f, 18.1589f, 19.5121f)
                curveTo(18.7422f, 19.2149f, 19.2165f, 18.7407f, 19.5137f, 18.1574f)
                curveTo(19.6562f, 17.8776f, 19.7501f, 17.5153f, 19.8001f, 16.9039f)
                curveTo(19.8509f, 16.2821f, 19.8516f, 15.485f, 19.8516f, 14.35f)
                verticalLineTo(9.65f)
                curveTo(19.8516f, 8.515f, 19.8509f, 7.718f, 19.8001f, 7.0961f)
                curveTo(19.7501f, 6.4847f, 19.6562f, 6.1224f, 19.5137f, 5.8426f)
                curveTo(19.2165f, 5.2593f, 18.7422f, 4.7851f, 18.1589f, 4.4879f)
                curveTo(17.8791f, 4.3453f, 17.5168f, 4.2515f, 16.9055f, 4.2015f)
                curveTo(16.2836f, 4.1507f, 15.4865f, 4.15f, 14.3516f, 4.15f)
                horizontalLineTo(9.6516f)
                curveTo(8.5166f, 4.15f, 7.7195f, 4.1507f, 7.0977f, 4.2015f)
                close()
            }
        }
        .build()
        return _squarefill!!
    }

private var _squarefill: ImageVector? = null
