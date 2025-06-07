@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journeydetail

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupPositionProvider
import androidx.hilt.navigation.compose.hiltViewModel
import com.payto.common.ext.numberFormat
import com.payto.common.ext.toPx
import com.payto.common.navigate.JourneyExpenseItemDetail
import com.payto.common.navigate.JourneyResult
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoButtonStatus
import com.payto.designsystem.dialog.DialogData
import com.payto.designsystem.dialog.DialogStyle
import com.payto.designsystem.dialog.PaytoDialog
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Caretdown
import com.payto.designsystem.icon.iconpack.Chevrondown
import com.payto.designsystem.icon.iconpack.Chevronup
import com.payto.designsystem.icon.iconpack.Circlequestionfill
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.R
import com.payto.feature.common.HistoryToolbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.ext.getDrawableId
import com.payto.feature.journey.OnChangeCurrency
import com.payto.feature.journey.OnChangeOrder
import com.payto.feature.journeyhistory.JourneyDate
import com.payto.model.JourneyDetailInfo
import com.payto.model.JourneyDetailModel
import com.payto.model.JourneyDetailOrder
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import kotlinx.coroutines.launch

@Composable
fun JourneyDetailRoute(
    viewModel: JourneyDetailViewModel = hiltViewModel(),
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit
) {
    var isShowDeleteDialog by remember {
        mutableStateOf(false)
    }

    PaytoDialog(
        isShowDialog = isShowDeleteDialog,
        model = DialogData(
            style = DialogStyle.RED,
            title = "여정을 삭제하시겠어요?",
            subtitle = "삭제시 모든 데이터가 사라집니다.",
            firstButton = "닫기",
            secondButton = "삭제하기",
            icon = R.drawable.dialog_delete
        ),
        onDismissRequest = {
            isShowDeleteDialog = false
        },
        secondButtonClick = {
            // TODO 삭제하기
        }
    )

    JourneyDetailScreen(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(color = Color.Static.white),
        onNavigate = onNavigate,
        uiEvent = viewModel::onEvent,
        model = JourneyDetailModel(), // TODO
        toolbar = {
            HistoryToolbar(
                modifier = Modifier.fillMaxWidth(),
                onBackClick = onBackClick,
                onShareClick = {
                    // TODO
                },
                onDeleteClick = {
                    isShowDeleteDialog = true
                }
            )
        }
    )
}

@Composable
fun JourneyDetailScreen(
    modifier: Modifier = Modifier,
    model: JourneyDetailModel,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit,
    toolbar: @Composable () -> Unit = {}
) {

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        toolbar.invoke()
        TitleHeader(
            modifier = Modifier,
            model = model.journeyInfo,
            currency = model.params.quoteCurrency,
            uiEvent = uiEvent,
            onNavigate = onNavigate
        )
        DetailContent(uiEvent = uiEvent, selectedOrder = model.params.order)
        JourneyDetailList(
            modifier = Modifier.weight(1f),
            list = model.list,
            onNavigate = onNavigate
        )
    }
}


@Composable
private fun TitleHeader(
    modifier: Modifier,
    model: JourneyInfoModel,
    currency: String,
    uiEvent: (UiEvent) -> Unit,
    onNavigate: (Any) -> Unit,
) {
    var isExpanded by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = model.title,
                    color = Color.Label.normal,
                    style = typography.highlightBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "여정 생산자 외 ${model.members.size.minus(1)}명",
                    color = Color.Label.neutral,
                    style = typography.captionAccent
                )
            }
            CurrencyToggle(
                modifier = Modifier,
                options = "KRW" to model.baseCurrency,
                selectedOption = currency,
                onOptionSelected = {
                    uiEvent.invoke(OnChangeCurrency(it))
                }
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 8.dp)
                .padding(horizontal = 16.dp)
                .rippleClickable {
                    isExpanded = !isExpanded
                },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(3.dp)
        ) {
            Text(text = "총 ${model.totalExpenseAmount.numberFormat()}", style = typography.heading2, color = Color.Label.normal)
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = if (isExpanded) IconPack.Chevronup else IconPack.Chevrondown,
                contentDescription = ""
            )
        }
        AnimatedVisibility(visible = isExpanded) {
            UsageAmountByDate(modifier = Modifier.fillMaxWidth())
        }
        Text(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 2.dp),
            text = model.dateRange,
            color = Color.Label.alternative,
            style = typography.captionRegular
        )
        if (model.isClosed) {
            PaytoButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp),
                text = "정산결과",
                onClick = {
                    onNavigate.invoke(JourneyResult(model.id))
                },
                status = PaytoButtonStatus.SECONDARY
            )
        }
        HorizontalDivider(
            color = Color.Line.neutral,
            thickness = 4.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
    }
}

@Composable
private fun UsageAmountByDate(
    modifier: Modifier,
) {
    LazyRow(
        modifier = modifier.padding(vertical = 8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(10) {
            UsageItem()
        }
    }
}

@Composable
private fun UsageItem() {
    Column(
        modifier = Modifier
            .background(Component.Fill.normal, shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(text = "4월 13일", color = Color.Label.neutral, style = typography.captionRegular)
        Text(text = "123,145", color = Color.Label.normal, style = typography.contentRegular)
    }
}

@Composable
private fun DetailContent(
    modifier: Modifier = Modifier,
    selectedOrder: JourneyDetailOrder,
    uiEvent: (UiEvent) -> Unit,
) {
    val tabs = listOf("전체", "1일차", "2일차", "3일차", "4일차", "5일차", "6일차", "7일차")
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }
    val tooltipState = rememberTooltipState(initialIsVisible = false)
    val scope = rememberCoroutineScope()
    val tooltipLeftPadding = 30.dp.toPx()

    val positionProvider = remember {
        object : PopupPositionProvider {
            override fun calculatePosition(
                anchorBounds: IntRect,
                windowSize: IntSize,
                layoutDirection: LayoutDirection,
                popupContentSize: IntSize
            ): IntOffset {
                val x = anchorBounds.left - tooltipLeftPadding.toInt()
                val y = anchorBounds.bottom + anchorBounds.height + 50
                return IntOffset(x, y)
            }
        }
    }

    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier,
                text = "상세내역",
                color = Color.Label.normal,
                style = typography.highlightBold
            )
            TooltipBox(
                positionProvider = positionProvider,
                tooltip = {
                    Box(
                        modifier = Modifier
                            .widthIn(max = 220.dp)
                            .background(
                                Color.Label.neutral,
                                shape = RoundedCornerShape(4.dp)
                            )

                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 34.dp, y = (-9).dp),
                            imageVector = ImageVector.vectorResource(id = R.drawable.polygon_arrow_top),
                            contentDescription = null,
                        )
                        Text(
                            modifier = Modifier.padding(8.dp),
                            text = "원화 환전 기능은 그날 환율을 기준으로 하며 실제 금액과는 차이가 있을 수 있습니다.",
                            style = typography.captionAccent,
                            color = Color.Inverse.label
                        )
                    }
                },
                state = tooltipState
            ) {

            }
            Image(
                modifier = Modifier
                    .size(20.dp)
                    .rippleClickable {
                        scope.launch {
                            tooltipState.show()
                        }
                    },
                imageVector = IconPack.Circlequestionfill,
                contentDescription = ""
            )
        }

        DailyTab(
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onSelectedTab = { selectedTabIndex = it }
        )
        JourneyDetailOrder(
            modifier = Modifier.padding(8.dp),
            selectedOrder = selectedOrder,
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun DailyTab(
    tabs: List<String>,
    selectedTabIndex: Int,
    onSelectedTab: (Int) -> Unit
) {
    PrimaryScrollableTabRow(
        modifier = Modifier.padding(top = 16.dp),
        selectedTabIndex = selectedTabIndex,
        contentColor = Color.Static.white,
        containerColor = Color.Static.white,
        edgePadding = 0.dp,
        indicator = {
            TabRowDefaults.PrimaryIndicator(
                Modifier.tabIndicatorOffset(selectedTabIndex, matchContentSize = false),
                height = 2.dp,
                color = Color.Primary.normal
            )
        },
        divider = {
            HorizontalDivider(color = Color.Line.neutral, thickness = 1.dp)
        }
    ) {
        tabs.forEachIndexed { index, title ->
            Text(
                modifier = Modifier
                    .fillMaxHeight()
                    .rippleClickable {
                        onSelectedTab.invoke(index)
                    }
                    .padding(bottom = 4.dp),
                textAlign = TextAlign.Center,
                text = title,
                style = typography.contentBold,
                color = if (selectedTabIndex == index) Color.Primary.normal else Color.Label.alternative
            )
        }
    }
}

@Composable
private fun JourneyDetailOrder(
    modifier: Modifier,
    selectedOrder: JourneyDetailOrder,
    uiEvent: (UiEvent) -> Unit
) {
    var isShowOrderDialog by remember {
        mutableStateOf(false)
    }
    JourneyDetailOrderBottomSheetDialog(
        modifier = Modifier,
        isShow = isShowOrderDialog,
        selectedOrder = selectedOrder,
        onSelected = {
            uiEvent.invoke(OnChangeOrder(it))
        },
        onDismissRequest = {
            isShowOrderDialog = false
        }
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .rippleClickable {
                isShowOrderDialog = true
            },
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = selectedOrder.orderName,
            style = typography.captionAccent,
            color = Color.Label.neutral
        )
        Image(
            imageVector = IconPack.Caretdown,
            contentDescription = "정렬",
            colorFilter = ColorFilter.tint(Color.Label.neutral)
        )
    }
}

@Composable
internal fun JourneyDetailList(
    modifier: Modifier,
    list: List<JourneyDetailInfo>,
    onNavigate: (Any) -> Unit,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (list.isEmpty()) {
            item {
                EmptyBox(modifier = Modifier.fillParentMaxHeight())
            }
        }
        list.forEach {
            item {
                JourneyDate(modifier = Modifier, date = it.date)
            }
            items(it.list) { model ->
                JourneyItem(modifier = Modifier, model = model, onNavigate = onNavigate)
            }
        }
    }
}

@Composable
private fun EmptyBox(modifier: Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(painter = painterResource(R.drawable.empty_box), contentDescription = "empty box")
            Text(
                text = "입력된 항목이 없습니다",
                style = typography.contentAccent,
                color = Color.Label.disable
            )
        }
    }
}

@Composable
private fun JourneyItem(
    modifier: Modifier,
    model: JourneyExpenseModel,
    onNavigate: (Any) -> Unit,
) {
    Row(
        modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(16.dp))
            .rippleClickable {
                onNavigate.invoke(
                    JourneyExpenseItemDetail(
                        journeyId = model.journeyId,
                        expenseId = model.id,
                        quoteCurrency = model.quoteCurrency
                    )
                )
            }
            .background(color = Component.Fill.normal)
            .padding(vertical = 8.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .background(
                            color = Component.Fill.primary,
                            shape = RoundedCornerShape(4.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier.size(15.dp),
                        imageVector = ImageVector.vectorResource(model.category.getDrawableId()),
                        contentDescription = "category"
                    )
                }
                Text(
                    modifier = Modifier,
                    text = model.categoryDescription ?: model.category.displayName,
                    style = typography.contentAccent,
                    color = Color.Label.normal,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Text(
                text = "정산 입력자 외 ${model.membersAmount.size.minus(1)}명",
                style = typography.captionRegular,
                color = Color.Label.neutral
            )
        }
        Row(
            modifier = Modifier.weight(1f, fill = false),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f, fill = false),
                text = model.amount?.numberFormat() ?: "",
                style = typography.heading3,
                color = Color.Label.normal,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            Chips(modifier = Modifier, text = model.quoteCurrency, color = Color.Label.neutral)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyDetailScreenPreview() {
    JourneyDetailScreen(
        modifier = Modifier.background(Color.Static.white),
        onNavigate = {},
        uiEvent = {},
        model = JourneyDetailModel(),
        toolbar = {
            HistoryToolbar(
                modifier = Modifier.fillMaxWidth(),
                onBackClick = {},
                onShareClick = {},
                onDeleteClick = {}
            )
        }
    )
}
