package com.payto.paytogether

import android.app.Application
import android.content.Context
import coil3.ImageLoader
import coil3.SingletonImageLoader
import coil3.request.crossfade
import coil3.svg.SvgDecoder
import com.google.firebase.crashlytics.FirebaseCrashlytics
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(), SingletonImageLoader.Factory {

    override fun onCreate() {
        super.onCreate()
        // Firebase Crashlytics 초기화 (릴리즈 빌드에서만)
        FirebaseCrashlytics.getInstance().isCrashlyticsCollectionEnabled = !BuildConfig.DEBUG
    }

    override fun newImageLoader(context: Context): ImageLoader {
        return ImageLoader.Builder(context)
            .crossfade(300)
            .components {
                add(SvgDecoder.Factory())
            }
            .build()
    }
}
