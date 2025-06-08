package com.payto.feature.journey.expense

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.designsystem.component.ContentBox
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Caretdown
import com.payto.designsystem.icon.iconpack.Circlecheckfill
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.model.ExpenseSettingModel

@Composable
fun ExpenseSettingRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    viewModel: ExpenseSettingViewModel = hiltViewModel()
) {
    val model by viewModel.model.collectAsStateWithLifecycle()

    HandleSideEffect(viewModel, onNavigate, onBackClick)
    ExpenseSettingScreen(
        model = model,
        onBackClick = onBackClick,
        uiEvent = viewModel::onEvent
    )
}

@Composable
fun ExpenseSettingScreen(
    model: ExpenseSettingModel?,
    onBackClick: () -> Unit,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
            .statusBarsPadding()
            .background(color = Color.Static.white)
    ) {
        DefaultToolbar(title = "정산 설정", onBackClick = onBackClick)
        if (model != null) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SelectPayer(payer = model.payer, uiEvent = uiEvent)
                MemberList(
                    modifier = Modifier
                        .weight(1f),
                    members = model.members,
                    uiEvent = uiEvent
                )
            }
        }
    }
}

@Composable
private fun SelectPayer(
    payer: String,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "결제자 설정",
            style = typography.captionAccent,
            color = Color.Label.neutral
        )
        ContentBox(
            modifier = Modifier.fillMaxWidth(),
            value = payer,
            endIcon = IconPack.Caretdown,
            onClick = {
                // TODO
            }
        )
    }
}

@Composable
private fun MemberList(
    modifier: Modifier,
    members: List<Pair<String, Boolean>>,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "정산인원 설정", style = typography.captionAccent, color = Color.Label.neutral)
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(members) {
                Member(
                    name = it.first,
                    exclude = it.second,
                    uiEvent = uiEvent,
                )
            }
        }
    }
}

@Composable
private fun Member(
    modifier: Modifier = Modifier,
    name: String,
    exclude: Boolean,
    uiEvent: (UiEvent) -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .rippleClickable(shape = RoundedCornerShape(16.dp)) {
                uiEvent.invoke(OnParticipantsChange(name, exclude.not()))
            }
            .background(color = Component.Fill.normal)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 10.dp),
            text = name,
            style = typography.contentAccent,
            color = Color.Label.normal
        )
        if (exclude.not()) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = IconPack.Circlecheckfill,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Primary.normal)
            )
        }
    }
}

@Preview
@Composable
private fun ExpenseSettingScreenPreview() {
    ExpenseSettingScreen(
        onBackClick = {},
        uiEvent = {},
        model = ExpenseSettingModel(
            payer = "나나",
            memberInfoMap = mapOf(
                "나나" to false,
                "나나1" to false,
                "나나2" to true,
                "나나3" to true,
                "나나4" to true
            )
        )
    )
}
