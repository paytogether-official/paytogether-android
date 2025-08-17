package com.payto.feature.journey

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.component.Chips
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoButtonStatus
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.common.UiEvent
import com.payto.model.JourneyInfoModel
import com.payto.model.navigate.Journey

@Composable
fun OngoingJourneyListDrawerSheet(
    ongoingJourneyList: List<JourneyInfoModel>,
    currentJourneyInfoModel: JourneyInfoModel?,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    ModalDrawerSheet(
        modifier = Modifier.fillMaxHeight(),
        drawerContainerColor = Color.Static.white,
        drawerContentColor = Color.Static.white,
    ) {
        OngoingJourneyListContent(
            ongoingJourneyList = ongoingJourneyList,
            currentJourneyInfoModel = currentJourneyInfoModel,
            onNavigate = onNavigate,
            uiEvent = uiEvent
        )
    }
}

@Composable
private fun OngoingJourneyListContent(
    ongoingJourneyList: List<JourneyInfoModel>,
    currentJourneyInfoModel: JourneyInfoModel?,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.8f)
            .padding(horizontal = 20.dp)
    ) {
        Text(
            modifier = Modifier.padding(top = 56.dp),
            text = "여정관리",
            style = typography.highlightBold,
            color = Color.Label.normal
        )
        Column(
            modifier = Modifier
                .padding(top = 24.dp)
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
        ) {

            ongoingJourneyList.forEach {
                OngoingItem(
                    modifier = Modifier,
                    model = it,
                    isSelected = currentJourneyInfoModel?.id == it.id,
                    onNavigate = onNavigate,
                    uiEvent = uiEvent
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PaytoButton(modifier = Modifier.fillMaxWidth(), text = "새 여정 만들기", onClick = {})
            PaytoButton(
                modifier = Modifier.fillMaxWidth(),
                status = PaytoButtonStatus.SECONDARY,
                text = "홈으로",
                onClick = {})
        }
    }
}

@Composable
private fun OngoingItem(
    modifier: Modifier,
    model: JourneyInfoModel,
    isSelected: Boolean,
    onNavigate: (Any) -> Unit,
    uiEvent: (UiEvent) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .rippleClickable(
                shape = RoundedCornerShape(8.dp),
                enabled = isSelected.not()
            ) {
                onNavigate(Journey(model.id))
            }
            .background(Component.Fill.normal)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = model.title,
            style = typography.contentAccent,
            color = if (isSelected) Color.Primary.normal else Color.Label.normal
        )
        if (isSelected) {
            Chips(
                modifier = Modifier,
                text = "현재"
            )
        }
    }
}

@Preview
@Composable
private fun OngoingJourneyListDrawerSheetPreview() {
    val list = List(10) {
        JourneyInfoModel(title = "타이틀 $it", id = it.toString())
    }
    OngoingJourneyListDrawerSheet(
        ongoingJourneyList = list,
        currentJourneyInfoModel = list.first(),
        onNavigate = {},
        uiEvent = {}
    )
}
