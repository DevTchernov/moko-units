/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("mpp-library-convention")
    id("stub-javadoc-convention")
    id("publication-convention")
}

dependencies {
    commonMainApi(project(":units"))

    androidMainImplementation(Deps.Libs.Android.appCompat)
    androidMainImplementation(Deps.Libs.Android.recyclerView)
}
