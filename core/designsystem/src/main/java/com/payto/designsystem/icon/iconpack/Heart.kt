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

public val IconPack.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9732f, 6.5558f)
                curveTo(9.5078f, 4.5211f, 6.7242f, 4.2129f, 4.8861f, 5.8535f)
                curveTo(3.0093f, 7.5286f, 2.8938f, 10.5324f, 4.6432f, 12.3598f)
                lineTo(12.0015f, 19.7784f)
                lineTo(19.3598f, 12.3598f)
                curveTo(21.1093f, 10.5324f, 20.9938f, 7.5286f, 19.117f, 5.8535f)
                curveTo(17.2789f, 4.2129f, 14.4953f, 4.5211f, 13.0299f, 6.5558f)
                lineTo(12.7318f, 6.9696f)
                curveTo(12.5627f, 7.2044f, 12.2909f, 7.3436f, 12.0015f, 7.3436f)
                curveTo(11.7121f, 7.3436f, 11.4404f, 7.2044f, 11.2713f, 6.9696f)
                lineTo(10.9732f, 6.5558f)
                close()
                moveTo(12.0015f, 4.9681f)
                curveTo(14.1691f, 2.567f, 17.8407f, 2.3017f, 20.3156f, 4.5106f)
                curveTo(22.9591f, 6.8701f, 23.1103f, 11.0531f, 20.6533f, 13.6116f)
                lineTo(20.6431f, 13.622f)
                lineTo(13.1715f, 21.1548f)
                curveTo(12.5278f, 21.8183f, 11.4753f, 21.8183f, 10.8315f, 21.1548f)
                lineTo(3.3599f, 13.622f)
                lineTo(3.3498f, 13.6116f)
                curveTo(0.8928f, 11.0531f, 1.044f, 6.8701f, 3.6875f, 4.5106f)
                curveTo(6.1623f, 2.3017f, 9.8341f, 2.567f, 12.0015f, 4.9681f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
