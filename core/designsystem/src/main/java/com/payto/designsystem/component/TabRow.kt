@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.designsystem.component

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography

@Composable
fun PaytoTabRow(
    modifier: Modifier = Modifier,
    tabs: List<String>,
    selectedTabIndex: Int,
    onSelectedTab: (Int) -> Unit
) {
    PrimaryScrollableTabRow(
        modifier = modifier.padding(top = 16.dp),
        selectedTabIndex = selectedTabIndex,
        contentColor = Color.Static.white,
        containerColor = Color.Static.white,
        edgePadding = 0.dp,
        indicator = {
            TabRowDefaults.PrimaryIndicator(
                Modifier.tabIndicatorOffset(selectedTabIndex, matchContentSize = false),
                height = 2.dp,
                color = Color.Primary.normal
            )
        },
        divider = {
            HorizontalDivider(color = Color.Line.neutral, thickness = 1.dp)
        }
    ) {
        tabs.forEachIndexed { index, title ->
            Text(
                modifier = Modifier
                    .fillMaxHeight()
                    .rippleClickable {
                        onSelectedTab.invoke(index)
                    }
                    .padding(bottom = 4.dp),
                textAlign = TextAlign.Center,
                text = title,
                style = typography.contentBold,
                color = if (selectedTabIndex == index) Color.Primary.normal else Color.Label.alternative
            )
        }
    }
}