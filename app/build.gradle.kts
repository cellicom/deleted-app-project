plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    // The namespace (internal code package) remains fixed
    namespace = "com.cellicomsoft.deleteapp"
    compileSdk = 35

    defaultConfig {
        // The applicationId is what appears on the Play Store and can be changed here
        applicationId = "your.package.here.new"
        
        // Configurable application name
        val appName = "Deleted App 999"
        resValue("string", "app_name", appName)

        // versioning
        versionCode = 999999
        versionName = "999999.9"

        minSdk = 24
        targetSdk = 35

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
