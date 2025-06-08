package com.payto.feature.journeydetail.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.payto.common.ext.numberFormat
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Shareios
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.feature.journey.OnChangeCurrency
import com.payto.model.JourneyExpenseModel

@Composable
fun JourneyExpenseItemDetailRoute(
    onBackClick: () -> Unit,
    onNavigate: (Any) -> Unit,
    viewModel: JourneyExpenseItemViewModel = hiltViewModel()
) {
    val model by viewModel.item.collectAsStateWithLifecycle()
    HandleSideEffect(viewModel, onNavigate = onNavigate, popBackStack = onBackClick)
    JourneyExpenseItemDetailScreen(
        onBackClick = onBackClick,
        model = model,
        uiEvent = viewModel::onEvent
    )
}

@Composable
private fun JourneyExpenseItemDetailScreen(
    onBackClick: () -> Unit = {},
    model: JourneyExpenseModel,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(
        modifier = Modifier
            .background(Color.Static.white)
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        DefaultToolbar(
            onBackClick = onBackClick,
            secondIcon = IconPack.Shareios,
            onSecondIconClick = {
                // todo 공유하기
            }
        )
        Content(
            modifier = Modifier
                .weight(1f),
            model = model,
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel,
    uiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        item {
            TitleItem(model = model, uiEvent = uiEvent)
        }
        item {
            TotalAmountItem(model = model)
        }
        items(model.membersAmount) {
            MemberInfoItem(model = it, isPayer = it.name == model.payer)
        }
        item {
            MemoItem(memo = model.memo)
        }
    }
}

@Composable
private fun TitleItem(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel,
    uiEvent: (UiEvent) -> Unit,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Text(
                text = model.categoryDescription ?: model.category.displayName,
                style = typography.featureBold,
                color = Color.Label.normal
            )
            Text(
                text = model.expenseDate?.toString() ?: "",
                style = typography.captionRegular,
                color = Color.Label.alternative
            )
        }
        CurrencyToggle(
            modifier = Modifier,
            options = "KRW" to model.baseCurrency,
            selectedOption = model.quoteCurrency,
            onOptionSelected = {
                uiEvent.invoke(OnChangeCurrency(it))
            }
        )
    }
}

@Composable
private fun TotalAmountItem(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = model.amount?.numberFormat() ?: "",
            style = typography.heading2,
            color = Color.Primary.normal
        )
        Text(
            modifier = Modifier.padding(bottom = 2.dp),
            text = model.quoteCurrency,
            style = typography.contentBold,
            color = Color.Label.neutral
        )
    }
}

@Composable
private fun MemberInfoItem(
    modifier: Modifier = Modifier,
    isPayer: Boolean,
    model: JourneyExpenseModel.MemberAmount
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .background(color = Component.Fill.normal, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(text = model.name, style = typography.contentAccent, color = Color.Label.normal)
            if (isPayer) {
                Chips(modifier = Modifier, text = "계산")
            }
        }
        Text(
            text = model.amount?.numberFormat() ?: "",
            style = typography.captionAccent,
            color = Color.Primary.normal
        )
    }
}

@Composable
private fun MemoItem(
    modifier: Modifier = Modifier,
    memo: String?
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .heightIn(min = 64.dp)
            .background(color = Component.Fill.normal, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = memo.takeIf { it.isNullOrEmpty().not() } ?: "기록된 메모가 없습니다.",
            textAlign = TextAlign.Center,
            style = typography.contentAccent,
            color = Color.Label.disable,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyExpenseItemDetailScreenPreview() {
    val model = JourneyExpenseModel(
        membersAmount = listOf(
            JourneyExpenseModel.MemberAmount(name = "가망이", amount = "10000.0"),
            JourneyExpenseModel.MemberAmount(name = "니망이", amount = "10000.0"),
            JourneyExpenseModel.MemberAmount(name = "다망이", amount = "10000.0"),
            JourneyExpenseModel.MemberAmount(name = "라망이", amount = "10000.0")
        )
    )
    JourneyExpenseItemDetailScreen(model = model, uiEvent = {})
}
