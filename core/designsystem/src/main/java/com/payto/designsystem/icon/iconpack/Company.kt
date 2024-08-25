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

public val IconPack.Company: ImageVector
    get() {
        if (_company != null) {
            return _company!!
        }
        _company = Builder(name = "Company", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.2844f, 2.1446f)
                curveTo(4.6174f, 2.0998f, 5.0234f, 2.0999f, 5.4508f, 2.1f)
                horizontalLineTo(12.5523f)
                curveTo(12.9797f, 2.0999f, 13.3857f, 2.0998f, 13.7187f, 2.1446f)
                curveTo(14.0909f, 2.1946f, 14.5035f, 2.3149f, 14.8451f, 2.6565f)
                curveTo(15.1866f, 2.998f, 15.3069f, 3.4107f, 15.3569f, 3.7828f)
                curveTo(15.4017f, 4.1158f, 15.4016f, 4.5218f, 15.4016f, 4.9492f)
                lineTo(15.4016f, 10.1f)
                horizontalLineTo(18.5523f)
                curveTo(18.9797f, 10.0999f, 19.3857f, 10.0998f, 19.7187f, 10.1446f)
                curveTo(20.0908f, 10.1946f, 20.5035f, 10.3149f, 20.845f, 10.6565f)
                curveTo(21.1866f, 10.998f, 21.3069f, 11.4107f, 21.3569f, 11.7828f)
                curveTo(21.4017f, 12.1158f, 21.4016f, 12.5218f, 21.4015f, 12.9492f)
                lineTo(21.4015f, 21.9f)
                horizontalLineTo(2.6016f)
                lineTo(2.6016f, 4.9492f)
                curveTo(2.6015f, 4.5218f, 2.6014f, 4.1158f, 2.6462f, 3.7828f)
                curveTo(2.6962f, 3.4107f, 2.8165f, 2.998f, 3.1581f, 2.6565f)
                curveTo(3.4996f, 2.3149f, 3.9123f, 2.1946f, 4.2844f, 2.1446f)
                close()
                moveTo(4.4015f, 3.9998f)
                curveTo(4.4015f, 3.9446f, 4.4463f, 3.8998f, 4.5016f, 3.8998f)
                horizontalLineTo(13.5015f)
                curveTo(13.5568f, 3.8998f, 13.6015f, 3.9446f, 13.6015f, 3.9998f)
                verticalLineTo(20.0998f)
                horizontalLineTo(9.9015f)
                verticalLineTo(15.9998f)
                horizontalLineTo(8.1016f)
                verticalLineTo(20.0998f)
                horizontalLineTo(4.4015f)
                verticalLineTo(3.9998f)
                close()
                moveTo(15.4015f, 20.0998f)
                horizontalLineTo(19.6015f)
                verticalLineTo(11.9998f)
                curveTo(19.6015f, 11.9446f, 19.5568f, 11.8998f, 19.5015f, 11.8998f)
                horizontalLineTo(15.4015f)
                lineTo(15.4015f, 20.0998f)
                close()
                moveTo(11.5016f, 11.9f)
                horizontalLineTo(6.5016f)
                verticalLineTo(10.1f)
                horizontalLineTo(11.5016f)
                verticalLineTo(11.9f)
                close()
                moveTo(11.5016f, 7.9f)
                horizontalLineTo(6.5016f)
                verticalLineTo(6.1f)
                horizontalLineTo(11.5016f)
                verticalLineTo(7.9f)
                close()
            }
        }
        .build()
        return _company!!
    }

private var _company: ImageVector? = null
