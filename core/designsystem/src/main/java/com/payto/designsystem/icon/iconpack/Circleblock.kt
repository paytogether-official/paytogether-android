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

public val IconPack.Circleblock: ImageVector
    get() {
        if (_circleblock != null) {
            return _circleblock!!
        }
        _circleblock = Builder(name = "Circleblock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.1001f)
                curveTo(6.5339f, 2.1001f, 2.1016f, 6.5325f, 2.1016f, 12.0001f)
                curveTo(2.1016f, 17.4677f, 6.5339f, 21.9001f, 12.0016f, 21.9001f)
                curveTo(17.4692f, 21.9001f, 21.9016f, 17.4677f, 21.9016f, 12.0001f)
                curveTo(21.9016f, 6.5325f, 17.4692f, 2.1001f, 12.0016f, 2.1001f)
                close()
                moveTo(3.9016f, 12.0001f)
                curveTo(3.9016f, 7.5266f, 7.5281f, 3.9001f, 12.0016f, 3.9001f)
                curveTo(13.9141f, 3.9001f, 15.6718f, 4.5629f, 17.0575f, 5.6714f)
                lineTo(5.6729f, 17.056f)
                curveTo(4.5644f, 15.6703f, 3.9016f, 13.9126f, 3.9016f, 12.0001f)
                close()
                moveTo(6.9456f, 18.3288f)
                curveTo(8.3314f, 19.4373f, 10.089f, 20.1001f, 12.0016f, 20.1001f)
                curveTo(16.4751f, 20.1001f, 20.1016f, 16.4736f, 20.1016f, 12.0001f)
                curveTo(20.1016f, 10.0876f, 19.4387f, 8.3299f, 18.3303f, 6.9442f)
                lineTo(6.9456f, 18.3288f)
                close()
            }
        }
        .build()
        return _circleblock!!
    }

private var _circleblock: ImageVector? = null
