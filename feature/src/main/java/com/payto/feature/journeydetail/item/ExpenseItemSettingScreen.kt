package com.payto.feature.journeydetail.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.feature.journey.expense.ExpenseScreen
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel

@Composable
fun ExpenseItemSettingRoute(
    onBackClick: () -> Unit,
    onNavigate: (Any) -> Unit,
    viewModel: ExpenseItemSettingViewModel = hiltViewModel()
) {
    val model by viewModel.journeyData.collectAsStateWithLifecycle()

    HandleSideEffect(viewModel, onNavigate = onNavigate, popBackStack = onBackClick)
    ExpenseItemSettingScreen(
        onBackClick = onBackClick,
        onNavigate = onNavigate,
        model = model,
        uiEvent = viewModel::onEvent
    )
}

@Composable
fun ExpenseItemSettingScreen(
    onBackClick: () -> Unit = {},
    onNavigate: (Any) -> Unit,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        if (model != null)
            ExpenseScreen(
                modifier = Modifier.weight(1f),
                model = model,
                onNavigate = onNavigate,
                uiEvent = uiEvent,
            )
    }
}

@Preview(showBackground = true)
@Composable
fun ExpenseItemSettingScreenPreview() {
    val model = JourneyModel(
        infoModel = JourneyInfoModel(
            id = "",
            title = "",
            baseCurrency = "JPY",
            members = emptyList()
        ),
        createExpenseModel = JourneyExpenseModel(
            amount = "100000000000.0",
            membersAmount = List(10) {
                JourneyExpenseModel.MemberAmount(name = "멤버 $it", amount = "0.0")
            }
        )
    )
    ExpenseItemSettingScreen(
        onBackClick = {},
        onNavigate = {},
        model = model,
        uiEvent = {}
    )
}