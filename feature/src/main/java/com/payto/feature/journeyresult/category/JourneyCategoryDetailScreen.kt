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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.payto.common.ext.numberFormat
import com.payto.designsystem.component.CurrencyToggle
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Caretdown
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography
import com.payto.feature.common.DefaultToolbar
import com.payto.feature.journeydetail.JourneyDetailList
import com.payto.model.CategoryDetailModel
import com.payto.model.ExpenseCategory
import com.payto.model.ExpenseParams


@Composable
fun CategoryDetailRoute(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    viewModel: CategoryDetailViewModel = hiltViewModel(),
) {
    val model by viewModel.model.collectAsStateWithLifecycle()
    CategoryDetailScreen(
        onNavigate = onNavigate,
        onBackClick = onBackClick,
        model = model,
    )
}

@Composable
private fun CategoryDetailScreen(
    onNavigate: (Any) -> Unit,
    onBackClick: () -> Unit,
    model: CategoryDetailModel?,
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
            onBackClick = onBackClick
        )
        if (model != null) {
            TitleHeader(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                model = model
            )
            JourneyDetailList(
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 16.dp),
                onNavigate = onNavigate,
                list = model.expenseInfoModel.expenseList
            )
        }
    }
}

@Composable
private fun TitleHeader(
    modifier: Modifier,
    model: CategoryDetailModel
) {
    var isShowCategoryDialog by remember {
        mutableStateOf(false)
    }
    CategoryBottomSheetDialog(
        modifier = Modifier,
        isShow = isShowCategoryDialog,
        categoryList = model.categoryList,
        selectedCategory = model.params.category ?: ExpenseCategory.ETC,
        onSelected = {
            // TODO
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
                    text = "${model.params.category?.displayName}에",
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
                    "${model.expenseInfoModel.totalAmount.numberFormat()}원을 쓰셨어요", // TODO
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
            options = "KRW" to model.baseCurrency,
            selectedOption = model.params.quoteCurrency,
            onOptionSelected = {
                // TODO
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun CategoryDetailScreenPreview() {

    CategoryDetailScreen(
        onBackClick = {},
        onNavigate = {},
        model = CategoryDetailModel(params = ExpenseParams(), categoryList = ExpenseCategory.list)
    )
}
