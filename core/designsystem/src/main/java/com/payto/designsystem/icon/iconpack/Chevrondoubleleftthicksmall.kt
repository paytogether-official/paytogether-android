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

public val IconPack.Chevrondoubleleftthicksmall: ImageVector
    get() {
        if (_chevrondoubleleftthicksmall != null) {
            return _chevrondoubleleftthicksmall!!
        }
        _chevrondoubleleftthicksmall = Builder(name = "Chevrondoubleleftthicksmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.9189f, 6.4175f)
                curveTo(20.4266f, 5.9098f, 20.4266f, 5.0867f, 19.9189f, 4.579f)
                curveTo(19.4112f, 4.0713f, 18.5881f, 4.0713f, 18.0804f, 4.579f)
                lineTo(11.5804f, 11.079f)
                curveTo(11.0727f, 11.5867f, 11.0727f, 12.4098f, 11.5804f, 12.9175f)
                lineTo(18.0804f, 19.4175f)
                curveTo(18.5881f, 19.9252f, 19.4112f, 19.9252f, 19.9189f, 19.4175f)
                curveTo(20.4266f, 18.9098f, 20.4266f, 18.0867f, 19.9189f, 17.579f)
                lineTo(14.3381f, 11.9982f)
                lineTo(19.9189f, 6.4175f)
                close()
                moveTo(11.9185f, 6.4177f)
                curveTo(12.4261f, 5.91f, 12.4261f, 5.0869f, 11.9185f, 4.5792f)
                curveTo(11.4108f, 4.0715f, 10.5877f, 4.0715f, 10.08f, 4.5792f)
                lineTo(3.58f, 11.0792f)
                curveTo(3.0723f, 11.5869f, 3.0723f, 12.41f, 3.58f, 12.9177f)
                lineTo(10.08f, 19.4177f)
                curveTo(10.5877f, 19.9254f, 11.4108f, 19.9254f, 11.9185f, 19.4177f)
                curveTo(12.4261f, 18.91f, 12.4261f, 18.0869f, 11.9185f, 17.5792f)
                lineTo(6.3377f, 11.9984f)
                lineTo(11.9185f, 6.4177f)
                close()
            }
        }
        .build()
        return _chevrondoubleleftthicksmall!!
    }

private var _chevrondoubleleftthicksmall: ImageVector? = null
