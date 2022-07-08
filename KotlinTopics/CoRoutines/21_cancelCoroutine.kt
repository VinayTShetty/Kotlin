/**
 * Case 1 
   Print 1-50 and join() function will wait untill all the coroutines are finished.
 */

 import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            println(i)
        }
    }
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------

/**
Case 2:-
Puroposely Making a delay 
 */
 import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Purposely making the delay
             */
            Thread.sleep(100)
            println(i)
        }
    }
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}

//------------------------------------------------------------------------------------------------------------------------
/**
Case 3:- 
 This will not cancel the launch coroutine.
 Becasue , Inside the launch coroutine we are not using any coroutine which is co-operatinve. 
 */
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Purposely making the delay
             */
            Thread.sleep(100)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     */
    delay(100)
    /**
     * This will cancel the coroutine immediately.
     * To avoid it , using delay(100) above
     */
    job.cancel()
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Making the coroutine cooperative using functions() form Kotlin.* packages.
             */
            delay(50)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     * If this is not there then,It will be difficult to mimic the cancel() function.
     */
    delay(200)
    /**
     * This will cancel the coroutine immediately.
     * To avoid it , using delay(100) above
     */
    job.cancel()
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------

import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Making the coroutine cooperative using functions() form Kotlin.* packages.
             */
            delay(50)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     * If this is not there then,It will be difficult to mimic the cancel() function.
     */
    delay(200)
    /**
     * This will cancel the coroutine() in the launch scope.
     */
    job.cancelAndJoin()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------