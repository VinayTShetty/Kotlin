package Coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){
    println("Thread Details=${Thread.currentThread().name} ${Thread.currentThread().id}")
    GlobalScope.launch {
        println("Coroutine Thread Details=${Thread.currentThread().name} , ${Thread.currentThread().id}")
        Thread.sleep(1000)
        println("Coroutine Thread Details=${Thread.currentThread().name} , ${Thread.currentThread().id}")
    }
    println("Thread Details=${Thread.currentThread().name} ${Thread.currentThread().id}")
}

/**
 * Application will not wait untill the coroutine finishes.
 *
 */