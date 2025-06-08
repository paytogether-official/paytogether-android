@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.designsystem.component.PaytoTabRow
import com.payto.designsystem.dialog.DialogData
import com.payto.designsystem.dialog.PaytoDialog
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Listcategory
import com.payto.designsystem.icon.iconpack.Morevertical
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.R
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.feature.journey.JourneySetting.FINISH
import com.payto.feature.journey.JourneySetting.LEAVE
import com.payto.feature.journey.JourneySetting.SETTINGS
import com.payto.feature.journey.JourneySetting.SHARE
import com.payto.feature.journey.expense.ExpenseScreen
import com.payto.feature.journey.expense.JourneyExpenseViewModel
import com.payto.feature.journeydetail.JourneyDetailScreen
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import kotlinx.coroutines.launch

@Composable
fun JourneyRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    viewModel: JourneyExpenseViewModel = hiltViewModel()
) {
    LaunchedEffect(Unit) {
        viewModel.setInitData()
    }
    val journeyModel by viewModel.journeyData.collectAsStateWithLifecycle()

    HandleSideEffect(viewModel, onNavigate, onBackClick)
    JourneyScreen(
        model = journeyModel,
        onNavigate = onNavigate,
        uiEvent = viewModel::onEvent
    )
}

@Composable
private fun JourneyScreen(
    model: JourneyModel?,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
            .statusBarsPadding()
            .background(color = Color.Static.white)
    ) {
        Toolbar(title = model?.infoModel?.title ?: "")
        AnimatedVisibility(model != null, modifier = Modifier.weight(1f)) {
            if (model != null) {
                Content(
                    modifier = Modifier.weight(1f),
                    model = model,
                    onNavigate = onNavigate,
                    uiEvent = uiEvent
                )
            }
        }
    }
}

@Composable
private fun Toolbar(
    modifier: Modifier = Modifier,
    title: String = ""
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Listcategory,
            contentDescription = ""
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = title,
            style = typography.highlightBold
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    model: JourneyModel,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    val tabs = listOf("지출 추가", "지출 내역 보기")
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }
    val pagerState = rememberPagerState { tabs.size }
    val coroutineScope = rememberCoroutineScope()

    var isShowSettingDialog by remember {
        mutableStateOf(false)
    }

    var isShowCloseDialog by remember {
        mutableStateOf(false)
    }


    PaytoDialog(
        isShowDialog = isShowCloseDialog,
        model = remember {
            DialogData(
                title = "여정을 마무리하시겠어요?",
                subtitle = "더 이상 항목을 추가할 수 없어요",
                firstButton = "닫기",
                secondButton = "마무리하기",
                icon = R.drawable.travel_insurance
            )
        },
        onDismissRequest = {
            isShowCloseDialog = false
        },
        secondButtonClick = {
            uiEvent.invoke(OnClickClose)
        }
    )

    JourneySettingBottomSheetDialog(
        modifier = Modifier.fillMaxWidth(),
        isShow = isShowSettingDialog,
        onDismissRequest = {
            isShowSettingDialog = false
            when (it) {
                FINISH -> isShowCloseDialog = true
                SHARE -> {
                    // TODO
                }

                SETTINGS -> {
                    // TODO
                }

                LEAVE -> {
                    // TODO
                }

                null -> {
                    // TODO
                }
            }
        }
    )

    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            PaytoTabRow(
                modifier = Modifier.weight(1f),
                tabs = tabs,
                selectedTabIndex = selectedTabIndex,
                onSelectedTab = {
                    selectedTabIndex = it
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(it)
                    }
                }
            )
            Image(
                modifier = Modifier
                    .rippleClickable {
                        isShowSettingDialog = true
                    }
                    .padding(12.dp)
                    .size(24.dp),
                imageVector = IconPack.Morevertical,
                contentDescription = ""
            )
        }
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
        ) {
            when (it) {
                0 -> ExpenseScreen(
                    modifier = Modifier.weight(1f),
                    model = model,
                    onNavigate = onNavigate,
                    uiEvent = uiEvent,
                )

                else -> JourneyDetailScreen(
                    modifier = Modifier.weight(1f),
                    uiEvent = uiEvent,
                    model = model.detailModel,
                    onNavigate = onNavigate
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyScreenPreview() {
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
    JourneyScreen(model = model, onNavigate = {}, uiEvent = {})
}
