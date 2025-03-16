package com.payto.paytogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.payto.designsystem.theme.Color
import com.payto.paytogether.navigation.PayToNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
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
        setContent {
            PayToNavHost()
        }
    }
}
