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

public val IconPack.Chevrondoubleleftthick: ImageVector
    get() {
        if (_chevrondoubleleftthick != null) {
            return _chevrondoubleleftthick!!
        }
        _chevrondoubleleftthick = Builder(name = "Chevrondoubleleftthick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.4184f, 4.9175f)
                curveTo(21.9261f, 4.4098f, 21.9261f, 3.5867f, 21.4184f, 3.079f)
                curveTo(20.9108f, 2.5713f, 20.0876f, 2.5713f, 19.58f, 3.079f)
                lineTo(11.58f, 11.079f)
                curveTo(11.0723f, 11.5867f, 11.0723f, 12.4098f, 11.58f, 12.9175f)
                lineTo(19.58f, 20.9175f)
                curveTo(20.0876f, 21.4252f, 20.9108f, 21.4252f, 21.4184f, 20.9175f)
                curveTo(21.9261f, 20.4098f, 21.9261f, 19.5867f, 21.4184f, 19.079f)
                lineTo(14.3377f, 11.9982f)
                lineTo(21.4184f, 4.9175f)
                close()
                moveTo(11.9185f, 4.9177f)
                curveTo(12.4261f, 4.41f, 12.4261f, 3.5869f, 11.9185f, 3.0792f)
                curveTo(11.4108f, 2.5715f, 10.5877f, 2.5715f, 10.08f, 3.0792f)
                lineTo(2.08f, 11.0792f)
                curveTo(1.5723f, 11.5869f, 1.5723f, 12.41f, 2.08f, 12.9177f)
                lineTo(10.08f, 20.9177f)
                curveTo(10.5877f, 21.4254f, 11.4108f, 21.4254f, 11.9185f, 20.9177f)
                curveTo(12.4261f, 20.41f, 12.4261f, 19.5869f, 11.9185f, 19.0792f)
                lineTo(4.8377f, 11.9984f)
                lineTo(11.9185f, 4.9177f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftthick!!
    }

private var _chevrondoubleleftthick: ImageVector? = null
