package com.payto.feature.common

import android.net.Uri
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.payto.designsystem.toast.ErrorPaytoToast
import com.payto.designsystem.toast.SuccessPaytoToast
import com.payto.feature.common.ShowSnackbar.Status.FAIL
import com.payto.feature.common.ShowSnackbar.Status.NONE
import com.payto.feature.common.ShowSnackbar.Status.SUCCESS
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Composable
fun HandleSideEffect(
    event: EventInterface,
    onNavigate: (Any) -> Unit,
    popBackStack: () -> Unit,
    onNavigateUri: (Uri) -> Unit = {},
) {
    val errorSnackbarState = remember { SnackbarHostState() }
    val successSnackbarState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(event) {
        event.sideEffectEvent.collectLatest { sideEffect ->
            when (sideEffect) {
                is Navigate -> {
                    onNavigate(sideEffect.route)
                }

                is NavigateUri -> {
                    onNavigateUri(sideEffect.uri)
                }

                is PopBackStack -> {
                    popBackStack()
                }

                is ShowSnackbar -> {
                    coroutineScope.launch {
                        errorSnackbarState.currentSnackbarData?.dismiss()
                        successSnackbarState.currentSnackbarData?.dismiss()
                        when (sideEffect.status) {
                            SUCCESS -> {
                                successSnackbarState.showSnackbar(
                                    message = sideEffect.message,
                                    duration = SnackbarDuration.Short
                                )
                            }

                            FAIL -> {
                                errorSnackbarState.showSnackbar(
                                    message = sideEffect.message,
                                    duration = SnackbarDuration.Short
                                )
                            }

                            NONE -> {}
                        }

                    }
                }
            }
        }
    }

    ErrorPaytoToast(snackbarHostState = errorSnackbarState)
    SuccessPaytoToast(snackbarHostState = successSnackbarState)
}
