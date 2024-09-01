package com.payto.designsystem.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography

@Composable
fun TextBox(
    modifier: Modifier = Modifier,
    value: String,
    enabled: Boolean = true,
    placeholder: String = "",
    onValueChange: (String) -> Unit
) {
    var isFocused: Boolean by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = modifier
            .height(48.dp)
            .background(Component.Fill.normal)
            .border(
                width = 1.dp,
                color = when {
                    isFocused && enabled -> {
                        Color.Primary.normal
                    }

                    else -> {
                        Color.Line.normal
                    }
                },
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp))
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
        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .align(Alignment.Center)
                .onFocusChanged {
                    isFocused = it.isFocused
                },
            value = value,
            enabled = enabled,
            onValueChange = onValueChange,
            textStyle = typography.contentAccent.copy(color = Color.Label.normal),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TextBoxPreview() {
    var text by remember {
        mutableStateOf("한글입니다")
    }
    TextBox(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        placeholder = "플레이스 홀더",
        onValueChange = {
            text = it
        }
    )
}
