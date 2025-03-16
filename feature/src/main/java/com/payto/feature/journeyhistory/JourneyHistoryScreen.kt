package com.payto.feature.journeyhistory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.common.navigate.JourneyDetail
import com.payto.designsystem.component.Chips
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar

@Composable
fun JourneyHistoryRoute(
    viewModel: JourneyHistoryViewModel = hiltViewModel(),
    onNavigate: (JourneyDetail) -> Unit,
    onBackClick: () -> Unit
) {
    val list by viewModel.journeyHistoryList.collectAsStateWithLifecycle()
    JourneyHistoryScreen(list = list, onNavigate = onNavigate, onBackClick = onBackClick)
}

@Composable
private fun JourneyHistoryScreen(
    list: List<JourneyHistoryData>,
    onNavigate: (JourneyDetail) -> Unit,
    onBackClick: () -> Unit
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
            title = "지난 여정",
            onBackClick = onBackClick
        )
        JourneyHistoryList(
            modifier = Modifier.padding(horizontal = 16.dp),
            list = list,
            onNavigate = onNavigate
        )
    }
}

@Composable
private fun JourneyHistoryList(
    modifier: Modifier,
    list: List<JourneyHistoryData>,
    onNavigate: (JourneyDetail) -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 40.dp)
    ) {
        list.forEach {
            item(contentType = "JourneyHistoryDate") {
                JourneyDate(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    it.date
                )
            }
            items(it.list, contentType = { "JourneyHistoryCard" }) { model ->
                JourneyHistoryCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    onNavigate = onNavigate,
                    model = model
                )
            }
        }
    }
}

@Composable
fun JourneyDate(modifier: Modifier, date: String = "") {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        Text(text = date, style = typography.captionAccent, color = Color.Label.neutral)
    }
}

@Composable
private fun JourneyHistoryCard(
    modifier: Modifier,
    onNavigate: (JourneyDetail) -> Unit = {},
    model: JourneyHistoryInfo
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Component.Fill.normal)
            .rippleClickable {
                onNavigate.invoke(JourneyDetail(model.title))
            }
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = model.title,
                overflow = TextOverflow.Ellipsis,
                style = typography.highlightBold,
                color = Color.Label.normal
            )
            Text(
                text = "4월 3일(금) - 4월 8일(월)",
                color = Color.Label.alternative,
                style = typography.captionRegular
            )
        }
        Text(
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            text = "여정 생산자 외 3명",
            color = Color.Label.neutral,
            style = typography.captionAccent
        )
        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(16.dp)),
            thickness = 2.dp,
            color = Color.Primary.normal
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(1f, fill = false),
                    text = "123,432,123",
                    color = Color.Primary.normal,
                    style = typography.heading2,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                Chips(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    text = "계산",
                )
            }

            Text(
                modifier = Modifier.align(Alignment.Bottom),
                text = "총 42 항목",
                color = Color.Label.neutral,
                style = typography.captionAccent
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JourneyHistoryScreenPreview() {
    val list = listOf(
        JourneyHistoryData(
            date = "24년 2월",
            list = List((1..5).random()) {
                JourneyHistoryInfo("여정 제목 $it")
            }
        ),
        JourneyHistoryData(
            date = "24년 1월",
            list = List((1..5).random()) {
                JourneyHistoryInfo("여정 제목 $it")
            }
        ),
        JourneyHistoryData(
            date = "23년 12월",
            list = List((1..5).random()) {
                JourneyHistoryInfo("여정 제목 $it")
            }
        )
    )
    JourneyHistoryScreen(list = list, onBackClick = {}, onNavigate = {})
}
