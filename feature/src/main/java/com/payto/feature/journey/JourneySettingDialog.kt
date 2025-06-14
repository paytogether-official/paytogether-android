@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey

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
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import kotlinx.coroutines.launch


@Composable
fun JourneySettingBottomSheetDialog(
    modifier: Modifier,
    isShow: Boolean,
    onDismissRequest: (JourneySettingType?) -> Unit,
) {

    val sheetState = rememberModalBottomSheetState()
    val coroutineScope = rememberCoroutineScope()

    val onSelected: (JourneySettingType?) -> Unit = { setting ->
        coroutineScope
            .launch { sheetState.hide() }
            .invokeOnCompletion {
                onDismissRequest(setting)
            }
    }

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            onDismissRequest = { onSelected(null) },
            contentColor = Color.Static.white,
            containerColor = Color.Static.white,
            sheetState = sheetState,
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            Content(
                onSelected = { setting ->
                    onSelected(setting)
                }
            )
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    onSelected: (JourneySettingType) -> Unit
) {
    val orderList = remember {
        JourneySettingType.entries.toList()
    }
    Column(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(orderList) {
                SettingItem(
                    setting = it,
                    onClick = onSelected
                )
            }
        }
    }
}

@Composable
private fun SettingItem(
    setting: JourneySettingType,
    onClick: (JourneySettingType) -> Unit
) {
    Row(
        modifier = Modifier
            .rippleClickable(shape = RoundedCornerShape(8.dp)) {
                onClick.invoke(setting)
            }
            .background(color = Component.Fill.normal)
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = setting.displayName,
            style = typography.captionAccent,
            color = if (setting == JourneySettingType.LEAVE) Color.Status.error else Color.Label.neutral
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ContentPreview() {
    Content {}
}


enum class JourneySettingType(val displayName: String) {
    FINISH("여정 마무리"),
    SHARE("여정 공유하기"),
    SETTINGS("설정 변경"),
    LEAVE("여정 나가기")
}