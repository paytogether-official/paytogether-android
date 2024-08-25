package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

public val IconPack.Chevronupthick: ImageVector
    get() {
        if (_chevronupthick != null) {
            return _chevronupthick!!
        }
        _chevronupthick = Builder(name = "Chevronupthick", defaultWidth = 25.0.dp, defaultHeight =
                25.0.dp, viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2091f, 17.1034f)
                curveTo(3.738f, 17.6322f, 4.5954f, 17.6322f, 5.1242f, 17.1034f)
                lineTo(12.5f, 9.7276f)
                lineTo(19.8758f, 17.1034f)
                curveTo(20.4046f, 17.6322f, 21.262f, 17.6322f, 21.7909f, 17.1034f)
                curveTo(22.3197f, 16.5746f, 22.3197f, 15.7172f, 21.7909f, 15.1883f)
                lineTo(13.4575f, 6.855f)
                curveTo(12.9287f, 6.3262f, 12.0713f, 6.3262f, 11.5424f, 6.855f)
                lineTo(3.2091f, 15.1883f)
                curveTo(2.6803f, 15.7172f, 2.6803f, 16.5746f, 3.2091f, 17.1034f)
                close()
            }
        }
        .build()
        return _chevronupthick!!
    }

private var _chevronupthick: ImageVector? = null
