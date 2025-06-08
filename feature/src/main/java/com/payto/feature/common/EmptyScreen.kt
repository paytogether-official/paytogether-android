package com.payto.feature.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.R


@Composable
fun EmptyScreen(
    modifier: Modifier = Modifier,
    title: String = "",
    subtitle: String = "",
    icon: Int? = R.drawable.travel_insurance,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (icon != null) {
            Image(
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(80.dp),
                painter = painterResource(icon),
                contentDescription = null
            )
        }
        Text(
            text = title,
            style = typography.featureBold,
            color = Color.Label.normal,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.padding(top = 4.dp),
            text = subtitle,
            style = typography.contentRegular,
            color = Color.Label.neutral,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EmptyScreenPreview() {
    EmptyScreen(
        modifier = Modifier.fillMaxSize(),
        title = "아직 마무리된 여정이 없어요!",
        subtitle = "여정을 마무리하거나 새 여정을 만들어보세요!"
    )
}
