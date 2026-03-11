plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.simpsonproject"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.simpsonproject"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {


    implementation(libs.androidx.compose.runtime.livedata)
    var retrofitVer = "2.9.0"
    var kotlinCourotinees = "1.7.3"
    var composeVer = "2.10.0"
    var composeNavigationVer = "2.9.7"
    var composeLiveDataVer = "1.10.3"
    var lifecycleRuntimeVer ="2.10.0"

    var coilVer ="2.7.0";

    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    implementation("com.squareup.retrofit2:retrofit:${retrofitVer}")
    implementation("com.squareup.retrofit2:converter-gson:${retrofitVer}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${kotlinCourotinees}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:${composeVer}")

    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.10.0")

    /*implementation("androidx.compose.runtime:runtime-livedata:${composeLiveDataVer}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${lifecycleRuntimeVer}")*/


    implementation("androidx.navigation:navigation-common:${composeNavigationVer}")
    implementation("io.coil-kt:coil-compose:${coilVer}")


}