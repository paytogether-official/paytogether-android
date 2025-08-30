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
        // Firebase Crashlytics 초기화 // TODO 릴리즈 배포시 디버그 분기 처리
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
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
