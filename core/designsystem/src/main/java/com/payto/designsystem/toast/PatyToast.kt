@file:OptIn(ExperimentalMaterial3Api::class)

package com.payto.designsystem.toast

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.payto.designsystem.icon.IconPack
import com.payto.designsystem.icon.iconpack.Circlecheck
import com.payto.designsystem.icon.iconpack.Circlecheckfill
import com.payto.designsystem.theme.Color
import com.payto.designsystem.theme.typography

@Composable
fun ErrorPaytoToast(
    snackbarHostState: SnackbarHostState,
) {
    PaytoToast(
        snackbarHostState = snackbarHostState,
        icon = {
            Image(
                imageVector = IconPack.Circlecheckfill,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Status.error)
            )
        }
    )
}

@Composable
fun SuccessPaytoToast(
    snackbarHostState: SnackbarHostState,
) {
    PaytoToast(
        snackbarHostState = snackbarHostState,
        icon = {
            Image(
                imageVector = IconPack.Circlecheckfill,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Status.success)
            )
        }
    )
}


@Composable
fun PaytoToast(
    snackbarHostState: SnackbarHostState,
    icon: @Composable () -> Unit = {
        Image(imageVector = IconPack.Circlecheck, contentDescription = null)
    }
) {
    Box(modifier = Modifier.fillMaxWidth()) {
        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier
                .align(Alignment.TopCenter)
        ) {
            Popup {
                ToastContent(message = it.visuals.message, icon = icon)
            }
        }
    }
}

@Composable
private fun ToastContent(
    message: String,
    icon: @Composable () -> Unit = {},
) {
    Row(
        modifier = Modifier
            .padding(horizontal = 50.dp)
            .fillMaxWidth()
            .background(Color.Static.black.copy(alpha = 0.8f), shape = RoundedCornerShape(16.dp))
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            10.dp,
            alignment = Alignment.CenterHorizontally
        )
    ) {
        icon()
        Text(text = message, color = Color.Static.white, style = typography.contentRegular)
    }
}

@Preview
@Composable
private fun PaytoToastPreview() {
    ToastContent(message = "테스트")
}
