package com.payto.feature.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.ArrowRight
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.feature.R
import com.payto.model.JourneyInfoModel
import com.payto.model.navigate.CreateJourney
import com.payto.model.navigate.JoinJourney
import com.payto.model.navigate.Journey
import com.payto.model.navigate.JourneyHistory

@Composable
fun HomeRoute(
    onNavigate: (Any) -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val ongoingJourneys by viewModel.ongoingJourneys.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.getOngoingJourneys()
    }

    HomeScreen(
        onNavigate = onNavigate,
        ongoingJourneys = ongoingJourneys,
    )
}

@Composable
fun HomeScreen(
    onNavigate: (Any) -> Unit,
    ongoingJourneys: List<JourneyInfoModel>,
) {
    var isShowDialog by rememberSaveable {
        mutableStateOf(false)
    }
    OngoingBottomSheetDialog(
        modifier = Modifier.fillMaxWidth(),
        isShow = isShowDialog,
        ongoingJourneys = ongoingJourneys,
        onDismissRequest = {
            isShowDialog = false
        },
        onSelected = {
            onNavigate(Journey(it.id))
        }
    )

    Column(
        modifier = Modifier
            .background(Color.Static.white)
            .statusBarsPadding()
            .navigationBarsPadding()
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 122.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CreateJourneyBox(onNavigate = onNavigate)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            JoinJourneyBox(modifier = Modifier.weight(1f), onNavigate = onNavigate)
            LastJourneyBox(onNavigate = onNavigate)
        }
        AnimatedVisibility(visible = ongoingJourneys.isNotEmpty()) {
            OngoingJourneyBox(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    if (ongoingJourneys.size == 1) {
                        onNavigate(Journey(ongoingJourneys[0].id))
                    } else {
                        isShowDialog = true
                    }
                }
            )
        }
    }
}

@Composable
private fun CreateJourneyBox(onNavigate: (Any) -> Unit) {
    Column(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(24.dp))
            .rippleClickable { onNavigate(CreateJourney) }
            .fillMaxWidth()
            .background(Color.Primary.normal)
            .padding(top = 16.dp, start = 16.dp, end = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(
            text = "새로운 여행을\n준비하고 있다면?",
            color = Color.Inverse.label,
            style = typography.contentRegular
        )
        Text(
            text = "여정 생성하기",
            color = Color.Inverse.label,
            style = typography.highlightBold
        )
        Image(
            modifier = Modifier
                .padding(top = 14.dp)
                .background(Color.Static.white, shape = CircleShape)
                .padding(10.dp)
                .size(24.dp)
                .align(Alignment.End),
            imageVector = IconPack.ArrowRight,
            contentDescription = "화살표"
        )
    }
}

@Composable
private fun JoinJourneyBox(modifier: Modifier = Modifier, onNavigate: (Any) -> Unit) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(24.dp))
            .rippleClickable {
                onNavigate.invoke(JoinJourney)
            }
            .background(Component.Fill.primary)
            .padding(top = 16.dp, start = 16.dp, end = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(
            text = "이미 생성된\n여정이 있다면?",
            color = Color.Label.normal,
            style = typography.contentRegular
        )
        Text(
            text = "여정 참여하기",
            color = Color.Label.normal,
            style = typography.highlightBold
        )
        Image(
            modifier = Modifier
                .padding(top = 14.dp)
                .background(Color.Static.white, shape = CircleShape)
                .padding(10.dp)
                .size(24.dp)
                .align(Alignment.End),
            imageVector = IconPack.ArrowRight,
            contentDescription = "화살표"
        )
    }
}

@Composable
private fun LastJourneyBox(modifier: Modifier = Modifier, onNavigate: (Any) -> Unit) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(24.dp))
            .rippleClickable {
                onNavigate(JourneyHistory)
            }
            .width(147.dp)
            .background(Component.Fill.normal)
            .padding(top = 16.dp, start = 16.dp, end = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(
            text = "지난 여정",
            color = Color.Label.normal,
            style = typography.highlightBold
        )
        Image(
            modifier = Modifier
                .padding(top = 54.dp)
                .background(Color.Static.white, shape = CircleShape)
                .padding(10.dp)
                .size(24.dp)
                .align(Alignment.End),
            imageVector = IconPack.ArrowRight,
            contentDescription = "화살표"
        )
    }
}

@Composable
private fun OngoingJourneyBox(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    val icon by remember {
        mutableIntStateOf(
            listOf(
                R.drawable.travel,
                R.drawable.travel_bag,
                R.drawable.travel_ticket,
                R.drawable.flight,
                R.drawable.worldtour
            ).random()
        )
    }
    Row(
        modifier = modifier
            .rippleClickable(
                onClick = onClick,
                shape = RoundedCornerShape(24.dp)
            )
            .fillMaxWidth()
            .background(Color.Inverse.background)
            .padding(vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        Image(
            modifier = Modifier.size(32.dp),
            painter = painterResource(icon),
            contentDescription = "",
        )
        Text(
            text = "여정으로 돌아가기",
            color = Color.Inverse.label,
            style = typography.highlightBold
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val models = List(10) {
        JourneyInfoModel(id = "", title = "title $it", baseCurrency = "JPY", members = listOf())
    }
    HomeScreen(ongoingJourneys = models, onNavigate = {})
}
