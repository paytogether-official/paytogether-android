package com.payto.paytogether.deeplink

import android.net.Uri
import com.payto.feature.common.Navigate
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.navigate.Journey
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DeepLinkViewModel @Inject constructor() : BaseViewModel() {

    fun handleDeepLink(uri: Uri?) {
        uri ?: return
        val path = uri.path
        val host = uri.host

        when {
            host == "app.paytogether.kr" && path?.startsWith("/journey/") == true -> {
                val journeyId = path.substringAfterLast("/")
                if (journeyId.isNotEmpty()) {
                    sendSideEffectEvent(Navigate(Journey(journeyId)))
                }
            }
            // 추가 딥링크 처리 로직을 여기에 추가할 수 있음
        }
    }
}
