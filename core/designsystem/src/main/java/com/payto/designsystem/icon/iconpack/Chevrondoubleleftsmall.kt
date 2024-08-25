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

public val IconPack.Chevrondoubleleftsmall: ImageVector
    get() {
        if (_chevrondoubleleftsmall != null) {
            return _chevrondoubleleftsmall!!
        }
        _chevrondoubleleftsmall = Builder(name = "Chevrondoubleleftsmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.638f, 6.1399f)
                curveTo(11.9894f, 5.7884f, 11.9894f, 5.2186f, 11.638f, 4.8671f)
                curveTo(11.2865f, 4.5156f, 10.7166f, 4.5156f, 10.3652f, 4.8671f)
                lineTo(3.8652f, 11.3671f)
                curveTo(3.6964f, 11.5359f, 3.6016f, 11.7648f, 3.6016f, 12.0035f)
                curveTo(3.6016f, 12.2422f, 3.6964f, 12.4711f, 3.8652f, 12.6399f)
                lineTo(10.3652f, 19.1399f)
                curveTo(10.7166f, 19.4914f, 11.2865f, 19.4914f, 11.638f, 19.1399f)
                curveTo(11.9894f, 18.7884f, 11.9894f, 18.2186f, 11.638f, 17.8671f)
                lineTo(5.7744f, 12.0035f)
                lineTo(11.638f, 6.1399f)
                close()
                moveTo(19.6382f, 6.1399f)
                curveTo(19.9896f, 5.7884f, 19.9896f, 5.2186f, 19.6382f, 4.8671f)
                curveTo(19.2867f, 4.5156f, 18.7168f, 4.5156f, 18.3654f, 4.8671f)
                lineTo(11.8654f, 11.3671f)
                curveTo(11.6966f, 11.5359f, 11.6018f, 11.7648f, 11.6018f, 12.0035f)
                curveTo(11.6018f, 12.2422f, 11.6966f, 12.4711f, 11.8654f, 12.6399f)
                lineTo(18.3654f, 19.1399f)
                curveTo(18.7168f, 19.4914f, 19.2867f, 19.4914f, 19.6382f, 19.1399f)
                curveTo(19.9896f, 18.7884f, 19.9896f, 18.2186f, 19.6382f, 17.8671f)
                lineTo(13.7746f, 12.0035f)
                lineTo(19.6382f, 6.1399f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftsmall!!
    }

private var _chevrondoubleleftsmall: ImageVector? = null
