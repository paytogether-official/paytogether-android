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

public val IconPack.Sendfill: ImageVector
    get() {
        if (_sendfill != null) {
            return _sendfill!!
        }
        _sendfill = Builder(name = "Sendfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0476f, 4.8672f)
                curveTo(3.6254f, 3.9346f, 4.5945f, 2.9815f, 5.52f, 3.4192f)
                lineTo(21.5154f, 10.9835f)
                curveTo(22.3551f, 11.3806f, 22.355f, 12.5754f, 21.5152f, 12.9724f)
                lineTo(5.4257f, 20.5779f)
                curveTo(4.4961f, 21.0174f, 3.5255f, 20.0547f, 3.9573f, 19.1215f)
                lineTo(7.265f, 11.9738f)
                lineTo(4.0476f, 4.8672f)
                close()
                moveTo(19.4075f, 11.9777f)
                lineTo(6.4015f, 18.1257f)
                lineTo(8.8197f, 12.9f)
                horizontalLineTo(14.0325f)
                verticalLineTo(11.1f)
                horizontalLineTo(8.8452f)
                lineTo(6.4735f, 5.8612f)
                lineTo(19.4075f, 11.9777f)
                close()
            }
        }
        .build()
        return _sendfill!!
    }

private var _sendfill: ImageVector? = null
