package com.payto.feature.createjourney

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.payto.designsystem.component.TextBox
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Chevronleft
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography

@Composable
fun CreateJourneyRoute(
    viewModel: CreateJourneyViewModel = hiltViewModel()
) {
    CreateJourneyScreen()
}

@Composable
private fun CreateJourneyScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Header()
        Contents(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Composable
private fun Header(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .clickable {

                }
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Chevronleft,
            contentDescription = "뒤로가기"
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "여정 생성하기",
            style = typography.highlightBold
        )
    }
}

@Composable
private fun Contents(modifier: Modifier) {
    Column(modifier = modifier) {
        JourneyNameBox()
    }
}

@Composable
private fun JourneyNameBox() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "여정명", color = Color.Label.normal,
            style = typography.contentAccent
        )
        TextBox(
            value = "", // TODO
            placeholder = "어떤 여정인가요?"
        ) {
            // TODO
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CreateJourneyScreenPreview() {
    CreateJourneyScreen()
}
