package Coroutine

import kotlinx.coroutines.*

fun main() {
   runBlocking {
       println("Start RunBlocking- ${Thread.currentThread().name}-${Thread.currentThread().id}")
       async {
           println("GlobalScope-async - ${Thread.currentThread().name}-${Thread.currentThread().id}")
       }
       println("End RunBlocking- ${Thread.currentThread().name}-${Thread.currentThread().id}")
   }
}
/**
 *  runBlocking --> GlobalScope.async
 *  GlobalScope.async will run on the Worker Thread.
 *
 *  runBlocking -->async
 *  async will run on the Main Theread.i.e(Thread on which runBlocking is executed.It will inherit from the Parent Co-routineContext)
 */