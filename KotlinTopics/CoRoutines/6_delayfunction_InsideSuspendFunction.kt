package Coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Thread Name= ${Thread.currentThread().name} ID= ${Thread.currentThread().id}")
    GlobalScope.launch {
        println("Thread Name= ${Thread.currentThread().name} ID= ${Thread.currentThread().id}")
        delay(100)
    }
    runBlocking {  // Blocks the current Thread in which it its runnning.i.e in this case MainThread
        delay(200)
        println(" Run Blocking Thread Name= ${Thread.currentThread().name} ID= ${Thread.currentThread().id}")
    }
}


/*
  runBlocking {
       // Blocks the Current Thread in which its running.If delay() is used
    }

    
  GlobalScope.launch {
      // Is a non Blocking in nature.It will not block the Thread in which its Running.
    }

 */

