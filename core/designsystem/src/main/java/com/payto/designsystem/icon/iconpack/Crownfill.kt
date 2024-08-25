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

public val IconPack.Crownfill: ImageVector
    get() {
        if (_crownfill != null) {
            return _crownfill!!
        }
        _crownfill = Builder(name = "Crownfill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0016f, 2.5996f)
                curveTo(12.3431f, 2.5996f, 12.6552f, 2.7929f, 12.8074f, 3.0987f)
                lineTo(15.2027f, 7.9125f)
                lineTo(20.569f, 4.9713f)
                curveTo(20.8771f, 4.8024f, 21.2554f, 4.8282f, 21.5376f, 5.0375f)
                curveTo(21.8199f, 5.2468f, 21.9545f, 5.6011f, 21.8825f, 5.945f)
                lineTo(19.6325f, 16.6842f)
                curveTo(19.5451f, 17.101f, 19.1775f, 17.3996f, 18.7516f, 17.3996f)
                horizontalLineTo(5.2516f)
                curveTo(4.8257f, 17.3996f, 4.4581f, 17.101f, 4.3707f, 16.6842f)
                lineTo(2.1207f, 5.945f)
                curveTo(2.0487f, 5.6011f, 2.1833f, 5.2468f, 2.4656f, 5.0375f)
                curveTo(2.7478f, 4.8282f, 3.126f, 4.8024f, 3.4342f, 4.9713f)
                lineTo(8.8005f, 7.9125f)
                lineTo(11.1958f, 3.0987f)
                curveTo(11.348f, 2.7929f, 11.6601f, 2.5996f, 12.0016f, 2.5996f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6016f, 19.9996f)
                curveTo(4.6016f, 19.5026f, 5.0045f, 19.0996f, 5.5016f, 19.0996f)
                horizontalLineTo(18.5016f)
                curveTo(18.9987f, 19.0996f, 19.4016f, 19.5026f, 19.4016f, 19.9996f)
                curveTo(19.4016f, 20.4967f, 18.9987f, 20.8996f, 18.5016f, 20.8996f)
                horizontalLineTo(5.5016f)
                curveTo(5.0045f, 20.8996f, 4.6016f, 20.4967f, 4.6016f, 19.9996f)
                close()
            }
        }
        .build()
        return _crownfill!!
    }

private var _crownfill: ImageVector? = null
