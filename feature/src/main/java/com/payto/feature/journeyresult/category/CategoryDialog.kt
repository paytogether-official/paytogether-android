@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journeyresult.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Circlecheckfill
import com.payto.designsystem.icon.iconpack.Close
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import kotlinx.coroutines.launch


@Composable
fun CategoryBottomSheetDialog(
    modifier: Modifier,
    isShow: Boolean,
    selectedCategory: String,
    categoryList: List<String>,
    onSelected: (String) -> Unit,
    onDismissRequest: () -> Unit = {},
) {

    val sheetState = rememberModalBottomSheetState()
    val coroutineScope = rememberCoroutineScope()

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            onDismissRequest = onDismissRequest,
            contentColor = Color.Static.white,
            containerColor = Color.Static.white,
            sheetState = sheetState,
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            Content(
                categoryList = categoryList,
                selected = selectedCategory,
                onSelected = { order ->
                    coroutineScope
                        .launch { sheetState.hide() }
                        .invokeOnCompletion {
                            onSelected(order)
                            onDismissRequest()
                        }
                }
            )
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    categoryList: List<String>,
    selected: String,
    onSelected: (String) -> Unit
) {
    Column(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "항목", style = typography.contentBold, color = Color.Static.black)
            Image(
                modifier = Modifier.rippleClickable {
                    onSelected.invoke(selected)
                },
                imageVector = IconPack.Close,
                contentDescription = "닫기"
            )
        }

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(categoryList) {
                OrderItem(
                    title = it,
                    isSelected = { selected == it },
                    onClick = onSelected
                )
            }
        }
    }
}

@Composable
private fun OrderItem(
    title: String,
    isSelected: () -> Boolean,
    onClick: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .rippleClickable {
                onClick.invoke(title)
            }
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 10.dp),
            text = title,
            style = typography.captionAccent,
            color = Color.Label.neutral
        )
        if (isSelected()) {
            Image(
                imageVector = IconPack.Circlecheckfill,
                contentDescription = "",
                colorFilter = ColorFilter.tint(Color.Primary.normal)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryContentPreview() {
    Content(categoryList = listOf("기타", "식비", "교통", "관광"), selected ="기타") {}
}
