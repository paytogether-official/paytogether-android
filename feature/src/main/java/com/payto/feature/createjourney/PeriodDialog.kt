@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.createjourney

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.DateRangePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Close
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

@Composable
fun PeriodDialog(
    onDismissRequest: (Long?, Long?) -> Unit,
    modifier: Modifier = Modifier,
) {
    val state = rememberDateRangePickerState()
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val coroutineScope = rememberCoroutineScope()

    val hideAndOnDismissRequest: () -> Unit = {
        coroutineScope
            .launch { sheetState.hide() }
            .invokeOnCompletion {
                onDismissRequest.invoke(state.selectedStartDateMillis, state.selectedEndDateMillis)
            }
    }
    LaunchedEffect(state.selectedEndDateMillis) {
        if (state.selectedEndDateMillis != null) {
            hideAndOnDismissRequest()
        }
    }
    ModalBottomSheet(
        modifier = modifier,
        onDismissRequest = {
            hideAndOnDismissRequest()
        },
        containerColor = Color.Inverse.label,
        sheetState = sheetState,
        dragHandle = {
            BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
        }
    ) {
        PeriodDialogContent(
            state = state,
            onDismissRequest = {
                hideAndOnDismissRequest()
            }
        )
    }
}


@Composable
fun PeriodDialogContent(state: DateRangePickerState, onDismissRequest: () -> Unit) {
    val dateRange by remember(state.selectedStartDateMillis, state.selectedEndDateMillis) {
        derivedStateOf {
            if (state.selectedEndDateMillis != null && state.selectedStartDateMillis != null) {
                val start = Date(state.selectedStartDateMillis ?: 0)
                val end = Date(state.selectedEndDateMillis ?: 0)
                SimpleDateFormat("yy.MM.dd", Locale.getDefault()).format(start) +
                        " - " +
                        SimpleDateFormat("yy.MM.dd", Locale.getDefault()).format(end)
            } else {
                null
            }
        }
    }

    val range by remember(state.selectedStartDateMillis, state.selectedEndDateMillis) {
        derivedStateOf {
            if (state.selectedEndDateMillis != null && state.selectedStartDateMillis != null) {
                val diffInMillis = kotlin.math.abs(
                    (state.selectedEndDateMillis ?: 0) - (state.selectedStartDateMillis ?: 0)
                )
                val days = TimeUnit.MILLISECONDS.toDays(diffInMillis)

                "${days + 1}일"
            } else {
                null
            }
        }
    }

    DateRangePicker(
        modifier = Modifier.fillMaxHeight(0.6f),
        state = state,
        title = null,
        headline = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "여행기간 설정",
                        style = typography.highlightBold,
                        color = Color.Label.normal
                    )
                    Image(
                        modifier = Modifier.rippleClickable(onClick = onDismissRequest),
                        imageVector = IconPack.Close,
                        contentDescription = "닫기"
                    )
                }

                Row(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    if (dateRange != null) {
                        Box(
                            modifier = Modifier
                                .height(28.dp)
                                .background(
                                    color = Component.Fill.primary,
                                    shape = RoundedCornerShape(40.dp)
                                )
                                .border(
                                    width = 1.dp,
                                    color = Color.Primary.normal,
                                    shape = RoundedCornerShape(40.dp)
                                )
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(Alignment.Center),
                                text = "$dateRange",
                                style = typography.contentAccent,
                                color = Color.Primary.normal,
                            )
                        }
                    }
                    if (range != null) {
                        Box(
                            modifier = Modifier
                                .height(28.dp)
                                .background(
                                    color = Component.Fill.primary,
                                    shape = RoundedCornerShape(40.dp)
                                )
                                .border(
                                    width = 1.dp,
                                    color = Color.Primary.normal,
                                    shape = RoundedCornerShape(40.dp)
                                )
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                modifier = Modifier.align(Alignment.Center),
                                text = "$range",
                                style = typography.contentAccent,
                                color = Color.Primary.normal,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
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
            disabledDayContentColor = Color.Label.normal,
            weekdayContentColor = Color.Label.normal,
            dividerColor = Color.Inverse.label,
        )
    )
}

@Preview
@Composable
private fun PeriodDialogPreview() {
    PeriodDialogContent(rememberDateRangePickerState(), onDismissRequest = {})
}
