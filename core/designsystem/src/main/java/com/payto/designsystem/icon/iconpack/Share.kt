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

public val IconPack.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 2.0f)
                curveTo(16.3431f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                curveTo(15.0f, 5.1766f, 15.0153f, 5.3496f, 15.0445f, 5.5179f)
                lineTo(7.9298f, 9.703f)
                curveTo(7.4082f, 9.2643f, 6.735f, 9.0f, 6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 10.3431f, 3.0f, 12.0f)
                curveTo(3.0f, 13.6569f, 4.3432f, 15.0f, 6.0f, 15.0f)
                curveTo(6.8303f, 15.0f, 7.5818f, 14.6627f, 8.125f, 14.1177f)
                lineTo(15.1019f, 18.2217f)
                curveTo(15.0354f, 18.4699f, 15.0f, 18.7308f, 15.0f, 19.0f)
                curveTo(15.0f, 20.6569f, 16.3431f, 22.0f, 18.0f, 22.0f)
                curveTo(19.6569f, 22.0f, 21.0f, 20.6569f, 21.0f, 19.0f)
                curveTo(21.0f, 17.3431f, 19.6569f, 16.0f, 18.0f, 16.0f)
                curveTo(17.2651f, 16.0f, 16.5918f, 16.2643f, 16.0702f, 16.703f)
                lineTo(8.9555f, 12.5179f)
                curveTo(8.9847f, 12.3496f, 9.0f, 12.1766f, 9.0f, 12.0f)
                curveTo(9.0f, 11.7308f, 8.9646f, 11.47f, 8.8981f, 11.2218f)
                lineTo(15.875f, 7.1177f)
                curveTo(16.4182f, 7.6627f, 17.1697f, 8.0f, 18.0f, 8.0f)
                curveTo(19.6569f, 8.0f, 21.0f, 6.6568f, 21.0f, 5.0f)
                curveTo(21.0f, 3.3431f, 19.6569f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(16.8f, 5.0f)
                curveTo(16.8f, 4.3373f, 17.3373f, 3.8f, 18.0f, 3.8f)
                curveTo(18.6627f, 3.8f, 19.2f, 4.3373f, 19.2f, 5.0f)
                curveTo(19.2f, 5.6627f, 18.6627f, 6.2f, 18.0f, 6.2f)
                curveTo(17.3373f, 6.2f, 16.8f, 5.6627f, 16.8f, 5.0f)
                close()
                moveTo(6.0f, 10.8f)
                curveTo(5.3373f, 10.8f, 4.8f, 11.3373f, 4.8f, 12.0f)
                curveTo(4.8f, 12.6627f, 5.3373f, 13.2f, 6.0f, 13.2f)
                curveTo(6.6627f, 13.2f, 7.2f, 12.6627f, 7.2f, 12.0f)
                curveTo(7.2f, 11.3373f, 6.6627f, 10.8f, 6.0f, 10.8f)
                close()
                moveTo(16.8f, 19.0f)
                curveTo(16.8f, 18.3373f, 17.3373f, 17.8f, 18.0f, 17.8f)
                curveTo(18.6627f, 17.8f, 19.2f, 18.3373f, 19.2f, 19.0f)
                curveTo(19.2f, 19.6627f, 18.6627f, 20.2f, 18.0f, 20.2f)
                curveTo(17.3373f, 20.2f, 16.8f, 19.6627f, 16.8f, 19.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
