package com.payto.feature.common

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HandleSideEffect(
    event: EventInterface,
    onNavigate: (Any) -> Unit
) {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        event.sideEffectEvent.collectLatest { sideEffect ->
            when (sideEffect) {
                is Navigate -> {
                    onNavigate(sideEffect.route)
                }

                is ShowSnackbar -> {
                    // TODO 커스텀
                    Toast.makeText(context, sideEffect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
