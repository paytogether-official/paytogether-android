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

public val IconPack.Listcategory: ImageVector
    get() {
        if (_listcategory != null) {
            return _listcategory!!
        }
        _listcategory = Builder(name = "Listcategory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.125f, 6.0f)
                curveTo(3.125f, 5.5167f, 3.5168f, 5.125f, 4.0f, 5.125f)
                horizontalLineTo(20.0f)
                curveTo(20.4832f, 5.125f, 20.875f, 5.5167f, 20.875f, 6.0f)
                curveTo(20.875f, 6.4833f, 20.4832f, 6.875f, 20.0f, 6.875f)
                horizontalLineTo(4.0f)
                curveTo(3.5168f, 6.875f, 3.125f, 6.4833f, 3.125f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.125f, 18.0f)
                curveTo(3.125f, 17.5168f, 3.5168f, 17.125f, 4.0f, 17.125f)
                horizontalLineTo(14.0f)
                curveTo(14.4832f, 17.125f, 14.875f, 17.5168f, 14.875f, 18.0f)
                curveTo(14.875f, 18.4832f, 14.4832f, 18.875f, 14.0f, 18.875f)
                horizontalLineTo(4.0f)
                curveTo(3.5168f, 18.875f, 3.125f, 18.4832f, 3.125f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.125f)
                curveTo(3.5168f, 11.125f, 3.125f, 11.5168f, 3.125f, 12.0f)
                curveTo(3.125f, 12.4832f, 3.5168f, 12.875f, 4.0f, 12.875f)
                horizontalLineTo(20.0f)
                curveTo(20.4832f, 12.875f, 20.875f, 12.4832f, 20.875f, 12.0f)
                curveTo(20.875f, 11.5168f, 20.4832f, 11.125f, 20.0f, 11.125f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _listcategory!!
    }

private var _listcategory: ImageVector? = null
