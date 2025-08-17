@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
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
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
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
import com.payto.designsystem.dialog.DialogStyle
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
import com.payto.feature.journey.JourneySettingType.FINISH
import com.payto.feature.journey.JourneySettingType.LEAVE
import com.payto.feature.journey.JourneySettingType.SETTINGS
import com.payto.feature.journey.JourneySettingType.SHARE
import com.payto.feature.journey.expense.ExpenseScreen
import com.payto.feature.journey.expense.JourneyExpenseViewModel
import com.payto.feature.journeydetail.JourneyDetailScreen
import com.payto.model.JourneyExpenseModel
import com.payto.model.JourneyInfoModel
import com.payto.model.JourneyModel
import com.payto.model.navigate.JourneySetting
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
    val ongoingJourneyList by viewModel.ongoingJourneys.collectAsStateWithLifecycle()

    HandleSideEffect(viewModel, onNavigate, onBackClick)
    JourneyScreen(
        model = journeyModel,
        ongoingJourneyList = ongoingJourneyList,
        onNavigate = onNavigate,
        uiEvent = viewModel::onEvent
    )
}

@Composable
private fun JourneyScreen(
    model: JourneyModel?,
    ongoingJourneyList: List<JourneyInfoModel>,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    // 드로어가 열려 있을 때 뒤로가기 버튼 처리
    BackHandler(enabled = drawerState.isOpen) {
        scope.launch {
            drawerState.close()
        }
    }

    ModalNavigationDrawer(
        modifier = Modifier.fillMaxSize(),
        drawerState = drawerState,
        drawerContent = {
            OngoingJourneyListDrawerSheet(
                ongoingJourneyList = ongoingJourneyList,
                currentJourneyInfoModel = model?.infoModel,
                onNavigate = { screen ->
                    scope.launch {
                        drawerState.close()
                    }.invokeOnCompletion {
                        onNavigate(screen)
                    }
                },
                uiEvent = uiEvent
            )
        }
    ) {
        Scaffold(
            modifier = Modifier
                .navigationBarsPadding()
                .statusBarsPadding(),
            containerColor = Color.Static.white,
            contentColor = Color.Static.white,
            topBar = {
                Toolbar(
                    title = model?.infoModel?.title ?: "",
                    onNavigationIconClick = {
                        scope.launch {
                            drawerState.apply {
                                if (isClosed) open() else close()
                            }
                        }
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues) // Scaffold로부터 content padding을 적용합니다.
            ) {
                AnimatedVisibility(model != null, modifier = Modifier.weight(1f)) {
                    if (model != null) {
                        Content(
                            modifier = Modifier.fillMaxSize(),
                            model = model,
                            onNavigate = onNavigate,
                            uiEvent = uiEvent
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun Toolbar(
    modifier: Modifier = Modifier,
    title: String = "",
    onNavigationIconClick: () -> Unit
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .rippleClickable(onClick = onNavigationIconClick) // 클릭 시 드로어 열기
                .align(Alignment.CenterStart)
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Listcategory,
            contentDescription = "메뉴 열기" // contentDescription 추가
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = title,
            style = typography.highlightBold,
            color = Color.Label.normal
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

    var isShowLeaveDialog by remember {
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
                    onNavigate(JourneySetting(model.infoModel.id))
                }

                LEAVE -> {
                    isShowLeaveDialog = true
                }

                null -> {
                    // TODO
                }
            }
        }
    )

    PaytoDialog(
        isShowDialog = isShowLeaveDialog,
        model = remember {
            DialogData(
                title = "여정을 나가시겠어요?",
                subtitle = "목록에서 해당 여정이 사라집니다.",
                firstButton = "닫기",
                secondButton = "나가기",
                icon = R.drawable.dialog_delete,
                style = DialogStyle.RED,
            )
        },
        onDismissRequest = {
            isShowLeaveDialog = false
        },
        secondButtonClick = {
            uiEvent.invoke(OnDeleteJourney(model.infoModel.id))
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
            title = "타이틀",
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
    JourneyScreen(model = model, onNavigate = {}, ongoingJourneyList = emptyList(), uiEvent = {})
}
