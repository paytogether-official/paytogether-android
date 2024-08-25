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

public val IconPack.Verifiedcheckfill: ImageVector
    get() {
        if (_verifiedcheckfill != null) {
            return _verifiedcheckfill!!
        }
        _verifiedcheckfill = Builder(name = "Verifiedcheckfill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.027f, 2.4269f)
                curveTo(11.1127f, 1.3248f, 12.8905f, 1.3248f, 13.9762f, 2.4269f)
                lineTo(15.0891f, 3.5567f)
                curveTo(15.2737f, 3.744f, 15.5261f, 3.8485f, 15.7888f, 3.8465f)
                lineTo(17.3747f, 3.8346f)
                curveTo(18.9217f, 3.8231f, 20.1787f, 5.0802f, 20.1672f, 6.6272f)
                lineTo(20.1554f, 8.2131f)
                curveTo(20.1534f, 8.4759f, 20.258f, 8.7283f, 20.4452f, 8.9127f)
                lineTo(21.575f, 10.0257f)
                curveTo(22.6771f, 11.1115f, 22.6771f, 12.8893f, 21.575f, 13.975f)
                lineTo(20.4452f, 15.0879f)
                curveTo(20.258f, 15.2724f, 20.1534f, 15.5249f, 20.1554f, 15.7877f)
                lineTo(20.1672f, 17.3735f)
                curveTo(20.1787f, 18.9205f, 18.9217f, 20.1775f, 17.3747f, 20.166f)
                lineTo(15.7888f, 20.1541f)
                curveTo(15.526f, 20.1522f, 15.2736f, 20.2568f, 15.0891f, 20.444f)
                lineTo(13.9762f, 21.5738f)
                curveTo(12.8904f, 22.6759f, 11.1127f, 22.6759f, 10.027f, 21.5738f)
                lineTo(8.9139f, 20.444f)
                curveTo(8.7295f, 20.2568f, 8.4771f, 20.1522f, 8.2142f, 20.1541f)
                lineTo(6.6284f, 20.166f)
                curveTo(5.0814f, 20.1775f, 3.8243f, 18.9205f, 3.8359f, 17.3735f)
                lineTo(3.8477f, 15.7876f)
                curveTo(3.8497f, 15.5249f, 3.7451f, 15.2724f, 3.5579f, 15.0879f)
                lineTo(2.4281f, 13.975f)
                curveTo(1.326f, 12.8892f, 1.326f, 11.1115f, 2.4281f, 10.0257f)
                lineTo(3.5579f, 8.9127f)
                curveTo(3.7451f, 8.7283f, 3.8497f, 8.4759f, 3.8477f, 8.2131f)
                lineTo(3.8359f, 6.6272f)
                curveTo(3.8243f, 5.0801f, 5.0813f, 3.8231f, 6.6284f, 3.8346f)
                lineTo(8.2143f, 3.8465f)
                curveTo(8.4771f, 3.8485f, 8.7295f, 3.7439f, 8.9139f, 3.5567f)
                lineTo(10.027f, 2.4269f)
                close()
                moveTo(15.3763f, 8.853f)
                lineTo(16.6268f, 10.1477f)
                lineTo(10.8251f, 15.7516f)
                lineTo(7.3763f, 12.4204f)
                lineTo(8.6268f, 11.1257f)
                lineTo(10.8251f, 13.249f)
                lineTo(15.3763f, 8.853f)
                close()
            }
        }
        .build()
        return _verifiedcheckfill!!
    }

private var _verifiedcheckfill: ImageVector? = null
