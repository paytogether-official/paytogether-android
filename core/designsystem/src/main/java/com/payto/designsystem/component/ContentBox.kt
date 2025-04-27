package com.payto.designsystem.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography

@Composable
fun ContentBox(
    modifier: Modifier = Modifier,
    value: String,
    enabled: Boolean = true,
    placeholder: String = "",
    endIcon: ImageVector? = null,
    endDecoration: @Composable () -> Unit = {},
    onClick: (() -> Unit) = {}
) {
    Box(
        modifier = modifier
            .height(48.dp)
            .clip(RoundedCornerShape(16.dp))
            .rippleClickable(enabled = enabled, onClick = onClick)
            .background(Component.Fill.normal)
            .border(
                width = 1.dp,
                color = Color.Line.normal,
                shape = RoundedCornerShape(16.dp)
            )

    ) {
        AnimatedVisibility(
            modifier = Modifier.align(Alignment.Center),
            visible = value.isEmpty(),
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                text = placeholder,
                color = Color.Label.disable,
                style = typography.contentAccent,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .align(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .weight(1f),
                text = value,
                style = typography.contentAccent,
                color = if (enabled) Color.Label.normal else Color.Label.disable
            )
            endDecoration.invoke()
            endIcon?.let {
                Image(
                    modifier = Modifier.size(24.dp),
                    imageVector = endIcon,
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContentBoxPreview() {
    ContentBox(value = "ContentBox", onClick = {})
}
