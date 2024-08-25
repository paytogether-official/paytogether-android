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

public val IconPack.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.6f)
                curveTo(12.3431f, 2.6f, 12.6552f, 2.7933f, 12.8074f, 3.099f)
                lineTo(15.2027f, 7.9128f)
                lineTo(20.569f, 4.9716f)
                curveTo(20.8771f, 4.8027f, 21.2554f, 4.8286f, 21.5376f, 5.0379f)
                curveTo(21.8199f, 5.2471f, 21.9545f, 5.6015f, 21.8825f, 5.9454f)
                lineTo(19.6325f, 16.6845f)
                curveTo(19.5451f, 17.1014f, 19.1775f, 17.4f, 18.7516f, 17.4f)
                horizontalLineTo(5.2516f)
                curveTo(4.8257f, 17.4f, 4.4581f, 17.1014f, 4.3707f, 16.6845f)
                lineTo(2.1207f, 5.9454f)
                curveTo(2.0487f, 5.6015f, 2.1833f, 5.2471f, 2.4656f, 5.0379f)
                curveTo(2.7478f, 4.8286f, 3.126f, 4.8027f, 3.4342f, 4.9716f)
                lineTo(8.8005f, 7.9128f)
                lineTo(11.1958f, 3.099f)
                curveTo(11.348f, 2.7933f, 11.6601f, 2.6f, 12.0016f, 2.6f)
                close()
                moveTo(12.0016f, 5.5202f)
                lineTo(9.9949f, 9.5531f)
                curveTo(9.8858f, 9.7723f, 9.692f, 9.9376f, 9.4584f, 10.0109f)
                curveTo(9.2247f, 10.0842f, 8.9713f, 10.0591f, 8.7565f, 9.9414f)
                lineTo(4.2833f, 7.4897f)
                lineTo(5.9826f, 15.6f)
                horizontalLineTo(18.0206f)
                lineTo(19.7198f, 7.4897f)
                lineTo(15.2467f, 9.9414f)
                curveTo(15.0319f, 10.0591f, 14.7785f, 10.0842f, 14.5448f, 10.0109f)
                curveTo(14.3112f, 9.9376f, 14.1174f, 9.7723f, 14.0083f, 9.5531f)
                lineTo(12.0016f, 5.5202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6016f, 20.0f)
                curveTo(4.6016f, 19.5029f, 5.0045f, 19.1f, 5.5016f, 19.1f)
                horizontalLineTo(18.5016f)
                curveTo(18.9987f, 19.1f, 19.4016f, 19.5029f, 19.4016f, 20.0f)
                curveTo(19.4016f, 20.497f, 18.9987f, 20.9f, 18.5016f, 20.9f)
                horizontalLineTo(5.5016f)
                curveTo(5.0045f, 20.9f, 4.6016f, 20.497f, 4.6016f, 20.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
