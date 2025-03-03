package com.payto.feature.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import com.payto.designsystem.icon.iconpack.Shareios
import com.payto.designsystem.icon.iconpack.Trash
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


@Composable
fun HistoryToolbar(
    modifier: Modifier = Modifier,
    onShareClick: () -> Unit,
    onDeleteClick: () -> Unit,
    onBackClick: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .rippleClickable(onClick = onBackClick)
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Chevronleft,
            contentDescription = "뒤로가기"
        )
        Row {
            Image(
                modifier = Modifier
                    .rippleClickable(onClick = onShareClick)
                    .padding(12.dp)
                    .size(24.dp),
                imageVector = IconPack.Shareios,
                contentDescription = "공유하기"
            )
            Image(
                modifier = Modifier
                    .rippleClickable(onClick = onDeleteClick)
                    .padding(12.dp)
                    .size(24.dp),
                imageVector = IconPack.Trash,
                contentDescription = "삭제하기"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ToolbarPreview() {
    DefaultToolbar(modifier = Modifier.fillMaxWidth(), title = "여정 생성하기", onBackClick = {})
}

@Preview(showBackground = true)
@Composable
private fun HistoryToolbarPreview() {
    HistoryToolbar(
        modifier = Modifier.fillMaxWidth(),
        onShareClick = {},
        onDeleteClick = {},
        onBackClick = {}
    )
}
