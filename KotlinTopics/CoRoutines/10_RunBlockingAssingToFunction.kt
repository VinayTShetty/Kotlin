import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * using runBlocking with a function.
 * i.e assigning a runBlocking to a function.
 */
fun main(args: Array<String>) =    runBlocking {
        GlobalScope.launch {
            println("RunBlocking Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
            delay(200)
            println("RunBlocking Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
        }
        delay(1000)
    }
