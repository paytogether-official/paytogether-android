package com.payto.feature.journey

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.runtime.derivedStateOf
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.common.ext.numberFormat
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.ContentBox
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoTabRow
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Bubbleplus
import com.payto.designsystem.icon.iconpack.Calendar
import com.payto.designsystem.icon.iconpack.Circleclose
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.R
import com.payto.feature.common.UiEvent
import com.payto.feature.journey.OnExpenseAmountChange.SplitMode
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
    var isShowDialog by remember {
        mutableStateOf(false)
    }
    ExpenseDateBottomSheetDialog(
        isShow = isShowDialog,
        model = model?.infoModel,
        onDismissRequest = {
            uiEvent.invoke(OnExpenseDateChange(it))
            isShowDialog = false
        }
    )
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            ContentBox(
                value = model?.expenseModel?.expenseDate ?: "",
                placeholder = "언제 여행을 떠나시나요?",
                endIcon = IconPack.Calendar
            ) {
                isShowDialog = true
            }
            CategoryList(
                modifier = Modifier.padding(vertical = 8.dp),
                selectedModel = model?.expenseModel?.category ?: ExpenseCategory.list.first(),
                uiEvent = uiEvent
            )
            Memo(
                model = model,
                uiEvent = uiEvent,
            )
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
    uiEvent: (UiEvent) -> Unit
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(ExpenseCategory.list) {
            CategoryItem(
                model = it,
                isSelected = selectedModel == it,
                uiEvent = uiEvent
            )
        }
    }
}

@Composable
private fun CategoryItem(
    model: ExpenseCategory,
    isSelected: Boolean,
    uiEvent: (UiEvent) -> Unit
) {
    val iconRes by remember(isSelected) {
        derivedStateOf {
            when (model) {
                ExpenseCategory.ETC -> if (isSelected) R.drawable.category_default_on else R.drawable.category_default
                ExpenseCategory.FOOD -> if (isSelected) R.drawable.category_food_on else R.drawable.category_food
                ExpenseCategory.TRANSPORT -> if (isSelected) R.drawable.category_bus_on else R.drawable.category_bus
                ExpenseCategory.TICKET -> if (isSelected) R.drawable.category_ticket_on else R.drawable.category_ticket
                ExpenseCategory.SHOPPING -> if (isSelected) R.drawable.category_shopping_on else R.drawable.category_shopping
                ExpenseCategory.ACCOMMODATION -> if (isSelected) R.drawable.category_hotel_on else R.drawable.category_hotel
                ExpenseCategory.FLIGHT -> if (isSelected) R.drawable.category_airplane_on else R.drawable.category_airplane
            }
        }
    }
    Column(
        modifier = Modifier
            .rippleClickable(shape = RoundedCornerShape(8.dp)) {
                uiEvent.invoke(OnExpenseCategoryChange(model))
            }
            .background(if (isSelected) Component.Fill.primary else Component.Fill.alternative)
            .padding(horizontal = 12.dp, vertical = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            modifier = Modifier
                .size(24.dp),
            imageVector = ImageVector.vectorResource(iconRes),
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
private fun Memo(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    uiEvent: (UiEvent) -> Unit
) {
    var isShowDialog by remember {
        mutableStateOf(false)
    }
    MemoBottomSheetDialog(
        isShow = isShowDialog,
        modifier = Modifier.fillMaxWidth(),
        onDismissRequest = {
            isShowDialog = false
            uiEvent.invoke(OnMemoChange(it))
        }
    )
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ContentBox(
            modifier = Modifier.weight(1f),
            value = model?.expenseModel?.memo ?: "",
            placeholder = "어디에 사용하셨나요?",
        ) {
            isShowDialog = true
        }
        Column(
            modifier = Modifier
                .size(48.dp)
                .rippleClickable(shape = RoundedCornerShape(16.dp)) {
                    isShowDialog = true
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
        Amount(modifier = Modifier, model = model, uiEvent = uiEvent, mode = SplitMode.EQUAL)
        SettlementSetting(modifier = Modifier.padding(top = 16.dp), model = model)
    }
}

@Composable
private fun Amount(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    mode: SplitMode,
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
                uiEvent.invoke(OnExpenseAmountChange(it.text, mode))
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
private fun SettlementSetting(
    modifier: Modifier = Modifier,
    model: JourneyModel?
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Chips(
            modifier = Modifier
                .align(Alignment.End)
                .rippleClickable {
                    // TODO
                },
            text = "정산설정",
            color = Component.Fill.primary,
            textColor = Color.Inverse.primary,
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 8.dp)
        ) {
            items(model?.expenseModel?.membersAmount ?: listOf()) {
                Member(model = it, isPayer = it.name == model?.expenseModel?.payer)
            }
        }
    }
}

@Composable
private fun Member(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel.MemberAmount,
    isPayer: Boolean,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
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
        if (model.amount != null) {
            Text(
                text = model.amount?.numberFormat() ?: "",
                style = typography.captionAccent,
                color = Color.Primary.normal
            )
        }
    }
}

@Composable
private fun SplitModeCustom(
    modifier: Modifier = Modifier,
) {

}

@Preview(showBackground = true)
@Composable
private fun JourneyExpenseScreenPreview() {
    val model = JourneyModel(
        infoModel = JourneyInfoModel(id = "", title = "", currency = "JPY", members = emptyList()),
        expenseModel = JourneyExpenseModel(
            amount = 100000000000.0,
            membersAmount = List(10) {
                JourneyExpenseModel.MemberAmount(name = "멤버 $it", amount = 0.0)
            }
        )
    )
    ExpenseScreen(model = model, uiEvent = {})
}
