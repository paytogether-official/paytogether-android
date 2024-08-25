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

public val IconPack.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 5.1995f)
                curveTo(11.6737f, 4.7689f, 11.2751f, 4.4115f, 10.8379f, 4.1235f)
                curveTo(9.7085f, 3.3795f, 8.3373f, 3.1001f, 7.2516f, 3.1001f)
                curveTo(6.1658f, 3.1001f, 4.7947f, 3.3795f, 3.6652f, 4.1235f)
                curveTo(2.4954f, 4.8942f, 1.6016f, 6.1614f, 1.6016f, 8.0001f)
                verticalLineTo(20.4882f)
                curveTo(1.6016f, 21.4487f, 2.7624f, 21.8062f, 3.3488f, 21.1618f)
                curveTo(4.3149f, 20.1001f, 5.705f, 19.4357f, 7.2516f, 19.4357f)
                curveTo(8.8828f, 19.4357f, 10.3406f, 20.1751f, 11.3096f, 21.3403f)
                horizontalLineTo(12.6935f)
                curveTo(13.6639f, 20.1734f, 15.1224f, 19.4294f, 16.7516f, 19.4294f)
                curveTo(18.2981f, 19.4294f, 19.6882f, 20.0938f, 20.6543f, 21.1555f)
                curveTo(21.2407f, 21.7999f, 22.4016f, 21.4424f, 22.4016f, 20.4819f)
                verticalLineTo(8.0001f)
                curveTo(22.4016f, 6.1614f, 21.5078f, 4.8942f, 20.3379f, 4.1235f)
                curveTo(19.2085f, 3.3795f, 17.8373f, 3.1001f, 16.7516f, 3.1001f)
                curveTo(15.6658f, 3.1001f, 14.2946f, 3.3795f, 13.1652f, 4.1235f)
                curveTo(12.728f, 4.4115f, 12.3294f, 4.7689f, 12.0016f, 5.1995f)
                close()
                moveTo(4.6554f, 5.6267f)
                curveTo(3.9278f, 6.106f, 3.4016f, 6.8388f, 3.4016f, 8.0001f)
                verticalLineTo(18.7742f)
                curveTo(4.5094f, 18.0544f, 5.8319f, 17.6357f, 7.2516f, 17.6357f)
                curveTo(8.6714f, 17.6357f, 9.9938f, 18.0544f, 11.1016f, 18.7742f)
                verticalLineTo(8.0001f)
                curveTo(11.1016f, 6.8388f, 10.5753f, 6.106f, 9.8477f, 5.6267f)
                curveTo(9.0796f, 5.1207f, 8.0757f, 4.9001f, 7.2516f, 4.9001f)
                curveTo(6.4274f, 4.9001f, 5.4236f, 5.1207f, 4.6554f, 5.6267f)
                close()
                moveTo(12.9016f, 18.7724f)
                curveTo(14.0087f, 18.0512f, 15.3308f, 17.6294f, 16.7516f, 17.6294f)
                curveTo(18.1713f, 17.6294f, 19.4937f, 18.0481f, 20.6016f, 18.7678f)
                verticalLineTo(8.0001f)
                curveTo(20.6016f, 6.8388f, 20.0753f, 6.106f, 19.3477f, 5.6267f)
                curveTo(18.5796f, 5.1207f, 17.5757f, 4.9001f, 16.7516f, 4.9001f)
                curveTo(15.9274f, 4.9001f, 14.9236f, 5.1207f, 14.1554f, 5.6267f)
                curveTo(13.4278f, 6.106f, 12.9016f, 6.8388f, 12.9016f, 8.0001f)
                verticalLineTo(18.7724f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
