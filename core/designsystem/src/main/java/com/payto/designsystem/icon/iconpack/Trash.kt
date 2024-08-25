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

public val IconPack.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 3.3992f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.5992f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.3992f)
                close()
                moveTo(21.0f, 6.8996f)
                horizontalLineTo(19.6506f)
                lineTo(19.6506f, 19.4294f)
                curveTo(19.6506f, 19.6837f, 19.6506f, 19.9258f, 19.634f, 20.1297f)
                curveTo(19.6158f, 20.3521f, 19.5734f, 20.6072f, 19.4435f, 20.8622f)
                curveTo(19.2613f, 21.2197f, 18.9707f, 21.5104f, 18.6132f, 21.6926f)
                curveTo(18.3582f, 21.8225f, 18.1031f, 21.8649f, 17.8807f, 21.883f)
                curveTo(17.6767f, 21.8997f, 17.4347f, 21.8997f, 17.1804f, 21.8996f)
                horizontalLineTo(6.8208f)
                curveTo(6.5665f, 21.8997f, 6.3245f, 21.8997f, 6.1205f, 21.883f)
                curveTo(5.8981f, 21.8649f, 5.643f, 21.8225f, 5.388f, 21.6926f)
                curveTo(5.0305f, 21.5104f, 4.7398f, 21.2197f, 4.5577f, 20.8622f)
                curveTo(4.4278f, 20.6072f, 4.3854f, 20.3521f, 4.3672f, 20.1297f)
                curveTo(4.3505f, 19.9258f, 4.3506f, 19.6837f, 4.3506f, 19.4294f)
                lineTo(4.3506f, 6.8996f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0996f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.8996f)
                close()
                moveTo(6.1498f, 6.8996f)
                horizontalLineTo(17.8498f)
                verticalLineTo(19.9991f)
                curveTo(17.8498f, 20.0543f, 17.805f, 20.0991f, 17.7498f, 20.0991f)
                horizontalLineTo(6.2498f)
                curveTo(6.1945f, 20.0991f, 6.1498f, 20.0543f, 6.1498f, 19.9991f)
                verticalLineTo(6.8996f)
                close()
                moveTo(13.1f, 16.4996f)
                verticalLineTo(10.4996f)
                horizontalLineTo(14.9f)
                verticalLineTo(16.4996f)
                horizontalLineTo(13.1f)
                close()
                moveTo(9.1f, 10.4996f)
                verticalLineTo(16.4996f)
                horizontalLineTo(10.9f)
                verticalLineTo(10.4996f)
                horizontalLineTo(9.1f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
