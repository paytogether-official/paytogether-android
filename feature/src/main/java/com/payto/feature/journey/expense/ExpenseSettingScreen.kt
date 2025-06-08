package com.payto.feature.journey.expense

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.payto.designsystem.theme.Color
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent

@Composable
fun ExpenseSettingRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    viewModel: ExpenseSettingViewModel = hiltViewModel()
) {
    HandleSideEffect(viewModel, onNavigate, onBackClick)
    ExpenseSettingScreen(onBackClick = onBackClick, uiEvent = viewModel::onEvent)
}

@Composable
fun ExpenseSettingScreen(
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
    }
}

@Preview
@Composable
private fun ExpenseSettingScreenPreview() {
    ExpenseSettingScreen(onBackClick = {}, uiEvent = {})
}
