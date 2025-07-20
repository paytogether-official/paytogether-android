package com.payto.feature.journeydetail.item

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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Chevronleft
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.feature.journey.OnClickUpdateExpenseItem
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Static.white)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        ExpenseItemSettingToolbar(
            modifier = Modifier.fillMaxWidth(),
            onBackClick = onBackClick,
            uiEvent = uiEvent,
        )
        if (model != null)
            ExpenseScreen(
                modifier = Modifier.weight(1f),
                model = model,
                isEdit = true,
                onNavigate = onNavigate,
                uiEvent = uiEvent,
            )
    }
}

@Composable
private fun ExpenseItemSettingToolbar(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    uiEvent: (UiEvent) -> Unit,
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
        Text(
            modifier = Modifier.weight(1f),
            text = "지출 수정",
            style = typography.highlightBold,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .width(48.dp)
                .rippleClickable {
                    uiEvent.invoke(OnClickUpdateExpenseItem)
                },
            text = "수정",
            style = typography.contentAccent,
            textAlign = TextAlign.Center,
            color = Color.Primary.normal
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