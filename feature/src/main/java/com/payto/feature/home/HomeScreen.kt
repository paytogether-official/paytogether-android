package com.payto.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.common.navigate.CreateJourney
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.ArrowRight
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography

@Composable
fun HomeRoute(onNavigate: (Any) -> Unit) {
    HomeScreen(onNavigate = onNavigate)
}

@Composable
fun HomeScreen(onNavigate: (Any) -> Unit) {
    Column(
        modifier = Modifier
            .background(Color.Static.white)
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 122.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CreateJourneyBox(onNavigate = onNavigate)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            JoinJourneyBox(modifier = Modifier.weight(1f))
            LastJourneyBox()
        }
    }
}

@Composable
private fun CreateJourneyBox(onNavigate: (Any) -> Unit) {
    Column(
        modifier = Modifier
            .rippleClickable { onNavigate(CreateJourney) }
            .fillMaxWidth()
            .background(Color.Primary.normal, shape = RoundedCornerShape(24.dp))
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
private fun JoinJourneyBox(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Component.Fill.primary, shape = RoundedCornerShape(24.dp))
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
private fun LastJourneyBox(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .width(147.dp)
            .background(Component.Fill.normal, shape = RoundedCornerShape(24.dp))
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

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen {}
}
