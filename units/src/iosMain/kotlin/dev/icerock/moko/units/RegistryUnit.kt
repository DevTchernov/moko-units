/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.units

interface RegistryUnit<T> {
    fun register(intoView: T)
}