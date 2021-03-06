/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

pluginManagement {
    repositories {
        mavenCentral()
        google()

        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        jcenter {
            content {
                includeGroup("org.jetbrains.trove4j")
                includeGroup("org.jetbrains.kotlinx")
            }
        }
    }
}

includeBuild("units-build-logic")
includeBuild("units-generator")

include(":units")
include(":units-basic")
include(":units-test")
include(":sample:android-app")
include(":sample:mpp-library")
