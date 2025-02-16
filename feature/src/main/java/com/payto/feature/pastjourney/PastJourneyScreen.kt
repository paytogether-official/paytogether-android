package com.payto.feature.pastjourney

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.payto.designsystem.component.Chips
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar

@Composable
fun PastJourneyRoute(
    viewModel: PastJourneyViewModel = hiltViewModel(),
    onBackClick: () -> Unit
) {
    val list by viewModel.pastJourneyList.collectAsStateWithLifecycle()
    PastJourneyScreen(list, onBackClick)
}

@Composable
private fun PastJourneyScreen(
    list: List<PastJourneyData>,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .background(Color.Static.white)
            .fillMaxSize()
    ) {
        DefaultToolbar(
            modifier = Modifier.fillMaxWidth(),
            title = "지난 여정",
            onBackClick = onBackClick
        )
        PastJourneyList(
            modifier = Modifier.padding(horizontal = 16.dp),
            list = list
        )
    }
}

@Composable
private fun PastJourneyList(modifier: Modifier, list: List<PastJourneyData>) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 40.dp)
    ) {
        list.forEach {
            item(contentType = "PastJourneyDate") {
                PastJourneyDate(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }
            items(it.list) {
                PastJourneyCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun PastJourneyDate(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        Text(text = "25년 1월", style = typography.captionAccent, color = Color.Label.neutral)
    }
}

@Composable
private fun PastJourneyCard(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Component.Fill.normal)
            .rippleClickable {
                // TODO
            }
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "여정 제목",
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
private fun PastJourneyScreenPreview() {
    val list = listOf(
        PastJourneyData(
            date = "24년 2월",
            list = List((1..5).random()) {
                PastJourneyInfo("title $it")
            }
        ),
        PastJourneyData(
            date = "24년 1월",
            list = List((1..5).random()) {
                PastJourneyInfo("title $it")
            }
        ),
        PastJourneyData(
            date = "23년 12월",
            list = List((1..5).random()) {
                PastJourneyInfo("title $it")
            }
        )
    )
    PastJourneyScreen(list = list, onBackClick = {})
}

@Preview(showBackground = true)
@Composable
private fun PastJourneyCardPreview() {
    Column(Modifier.padding(horizontal = 16.dp)) {
        PastJourneyDate(modifier = Modifier)
        PastJourneyCard(modifier = Modifier)
        PastJourneyCard(modifier = Modifier)
    }
}
