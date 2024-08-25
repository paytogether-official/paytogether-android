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

public val IconPack.Facesmile: ImageVector
    get() {
        if (_facesmile != null) {
            return _facesmile!!
        }
        _facesmile = Builder(name = "Facesmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.1f)
                curveTo(6.5339f, 2.1f, 2.1016f, 6.5324f, 2.1016f, 12.0f)
                curveTo(2.1016f, 17.4676f, 6.5339f, 21.9f, 12.0016f, 21.9f)
                curveTo(17.4692f, 21.9f, 21.9016f, 17.4676f, 21.9016f, 12.0f)
                curveTo(21.9016f, 6.5324f, 17.4692f, 2.1f, 12.0016f, 2.1f)
                close()
                moveTo(9.0016f, 11.0f)
                curveTo(9.5538f, 11.0f, 10.0016f, 10.5523f, 10.0016f, 10.0f)
                curveTo(10.0016f, 9.4477f, 9.5538f, 9.0f, 9.0016f, 9.0f)
                curveTo(8.4493f, 9.0f, 8.0016f, 9.4477f, 8.0016f, 10.0f)
                curveTo(8.0016f, 10.5523f, 8.4493f, 11.0f, 9.0016f, 11.0f)
                close()
                moveTo(15.0016f, 11.0f)
                curveTo(15.5538f, 11.0f, 16.0016f, 10.5523f, 16.0016f, 10.0f)
                curveTo(16.0016f, 9.4477f, 15.5538f, 9.0f, 15.0016f, 9.0f)
                curveTo(14.4493f, 9.0f, 14.0016f, 9.4477f, 14.0016f, 10.0f)
                curveTo(14.0016f, 10.5523f, 14.4493f, 11.0f, 15.0016f, 11.0f)
                close()
                moveTo(8.5495f, 13.0218f)
                curveTo(8.9792f, 12.7722f, 9.5301f, 12.9182f, 9.7798f, 13.3479f)
                curveTo(10.236f, 14.1333f, 11.0865f, 14.66f, 12.0516f, 14.66f)
                curveTo(13.0166f, 14.66f, 13.8671f, 14.1333f, 14.3234f, 13.3479f)
                curveTo(14.573f, 12.9182f, 15.1239f, 12.7722f, 15.5537f, 13.0218f)
                curveTo(15.9834f, 13.2715f, 16.1295f, 13.8224f, 15.8798f, 14.2522f)
                curveTo(15.116f, 15.5668f, 13.6865f, 16.46f, 12.0516f, 16.46f)
                curveTo(10.4166f, 16.46f, 8.9871f, 15.5668f, 8.2233f, 14.2522f)
                curveTo(7.9737f, 13.8224f, 8.1197f, 13.2715f, 8.5495f, 13.0218f)
                close()
            }
        }
        .build()
        return _facesmile!!
    }

private var _facesmile: ImageVector? = null
