@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Close
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import com.payto.model.JourneyModel
import kotlinx.coroutines.launch


@Composable
fun OngoingBottomSheetDialog(
    modifier: Modifier,
    isShow: Boolean,
    ongoingJourneys: List<JourneyModel>,
    onSelected: (JourneyModel) -> Unit,
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
                list = ongoingJourneys,
                onSelected = { order ->
                    coroutineScope
                        .launch { sheetState.hide() }
                        .invokeOnCompletion {
                            onSelected(order)
                            onDismissRequest()
                        }
                },
                onDismissRequest = onDismissRequest
            )
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    list: List<JourneyModel>,
    onSelected: (JourneyModel) -> Unit,
    onDismissRequest: () -> Unit = {},
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
            Text(text = "진행중인 여정", style = typography.contentBold, color = Color.Static.black)
            Image(
                modifier = Modifier.rippleClickable(onClick = onDismissRequest),
                imageVector = IconPack.Close,
                contentDescription = "닫기"
            )
        }

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(list) {
                OngoingItem(
                    item = it,
                    onClick = onSelected
                )
            }
        }
    }
}

@Composable
private fun OngoingItem(
    item: JourneyModel,
    onClick: (JourneyModel) -> Unit
) {
    Row(
        modifier = Modifier
            .rippleClickable(shape = RoundedCornerShape(16.dp)) {
                onClick.invoke(item)
            }
            .background(Component.Fill.normal)
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 10.dp),
            text = item.title,
            style = typography.captionAccent,
            color = Color.Label.neutral
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderContentPreview() {
    val list = List(10) {
        JourneyModel(id = "", title = "title $it", isClosed = false)
    }
    Content(
        list = list,
        onSelected = {}
    ) {}
}
