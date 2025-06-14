package com.payto.feature.journeysetting

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.common.ext.addFocusCleaner
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.theme.Color
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.common.UiEvent
import com.payto.feature.createjourney.JourneyContents
import com.payto.model.Continent
import com.payto.model.Country
import com.payto.model.CreateJourneyModel

@Composable
fun JourneySettingRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    viewModel: JourneySettingViewModel = hiltViewModel(),
) {
    val journeyData by viewModel.journeyData.collectAsStateWithLifecycle()
    JourneySettingScreen(
        onBackClick = onBackClick,
        journeyData = journeyData,
        uiEvent = viewModel::onEvent
    )
}

@Composable
fun JourneySettingScreen(
    onBackClick: () -> Unit,
    journeyData: CreateJourneyModel?,
    uiEvent: (UiEvent) -> Unit,
) {
    val focusManager = LocalFocusManager.current
    val enableButton by remember(journeyData) {
        derivedStateOf {
            journeyData?.isFullyFilled() == true
        }
    }

    Box(
        modifier = Modifier
            .background(Color.Static.white)
            .statusBarsPadding()
            .navigationBarsPadding()
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
                title = "여정 설정",
                onBackClick = onBackClick,
            )
            AnimatedVisibility(
                visible = journeyData != null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
            ) {
                if (journeyData != null) {
                    JourneyContents(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        isCreateScreen = false,
                        journeyData = { journeyData },
                        uiEvent = uiEvent
                    )
                }
            }
        }
        PaytoButton(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            enabled = enableButton,
            text = "수정완료",
            onClick = {
                uiEvent.invoke(ClickEdit)
            }
        )
    }
}

@Preview
@Composable
private fun JourneySettingScreenPreview() {
    JourneySettingScreen(
        journeyData =
            CreateJourneyModel(
                members = listOf("정산요정"),
                country = Country(
                    continent = Continent.ASIA,
                    currency = "USD",
                    koreanName = "한국",
                    localeCode = "KO"
                )
            ),
        onBackClick = {},
        uiEvent = {}
    )
}