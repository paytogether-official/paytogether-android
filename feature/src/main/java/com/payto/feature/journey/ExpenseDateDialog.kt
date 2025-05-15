@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import com.payto.model.JourneyInfoModel
import kotlinx.coroutines.launch
import java.time.Instant
import java.time.ZoneId


@Composable
fun ExpenseDateBottomSheetDialog(
    modifier: Modifier = Modifier,
    isShow: Boolean = false,
    model: JourneyInfoModel?,
    onDismissRequest: (Long?) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    val state = rememberDatePickerState(
        selectableDates = object : SelectableDates {
            override fun isSelectableDate(utcTimeMillis: Long): Boolean {
                val localDate = Instant.ofEpochMilli(utcTimeMillis)
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate()
                return !localDate.isBefore(model?.startLocalDate) && !localDate.isAfter(model?.endLocalDate)
            }
        }
    )

    val hideAndOnDismissRequest : (Long?) -> Unit = {
        coroutineScope
            .launch { sheetState.hide() }
            .invokeOnCompletion {
                onDismissRequest.invoke(state.selectedDateMillis)
            }
    }

    LaunchedEffect(state.selectedDateMillis) {
        if (isShow) {
            hideAndOnDismissRequest.invoke(state.selectedDateMillis)
        }
    }

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            onDismissRequest = {
                hideAndOnDismissRequest.invoke(state.selectedDateMillis)
            },
            containerColor = Color.Inverse.label,
            sheetState = sheetState,
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            Content(state = state, onDismissRequest = hideAndOnDismissRequest)
        }
    }
}


@Composable
private fun Content(
    state: DatePickerState,
    onDismissRequest: (Long?) -> Unit
) {
    DatePicker(
        state = state,
        title = null,
        headline = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "사용일자 선택", style = typography.contentBold, color = Color.Static.black)
                Image(
                    modifier = Modifier.rippleClickable {
                        onDismissRequest.invoke(null)
                    },
                    imageVector = IconPack.Close,
                    contentDescription = "닫기"
                )
            }
        },
        showModeToggle = false,
        colors = DatePickerDefaults.colors(
            containerColor = Color.Inverse.label,
            dayContentColor = Color.Label.normal,
            yearContentColor = Color.Label.normal,
            todayDateBorderColor = Color.Primary.normal,
            todayContentColor = Color.Primary.normal,
            selectedDayContentColor = Color.Inverse.label,
            selectedDayContainerColor = Color.Primary.normal,
            dayInSelectionRangeContainerColor = Component.Fill.primary,
            disabledDayContentColor = Color.Label.disable,
            weekdayContentColor = Color.Label.normal,
            selectedYearContainerColor = Color.Primary.normal,
            selectedYearContentColor = Color.Inverse.label,
            dividerColor = Color.Inverse.label,
        )
    )
}

@Preview
@Composable
private fun ExpenseDateBottomSheetDialogPreview() {
    Content(state = rememberDatePickerState(), onDismissRequest = {})
}
