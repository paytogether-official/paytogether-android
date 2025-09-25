package com.payto.feature.journey.expense

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
import androidx.compose.foundation.layout.defaultMinSize
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.payto.common.ext.numberFormat
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.ContentBox
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoButtonStatus
import com.payto.designsystem.component.PaytoTabRow
import com.payto.designsystem.component.TextBox
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Bubbleplus
import com.payto.designsystem.icon.iconpack.Calendar
import com.payto.designsystem.icon.iconpack.Circleclose
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.UiEvent
import com.payto.feature.common.ext.getDrawableId
import com.payto.feature.journey.ClickAddExpense
import com.payto.feature.journey.MemoBottomSheetDialog
import com.payto.feature.journey.OnCategoryDescriptionChange
import com.payto.feature.journey.OnExpenseAmountChange
import com.payto.feature.journey.OnExpenseAmountChange.SplitMode
import com.payto.feature.journey.OnExpenseCategoryChange
import com.payto.feature.journey.OnExpenseDateChange
import com.payto.feature.journey.OnExpenseModeChange
import com.payto.feature.journey.OnMemoChange
import com.payto.model.ExpenseCategory
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import com.payto.model.navigate.ExpenseSetting
import kotlinx.coroutines.launch


@Composable
fun ExpenseScreen(
    modifier: Modifier = Modifier,
    model: JourneyModel,
    isEdit: Boolean = false,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    val focusManager = LocalFocusManager.current

    var isShowDialog by remember {
        mutableStateOf(false)
    }
    val isFullFilled by remember(model) {
        derivedStateOf {
            model.createExpenseModel.isFullyFilled()
        }
    }

    ExpenseDateBottomSheetDialog(
        isShow = isShowDialog,
        selectedDate = model.createExpenseModel.expenseDate,
        onDismissRequest = {
            if (it != null) {
                uiEvent.invoke(OnExpenseDateChange(it))
            }
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
                value = model.createExpenseModel.expenseDate?.toString() ?: "",
                placeholder = "언제 여행을 떠나시나요?",
                endIcon = IconPack.Calendar
            ) {
                isShowDialog = true
            }
            CategoryList(
                modifier = Modifier.padding(vertical = 8.dp),
                selectedModel = model.createExpenseModel.category,
                uiEvent = uiEvent
            )
            Memo(
                model = model,
                uiEvent = uiEvent,
            )
            SettlementTab(
                modifier = Modifier.fillMaxWidth(),
                model = model,
                onNavigate = onNavigate,
                uiEvent = uiEvent
            )
        }

        if (isEdit.not()) {
            PaytoButton(
                modifier = Modifier.fillMaxWidth(),
                text = "지출 추가",
                enabled = isFullFilled,
            ) {
                focusManager.clearFocus()
                uiEvent.invoke(ClickAddExpense)
            }
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
            model.getDrawableId(isSelected)
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
    var hasMemo by remember(model) {
        mutableStateOf(model?.createExpenseModel?.memo.isNullOrEmpty().not())
    }

    MemoBottomSheetDialog(
        isShow = isShowDialog,
        modifier = Modifier.fillMaxWidth(),
        initialText = model?.createExpenseModel?.memo,
        onDismissRequest = {
            isShowDialog = false
            uiEvent.invoke(OnMemoChange(it))
        }
    )
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextBox(
            modifier = Modifier.weight(1f),
            value = model?.createExpenseModel?.categoryDescription ?: "",
            placeholder = "어디에 사용하셨나요?",
        ) {
            uiEvent.invoke(OnCategoryDescriptionChange(it))
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
                colorFilter = ColorFilter.tint(if (hasMemo) Color.Primary.normal else Color.Label.alternative),
                contentDescription = ""
            )
            Text(
                text = "메모",
                style = typography.captionAccent,
                color = if (hasMemo) Color.Primary.normal else Color.Label.alternative
            )
        }
    }
}


@Composable
private fun SettlementTab(
    modifier: Modifier = Modifier,
    model: JourneyModel,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    val tabs = listOf("1/N하기", "직접입력")
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState = rememberPagerState { tabs.size }
    val coroutineScope = rememberCoroutineScope()

    var showModeChangeDialog by remember {
        mutableStateOf(false)
    }
    ModeChangeDialog(
        isShowDialog = showModeChangeDialog,
        onDismissRequest = {
            showModeChangeDialog = false
            if (it) {
                uiEvent.invoke(OnExpenseModeChange(SplitMode.EQUAL))
                selectedTabIndex = 0
            }
        }
    )

    LaunchedEffect(selectedTabIndex) {
        coroutineScope.launch {
            pagerState.animateScrollToPage(selectedTabIndex)
        }
    }

    Column(modifier = modifier.fillMaxWidth()) {
        PaytoTabRow(
            modifier = Modifier.fillMaxWidth(),
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onSelectedTab = {
                if (it == 1) {
                    uiEvent.invoke(OnExpenseModeChange(SplitMode.CUSTOM))
                    selectedTabIndex = it
                } else {
                    showModeChangeDialog = true
                }
            }
        )
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
        ) {
            when (it) {
                0 -> SplitMode(
                    modifier = Modifier.weight(1f),
                    model = model,
                    mode = SplitMode.EQUAL,
                    onNavigate = onNavigate,
                    uiEvent = uiEvent,
                )

                else -> SplitMode(
                    modifier = Modifier.weight(1f),
                    model = model,
                    mode = SplitMode.CUSTOM,
                    onNavigate = onNavigate,
                    uiEvent = uiEvent,
                )
            }
        }
    }
}

@Composable
private fun ModeChangeDialog(
    isShowDialog: Boolean,
    onDismissRequest: (Boolean) -> Unit
) {
    if (isShowDialog) {
        Dialog(onDismissRequest = { onDismissRequest(false) }) {
            Column(
                modifier = Modifier
                    .background(Color.Static.white, shape = RoundedCornerShape(24.dp))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                // 제목과 안내 텍스트
                Text(
                    text = "총 금액을 기준으로 1/N하여 나눕니다.\n변경하시겠습니까?",
                    style = typography.highlightAccent,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 24.dp)
                )

                // 버튼 행
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    PaytoButton(
                        onClick = { onDismissRequest(false) },
                        modifier = Modifier.weight(1f),
                        status = PaytoButtonStatus.NORMAL,
                        text = "취소"
                    )

                    // 변경하기 버튼
                    PaytoButton(
                        onClick = { onDismissRequest(true) },
                        modifier = Modifier.weight(1f),
                        text = "변경하기"
                    )
                }
            }
        }
    }
}

@Composable
private fun SplitMode(
    modifier: Modifier = Modifier,
    model: JourneyModel,
    mode: SplitMode,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Amount(modifier = Modifier, model = model, uiEvent = uiEvent, mode = mode)
        SettlementSetting(
            modifier = Modifier.padding(top = 16.dp),
            model = model,
            mode = mode,
            onNavigate = onNavigate,
            uiEvent = uiEvent,
        )
    }
}

@Composable
private fun Amount(
    modifier: Modifier = Modifier,
    model: JourneyModel?,
    mode: SplitMode,
    uiEvent: (UiEvent) -> Unit,
) {
    val errorText by remember(model?.createExpenseModel?.amount) {
        mutableStateOf(model?.createExpenseModel?.getAmountErrorText() ?: "")
    }

    Column(modifier.padding(top = 16.dp)) {
        AmountTextField(
            modifier = Modifier.fillMaxWidth(),
            amount = model?.createExpenseModel?.amount,
            currency = model?.infoModel?.baseCurrency ?: "",
            onValueChange = {
                uiEvent.invoke(OnExpenseAmountChange(it.text, mode))
            },
            mode = mode,
            enabled = mode == SplitMode.EQUAL
        )
        if (mode == SplitMode.EQUAL) {
            HorizontalDivider(
                thickness = 2.dp,
                color = if (errorText.isEmpty()) Color.Primary.normal else Color.Status.error,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
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
    amount: String?,
    currency: String,
    enabled: Boolean = true,
    mode: SplitMode,
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
                text = if (mode == SplitMode.EQUAL) "금액입력($currency)" else "0$currency",
                color = if (mode == SplitMode.EQUAL) Color.Label.disable else Color.Label.neutral,
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
            if (enabled) {
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
}

@Composable
private fun SettlementSetting(
    modifier: Modifier = Modifier,
    model: JourneyModel,
    mode: SplitMode,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Chips(
            modifier = Modifier
                .align(Alignment.End)
                .rippleClickable {
                    onNavigate.invoke(ExpenseSetting(model.infoModel.id))
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
            items(model.createExpenseModel.membersAmount) {
                Member(
                    modifier = Modifier.fillMaxWidth(),
                    model = it,
                    isPayer = it.name == model.createExpenseModel.payer,
                    mode = mode,
                    uiEvent = uiEvent
                )
            }
        }
    }
}

@Composable
private fun Member(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel.MemberAmount,
    isPayer: Boolean,
    mode: SplitMode,
    uiEvent: (UiEvent) -> Unit,
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
        MemberAmountTextField(
            modifier = Modifier,
            model = model,
            mode = mode,
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun MemberAmountTextField(
    modifier: Modifier = Modifier,
    model: JourneyExpenseModel.MemberAmount,
    mode: SplitMode,
    uiEvent: (UiEvent) -> Unit,
) {
    var isFocused: Boolean by remember {
        mutableStateOf(false)
    }
    val text by remember(model, mode) {
        derivedStateOf {
            when {
                mode == SplitMode.EQUAL && model.amount == null -> ""
                model.amount == null -> "금액입력"
                else -> "${model.amount?.numberFormat()}"
            }
        }
    }

    val focusManager = LocalFocusManager.current
    BasicTextField(
        modifier = modifier
            .drawBehind {
                if (isFocused) {
                    drawRect(
                        color = Color.Primary.normal,
                        topLeft = Offset(0f, size.height),
                        size = Size(width = size.width, height = 2.dp.toPx())
                    )
                }
            }
            .onFocusChanged {
                isFocused = it.isFocused
            },
        enabled = mode == SplitMode.CUSTOM,
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
            text = text,
            selection = TextRange(text.length)
        ),
        onValueChange = {
            uiEvent.invoke(OnExpenseAmountChange(it.text, mode, model.name))
        },
        textStyle = typography.contentAccent.copy(
            textAlign = TextAlign.End,
            color = if (model.amount == null) Color.Label.disable else Color.Label.alternative
        ),
    )

}

@Preview(showBackground = true)
@Composable
private fun JourneyExpenseScreenPreview() {
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
    ExpenseScreen(model = model, onNavigate = {}, uiEvent = {})
}
