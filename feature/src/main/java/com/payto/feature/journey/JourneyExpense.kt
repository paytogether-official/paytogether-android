package com.payto.feature.journey

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.common.ext.numberFormat
import com.payto.designsystem.component.ContentBox
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoTabRow
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Bubbleplus
import com.payto.designsystem.icon.iconpack.Calendar
import com.payto.designsystem.icon.iconpack.Circleclose
import com.payto.designsystem.icon.iconpack.Listcategory
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.UiEvent
import com.payto.model.ExpenseCategory
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import kotlinx.coroutines.launch


@Composable
fun ExpenseScreen(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            ContentBox(
                value = "",
                placeholder = "언제 여행을 떠나시나요?",
                endIcon = IconPack.Calendar
            ) {
            }
            CategoryList(
                modifier = Modifier.padding(vertical = 8.dp),
                selectedModel = model?.expenseModel?.category ?: ExpenseCategory.list.first(),
                onClick = {

                }
            )
            Memo()
            SettlementTab(
                modifier = Modifier.fillMaxWidth(),
                model = model,
                uiEvent = uiEvent
            )
        }

        PaytoButton(
            modifier = Modifier.fillMaxWidth(),
            text = "지출 추가"
        ) {

        }
    }
}

@Composable
private fun CategoryList(
    modifier: Modifier = Modifier,
    selectedModel: ExpenseCategory,
    onClick: (ExpenseCategory) -> Unit
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(ExpenseCategory.list) {
            CategoryItem(
                model = it,
                isSelected = selectedModel == it,
                onClick = onClick
            )
        }
    }
}

@Composable
private fun CategoryItem(
    model: ExpenseCategory,
    isSelected: Boolean,
    onClick: (ExpenseCategory) -> Unit
) {
    Column(
        modifier = Modifier
            .rippleClickable(shape = RoundedCornerShape(8.dp)) {
                onClick.invoke(model)
            }
            .background(if (isSelected) Component.Fill.primary else Component.Fill.alternative)
            .padding(horizontal = 12.dp, vertical = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            modifier = Modifier
                .size(24.dp),
            imageVector = IconPack.Listcategory,
            contentDescription = ""
        )
        Text(
            text = model.displayName,
            style = typography.captionAccent,
            color = if (isSelected) Color.Primary.normal else Color.Label.neutral
        )
    }
}

@Composable
private fun Memo(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ContentBox(
            modifier = Modifier.weight(1f),
            value = "",
            placeholder = "어디에 사용하셨나요?",
        ) {
        }
        Column(
            modifier = Modifier
                .size(48.dp)
                .rippleClickable(shape = RoundedCornerShape(16.dp)) {
                    // TODO mono
                }
                .background(Component.Fill.normal)
                .padding(horizontal = 12.dp, vertical = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp),
                imageVector = IconPack.Bubbleplus,
                colorFilter = ColorFilter.tint(Color.Label.alternative),
                contentDescription = ""
            )
            Text(
                text = "메모",
                style = typography.captionAccent,
                color = Color.Label.alternative
            )
        }
    }
}

@Composable
private fun SettlementTab(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit
) {
    val tabs = listOf("1/N하기", "직접입력")
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState = rememberPagerState { tabs.size }
    val coroutineScope = rememberCoroutineScope()

    Column(modifier = modifier.fillMaxWidth()) {
        PaytoTabRow(
            modifier = Modifier.fillMaxWidth(),
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onSelectedTab = {
                selectedTabIndex = it
                coroutineScope.launch {
                    pagerState.animateScrollToPage(it)
                }
            }
        )
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
        ) {
            when (it) {
                0 -> SplitModeEqual(
                    modifier = Modifier.weight(1f),
                    model = model,
                    uiEvent = uiEvent,
                )

                else -> SplitModeCustom(modifier = Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun SplitModeEqual(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Amount(modifier = Modifier, model = model, uiEvent = uiEvent)
    }
}

@Composable
private fun Amount(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit,
) {
    val errorText by remember(model?.expenseModel?.amount) {
        mutableStateOf(model?.expenseModel?.getAmountErrorText() ?: "")
    }

    Column(modifier.padding(top = 16.dp)) {
        AmountTextField(
            modifier = Modifier.fillMaxWidth(),
            amount = model?.expenseModel?.amount,
            currency = model?.infoModel?.currency ?: "",
            onValueChange = {
                uiEvent.invoke(OnExpenseAmountChange(it.text))
            }
        )
        HorizontalDivider(
            thickness = 2.dp,
            color = if (errorText.isEmpty()) Color.Primary.normal else Color.Status.error,
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp),
            text = errorText,
            style = typography.captionAccent,
            color = Color.Status.error
        )
    }
}

@Composable
private fun AmountTextField(
    modifier: Modifier = Modifier,
    amount: Double?,
    currency: String,
    enabled: Boolean = true,
    onValueChange: (TextFieldValue) -> Unit,
) {
    var isFocused: Boolean by remember {
        mutableStateOf(false)
    }
    val focusManager = LocalFocusManager.current
    Box(
        modifier = modifier.size(48.dp)
    ) {
        AnimatedVisibility(
            modifier = Modifier.align(Alignment.Center),
            visible = amount == null,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "금액($currency)",
                color = Color.Label.disable,
                style = typography.heading1,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {
            BasicTextField(
                modifier = Modifier
                    .weight(1f)
                    .onFocusChanged {
                        isFocused = it.isFocused
                    },
                singleLine = true,
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                    }
                ),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),
                value = TextFieldValue(
                    text = if (amount == null) "" else "${amount.numberFormat()}$currency",
                    selection = TextRange((amount?.numberFormat() ?: "").length)
                ),
                enabled = enabled,
                onValueChange = onValueChange,
                textStyle = typography.heading1.copy(color = Color.Label.neutral),
            )
            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .size(24.dp)
                    .rippleClickable {
                        onValueChange.invoke(TextFieldValue(""))
                    },
                imageVector = IconPack.Circleclose,
                contentDescription = ""
            )
        }
    }
}

@Composable
private fun SplitModeCustom(modifier: Modifier = Modifier) {

}

@Composable
private fun Members() {

}


@Preview(showBackground = true)
@Composable
private fun JourneyExpenseScreenPreview() {
    val model = JourneyModel(
        JourneyInfoModel(id = "", title = "", currency = "JPY"),
        expenseModel = JourneyExpenseModel(amount = 100000000000.0)
    )
    ExpenseScreen(model = model, uiEvent = {})
}
