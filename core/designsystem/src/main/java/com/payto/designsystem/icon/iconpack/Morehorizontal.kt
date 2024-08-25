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

public val IconPack.Morehorizontal: ImageVector
    get() {
        if (_morehorizontal != null) {
            return _morehorizontal!!
        }
        _morehorizontal = Builder(name = "Morehorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 13.75f)
                curveTo(18.2835f, 13.75f, 17.5f, 12.9665f, 17.5f, 12.0f)
                curveTo(17.5f, 11.0335f, 18.2835f, 10.25f, 19.25f, 10.25f)
                curveTo(20.2165f, 10.25f, 21.0f, 11.0335f, 21.0f, 12.0f)
                curveTo(21.0f, 12.9665f, 20.2165f, 13.75f, 19.25f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.75f)
                curveTo(11.0335f, 13.75f, 10.25f, 12.9665f, 10.25f, 12.0f)
                curveTo(10.25f, 11.0335f, 11.0335f, 10.25f, 12.0f, 10.25f)
                curveTo(12.9665f, 10.25f, 13.75f, 11.0335f, 13.75f, 12.0f)
                curveTo(13.75f, 12.9665f, 12.9665f, 13.75f, 12.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 12.9665f, 3.7835f, 13.75f, 4.75f, 13.75f)
                curveTo(5.7165f, 13.75f, 6.5f, 12.9665f, 6.5f, 12.0f)
                curveTo(6.5f, 11.0335f, 5.7165f, 10.25f, 4.75f, 10.25f)
                curveTo(3.7835f, 10.25f, 3.0f, 11.0335f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _morehorizontal!!
    }

private var _morehorizontal: ImageVector? = null
