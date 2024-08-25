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

public val IconPack.Graduation: ImageVector
    get() {
        if (_graduation != null) {
            return _graduation!!
        }
        _graduation = Builder(name = "Graduation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0015f, 4.9455f)
                lineTo(3.6247f, 9.4996f)
                lineTo(12.0015f, 14.0547f)
                lineTo(20.3783f, 9.5006f)
                lineTo(12.0015f, 4.9455f)
                close()
                moveTo(11.2971f, 3.2796f)
                curveTo(11.5118f, 3.1631f, 11.7533f, 3.1001f, 12.0015f, 3.1001f)
                curveTo(12.2497f, 3.1001f, 12.4911f, 3.1631f, 12.7059f, 3.2796f)
                lineTo(21.5913f, 8.1114f)
                curveTo(21.8477f, 8.2509f, 22.0531f, 8.4597f, 22.1921f, 8.7044f)
                curveTo(22.3267f, 8.9412f, 22.397f, 9.2074f, 22.4012f, 9.4754f)
                curveTo(22.4014f, 9.4837f, 22.4015f, 9.4921f, 22.4015f, 9.5005f)
                verticalLineTo(15.5005f)
                horizontalLineTo(20.6016f)
                verticalLineTo(11.428f)
                lineTo(18.8904f, 12.3583f)
                curveTo(18.8978f, 12.4046f, 18.9016f, 12.4521f, 18.9016f, 12.5005f)
                verticalLineTo(18.0005f)
                curveTo(18.9016f, 18.3414f, 18.709f, 18.653f, 18.4041f, 18.8055f)
                lineTo(12.4041f, 21.8055f)
                curveTo(12.1507f, 21.9322f, 11.8525f, 21.9322f, 11.5991f, 21.8055f)
                lineTo(5.5992f, 18.8055f)
                curveTo(5.2943f, 18.653f, 5.1017f, 18.3414f, 5.1017f, 18.0005f)
                verticalLineTo(12.5005f)
                curveTo(5.1017f, 12.4519f, 5.1055f, 12.4042f, 5.1129f, 12.3577f)
                lineTo(2.4116f, 10.8888f)
                curveTo(2.1553f, 10.7493f, 1.9498f, 10.5405f, 1.8108f, 10.2958f)
                curveTo(1.6721f, 10.0515f, 1.6016f, 9.776f, 1.6016f, 9.4995f)
                curveTo(1.6016f, 9.223f, 1.6721f, 8.9476f, 1.8108f, 8.7032f)
                curveTo(1.9498f, 8.4585f, 2.1548f, 8.2501f, 2.4112f, 8.1105f)
                lineTo(11.2971f, 3.2796f)
                close()
                moveTo(12.7063f, 15.7203f)
                lineTo(17.1016f, 13.3308f)
                verticalLineTo(17.4443f)
                lineTo(12.0016f, 19.9943f)
                lineTo(6.9017f, 17.4443f)
                verticalLineTo(13.3304f)
                lineTo(11.2965f, 15.7203f)
                curveTo(11.5113f, 15.8368f, 11.7532f, 15.9001f, 12.0015f, 15.9001f)
                curveTo(12.2497f, 15.9001f, 12.4916f, 15.8369f, 12.7063f, 15.7203f)
                close()
            }
        }
        .build()
        return _graduation!!
    }

private var _graduation: ImageVector? = null
