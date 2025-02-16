package com.payto.feature.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Chevronleft
import com.payto.designsystem.theme.typography

@Composable
fun DefaultToolbar(
    modifier: Modifier = Modifier,
    title: String = "",
    onBackClick: () -> Unit
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .rippleClickable(onClick = onBackClick)
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Chevronleft,
            contentDescription = "뒤로가기"
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = title,
            style = typography.highlightBold
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ToolbarPreview() {
    DefaultToolbar(modifier = Modifier.fillMaxWidth(), title = "여정 생성하기", onBackClick = {})
}
