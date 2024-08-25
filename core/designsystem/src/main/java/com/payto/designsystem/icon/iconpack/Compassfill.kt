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

public val IconPack.Compassfill: ImageVector
    get() {
        if (_compassfill != null) {
            return _compassfill!!
        }
        _compassfill = Builder(name = "Compassfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.8173f, 8.3808f)
                curveTo(16.9773f, 8.0379f, 16.9057f, 7.6314f, 16.6381f, 7.3638f)
                curveTo(16.3705f, 7.0962f, 15.964f, 7.0246f, 15.6211f, 7.1847f)
                lineTo(10.1665f, 9.7301f)
                curveTo(9.975f, 9.8195f, 9.821f, 9.9735f, 9.7316f, 10.1651f)
                lineTo(7.1861f, 15.6196f)
                curveTo(7.0261f, 15.9626f, 7.0977f, 16.369f, 7.3653f, 16.6366f)
                curveTo(7.6329f, 16.9042f, 8.0393f, 16.9758f, 8.3823f, 16.8158f)
                lineTo(13.8368f, 14.2703f)
                curveTo(14.0284f, 14.1809f, 14.1824f, 14.0269f, 14.2718f, 13.8354f)
                lineTo(16.8173f, 8.3808f)
                close()
                moveTo(13.0017f, 12.0002f)
                curveTo(13.0017f, 12.5525f, 12.554f, 13.0002f, 12.0017f, 13.0002f)
                curveTo(11.4494f, 13.0002f, 11.0017f, 12.5525f, 11.0017f, 12.0002f)
                curveTo(11.0017f, 11.4479f, 11.4494f, 11.0002f, 12.0017f, 11.0002f)
                curveTo(12.554f, 11.0002f, 13.0017f, 11.4479f, 13.0017f, 12.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.1001f)
                curveTo(6.5339f, 2.1001f, 2.1016f, 6.5325f, 2.1016f, 12.0001f)
                curveTo(2.1016f, 17.4677f, 6.5339f, 21.9001f, 12.0016f, 21.9001f)
                curveTo(17.4692f, 21.9001f, 21.9016f, 17.4677f, 21.9016f, 12.0001f)
                curveTo(21.9016f, 6.5325f, 17.4692f, 2.1001f, 12.0016f, 2.1001f)
                close()
                moveTo(3.9016f, 12.0001f)
                curveTo(3.9016f, 7.5266f, 7.5281f, 3.9001f, 12.0016f, 3.9001f)
                curveTo(16.4751f, 3.9001f, 20.1016f, 7.5266f, 20.1016f, 12.0001f)
                curveTo(20.1016f, 16.4736f, 16.4751f, 20.1001f, 12.0016f, 20.1001f)
                curveTo(7.5281f, 20.1001f, 3.9016f, 16.4736f, 3.9016f, 12.0001f)
                close()
            }
        }
        .build()
        return _compassfill!!
    }

private var _compassfill: ImageVector? = null
