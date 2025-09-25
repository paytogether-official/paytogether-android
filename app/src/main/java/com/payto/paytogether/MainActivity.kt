package com.payto.paytogether

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.ui.graphics.toArgb
import com.payto.designsystem.theme.Color
import com.payto.paytogether.deeplink.DeepLinkViewModel
import com.payto.paytogether.navigation.PayToNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val deepLinkViewModel: DeepLinkViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                Color.Static.white.toArgb(),
                Color.Static.white.toArgb(),
            ),
            navigationBarStyle = SystemBarStyle.auto(
                Color.Static.white.toArgb(),
                Color.Static.white.toArgb(),
            )
        )
        deepLinkViewModel.handleDeepLink(getDeepLinkUri(intent))
        setContent {
            PayToNavHost(deepLinkViewModel = deepLinkViewModel)
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        deepLinkViewModel.handleDeepLink(getDeepLinkUri(intent))
    }

    private fun getDeepLinkUri(intent: Intent): Uri? {
        return if (intent.action == Intent.ACTION_VIEW) {
            intent.data
        } else null
    }
}
