package com.payto.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component

@Composable
fun CurrencyToggle(
    modifier: Modifier = Modifier,
    options: Pair<String, String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    Row(
        modifier = modifier
            .height(28.dp)
            .clip(RoundedCornerShape(99.dp))
            .background(Component.Fill.normal)
            .width(IntrinsicSize.Max)
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        listOf(options.first, options.second).forEachIndexed { _, text ->
            Chips(
                modifier = Modifier
                    .weight(1f)
                    .rippleClickable {
                        onOptionSelected(text)
                    },
                text = text,
                color = if (selectedOption == text) Color.Primary.normal else Component.Fill.normal,
                textColor = if (selectedOption == text) Color.Inverse.label else Color.Label.disable
            )
        }
    }
}

@Preview
@Composable
private fun CurrencyTogglePreview() {
    var selectedOption by remember { mutableStateOf("EUR") }

    CurrencyToggle(
        modifier = Modifier.padding(16.dp),
        options = "USD" to "EUR",
        selectedOption = selectedOption,
        onOptionSelected = { selectedOption = it }
    )
}
