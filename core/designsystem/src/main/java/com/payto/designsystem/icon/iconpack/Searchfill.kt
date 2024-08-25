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

public val IconPack.Searchfill: ImageVector
    get() {
        if (_searchfill != null) {
            return _searchfill!!
        }
        _searchfill = Builder(name = "Searchfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9992f, 1.7f)
                curveTo(5.4152f, 1.7f, 1.6992f, 5.416f, 1.6992f, 10.0f)
                curveTo(1.6992f, 14.584f, 5.4152f, 18.3f, 9.9992f, 18.3f)
                curveTo(11.8221f, 18.3f, 13.5078f, 17.7124f, 14.877f, 16.7161f)
                lineTo(19.5801f, 21.4192f)
                curveTo(20.0878f, 21.9269f, 20.9109f, 21.9269f, 21.4186f, 21.4192f)
                curveTo(21.9263f, 20.9115f, 21.9263f, 20.0884f, 21.4186f, 19.5807f)
                lineTo(16.7155f, 14.8776f)
                curveTo(17.7116f, 13.5084f, 18.2992f, 11.8228f, 18.2992f, 10.0f)
                curveTo(18.2992f, 5.416f, 14.5832f, 1.7f, 9.9992f, 1.7f)
                close()
                moveTo(4.2992f, 10.0f)
                curveTo(4.2992f, 6.852f, 6.8512f, 4.3f, 9.9992f, 4.3f)
                curveTo(13.1472f, 4.3f, 15.6992f, 6.852f, 15.6992f, 10.0f)
                curveTo(15.6992f, 13.148f, 13.1472f, 15.7f, 9.9992f, 15.7f)
                curveTo(6.8512f, 15.7f, 4.2992f, 13.148f, 4.2992f, 10.0f)
                close()
            }
        }
        .build()
        return _searchfill!!
    }

private var _searchfill: ImageVector? = null
