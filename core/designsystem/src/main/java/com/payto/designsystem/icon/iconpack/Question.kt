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

public val IconPack.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2111f, 4.5205f)
                curveTo(13.4645f, 4.1691f, 12.6358f, 4.0026f, 11.8047f, 4.0337f)
                curveTo(10.9736f, 4.0647f, 10.1611f, 4.2925f, 9.4457f, 4.6997f)
                curveTo(8.7301f, 5.1072f, 8.1323f, 5.683f, 7.718f, 6.3781f)
                curveTo(7.2994f, 7.0804f, 7.1015f, 7.8466f, 7.1016f, 8.6522f)
                lineTo(8.9016f, 8.6521f)
                curveTo(8.9015f, 8.1534f, 9.0205f, 7.7085f, 9.2642f, 7.2997f)
                curveTo(9.5121f, 6.8837f, 9.8789f, 6.5245f, 10.3364f, 6.264f)
                curveTo(10.7942f, 6.0033f, 11.3233f, 5.8529f, 11.8719f, 5.8324f)
                curveTo(12.4206f, 5.812f, 12.9627f, 5.9223f, 13.4445f, 6.1491f)
                curveTo(13.9261f, 6.3758f, 14.3261f, 6.7085f, 14.6121f, 7.1074f)
                curveTo(14.8976f, 7.5055f, 15.0611f, 7.9575f, 15.0946f, 8.419f)
                curveTo(15.1282f, 8.8803f, 15.0315f, 9.345f, 14.8088f, 9.7696f)
                curveTo(14.5867f, 10.1929f, 14.2446f, 10.5658f, 13.8072f, 10.8462f)
                curveTo(12.999f, 11.3412f, 12.3212f, 12.008f, 11.8343f, 12.7982f)
                curveTo(11.3454f, 13.5916f, 11.0642f, 14.4851f, 11.0189f, 15.4058f)
                lineTo(11.0178f, 15.4278f)
                verticalLineTo(15.93f)
                horizontalLineTo(12.8178f)
                verticalLineTo(15.4733f)
                curveTo(12.851f, 14.8699f, 13.0371f, 14.2774f, 13.3667f, 13.7425f)
                curveTo(13.7004f, 13.2008f, 14.1734f, 12.7314f, 14.7532f, 12.3776f)
                lineTo(14.7606f, 12.373f)
                lineTo(14.768f, 12.3683f)
                curveTo(15.4613f, 11.9264f, 16.0273f, 11.3215f, 16.4027f, 10.6058f)
                curveTo(16.7786f, 9.8894f, 16.9482f, 9.0905f, 16.8899f, 8.2884f)
                curveTo(16.8315f, 7.4865f, 16.5481f, 6.7184f, 16.075f, 6.0585f)
                curveTo(15.6023f, 5.3993f, 14.958f, 4.8721f, 14.2111f, 4.5205f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9992f, 19.9763f)
                curveTo(12.662f, 19.9763f, 13.1992f, 19.439f, 13.1992f, 18.7763f)
                curveTo(13.1992f, 18.1135f, 12.662f, 17.5763f, 11.9992f, 17.5763f)
                curveTo(11.3365f, 17.5763f, 10.7992f, 18.1135f, 10.7992f, 18.7763f)
                curveTo(10.7992f, 19.439f, 11.3365f, 19.9763f, 11.9992f, 19.9763f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
