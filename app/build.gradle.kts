plugins {
    alias(libs.plugins.ksp)
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.quickexam"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.quickexam"
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
    implementation(libs.androidx.core.ktx)

    // čuva podatke i kada se ekran rotira
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.10.0")

    // omogućava prijelaz sa ekrana na ekran
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // omogućava da baza i internet rade u pozadini
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // osnovni dio Room baze
    implementation("androidx.room:room-runtime:2.6.1")

    // omogučava korištenje Room-a s Coroutines
    // Room - baza, Coroutines - rad u pozadini
    implementation("androidx.room:room-ktx:2.6.1")

    // automatski generira kod za bazu (bez ovoga Room ne radi
    ksp("androidx.room:room-compiler:2.6.1")

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
}