package com.payto.designsystem.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Circleplus
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography

@Composable
fun PaytoButton(
    modifier: Modifier = Modifier,
    status: PaytoButtonStatus = PaytoButtonStatus.PRIMARY,
    text: String = "",
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val backgroundColor by remember(status) {
        mutableStateOf(
            when (status) {
                PaytoButtonStatus.PRIMARY -> Color.Primary.normal
                PaytoButtonStatus.SECONDARY -> Component.Fill.primary
                PaytoButtonStatus.NORMAL -> Component.Fill.normal
            }
        )
    }

    val textColor by remember(status) {
        mutableStateOf(
            when (status) {
                PaytoButtonStatus.PRIMARY -> Color.Inverse.label
                PaytoButtonStatus.SECONDARY -> Color.Inverse.primary
                PaytoButtonStatus.NORMAL -> Color.Label.normal
            }
        )
    }

    CompositionLocalProvider(value = LocalMinimumInteractiveComponentSize provides 0.dp) {
        Button(
            colors = ButtonColors(
                containerColor = backgroundColor,
                contentColor = androidx.compose.ui.graphics.Color.Unspecified,
                disabledContentColor = Color.Label.disable,
                disabledContainerColor = Color.Label.disable
            ),
            shape = RoundedCornerShape(16.dp),
            contentPadding = PaddingValues(vertical = 13.dp),
            modifier = modifier,
            onClick = onClick,
            enabled = enabled
        ) {
            Text(text = text, style = typography.highlightBold, color = textColor)
        }
    }
}

@Composable
fun PaytoOutlineButton(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    onClick: () -> Unit
) {
    CompositionLocalProvider(value = LocalMinimumInteractiveComponentSize provides 0.dp) {
        Button(
            border = BorderStroke(1.dp, Color.Primary.normal),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonColors(
                containerColor = Component.Fill.primary,
                contentColor = androidx.compose.ui.graphics.Color.Unspecified,
                disabledContentColor = Component.Fill.primary,
                disabledContainerColor = Component.Fill.primary
            ),
            contentPadding = PaddingValues(vertical = 8.dp),
            modifier = modifier,
            onClick = onClick
        ) {
            if (icon != null) {
                Image(
                    modifier = Modifier.size(24.dp),
                    imageVector = icon,
                    colorFilter = ColorFilter.tint(Color.Primary.normal),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview
@Composable
private fun PaytoButtonButtonPreview() {
    PaytoButton(text = "Button", status = PaytoButtonStatus.PRIMARY) {}
}

@Preview
@Composable
private fun PaytoOutlineButtonPreview() {
    PaytoOutlineButton(icon = IconPack.Circleplus) {}
}

enum class PaytoButtonStatus {
    PRIMARY, SECONDARY, NORMAL
}
