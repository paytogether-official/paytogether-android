@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.designsystem.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.component.PaytoButton
import com.payto.designsystem.component.PaytoButtonStatus
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import kotlinx.coroutines.launch

@Composable
fun PaytoDialog(
    isShowDialog: Boolean,
    model: DialogData,
    sheetState: SheetState = rememberModalBottomSheetState(),
    onDismissRequest: () -> Unit,
    firstButtonClick: () -> Unit = {},
    secondButtonClick: () -> Unit = {}
) {
    val coroutineScope = rememberCoroutineScope()

    if (isShowDialog) {
        ModalBottomSheet(
            modifier = Modifier
                .navigationBarsPadding()
                .padding(start = 8.dp, end = 8.dp, bottom = 16.dp),
            onDismissRequest = onDismissRequest,
            sheetState = sheetState,
            containerColor = Color.Static.white,
            shape = RoundedCornerShape(24.dp),
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            DialogComponent(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                model = model,
                firstButtonClick = {
                    coroutineScope
                        .launch { sheetState.hide() }
                        .invokeOnCompletion {
                            onDismissRequest.invoke()
                            firstButtonClick.invoke()
                        }
                },
                secondButtonClick = {
                    coroutineScope
                        .launch { sheetState.hide() }
                        .invokeOnCompletion {
                            onDismissRequest.invoke()
                            secondButtonClick.invoke()
                        }
                }
            )
        }
    }
}

@Composable
private fun DialogComponent(
    modifier: Modifier = Modifier,
    model: DialogData,
    firstButtonClick: () -> Unit = {},
    secondButtonClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            if (model.icon != null) {
                Image(
                    modifier = Modifier.size(80.dp),
                    painter = painterResource(id = model.icon),
                    contentDescription = null
                )
            }
            Text(
                text = model.title,
                color = Color.Label.normal,
                style = typography.featureBold
            )
            Text(
                modifier = Modifier.padding(top = 4.dp),
                text = model.subtitle,
                color = Color.Label.neutral,
                style = typography.contentRegular
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PaytoButton(
                modifier = Modifier.weight(1f),
                status = PaytoButtonStatus.NORMAL,
                text = model.firstButton,
                onClick = firstButtonClick
            )
            PaytoButton(
                modifier = Modifier.weight(1f),
                text = model.secondButton,
                status = if (model.style == DialogStyle.RED) PaytoButtonStatus.ERROR else PaytoButtonStatus.PRIMARY,
                onClick = secondButtonClick
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PaytoDialogComponentPreview() {
    DialogComponent(
        model = DialogData(
            title = "여정을 삭제하시겠어요?",
            subtitle = "삭제시 모든 데이터가 사라집니다.",
            firstButton = "닫기",
            secondButton = "삭제하기",
        )
    )
}


@Preview(showBackground = true)
@Composable
private fun PaytoDialogPreview() {
    var isShowDialog by mutableStateOf(true)
    PaytoDialog(
        isShowDialog = isShowDialog,
        model = DialogData(
            title = "여정을 삭제하시겠어요?",
            subtitle = "삭제시 모든 데이터가 사라집니다.",
            firstButton = "닫기",
            secondButton = "삭제하기",
        ),
        onDismissRequest = {
            isShowDialog = false
        }
    )
}

enum class DialogStyle {
    RED, BLUE
}

data class DialogData(
    val style: DialogStyle = DialogStyle.BLUE,
    val title: String = "",
    val subtitle: String = "",
    val icon: Int? = null,
    val firstButton: String = "",
    val secondButton: String = "",
)
