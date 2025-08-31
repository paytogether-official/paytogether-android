import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotlinParcelize)
    alias(libs.plugins.googleKsp)
    alias(libs.plugins.googleHilt)
    alias(libs.plugins.googleServices)
    alias(libs.plugins.firebaseCrashlyticsPlugin)
    alias(libs.plugins.firebaseAppDistribution)
}

android {
    namespace = "com.payto.paytogether"
    compileSdk = AppConfig.COMPILE_SDK

    defaultConfig {
        applicationId = "com.payto.paytogether"
        minSdk = AppConfig.MIN_SDK
        targetSdk = AppConfig.COMPILE_SDK
        versionCode = AppConfig.VERSION_CODE
        versionName = AppConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }
    composeCompiler {
        includeSourceInformation = true
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

firebaseAppDistribution {
    appId = project.findProperty("FIREBASE_APP_ID") as String?
    artifactType = "APK"
    groups = "testers"
    releaseNotes = "Debug build for testing"
}

tasks.register("distributeDebug") {
    dependsOn("assembleDebug")
    finalizedBy("appDistributionUploadDebug")
    
    doLast {
        println("Debug APK build completed and uploaded to Firebase App Distribution")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.kotlinx.serialization.json)

    implementation(platform(libs.firebase.bom))
    implementation(libs.bundles.firebase)

    ksp(libs.hilt.compiler)
    implementation(libs.bundles.hilt)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose)

    implementation(libs.bundles.coil)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(project(":feature"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:common"))
    implementation(project(":core:data"))
    implementation(project(":core:model"))
}