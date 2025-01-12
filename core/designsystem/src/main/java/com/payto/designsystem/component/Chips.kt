package com.payto.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography

@Composable
fun Chips(modifier: Modifier, text: String) {
    Box(
        modifier = modifier
            .background(
                color = Color.Primary.normal,
                shape = RoundedCornerShape(8.dp)
            )
            .height(20.dp)
            .padding(horizontal = 8.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = text,
            style = typography.contentAccent,
            color = Color.Inverse.label
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ChipsPreview() {
    Chips(modifier = Modifier, text = "여행")
}