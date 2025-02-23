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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.payto.common.ext.toPx
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoButtonStatus
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
import com.payto.feature.pastjourney.JourneyDate
import kotlinx.coroutines.launch

@Composable
fun JourneyDetailRoute(
    viewModel: JourneyDetailViewModel = hiltViewModel(),
    onBackClick: () -> Unit
) {
    JourneyDetailScreen(
        modifier = Modifier.background(color = Color.Static.white),
        title = viewModel.detail.journeyId
    )
}


@Composable
fun JourneyDetailScreen(
    modifier: Modifier = Modifier,
    title: String,
) {
    val list = remember {
        List((1..10).random()) {
            JourneyDetailData(
                date = "3월 12일",
                List((1..10).random()) {
                    JourneyDetailInfo("항목명 $it")
                }
            )
        }

    }
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        TitleHeader(modifier = Modifier, title = title)
        DetailContent()
        JourneyDetailList(
            modifier = Modifier.weight(1f),
            list = list
        )
    }
}


@Composable
private fun TitleHeader(
    modifier: Modifier,
    title: String
) {
    var selectedOption by remember { mutableStateOf("KRW") }
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
                    text = title,
                    color = Color.Label.normal,
                    style = typography.highlightBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "여정 생산자 외 3명",
                    color = Color.Label.neutral,
                    style = typography.captionAccent
                )
            }
            CurrencyToggle(
                modifier = Modifier,
                options = "KRW" to "JPY",
                selectedOption = selectedOption,
                onOptionSelected = { selectedOption = it }
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
            Text(text = "총 123,432", style = typography.heading2, color = Color.Label.normal)
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
            text = "24년 4월 13일 - 4월 17일",
            color = Color.Label.alternative,
            style = typography.captionRegular
        )
        PaytoButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp, bottom = 8.dp),
            text = "정산결과",
            onClick = {}, // TODO
            status = PaytoButtonStatus.SECONDARY
        )
        HorizontalDivider(color = Color.Line.neutral, thickness = 4.dp)
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
private fun DetailContent(modifier: Modifier = Modifier) {
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
        JourneyDetailOrder(modifier = Modifier.padding(8.dp))
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
private fun JourneyDetailOrder(modifier: Modifier) {
    var selectedOrder by remember {
        mutableStateOf(JourneyDetailOrder.OLDEST)
    }
    var isShowOrderDialog by remember {
        mutableStateOf(false)
    }
    JourneyDetailOrderBottomSheetDialog(
        modifier = Modifier,
        isShow = isShowOrderDialog,
        selectedOrder = selectedOrder,
        onSelected = {
            selectedOrder = it
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
private fun JourneyDetailList(modifier: Modifier, list: List<JourneyDetailData>) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        list.forEach {
            item {
                JourneyDate(modifier = Modifier, date = it.date)
            }
            items(it.list) { model ->
                JourneyItem(modifier = Modifier, model = model)
            }
        }
    }
}

@Composable
private fun JourneyItem(
    modifier: Modifier,
    model: JourneyDetailInfo
) {
    Row(
        modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(16.dp))
            .rippleClickable {

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
                        )
                )
                Text(
                    text = model.title,
                    style = typography.contentAccent,
                    color = Color.Label.normal
                )
            }
            Text(
                text = "정산 입력자 외 몇명",
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
                text = "343,123",
                style = typography.heading3,
                color = Color.Label.normal,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            Chips(modifier = Modifier, text = "JPY", color = Color.Label.neutral)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyDetailScreenPreview() {
    JourneyDetailScreen(modifier = Modifier.background(Color.Static.white), title = "여정 제목")
}
