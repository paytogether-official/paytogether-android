package com.payto.feature.createjourney

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.platform.LocalFocusManager
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
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.UiEvent
import com.payto.feature.createjourney.countrydialog.CountrySelectionDialog
import com.payto.feature.localcomposition.LocalCreateJourneyRepository
import com.payto.model.Country
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun CreateJourneyRoute(
    viewModel: CreateJourneyViewModel = hiltViewModel(),
    onBackClick: () -> Unit
) {
    val journeyData by viewModel.journeyData.collectAsStateWithLifecycle()
    CompositionLocalProvider(LocalCreateJourneyRepository provides viewModel.repository) {
        CreateJourneyScreen(
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                .background(Color.Static.white),
            onBackClick = onBackClick,
            journeyData = { journeyData },
            uiEvent = viewModel::onEvent
        )
    }
}

@Composable
private fun CreateJourneyScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    journeyData: () -> CreateJourneyData,
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
            Contents(
                modifier = Modifier
                    .fillMaxSize()
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
private fun Contents(
    modifier: Modifier,
    journeyData: () -> CreateJourneyData,
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
                uiEvent = uiEvent
            )
        }

        this@LazyColumn.journeyParticipantBox(people = { journeyData().people }, uiEvent = uiEvent)
    }
}

@Composable
private fun JourneyTitleBox(
    modifier: Modifier,
    title: String?,
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
            placeholder = "어떤 여정인가요?"
        ) {
            uiEvent.invoke(OnJourneyTitleChange(it))
        }
    }
}

@Composable
private fun JourneyDateBox(
    modifier: Modifier,
    date: CreateJourneyData.JourneyDate?,
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
            endIcon = IconPack.Caretdown
        ) {
            isShowCountryDialog = true
        }
        // TODO 국가 설정 시 환율 설정
    }
}

private fun LazyListScope.journeyParticipantBox(
    people: () -> List<String>,
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

    this.participantList(people = people, uiEvent = uiEvent)
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
    people: () -> List<String>,
    uiEvent: (UiEvent) -> Unit,
) {
    itemsIndexed(people()) { index, name ->
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
        journeyData = { CreateJourneyData(people = listOf("정산요정")) },
        onBackClick = {},
        uiEvent = {})
}
