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

public val IconPack.Companyplus: ImageVector
    get() {
        if (_companyplus != null) {
            return _companyplus!!
        }
        _companyplus = Builder(name = "Companyplus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.1517f, 2.1f)
                horizontalLineTo(19.3517f)
                verticalLineTo(4.35f)
                horizontalLineTo(17.1017f)
                verticalLineTo(6.15f)
                horizontalLineTo(19.3517f)
                verticalLineTo(8.4f)
                horizontalLineTo(21.1517f)
                verticalLineTo(6.15f)
                horizontalLineTo(23.4017f)
                verticalLineTo(4.35f)
                horizontalLineTo(21.1517f)
                verticalLineTo(2.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.4508f, 2.1f)
                curveTo(5.0234f, 2.0999f, 4.6174f, 2.0998f, 4.2844f, 2.1446f)
                curveTo(3.9123f, 2.1946f, 3.4996f, 2.3149f, 3.1581f, 2.6565f)
                curveTo(2.8165f, 2.998f, 2.6962f, 3.4107f, 2.6462f, 3.7828f)
                curveTo(2.6014f, 4.1158f, 2.6015f, 4.5218f, 2.6016f, 4.9492f)
                lineTo(2.6016f, 21.9f)
                horizontalLineTo(14.6015f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.4015f)
                verticalLineTo(21.8998f)
                horizontalLineTo(21.4016f)
                lineTo(21.4016f, 12.949f)
                curveTo(21.4017f, 12.5216f, 21.4017f, 12.1156f, 21.3569f, 11.7826f)
                curveTo(21.3069f, 11.4105f, 21.1866f, 10.9978f, 20.8451f, 10.6563f)
                curveTo(20.5035f, 10.3147f, 20.0909f, 10.1945f, 19.7188f, 10.1444f)
                curveTo(19.3857f, 10.0996f, 18.9797f, 10.0997f, 18.5524f, 10.0998f)
                lineTo(15.4015f, 10.0998f)
                lineTo(15.4015f, 4.9492f)
                curveTo(15.4016f, 4.5218f, 15.4017f, 4.1158f, 15.3569f, 3.7828f)
                curveTo(15.3069f, 3.4107f, 15.1866f, 2.998f, 14.845f, 2.6565f)
                curveTo(14.5035f, 2.3149f, 14.0909f, 2.1946f, 13.7187f, 2.1446f)
                curveTo(13.3857f, 2.0998f, 12.9797f, 2.0999f, 12.5523f, 2.1f)
                horizontalLineTo(5.4508f)
                close()
                moveTo(11.5015f, 11.9f)
                horizontalLineTo(6.5016f)
                verticalLineTo(10.1f)
                horizontalLineTo(11.5015f)
                verticalLineTo(11.9f)
                close()
                moveTo(11.5015f, 7.9f)
                horizontalLineTo(6.5016f)
                verticalLineTo(6.1f)
                horizontalLineTo(11.5015f)
                verticalLineTo(7.9f)
                close()
            }
        }
        .build()
        return _companyplus!!
    }

private var _companyplus: ImageVector? = null
