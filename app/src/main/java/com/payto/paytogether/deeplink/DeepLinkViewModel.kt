package com.payto.paytogether.deeplink

import android.net.Uri
import com.payto.feature.common.NavigateUri
import com.payto.feature.common.arch.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DeepLinkViewModel @Inject constructor() : BaseViewModel() {

    fun handleDeepLink(uri: Uri?) {
        uri ?: return
        // URI를 그대로 전달하여 Navigation이 자동으로 매칭하도록 함
        sendSideEffectEvent(NavigateUri(uri))
    }
}
