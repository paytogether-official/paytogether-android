@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey.expense

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
fun PayerSettingDialog(
    modifier: Modifier = Modifier,
    isShow: Boolean = false,
    payers: List<String>,
    selectedPayer: String,
    onDismissRequest: (String?) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    val hideAndOnDismissRequest: (String?) -> Unit = { payer ->
        coroutineScope
            .launch { sheetState.hide() }
            .invokeOnCompletion {
                onDismissRequest.invoke(payer)
            }
    }

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            onDismissRequest = {
                hideAndOnDismissRequest.invoke(null)
            },
            containerColor = Color.Inverse.label,
            sheetState = sheetState,
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            Content(
                payers = payers,
                selectedPayer = selectedPayer,
                onDismissRequest = hideAndOnDismissRequest
            )
        }
    }
}

@Composable
fun Content(
    payers: List<String>,
    selectedPayer: String,
    onDismissRequest: (String?) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "결제자 설정", style = typography.contentBold, color = Color.Static.black)
            Image(
                modifier = Modifier.rippleClickable {
                    onDismissRequest.invoke(selectedPayer)
                },
                imageVector = IconPack.Close,
                contentDescription = "닫기"
            )
        }

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(payers) {
                Item(
                    name = it,
                    isSelected = selectedPayer == it,
                    onClick = { onDismissRequest(it) }
                )
            }
        }
    }
}

@Composable
private fun Item(
    name: String,
    isSelected: Boolean,
    onClick: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .rippleClickable {
                onClick.invoke(name)
            }
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 10.dp),
            text = name,
            style = typography.captionAccent,
            color = Color.Label.neutral
        )
        if (isSelected) {
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
private fun PayerSettingDialogPreview() {
    Content(payers = List(5) { "payer $it" }, selectedPayer = "payer 0", onDismissRequest = {})
}
