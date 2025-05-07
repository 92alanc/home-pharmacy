plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.compose.compiler)
    alias(libs.plugins.kotlin.parcelise)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.alancamargo.homepharmacy"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.alancamargo.homepharmacy"
        minSdk = 24
        targetSdk = 35
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
}

dependencies {
    implementation(libs.android.activity)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.android.compose.activity)
    implementation(platform(libs.android.compose.bom))
    implementation(libs.android.compose.material3)
    implementation(libs.android.compose.preview)
    implementation(libs.google.ads)
    implementation(libs.hilt.android)
    implementation(libs.android.splashscreen)
    implementation(libs.hilt.android)
    implementation(libs.room.ktx)

    ksp(libs.hilt.compiler)
    ksp(libs.room.compiler)

    testImplementation(libs.coroutines.test)
    testImplementation(libs.junit)
    testImplementation(libs.mockk.android)
    testImplementation(libs.truth)
    testImplementation(libs.turbine)

    androidTestImplementation(libs.androidx.espresso.core)
}
