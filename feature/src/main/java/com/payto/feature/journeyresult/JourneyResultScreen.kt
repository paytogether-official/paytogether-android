@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.payto.feature.journeyresult

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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.common.ext.numberFormat
import com.payto.common.navigate.CategoryDetail
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoTabRow
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.ArrowRight
import com.payto.designsystem.icon.iconpack.Chevrondown
import com.payto.designsystem.icon.iconpack.Chevronright
import com.payto.designsystem.icon.iconpack.Chevronup
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.ext.getDrawableId
import com.payto.feature.journey.OnChangeCurrency
import com.payto.model.ExpenseCategory
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyResultModel
import com.payto.model.ResultRatioModel
import com.payto.model.SettlementSummaryModel
import kotlinx.coroutines.launch


@Composable
fun JourneyResultRoute(
    viewModel: JourneyResultViewModel = hiltViewModel(),
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit
) {
    val model by viewModel.model.collectAsStateWithLifecycle()

    JourneyResultScreen(
        model = model,
        onNavigate = onNavigate,
        onBackClick = onBackClick,
        uiEvent = viewModel::onEvent
    )
}

@Composable
private fun JourneyResultScreen(
    model: JourneyResultModel?,
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(Color.Static.white)
            .fillMaxSize()
    ) {
        DefaultToolbar(
            modifier = Modifier.fillMaxWidth(),
            title = "정산결과",
            onBackClick = onBackClick
        )
        AnimatedVisibility(
            visible = model != null,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            if (model != null) {
                Column(modifier = Modifier.fillMaxSize()) {
                    TitleHeader(
                        modifier = Modifier.fillMaxWidth(),
                        model = model.infoModel,
                        uiEvent = uiEvent
                    )
                    Content(
                        modifier = Modifier.weight(1f),
                        onNavigate = onNavigate,
                        model = model
                    )
                }
            }
        }
    }
}

@Composable
private fun TitleHeader(
    modifier: Modifier,
    model: JourneyInfoModel,
    uiEvent: (UiEvent) -> Unit
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
                    text = "여정 생산자 외 ${model.members.size - 1}명",
                    color = Color.Label.neutral,
                    style = typography.captionAccent
                )
            }
            CurrencyToggle(
                modifier = Modifier,
                options = "KRW" to model.baseCurrency,
                selectedOption = "", // TODO
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
            Text(
                text = "총 ${model.totalExpenseAmount.numberFormat()}",
                style = typography.heading2,
                color = Color.Label.normal
            )
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
private fun Content(
    modifier: Modifier,
    onNavigate: (Any) -> Unit,
    model: JourneyResultModel
) {
    val tabs = listOf("비율보기", "정산결과")
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }
    val pagerState = rememberPagerState { tabs.size }
    val coroutineScope = rememberCoroutineScope()
    Column(modifier = modifier.fillMaxWidth()) {
        PaytoTabRow(
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
                0 -> RatioList(
                    modifier = Modifier.weight(1f),
                    onNavigate = onNavigate,
                    list = model.ratioModel
                )

                else -> SettlementSummary(Modifier.weight(1f), list = model.settlementSummaryModel)
            }
        }
    }
}

@Composable
private fun RatioList(
    modifier: Modifier,
    onNavigate: (Any) -> Unit,
    list: List<ResultRatioModel>
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        items(list) {
            RatioItem(modifier = Modifier, onNavigate = onNavigate, model = it)
        }
    }
}

@Composable
private fun RatioItem(
    modifier: Modifier,
    onNavigate: (Any) -> Unit,
    model: ResultRatioModel
) {
    val iconRes by remember {
        derivedStateOf {
            model.category.getDrawableId()
        }
    }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .rippleClickable {
                onNavigate.invoke(CategoryDetail)
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(36.dp)
                .background(
                    color = Component.Fill.primary,
                    shape = RoundedCornerShape(8.dp)
                ),
            imageVector = ImageVector.vectorResource(id = iconRes),
            contentDescription = model.category.displayName
        )
        Column(modifier = Modifier.padding(start = 12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = model.category.displayName,
                    style = typography.contentBold,
                    color = Color.Label.normal
                )
                Image(
                    modifier = Modifier.size(16.dp),
                    imageVector = IconPack.Chevronright,
                    contentDescription = model.category.displayName
                )
            }
            Text(
                text = model.amount.numberFormat(),
                style = typography.captionRegular,
                color = Color.Label.neutral
            )
        }
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.spacedBy(4.dp, alignment = Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "${model.percentage.numberFormat()}%",
                style = typography.captionAccent,
                color = Color.Primary.normal
            )
            Box(modifier = Modifier.weight(1f, fill = false)) {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .height(36.dp)
                        .fillMaxWidth((model.percentage / 100).toFloat())
                        .background(
                            color = Color.Primary.normal,
                            shape = RoundedCornerShape(8.dp)
                        )
                )
            }
        }
    }
}

@Composable
private fun SettlementSummary(
    modifier: Modifier,
    list: List<SettlementSummaryModel>
) {
    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = modifier.matchParentSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 32.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "보내는 사람",
                            style = typography.captionAccent,
                            color = Color.Label.normal
                        )
                    }
                    Image(
                        modifier = Modifier.weight(1f),
                        imageVector = IconPack.ArrowRight,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color.Primary.normal)
                    )
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            text = "받는 사람",
                            style = typography.captionAccent,
                            color = Color.Label.normal
                        )
                    }
                }
            }
            items(list) {
                SettlementSummaryItem(model = it)
            }
        }

        PaytoButton(
            text = "공유하기",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.BottomCenter),
        ) {
            // TODO
        }
    }
}

@Composable
private fun SettlementSummaryItem(
    modifier: Modifier = Modifier,
    model: SettlementSummaryModel
) {
    Row(
        modifier = modifier
            .background(color = Component.Fill.normal, shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color.Background.normal,
                    shape = RoundedCornerShape(12.dp)
                )
                .weight(1f)
                .padding(horizontal = 8.dp, vertical = 7.dp),
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = model.sender,
                style = typography.captionAccent,
                color = Color.Label.normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Box(modifier = Modifier.defaultMinSize(minWidth = 86.dp)) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = model.amount.toString(),
                style = typography.contentBold,
                color = Color.Primary.normal
            )
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color.Background.normal,
                    shape = RoundedCornerShape(12.dp)
                )
                .weight(1f)
                .padding(horizontal = 8.dp, vertical = 7.dp),
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = model.receiver,
                style = typography.captionAccent,
                color = Color.Label.normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyResultScreenPreview() {
    val model = JourneyResultModel(
        ratioModel = listOf(
            ResultRatioModel(ExpenseCategory.ACCOMMODATION, 0.333, 12.0),
            ResultRatioModel(ExpenseCategory.ACCOMMODATION, 0.5, 12.0),
            ResultRatioModel(ExpenseCategory.ACCOMMODATION, 0.22, 12.0),
            ResultRatioModel(ExpenseCategory.ACCOMMODATION, 1.0, 12.0),
        ),
        settlementSummaryModel = listOf(
            SettlementSummaryModel("sender", 123456.0, "receiver"),
            SettlementSummaryModel("sender", 123456.0, "receiver"),
            SettlementSummaryModel("sender", 123456.0, "receiver"),
        )
    )
    JourneyResultScreen(onBackClick = {}, onNavigate = {}, model = model, uiEvent = {})
}

@Preview(showBackground = true)
@Composable
private fun SettlementSummaryPreview() {
    val model = listOf(
        SettlementSummaryModel("sender", 123456.0, "receiver"),
        SettlementSummaryModel("sender", 123456.0, "receiver"),
        SettlementSummaryModel("sender", 123456.0, "receiver"),
    )
    SettlementSummary(modifier = Modifier, list = model)
}
