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

public val IconPack.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.6413f, 2.5982f)
                horizontalLineTo(17.3609f)
                curveTo(17.9065f, 2.5981f, 18.3761f, 2.5981f, 18.742f, 2.6308f)
                curveTo(19.0922f, 2.6622f, 19.5528f, 2.7345f, 19.9189f, 3.0407f)
                curveTo(20.3783f, 3.425f, 20.6297f, 4.0034f, 20.5971f, 4.6015f)
                curveTo(20.5711f, 5.078f, 20.3098f, 5.4641f, 20.0938f, 5.7414f)
                curveTo(19.868f, 6.0313f, 19.5476f, 6.3746f, 19.1753f, 6.7734f)
                lineTo(14.9011f, 11.3529f)
                lineTo(14.9011f, 20.1583f)
                curveTo(14.9012f, 20.2774f, 14.9013f, 20.4212f, 14.89f, 20.5442f)
                curveTo(14.8785f, 20.6688f, 14.8459f, 20.9301f, 14.6645f, 21.1743f)
                curveTo(14.4582f, 21.452f, 14.1421f, 21.6272f, 13.7973f, 21.655f)
                curveTo(13.494f, 21.6793f, 13.2551f, 21.5685f, 13.1435f, 21.5122f)
                curveTo(13.0331f, 21.4566f, 12.9113f, 21.3803f, 12.8103f, 21.3171f)
                lineTo(9.7379f, 19.3971f)
                curveTo(9.6849f, 19.3651f, 9.5185f, 19.2647f, 9.3899f, 19.1147f)
                curveTo(9.2842f, 18.9913f, 9.2046f, 18.8477f, 9.156f, 18.6926f)
                curveTo(9.097f, 18.5042f, 9.1f, 18.3098f, 9.101f, 18.248f)
                lineTo(9.1011f, 11.3529f)
                lineTo(4.827f, 6.7734f)
                curveTo(4.4547f, 6.3746f, 4.1342f, 6.0313f, 3.9085f, 5.7414f)
                curveTo(3.6925f, 5.4641f, 3.4311f, 5.078f, 3.4052f, 4.6015f)
                curveTo(3.3726f, 4.0034f, 3.6239f, 3.425f, 4.0834f, 3.0407f)
                curveTo(4.4495f, 2.7345f, 4.9101f, 2.6622f, 5.2602f, 2.6308f)
                curveTo(5.6261f, 2.5981f, 6.0958f, 2.5981f, 6.6413f, 2.5982f)
                close()
                moveTo(5.2012f, 4.5171f)
                curveTo(5.2026f, 4.5264f, 5.2063f, 4.5426f, 5.2293f, 4.5671f)
                lineTo(10.6591f, 10.3848f)
                curveTo(10.8147f, 10.5515f, 10.9012f, 10.7709f, 10.9012f, 10.9989f)
                verticalLineTo(18.002f)
                lineTo(13.1012f, 19.377f)
                verticalLineTo(10.9989f)
                curveTo(13.1012f, 10.7709f, 13.1877f, 10.5515f, 13.3432f, 10.3848f)
                lineTo(18.7731f, 4.5671f)
                curveTo(18.796f, 4.5426f, 18.7997f, 4.5264f, 18.8011f, 4.5171f)
                curveTo(18.8032f, 4.5032f, 18.8018f, 4.4823f, 18.7917f, 4.4591f)
                curveTo(18.7815f, 4.4358f, 18.7672f, 4.4205f, 18.7557f, 4.4125f)
                curveTo(18.7479f, 4.4072f, 18.7336f, 4.3989f, 18.6999f, 4.3989f)
                horizontalLineTo(5.3024f)
                curveTo(5.2688f, 4.3989f, 5.2544f, 4.4072f, 5.2467f, 4.4125f)
                curveTo(5.2351f, 4.4205f, 5.2208f, 4.4358f, 5.2107f, 4.4591f)
                curveTo(5.2006f, 4.4823f, 5.1992f, 4.5032f, 5.2012f, 4.5171f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
