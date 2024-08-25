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

public val IconPack.Tune: ImageVector
    get() {
        if (_tune != null) {
            return _tune!!
        }
        _tune = Builder(name = "Tune", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 6.3f)
                curveTo(13.5611f, 6.3f, 12.8f, 7.0611f, 12.8f, 8.0f)
                curveTo(12.8f, 8.9389f, 13.5611f, 9.7f, 14.5f, 9.7f)
                curveTo(15.4388f, 9.7f, 16.2f, 8.9389f, 16.2f, 8.0f)
                curveTo(16.2f, 7.0611f, 15.4388f, 6.3f, 14.5f, 6.3f)
                close()
                moveTo(3.0001f, 9.0f)
                horizontalLineTo(11.1449f)
                curveTo(11.5752f, 10.4457f, 12.9144f, 11.5f, 14.5f, 11.5f)
                curveTo(16.0855f, 11.5f, 17.4248f, 10.4457f, 17.855f, 9.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(7.2f)
                horizontalLineTo(17.9081f)
                curveTo(17.5463f, 5.6525f, 16.1577f, 4.5f, 14.5f, 4.5f)
                curveTo(12.8422f, 4.5f, 11.4537f, 5.6525f, 11.0918f, 7.2f)
                horizontalLineTo(3.0001f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.855f, 17.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(15.2f)
                horizontalLineTo(12.9081f)
                curveTo(12.5463f, 13.6525f, 11.1577f, 12.5f, 9.5f, 12.5f)
                curveTo(7.8422f, 12.5f, 6.4537f, 13.6525f, 6.0918f, 15.2f)
                horizontalLineTo(3.0001f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.1449f)
                curveTo(6.5752f, 18.4457f, 7.9144f, 19.5f, 9.5f, 19.5f)
                curveTo(11.0855f, 19.5f, 12.4248f, 18.4457f, 12.855f, 17.0f)
                close()
                moveTo(7.8f, 16.0f)
                curveTo(7.8f, 15.0611f, 8.5611f, 14.3f, 9.5f, 14.3f)
                curveTo(10.4388f, 14.3f, 11.2f, 15.0611f, 11.2f, 16.0f)
                curveTo(11.2f, 16.9389f, 10.4388f, 17.7f, 9.5f, 17.7f)
                curveTo(8.5611f, 17.7f, 7.8f, 16.9389f, 7.8f, 16.0f)
                close()
            }
        }
        .build()
        return _tune!!
    }

private var _tune: ImageVector? = null
