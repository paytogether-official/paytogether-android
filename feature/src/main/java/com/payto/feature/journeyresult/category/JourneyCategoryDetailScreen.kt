package com.payto.feature.journeyresult.category

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Caretdown
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.journeydetail.JourneyDetailList
import com.payto.model.JourneyDetailInfo
import com.payto.model.JourneyExpenseModel


@Composable
fun CategoryDetailRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit
) {
    CategoryDetailScreen(
        onNavigate = onNavigate,
        onBackClick = onBackClick
    )
}

@Composable
private fun CategoryDetailScreen(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit
) {
    val list = remember {
        List((1..10).random()) {
            JourneyDetailInfo(
                date = "3월 12일",
                List((1..10).random()) {
                    JourneyExpenseModel()
                }
            )
        }
    }
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding()
            .background(Color.Static.white)
            .fillMaxSize()
    ) {
        DefaultToolbar(
            modifier = Modifier.fillMaxWidth(),
            onBackClick = onBackClick
        )
        TitleHeader(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )
        JourneyDetailList(
            modifier = Modifier
                .weight(1f)
                .padding(top = 16.dp),
            onNavigate = onNavigate,
            list = list
        )
    }
}

@Composable
private fun TitleHeader(modifier: Modifier) {
    var selectedOption by remember { mutableStateOf("KRW") }
    val categoryList = remember {
        listOf("기타", "식비", "교통", "관광")
    }
    var selectedCategory by remember {
        mutableStateOf(categoryList.firstOrNull() ?: "")
    }
    var isShowCategoryDialog by remember {
        mutableStateOf(false)
    }
    CategoryBottomSheetDialog(
        modifier = Modifier,
        isShow = isShowCategoryDialog,
        categoryList = categoryList,
        selectedCategory = selectedCategory,
        onSelected = {
            selectedCategory = it
        },
        onDismissRequest = {
            isShowCategoryDialog = false
        }
    )
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.Top
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .rippleClickable {
                    isShowCategoryDialog = true
                },
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "${selectedCategory}에",
                    color = Color.Label.normal,
                    style = typography.heading2,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Image(
                    imageVector = IconPack.Caretdown,
                    modifier = Modifier.size(24.dp),
                    contentDescription = null
                )
            }
            Text(
                text = AnnotatedString(
                    "123,432원을 쓰셨어요",
                    spanStyles = listOf(
                        AnnotatedString.Range(
                            SpanStyle(color = Color.Primary.normal), 0, 7
                        )
                    ),
                ),
                color = Color.Label.neutral,
                style = typography.heading2
            )
        }
        CurrencyToggle(
            modifier = Modifier,
            options = "KRW" to "JPY",
            selectedOption = selectedOption,
            onOptionSelected = { selectedOption = it }
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun CategoryDetailScreenPreview() {
    CategoryDetailScreen(onBackClick = {}, onNavigate = {})
}
