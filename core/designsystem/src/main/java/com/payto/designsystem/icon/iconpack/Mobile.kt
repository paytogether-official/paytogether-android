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

public val IconPack.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.9162f, 1.8506f)
                horizontalLineTo(9.9516f)
                horizontalLineTo(14.0516f)
                horizontalLineTo(14.087f)
                horizontalLineTo(14.087f)
                horizontalLineTo(14.087f)
                curveTo(14.6169f, 1.8506f, 15.068f, 1.8506f, 15.4384f, 1.8808f)
                curveTo(15.8276f, 1.9126f, 16.2062f, 1.9823f, 16.5681f, 2.1667f)
                curveTo(17.1138f, 2.4447f, 17.5574f, 2.8884f, 17.8355f, 3.434f)
                curveTo(18.0199f, 3.7959f, 18.0895f, 4.1745f, 18.1213f, 4.5637f)
                curveTo(18.1516f, 4.9341f, 18.1516f, 5.3853f, 18.1516f, 5.9152f)
                verticalLineTo(5.9506f)
                verticalLineTo(18.0506f)
                verticalLineTo(18.086f)
                curveTo(18.1516f, 18.6159f, 18.1516f, 19.067f, 18.1213f, 19.4375f)
                curveTo(18.0895f, 19.8266f, 18.0199f, 20.2052f, 17.8355f, 20.5672f)
                curveTo(17.5574f, 21.1128f, 17.1138f, 21.5565f, 16.5681f, 21.8345f)
                curveTo(16.2062f, 22.0189f, 15.8276f, 22.0886f, 15.4384f, 22.1203f)
                curveTo(15.068f, 22.1506f, 14.6169f, 22.1506f, 14.087f, 22.1506f)
                horizontalLineTo(14.087f)
                horizontalLineTo(14.087f)
                horizontalLineTo(14.0516f)
                horizontalLineTo(9.9516f)
                horizontalLineTo(9.9162f)
                horizontalLineTo(9.9161f)
                horizontalLineTo(9.9161f)
                curveTo(9.3863f, 22.1506f, 8.9351f, 22.1506f, 8.5647f, 22.1203f)
                curveTo(8.1755f, 22.0886f, 7.7969f, 22.0189f, 7.435f, 21.8345f)
                curveTo(6.8893f, 21.5565f, 6.4457f, 21.1128f, 6.1677f, 20.5672f)
                curveTo(5.9832f, 20.2052f, 5.9136f, 19.8266f, 5.8818f, 19.4375f)
                curveTo(5.8515f, 19.0671f, 5.8516f, 18.6159f, 5.8516f, 18.086f)
                verticalLineTo(18.086f)
                verticalLineTo(18.086f)
                verticalLineTo(18.0506f)
                verticalLineTo(5.9506f)
                verticalLineTo(5.9152f)
                verticalLineTo(5.9152f)
                verticalLineTo(5.9151f)
                curveTo(5.8516f, 5.3853f, 5.8515f, 4.9341f, 5.8818f, 4.5637f)
                curveTo(5.9136f, 4.1745f, 5.9832f, 3.7959f, 6.1677f, 3.434f)
                curveTo(6.4457f, 2.8884f, 6.8893f, 2.4447f, 7.435f, 2.1667f)
                curveTo(7.7969f, 1.9823f, 8.1755f, 1.9126f, 8.5647f, 1.8808f)
                curveTo(8.9351f, 1.8506f, 9.3863f, 1.8506f, 9.9161f, 1.8506f)
                horizontalLineTo(9.9161f)
                horizontalLineTo(9.9162f)
                close()
                moveTo(10.0017f, 18.325f)
                curveTo(9.6289f, 18.325f, 9.3267f, 18.6272f, 9.3267f, 19.0f)
                curveTo(9.3267f, 19.3728f, 9.6289f, 19.675f, 10.0017f, 19.675f)
                horizontalLineTo(14.0017f)
                curveTo(14.3745f, 19.675f, 14.6767f, 19.3728f, 14.6767f, 19.0f)
                curveTo(14.6767f, 18.6272f, 14.3745f, 18.325f, 14.0017f, 18.325f)
                horizontalLineTo(10.0017f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
