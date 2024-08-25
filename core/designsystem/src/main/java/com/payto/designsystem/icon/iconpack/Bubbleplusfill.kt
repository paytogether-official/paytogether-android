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

public val IconPack.Bubbleplusfill: ImageVector
    get() {
        if (_bubbleplusfill != null) {
            return _bubbleplusfill!!
        }
        _bubbleplusfill = Builder(name = "Bubbleplusfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.35f)
                curveTo(6.672f, 2.35f, 2.3516f, 6.6705f, 2.3516f, 12.0f)
                curveTo(2.3516f, 17.3296f, 6.672f, 21.65f, 12.0016f, 21.65f)
                curveTo(13.5399f, 21.65f, 14.9963f, 21.2894f, 16.2887f, 20.6476f)
                lineTo(18.0634f, 21.1316f)
                lineTo(18.1013f, 21.1419f)
                curveTo(18.5114f, 21.2538f, 18.8772f, 21.3536f, 19.1778f, 21.4066f)
                curveTo(19.4823f, 21.4604f, 19.8684f, 21.4971f, 20.2541f, 21.3498f)
                curveTo(20.7593f, 21.1569f, 21.1584f, 20.7578f, 21.3513f, 20.2525f)
                curveTo(21.4986f, 19.8669f, 21.4619f, 19.4808f, 21.4082f, 19.1762f)
                curveTo(21.3551f, 18.8757f, 21.2553f, 18.5099f, 21.1434f, 18.0997f)
                lineTo(21.1331f, 18.0619f)
                lineTo(20.6491f, 16.2872f)
                curveTo(21.2909f, 14.9947f, 21.6515f, 13.5383f, 21.6515f, 12.0f)
                curveTo(21.6515f, 6.6705f, 17.3311f, 2.35f, 12.0016f, 2.35f)
                close()
                moveTo(12.9016f, 11.1f)
                verticalLineTo(7.1f)
                horizontalLineTo(11.1016f)
                verticalLineTo(11.1f)
                horizontalLineTo(7.1016f)
                verticalLineTo(12.9f)
                horizontalLineTo(11.1016f)
                verticalLineTo(16.9f)
                horizontalLineTo(12.9016f)
                verticalLineTo(12.9f)
                horizontalLineTo(16.9015f)
                verticalLineTo(11.1f)
                horizontalLineTo(12.9016f)
                close()
            }
        }
        .build()
        return _bubbleplusfill!!
    }

private var _bubbleplusfill: ImageVector? = null
