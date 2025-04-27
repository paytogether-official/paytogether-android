package com.payto.data.network.module

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.payto.data.network.service.PaytoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val json = Json {
            ignoreUnknownKeys = true // 알 수 없는 필드 무시
            explicitNulls = false // null 값을 제거
            isLenient = true // 더 유연한 JSON 파싱 허용
            encodeDefaults = true // 기본값을 포함하여 직렬화
        }
        return Retrofit.Builder()
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
//            .baseUrl("https://api.paytogether.kr/")
            .baseUrl("http://3.39.194.45/")
            .build()
    }


    @Singleton
    @Provides
    internal fun providePaytoService(retrofit: Retrofit): PaytoService {
        return retrofit.create(PaytoService::class.java)
    }
}
