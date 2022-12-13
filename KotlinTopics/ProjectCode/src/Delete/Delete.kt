/**
 *  withTimeoutOrNull
 *  This will return a value from the coroutine from the Lambda Result.
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
  val resutl:String?=  withTimeoutOrNull(500) {
        for (i in 0..10) {
            println(i)
        }
        "I am Finsihed"
    }
    println("Main Function ${Thread.currentThread().id} ${Thread.currentThread().name}")
    println("WithTimeOutOrNull= ${resutl}")
}

