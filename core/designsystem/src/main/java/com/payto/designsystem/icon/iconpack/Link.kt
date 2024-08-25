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

public val IconPack.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.1214f, 5.8802f)
                curveTo(16.8144f, 4.5732f, 14.6956f, 4.5732f, 13.3886f, 5.8802f)
                lineTo(10.5002f, 8.7686f)
                lineTo(9.2274f, 7.4958f)
                lineTo(12.1159f, 4.6074f)
                curveTo(14.1257f, 2.5975f, 17.3843f, 2.5975f, 19.3941f, 4.6074f)
                curveTo(21.404f, 6.6172f, 21.404f, 9.8758f, 19.3941f, 11.8857f)
                lineTo(16.5057f, 14.7742f)
                lineTo(15.2329f, 13.5014f)
                lineTo(18.1214f, 10.6129f)
                curveTo(19.4283f, 9.306f, 19.4283f, 7.1871f, 18.1214f, 5.8802f)
                close()
                moveTo(15.7743f, 9.5f)
                lineTo(9.5016f, 15.7728f)
                lineTo(8.2288f, 14.5f)
                lineTo(14.5016f, 8.2272f)
                lineTo(15.7743f, 9.5f)
                close()
                moveTo(7.7744f, 11.5028f)
                lineTo(5.8817f, 13.3871f)
                curveTo(4.5753f, 14.694f, 4.575f, 16.813f, 5.8817f, 18.1198f)
                curveTo(7.1884f, 19.4265f, 9.3068f, 19.4267f, 10.6138f, 18.1205f)
                lineTo(12.4988f, 16.2272f)
                lineTo(13.7743f, 17.4972f)
                lineTo(11.8886f, 19.3912f)
                lineTo(11.8873f, 19.3926f)
                curveTo(9.8774f, 21.4024f, 6.6188f, 21.4024f, 4.6089f, 19.3926f)
                curveTo(2.5991f, 17.3827f, 2.5991f, 14.1242f, 4.6089f, 12.1143f)
                lineTo(6.5044f, 10.2272f)
                lineTo(7.7744f, 11.5028f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
