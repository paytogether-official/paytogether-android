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

public val IconPack.Bookfill: ImageVector
    get() {
        if (_bookfill != null) {
            return _bookfill!!
        }
        _bookfill = Builder(name = "Bookfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9144f, 4.8437f)
                curveTo(3.9846f, 4.2322f, 5.228f, 4.1001f, 6.0484f, 4.1001f)
                curveTo(6.8693f, 4.1001f, 8.0888f, 4.2328f, 9.1384f, 4.7576f)
                curveTo(10.2375f, 5.3071f, 11.1984f, 6.3273f, 11.1984f, 8.0001f)
                verticalLineTo(20.0001f)
                lineTo(9.6065f, 20.5756f)
                curveTo(8.7567f, 19.5537f, 7.4787f, 18.9056f, 6.0484f, 18.9056f)
                curveTo(4.751f, 18.9056f, 3.5797f, 19.4387f, 2.7387f, 20.3001f)
                lineTo(2.7287f, 20.3104f)
                curveTo(2.6888f, 20.3513f, 2.6281f, 20.4136f, 2.5712f, 20.4636f)
                curveTo(2.5382f, 20.4926f, 2.479f, 20.5424f, 2.4009f, 20.5892f)
                curveTo(2.3248f, 20.6349f, 2.1807f, 20.7085f, 1.9853f, 20.7255f)
                curveTo(1.6636f, 20.7536f, 1.351f, 20.6263f, 1.1404f, 20.3815f)
                curveTo(0.9267f, 20.1331f, 0.9079f, 19.8439f, 0.9046f, 19.7937f)
                lineTo(0.9043f, 19.7885f)
                curveTo(0.8983f, 19.7129f, 0.8984f, 19.6265f, 0.8984f, 19.5715f)
                lineTo(0.8985f, 8.5001f)
                curveTo(0.8985f, 6.6571f, 1.7768f, 5.4938f, 2.9144f, 4.8437f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0824f, 4.8437f)
                curveTo(20.0122f, 4.2322f, 18.7688f, 4.1001f, 17.9484f, 4.1001f)
                curveTo(17.1275f, 4.1001f, 15.908f, 4.2328f, 14.8584f, 4.7576f)
                curveTo(13.7593f, 5.3071f, 12.7984f, 6.3273f, 12.7984f, 8.0001f)
                verticalLineTo(20.0001f)
                lineTo(14.3903f, 20.5756f)
                curveTo(15.2401f, 19.5537f, 16.5182f, 18.9056f, 17.9484f, 18.9056f)
                curveTo(19.2458f, 18.9056f, 20.4171f, 19.4387f, 21.2581f, 20.3001f)
                lineTo(21.2681f, 20.3104f)
                curveTo(21.308f, 20.3513f, 21.3687f, 20.4136f, 21.4256f, 20.4636f)
                curveTo(21.4587f, 20.4926f, 21.5178f, 20.5424f, 21.5959f, 20.5892f)
                curveTo(21.672f, 20.6349f, 21.8161f, 20.7085f, 22.0115f, 20.7255f)
                curveTo(22.3332f, 20.7536f, 22.6458f, 20.6263f, 22.8564f, 20.3815f)
                curveTo(23.0701f, 20.1331f, 23.0889f, 19.8439f, 23.0922f, 19.7937f)
                lineTo(23.0925f, 19.7885f)
                curveTo(23.0985f, 19.7129f, 23.0984f, 19.6265f, 23.0984f, 19.5715f)
                lineTo(23.0983f, 8.5001f)
                curveTo(23.0983f, 6.6571f, 22.22f, 5.4938f, 21.0824f, 4.8437f)
                close()
            }
        }
        .build()
        return _bookfill!!
    }

private var _bookfill: ImageVector? = null
