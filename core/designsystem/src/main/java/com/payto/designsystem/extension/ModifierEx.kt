package com.payto.designsystem.extension

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role

@Composable
fun Modifier.rippleClickable(
    rippleColor: Color = com.payto.designsystem.theme.Color.Label.normal,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    role: Role? = null,
    onClick: () -> Unit,
): Modifier {
    return this.then(
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = ripple(color = rippleColor),
            enabled = enabled,
            role = role,
            onClick = onClick
        )
    )
}
