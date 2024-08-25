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

public val IconPack.Chevronleftthick: ImageVector
    get() {
        if (_chevronleftthick != null) {
            return _chevronleftthick!!
        }
        _chevronleftthick = Builder(name = "Chevronleftthick", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4184f, 3.0801f)
                curveTo(16.9261f, 3.5878f, 16.9261f, 4.4109f, 16.4184f, 4.9186f)
                lineTo(9.3377f, 11.9993f)
                lineTo(16.4184f, 19.0801f)
                curveTo(16.9261f, 19.5878f, 16.9261f, 20.4109f, 16.4184f, 20.9186f)
                curveTo(15.9108f, 21.4263f, 15.0877f, 21.4263f, 14.58f, 20.9186f)
                lineTo(6.58f, 12.9186f)
                curveTo(6.0723f, 12.4109f, 6.0723f, 11.5878f, 6.58f, 11.0801f)
                lineTo(14.58f, 3.0801f)
                curveTo(15.0877f, 2.5724f, 15.9108f, 2.5724f, 16.4184f, 3.0801f)
                close()
            }
        }
        .build()
        return _chevronleftthick!!
    }

private var _chevronleftthick: ImageVector? = null
