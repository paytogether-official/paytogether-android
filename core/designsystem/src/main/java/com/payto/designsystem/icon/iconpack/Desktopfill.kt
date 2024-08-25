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

public val IconPack.Desktopfill: ImageVector
    get() {
        if (_desktopfill != null) {
            return _desktopfill!!
        }
        _desktopfill = Builder(name = "Desktopfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.3179f, 3.1f)
                curveTo(4.0636f, 3.1f, 3.8215f, 3.1f, 3.6176f, 3.1166f)
                curveTo(3.3952f, 3.1348f, 3.14f, 3.1772f, 2.8851f, 3.3071f)
                curveTo(2.5276f, 3.4893f, 2.2369f, 3.7799f, 2.0547f, 4.1374f)
                curveTo(1.9248f, 4.3924f, 1.8824f, 4.6475f, 1.8643f, 4.8699f)
                curveTo(1.8476f, 5.0739f, 1.8476f, 5.3159f, 1.8477f, 5.5703f)
                verticalLineTo(14.9298f)
                curveTo(1.8476f, 15.1841f, 1.8476f, 15.4261f, 1.8643f, 15.6301f)
                curveTo(1.8824f, 15.8525f, 1.9248f, 16.1076f, 2.0547f, 16.3626f)
                curveTo(2.2369f, 16.7201f, 2.5276f, 17.0108f, 2.8851f, 17.1929f)
                curveTo(3.14f, 17.3228f, 3.3952f, 17.3652f, 3.6176f, 17.3834f)
                curveTo(3.8215f, 17.4001f, 4.0636f, 17.4f, 4.3179f, 17.4f)
                lineTo(11.1002f, 17.4f)
                verticalLineTo(19.6f)
                horizontalLineTo(5.9998f)
                verticalLineTo(21.4f)
                horizontalLineTo(17.9998f)
                verticalLineTo(19.6f)
                horizontalLineTo(12.9002f)
                verticalLineTo(17.4f)
                lineTo(19.6774f, 17.4f)
                curveTo(19.9317f, 17.4f, 20.1738f, 17.4001f, 20.3777f, 17.3834f)
                curveTo(20.6001f, 17.3652f, 20.8552f, 17.3228f, 21.1102f, 17.1929f)
                curveTo(21.4677f, 17.0108f, 21.7584f, 16.7201f, 21.9406f, 16.3626f)
                curveTo(22.0705f, 16.1076f, 22.1129f, 15.8525f, 22.131f, 15.6301f)
                curveTo(22.1477f, 15.4261f, 22.1477f, 15.1841f, 22.1476f, 14.9298f)
                verticalLineTo(5.5703f)
                curveTo(22.1477f, 5.3159f, 22.1477f, 5.0739f, 22.131f, 4.8699f)
                curveTo(22.1129f, 4.6475f, 22.0705f, 4.3924f, 21.9406f, 4.1374f)
                curveTo(21.7584f, 3.7799f, 21.4677f, 3.4893f, 21.1102f, 3.3071f)
                curveTo(20.8552f, 3.1772f, 20.6001f, 3.1348f, 20.3777f, 3.1166f)
                curveTo(20.1738f, 3.1f, 19.9317f, 3.1f, 19.6774f, 3.1f)
                horizontalLineTo(4.3179f)
                close()
            }
        }
        .build()
        return _desktopfill!!
    }

private var _desktopfill: ImageVector? = null
