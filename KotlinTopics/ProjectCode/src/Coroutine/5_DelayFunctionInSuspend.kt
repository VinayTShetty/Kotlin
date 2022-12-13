package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Using run Blocking")
    runBlocking {
        delay(100)
    }
}

