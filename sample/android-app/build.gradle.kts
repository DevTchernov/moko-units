/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("android-app-convention")
}

android {
    buildFeatures.dataBinding = true

    defaultConfig {
        applicationId = "dev.icerock.moko.samples.units"

        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation(Deps.Libs.Android.appCompat)
    implementation(Deps.Libs.Android.recyclerView)

    implementation(project(":sample:mpp-library"))
}
