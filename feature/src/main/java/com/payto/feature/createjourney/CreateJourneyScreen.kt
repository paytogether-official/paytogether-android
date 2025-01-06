package com.payto.feature.createjourney

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.payto.designsystem.icon.iconpack.Chevronleft
import com.payto.designsystem.icon.iconpack.Circleplus
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.UiEvent
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun CreateJourneyRoute(
    viewModel: CreateJourneyViewModel = hiltViewModel()
) {
    val journeyData by viewModel.journeyData.collectAsStateWithLifecycle()

    CreateJourneyScreen(
        journeyData = journeyData,
        uiEvent = viewModel::onEvent
    )
}

@Composable
private fun CreateJourneyScreen(
    modifier: Modifier = Modifier,
    journeyData: JourneyData,
    uiEvent: (UiEvent) -> Unit,
) {
    val focusManager = LocalFocusManager.current
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
            Header()
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
            text = "생성하기",
            onClick = {
                uiEvent.invoke(ClickCreate)
            }
        )
    }
}

// TODO 툴바 공통화~
@Composable
private fun Header(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .clickable {
                    // TODO
                }
                .padding(12.dp)
                .size(24.dp),
            imageVector = IconPack.Chevronleft,
            contentDescription = "뒤로가기"
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "여정 생성하기",
            style = typography.highlightBold
        )
    }
}

@Composable
private fun Contents(
    modifier: Modifier,
    journeyData: JourneyData,
    uiEvent: (UiEvent) -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        state = rememberLazyListState()
    ) {
        item(contentType = "JourneyTitleBox") {
            JourneyTitleBox(title = journeyData.title, uiEvent = uiEvent)
        }
        item(contentType = "JourneyDateBox") {
            JourneyDateBox(date = journeyData.journeyDate, uiEvent = uiEvent)
        }
        item(contentType = "JourneyCountryBox") {
            JourneyCountryBox()
        }

        item {
            JourneyParticipantBox(people = journeyData.people, uiEvent = uiEvent)
        }
    }
}

@Composable
private fun JourneyTitleBox(
    title: String?,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
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
    date: JourneyData.JourneyDate?,
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
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "여행기간", color = Color.Label.normal,
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
private fun JourneyCountryBox() {
    var country by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "국가설정",
            color = Color.Label.normal,
            style = typography.contentAccent
        )
        ContentBox(
            value = country,
            placeholder = "어디로 여행을 떠나시나요?",
            endIcon = IconPack.Caretdown
        ) {
            // TODO 국가 다이얼로그
        }
        // TODO 국가 설정 시 환율 설정
    }
}

@SuppressLint("MutableCollectionMutableState")
@Composable
private fun JourneyParticipantBox(
    people: Set<String>,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text(
            modifier = Modifier.padding(bottom = 4.dp),
            text = "인원설정",
            color = Color.Label.normal,
            style = typography.contentAccent
        )
        ParticipantList(people = people, uiEvent = uiEvent)
        PaytoOutlineButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            icon = IconPack.Circleplus,
            onClick = { uiEvent.invoke(ClickAddPerson) }
        )
    }
}

@Composable
private fun ParticipantList(
    people: Set<String>,
    uiEvent: (UiEvent) -> Unit,
) {
    val list by remember(people) {
        mutableStateOf(people.toList())
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        list.forEachIndexed { index, name ->
            TextBox(
                value = name,
                placeholder = "이름을 입력해주세요"
            ) {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CreateJourneyScreenPreview() {
    CreateJourneyScreen(journeyData = JourneyData(people = setOf("정산요정")), uiEvent = {})
}
