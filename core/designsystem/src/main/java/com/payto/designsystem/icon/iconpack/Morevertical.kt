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

public val IconPack.Morevertical: ImageVector
    get() {
        if (_morevertical != null) {
            return _morevertical!!
        }
        _morevertical = Builder(name = "Morevertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 4.75f)
                curveTo(13.75f, 5.7165f, 12.9665f, 6.5f, 12.0f, 6.5f)
                curveTo(11.0335f, 6.5f, 10.25f, 5.7165f, 10.25f, 4.75f)
                curveTo(10.25f, 3.7835f, 11.0335f, 3.0f, 12.0f, 3.0f)
                curveTo(12.9665f, 3.0f, 13.75f, 3.7835f, 13.75f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 12.0f)
                curveTo(13.75f, 12.9665f, 12.9665f, 13.75f, 12.0f, 13.75f)
                curveTo(11.0335f, 13.75f, 10.25f, 12.9665f, 10.25f, 12.0f)
                curveTo(10.25f, 11.0335f, 11.0335f, 10.25f, 12.0f, 10.25f)
                curveTo(12.9665f, 10.25f, 13.75f, 11.0335f, 13.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(12.9665f, 21.0f, 13.75f, 20.2165f, 13.75f, 19.25f)
                curveTo(13.75f, 18.2835f, 12.9665f, 17.5f, 12.0f, 17.5f)
                curveTo(11.0335f, 17.5f, 10.25f, 18.2835f, 10.25f, 19.25f)
                curveTo(10.25f, 20.2165f, 11.0335f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _morevertical!!
    }

private var _morevertical: ImageVector? = null
