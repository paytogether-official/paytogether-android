package com.payto.feature.createjourney

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.common.ext.addFocusCleaner
import com.payto.designsystem.component.ContentBox
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoOutlineButton
import com.payto.designsystem.component.TextBox
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Calendar
import com.payto.designsystem.icon.iconpack.Caretdown
import com.payto.designsystem.icon.iconpack.Circleplus
import com.payto.designsystem.icon.iconpack.Circlequestionfill
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.R
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.common.UiEvent
import com.payto.feature.createjourney.countrydialog.CountrySelectionDialog
import com.payto.feature.localcomposition.LocalCreateJourneyRepository
import com.payto.model.Continent
import com.payto.model.Country
import com.payto.model.CreateJourneyModel
import com.payto.model.ExchangeRateModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun CreateJourneyRoute(
    viewModel: CreateJourneyViewModel = hiltViewModel(),
    onBackClick: () -> Unit,
    onNavigate: (Any) -> Unit,
) {
    val journeyData by viewModel.journeyData.collectAsStateWithLifecycle()
    HandleSideEffect(viewModel, onNavigate, onBackClick)
    CompositionLocalProvider(LocalCreateJourneyRepository provides viewModel.repository) {
        CreateJourneyScreen(
            modifier = Modifier
                .background(Color.Static.white)
                .statusBarsPadding()
                .navigationBarsPadding(),
            onBackClick = onBackClick,
            journeyData = { journeyData },
            uiEvent = viewModel::onEvent
        )
    }
}

@Composable
fun CreateJourneyScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    journeyData: () -> CreateJourneyModel,
    uiEvent: (UiEvent) -> Unit,
) {
    val focusManager = LocalFocusManager.current
    val enableButton by remember(journeyData()) {
        derivedStateOf {
            journeyData().isFullyFilled()
        }
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .addFocusCleaner(focusManager)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
        ) {
            DefaultToolbar(
                modifier = Modifier.fillMaxWidth(),
                title = "여정 생성하기",
                onBackClick = onBackClick,
            )
            JourneyContents(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp),
                journeyData = journeyData,
                uiEvent = uiEvent
            )
        }
        PaytoButton(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            enabled = enableButton,
            text = "생성하기",
            onClick = {
                uiEvent.invoke(ClickCreate)
            }
        )
    }
}

@Composable
fun JourneyContents(
    modifier: Modifier,
    isCreateScreen: Boolean = true,
    journeyData: () -> CreateJourneyModel,
    uiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = rememberLazyListState(),
        contentPadding = PaddingValues(bottom = 40.dp)
    ) {
        item(contentType = "JourneyTitleBox") {
            JourneyTitleBox(
                modifier = Modifier.padding(bottom = 16.dp),
                title = journeyData().title,
                enabled = isCreateScreen,
                uiEvent = uiEvent
            )
        }
        item(contentType = "JourneyDateBox") {
            JourneyDateBox(
                modifier = Modifier.padding(bottom = 16.dp),
                date = journeyData().journeyDate,
                uiEvent = uiEvent
            )
        }
        item(contentType = "JourneyCountryBox") {
            JourneyCountryBox(
                modifier = Modifier.padding(bottom = 16.dp),
                country = journeyData().country,
                exchangeRateModel = journeyData().exchangeRateModel,
                enabled = isCreateScreen,
                uiEvent = uiEvent
            )
        }

        this@LazyColumn.journeyParticipantBox(
            members = { journeyData().members },
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun JourneyTitleBox(
    modifier: Modifier,
    title: String?,
    enabled: Boolean,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "여정명",
            color = Color.Label.normal,
            style = typography.contentAccent
        )
        TextBox(
            value = title ?: "",
            placeholder = "어떤 여정인가요?",
            enabled = enabled
        ) {
            uiEvent.invoke(OnJourneyTitleChange(it))
        }
    }
}

@Composable
private fun JourneyDateBox(
    modifier: Modifier,
    date: CreateJourneyModel.JourneyDate?,
    uiEvent: (UiEvent) -> Unit
) {
    val journeyDate by remember(date) {
        derivedStateOf {
            date?.let {
                val start = Date(date.startTimeMill)
                val end = Date(date.endTimeMill)
                SimpleDateFormat("yy.MM.dd", Locale.getDefault()).format(start) +
                        " - " +
                        SimpleDateFormat("yy.MM.dd", Locale.getDefault()).format(end)

            }
        }
    }
    var isShowPeriodDialog by remember {
        mutableStateOf(false)
    }

    if (isShowPeriodDialog) {
        PeriodDialog(
            modifier = Modifier.fillMaxWidth(),
            onDismissRequest = { start, end ->
                uiEvent.invoke(OnJourneyDateChange(start, end))
                isShowPeriodDialog = false
            }
        )
    }
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "여행기간",
            color = Color.Label.normal,
            style = typography.contentAccent
        )
        ContentBox(
            value = journeyDate ?: "",
            placeholder = "언제 여행을 떠나시나요?",
            endIcon = IconPack.Calendar
        ) {
            isShowPeriodDialog = true
        }
    }
}

@Composable
private fun JourneyCountryBox(
    modifier: Modifier,
    country: Country? = null,
    exchangeRateModel: ExchangeRateModel,
    enabled: Boolean,
    uiEvent: (UiEvent) -> Unit
) {
    var isShowCountryDialog by remember {
        mutableStateOf(false)
    }
    CountrySelectionDialog(
        isShow = isShowCountryDialog,
        onDismissRequest = {
            isShowCountryDialog = false
        },
        onSelectedCountry = {
            uiEvent.invoke(OnCountryChange(it))
            isShowCountryDialog = false
        }
    )
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "국가설정",
            color = Color.Label.normal,
            style = typography.contentAccent
        )
        ContentBox(
            value = country?.koreanName ?: "",
            placeholder = "어디로 여행을 떠나시나요?",
            endIcon = IconPack.Caretdown,
            enabled = enabled
        ) {
            isShowCountryDialog = true
        }
        AnimatedVisibility(country != null) {
            ExchangeRate(
                modifier = Modifier.padding(top = 16.dp),
                model = exchangeRateModel,
                uiEvent = uiEvent
            )
        }
    }
}

@Composable
private fun ExchangeRate(
    modifier: Modifier,
    model: ExchangeRateModel,
    uiEvent: (UiEvent) -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "환율설정",
                color = Color.Label.normal,
                style = typography.contentAccent
            )
            Image(
                modifier = Modifier.size(20.dp),
                imageVector = IconPack.Circlequestionfill,
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            ContentBox(
                modifier = Modifier.weight(1f),
                value = "1",
                enabled = false,
                endDecoration = {
                    Text(
                        model.currency ?: "",
                        style = typography.contentAccent,
                        color = Color.Label.disable
                    )
                }
            )
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = ImageVector.vectorResource(R.drawable.equal),
                contentDescription = null
            )
            TextBox(
                modifier = Modifier.weight(2f),
                value = model.exchangeRate.toString(),
                placeholder = "10,000",
                endDecoration = {
                    Text(
                        "원",
                        style = typography.contentAccent,
                        color = Color.Label.neutral
                    )
                }
            ) {
                uiEvent.invoke(OnExchangeRateChange(it, model))
            }
        }
    }
}

private fun LazyListScope.journeyParticipantBox(
    members: () -> List<String>,
    isSetting: Boolean = false,
    uiEvent: (UiEvent) -> Unit
) {
    item {
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                modifier = Modifier.padding(bottom = 4.dp),
                text = "인원설정",
                color = Color.Label.normal,
                style = typography.contentAccent
            )
        }
    }

    this.participantList(members = members, uiEvent = uiEvent)
    item {
        PaytoOutlineButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            icon = IconPack.Circleplus,
            onClick = { uiEvent.invoke(ClickAddPerson) }
        )
    }
}

private fun LazyListScope.participantList(
    members: () -> List<String>,
    uiEvent: (UiEvent) -> Unit,
) {
    itemsIndexed(members()) { index, name ->
        TextBox(
            modifier = Modifier.padding(bottom = 8.dp),
            value = name,
            placeholder = "이름을 입력해주세요"
        ) {
            uiEvent.invoke(OnNameChange(index, it))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CreateJourneyScreenPreview() {
    CreateJourneyScreen(
        journeyData = {
            CreateJourneyModel(
                members = listOf("정산요정"),
                country = Country(
                    continent = Continent.ASIA,
                    currency = "USD",
                    koreanName = "한국",
                    localeCode = "KO"
                )
            )
        },
        onBackClick = {},
        uiEvent = {})
}
