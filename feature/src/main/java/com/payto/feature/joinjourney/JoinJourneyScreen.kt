package com.payto.feature.joinjourney

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.TextBox
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent

@Composable
fun JoinJourneyRoute(
    viewModel: JoinJourneyViewModel = hiltViewModel(),
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit
) {
    JoinJourneyScreen(
        onNavigate = onNavigate,
        onBackClick = onBackClick,
        uiEvent = viewModel::onEvent
    )
    HandleSideEffect(viewModel, onNavigate)
}

@Composable
private fun JoinJourneyScreen(
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit = {},
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .background(Color.Static.white)
            .fillMaxSize()
            .navigationBarsPadding()
            .statusBarsPadding()
    ) {
        DefaultToolbar(title = "여정 참여하기", onBackClick = onBackClick)
        Content(
            modifier = Modifier.weight(1f),
            onNavigate = onNavigate,
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier,
    uiEvent: (UiEvent) -> Unit = {},
    onNavigate: (Any) -> Unit
) {
    var inviteCode by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier,
            text = "초대코드를 입력해주세요!",
            style = typography.heading3,
            color = Color.Label.normal
        )
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "공유받은 초대코드를 입력해주세요. 초대코드를 입력한 후 버튼을 누르면 해당 여정으로 들어갈 수 있습니다.",
            style = typography.contentRegular,
            color = Color.Label.neutral
        )

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "초대코드",
                color = Color.Label.normal,
                style = typography.contentAccent
            )
            TextBox(
                value = inviteCode,
                placeholder = "공유 받은 초대코드를 입력해주세요."
            ) {
                inviteCode = it
            }
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            PaytoButton(
                modifier = Modifier.fillMaxWidth(),
                text = "참여하기",
                onClick = {
                    uiEvent.invoke(CheckInviteCode(inviteCode))
                },
                enabled = inviteCode.isNotEmpty()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JoinJourneyScreenPreview() {
    JoinJourneyScreen(onNavigate = {}, onBackClick = {})
}
