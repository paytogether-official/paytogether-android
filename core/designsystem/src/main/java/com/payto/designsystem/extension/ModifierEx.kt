package com.payto.designsystem.extension

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun Modifier.rippleClickable(
    rippleColor: Color = com.payto.designsystem.theme.Color.Label.normal,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    role: Role? = null,
    shape: Shape? = RoundedCornerShape(8.dp),
    onClick: () -> Unit,
): Modifier {
    return this.then(
        if (shape != null) Modifier.clip(shape) else this
    ).then(
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = ripple(color = rippleColor),
            enabled = enabled,
            role = role,
            onClick = onClick
        )
    )
}
