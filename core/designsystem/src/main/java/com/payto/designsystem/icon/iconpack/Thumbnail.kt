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

public val IconPack.Thumbnail: ImageVector
    get() {
        if (_thumbnail != null) {
            return _thumbnail!!
        }
        _thumbnail = Builder(name = "Thumbnail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.2984f, 3.1499f)
                curveTo(3.6633f, 3.1499f, 3.1484f, 3.6648f, 3.1484f, 4.2999f)
                verticalLineTo(9.6999f)
                curveTo(3.1484f, 10.335f, 3.6633f, 10.8499f, 4.2984f, 10.8499f)
                horizontalLineTo(9.6984f)
                curveTo(10.3336f, 10.8499f, 10.8484f, 10.335f, 10.8484f, 9.6999f)
                verticalLineTo(4.2999f)
                curveTo(10.8484f, 3.6648f, 10.3336f, 3.1499f, 9.6984f, 3.1499f)
                horizontalLineTo(4.2984f)
                close()
                moveTo(4.8484f, 9.1499f)
                verticalLineTo(4.8499f)
                horizontalLineTo(9.1484f)
                verticalLineTo(9.1499f)
                horizontalLineTo(4.8484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.2984f, 3.1499f)
                curveTo(13.6633f, 3.1499f, 13.1484f, 3.6648f, 13.1484f, 4.2999f)
                verticalLineTo(9.6999f)
                curveTo(13.1484f, 10.335f, 13.6633f, 10.8499f, 14.2984f, 10.8499f)
                horizontalLineTo(19.6984f)
                curveTo(20.3335f, 10.8499f, 20.8484f, 10.335f, 20.8484f, 9.6999f)
                verticalLineTo(4.2999f)
                curveTo(20.8484f, 3.6648f, 20.3335f, 3.1499f, 19.6984f, 3.1499f)
                horizontalLineTo(14.2984f)
                close()
                moveTo(14.8484f, 9.1499f)
                verticalLineTo(4.8499f)
                horizontalLineTo(19.1484f)
                verticalLineTo(9.1499f)
                horizontalLineTo(14.8484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1484f, 14.2999f)
                curveTo(3.1484f, 13.6648f, 3.6633f, 13.1499f, 4.2984f, 13.1499f)
                horizontalLineTo(9.6984f)
                curveTo(10.3336f, 13.1499f, 10.8484f, 13.6648f, 10.8484f, 14.2999f)
                verticalLineTo(19.6999f)
                curveTo(10.8484f, 20.335f, 10.3336f, 20.8499f, 9.6984f, 20.8499f)
                horizontalLineTo(4.2984f)
                curveTo(3.6633f, 20.8499f, 3.1484f, 20.335f, 3.1484f, 19.6999f)
                verticalLineTo(14.2999f)
                close()
                moveTo(4.8484f, 14.8499f)
                verticalLineTo(19.1499f)
                horizontalLineTo(9.1484f)
                verticalLineTo(14.8499f)
                horizontalLineTo(4.8484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.2984f, 13.1499f)
                curveTo(13.6633f, 13.1499f, 13.1484f, 13.6648f, 13.1484f, 14.2999f)
                verticalLineTo(19.6999f)
                curveTo(13.1484f, 20.335f, 13.6633f, 20.8499f, 14.2984f, 20.8499f)
                horizontalLineTo(19.6984f)
                curveTo(20.3335f, 20.8499f, 20.8484f, 20.335f, 20.8484f, 19.6999f)
                verticalLineTo(14.2999f)
                curveTo(20.8484f, 13.6648f, 20.3335f, 13.1499f, 19.6984f, 13.1499f)
                horizontalLineTo(14.2984f)
                close()
                moveTo(14.8484f, 19.1499f)
                verticalLineTo(14.8499f)
                horizontalLineTo(19.1484f)
                verticalLineTo(19.1499f)
                horizontalLineTo(14.8484f)
                close()
            }
        }
        .build()
        return _thumbnail!!
    }

private var _thumbnail: ImageVector? = null
