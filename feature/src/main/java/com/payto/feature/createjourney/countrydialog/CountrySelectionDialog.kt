@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.createjourney.countrydialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.SheetState
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.common.ext.addFocusCleaner
import com.payto.designsystem.component.TextBox
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Search
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.model.Continent
import com.payto.model.Country
import kotlinx.coroutines.launch

@Composable
fun CountrySelectionDialog(
    modifier: Modifier = Modifier,
    isShow: Boolean = false,
    onDismissRequest: () -> Unit = {},
    onSelectedCountry: (Country) -> Unit = {},
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            sheetState = sheetState,
            onDismissRequest = onDismissRequest,
            containerColor = Color.Static.white,
        ) {
            Content(
                sheetState = sheetState,
                onSelectedCountry = onSelectedCountry
            )
        }
    }
}

@Composable
private fun Content(
    state: CountrySelectionState = rememberCountrySelectionState(),
    sheetState: SheetState = rememberModalBottomSheetState(),
    onSelectedCountry: (Country) -> Unit = {},
) {
    var countries by remember { mutableStateOf(state.countries) }

    LaunchedEffect(state.countries) {
        countries = state.countries
    }

    var query by remember {
        mutableStateOf("")
    }

    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .addFocusCleaner(focusManager)
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
    ) {
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(text = "여행지 선택", style = typography.contentBold, color = Color.Static.black)
        }
        Box(modifier = Modifier.padding(vertical = 16.dp, horizontal = 16.dp)) {
            TextBox(
                modifier = Modifier.fillMaxWidth(),
                value = query,
                placeholder = "찾으시는 국가명을 입력해주세요",
            ) {
                query = it
            }
            Image(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 16.dp)
                    .rippleClickable {
                        focusManager.clearFocus()
                        state.updateQuery(query)
                    }
                    .size(24.dp),
                imageVector = IconPack.Search,
                contentDescription = "검색",
                colorFilter = ColorFilter.tint(Color.Label.neutral)
            )
        }

        ContinentTab(
            tabs = state.continent,
            selectedTabIndex = selectedTabIndex,
            onSelectedTab = { index, continent ->
                selectedTabIndex = index
                state.updateContinent(continent)
            }
        )

        if (countries.isEmpty()) {
            EmptyView(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentPadding = PaddingValues(vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(countries) { country ->
                    CountryItem(
                        country = country,
                        sheetState = sheetState,
                        onSelectedCountry = onSelectedCountry
                    )
                }
            }
        }
    }
}

@Composable
private fun CountryItem(
    country: Country,
    sheetState: SheetState,
    onSelectedCountry: (Country) -> Unit = {},
) {
    val coroutineScope = rememberCoroutineScope()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .rippleClickable {
                coroutineScope.launch {
                    sheetState.hide()
                }.invokeOnCompletion {
                    onSelectedCountry.invoke(country)
                }
            }
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // TODO 국기 이미지
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Primary.normal)
                    .size(width = 48.dp, height = 32.dp)
            )
            Text(
                text = country.koreanName,
                modifier = Modifier.padding(8.dp),
                style = typography.contentAccent,
                color = Color.Label.normal
            )
        }
        Text(
            text = country.currency,
            modifier = Modifier.padding(vertical = 10.dp),
            style = typography.contentAccent,
            color = Color.Label.alternative
        )
    }
}

@Composable
private fun ContinentTab(
    tabs: List<Continent?>,
    selectedTabIndex: Int,
    onSelectedTab: (Int, Continent?) -> Unit
) {
    PrimaryScrollableTabRow(
        modifier = Modifier.padding(top = 16.dp),
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
        tabs.forEachIndexed { index, continent ->
            Text(
                modifier = Modifier
                    .fillMaxHeight()
                    .rippleClickable {
                        onSelectedTab.invoke(index, continent)
                    }
                    .padding(bottom = 4.dp),
                textAlign = TextAlign.Center,
                text = continent?.koreanName ?: "전체",
                style = typography.contentBold,
                color = if (selectedTabIndex == index) Color.Primary.normal else Color.Label.alternative
            )
        }
    }
}

@Composable
private fun EmptyView(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            "검색하신 국가명을 다시 확인해 주세요.\n철자 오류 또는 미지원 국가일 수 있습니다.",
            modifier = Modifier.align(Alignment.Center),
            style = typography.contentAccent,
            color = Color.Label.disable,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CountrySelectionDialogPreview() {
    Content()
}
