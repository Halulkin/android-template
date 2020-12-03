package com.monstarlab.mock

import kotlinx.coroutines.delay

object MockSuspends {

    suspend fun fetchString(): String {
        delay(5000)
        return "Hello world from suspend"
    }

}