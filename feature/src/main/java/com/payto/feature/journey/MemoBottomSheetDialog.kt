@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.feature.journey

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payto.designsystem.extension.rippleClickable
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Close
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.Component
import com.payto.designsystem.theme.typography
import kotlinx.coroutines.launch

@Composable
fun MemoBottomSheetDialog(
    modifier: Modifier,
    isShow: Boolean,
    onDismissRequest: (String) -> Unit = {},
) {

    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val coroutineScope = rememberCoroutineScope()

    if (isShow) {
        ModalBottomSheet(
            modifier = modifier,
            onDismissRequest = {
                coroutineScope
                    .launch { sheetState.hide() }
                    .invokeOnCompletion {
                        onDismissRequest("")
                    }
            },
            contentColor = Color.Static.white,
            containerColor = Color.Static.white,
            sheetState = sheetState,
            dragHandle = {
                BottomSheetDefaults.DragHandle(color = Component.Fill.strong)
            }
        ) {
            Content(
                onDismissRequest = onDismissRequest
            )
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    onDismissRequest: (String) -> Unit = {},
) {
    var memoText by remember {
        mutableStateOf("")
    }

    val isError by remember(memoText) {
        derivedStateOf { memoText.length > 25 }
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "메모", style = typography.contentBold, color = Color.Static.black)
            Image(
                modifier = Modifier.rippleClickable {
                    onDismissRequest.invoke("")
                },
                imageVector = IconPack.Close,
                contentDescription = "닫기"
            )
        }

        Column(modifier.padding(top = 16.dp)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                MemoTextField(
                    modifier = Modifier.fillMaxWidth(),
                    text = memoText,
                    onValueChange = {
                        memoText = it
                    }
                )
                HorizontalDivider(
                    thickness = 2.dp,
                    color = if (isError) Color.Status.error else Color.Primary.normal,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 2.dp),
                    text = "25자까지 입력할 수 있어요",
                    style = typography.captionRegular,
                    color = Color.Label.alternative
                )
            }
            Box(
                modifier = Modifier
                    .padding(top = 36.dp)
                    .rippleClickable(
                        enabled = isError.not() && memoText.isNotEmpty(),
                        shape = null
                    ) {
                        onDismissRequest.invoke(memoText)
                    }
                    .fillMaxWidth()
                    .background(Color.Primary.normal)
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "확인", style = typography.contentAccent, color = Color.Static.white)
            }
        }
    }
}

@Composable
private fun MemoTextField(
    modifier: Modifier = Modifier,
    text: String,
    onValueChange: (String) -> Unit,
) {
    var isFocused: Boolean by remember {
        mutableStateOf(false)
    }
    val focusManager = LocalFocusManager.current
    Box(
        modifier = modifier.height(20.dp)
    ) {
        AnimatedVisibility(
            modifier = Modifier.align(Alignment.Center),
            visible = text.isEmpty(),
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "어떤 특이사항이 있었나요?",
                color = Color.Label.disable,
                style = typography.contentAccent,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {
            BasicTextField(
                modifier = Modifier
                    .weight(1f)
                    .onFocusChanged {
                        isFocused = it.isFocused
                    },
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                    }
                ),
                value = text,
                onValueChange = onValueChange,
                textStyle = typography.contentAccent.copy(color = Color.Label.neutral),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContentPreview() {
    Content {}
}
