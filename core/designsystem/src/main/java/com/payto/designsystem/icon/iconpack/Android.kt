package com.payto.designsystem.icon.iconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack

val IconPack.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF343942)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 18.0f)
                curveTo(1.15f, 16.2167f, 1.6958f, 14.575f, 2.6375f, 13.075f)
                curveTo(3.5792f, 11.575f, 4.8333f, 10.3833f, 6.4f, 9.5f)
                lineTo(4.55f, 6.3f)
                curveTo(4.45f, 6.15f, 4.425f, 5.9917f, 4.475f, 5.825f)
                curveTo(4.525f, 5.6583f, 4.6333f, 5.5333f, 4.8f, 5.45f)
                curveTo(4.9333f, 5.3667f, 5.0833f, 5.35f, 5.25f, 5.4f)
                curveTo(5.4167f, 5.45f, 5.55f, 5.55f, 5.65f, 5.7f)
                lineTo(7.5f, 8.9f)
                curveTo(8.9333f, 8.3f, 10.4333f, 8.0f, 12.0f, 8.0f)
                curveTo(13.5667f, 8.0f, 15.0667f, 8.3f, 16.5f, 8.9f)
                lineTo(18.35f, 5.7f)
                curveTo(18.45f, 5.55f, 18.5833f, 5.45f, 18.75f, 5.4f)
                curveTo(18.9167f, 5.35f, 19.0667f, 5.3667f, 19.2f, 5.45f)
                curveTo(19.3666f, 5.5333f, 19.475f, 5.6583f, 19.525f, 5.825f)
                curveTo(19.575f, 5.9917f, 19.55f, 6.15f, 19.45f, 6.3f)
                lineTo(17.6f, 9.5f)
                curveTo(19.1667f, 10.3833f, 20.4208f, 11.575f, 21.3625f, 13.075f)
                curveTo(22.3041f, 14.575f, 22.85f, 16.2167f, 23.0f, 18.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(7.0f, 15.25f)
                curveTo(7.35f, 15.25f, 7.6458f, 15.1292f, 7.8875f, 14.8875f)
                curveTo(8.1292f, 14.6458f, 8.25f, 14.35f, 8.25f, 14.0f)
                curveTo(8.25f, 13.65f, 8.1292f, 13.3542f, 7.8875f, 13.1125f)
                curveTo(7.6458f, 12.8708f, 7.35f, 12.75f, 7.0f, 12.75f)
                curveTo(6.65f, 12.75f, 6.3542f, 12.8708f, 6.1125f, 13.1125f)
                curveTo(5.8708f, 13.3542f, 5.75f, 13.65f, 5.75f, 14.0f)
                curveTo(5.75f, 14.35f, 5.8708f, 14.6458f, 6.1125f, 14.8875f)
                curveTo(6.3542f, 15.1292f, 6.65f, 15.25f, 7.0f, 15.25f)
                close()
                moveTo(17.0f, 15.25f)
                curveTo(17.35f, 15.25f, 17.6458f, 15.1292f, 17.8875f, 14.8875f)
                curveTo(18.1292f, 14.6458f, 18.25f, 14.35f, 18.25f, 14.0f)
                curveTo(18.25f, 13.65f, 18.1292f, 13.3542f, 17.8875f, 13.1125f)
                curveTo(17.6458f, 12.8708f, 17.35f, 12.75f, 17.0f, 12.75f)
                curveTo(16.65f, 12.75f, 16.3542f, 12.8708f, 16.1125f, 13.1125f)
                curveTo(15.8708f, 13.3542f, 15.75f, 13.65f, 15.75f, 14.0f)
                curveTo(15.75f, 14.35f, 15.8708f, 14.6458f, 16.1125f, 14.8875f)
                curveTo(16.3542f, 15.1292f, 16.65f, 15.25f, 17.0f, 15.25f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
