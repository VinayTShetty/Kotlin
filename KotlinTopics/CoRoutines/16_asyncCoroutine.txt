import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
        /**
         * async coroutine will inherit scope form the parent coroutines.
         */
        var job:Job=async {
            println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
            delay(1000)

            println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
        }
        println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
    }

} 


/**
 *   'async' coroutine builder
 1) We can retrive the data using await() function.
 2)async will create a new coroutine without blocking the current Thread.
   It will inherits the thread and coroutine scope of the immediate parent coroutine.
 3)It will return a Defered<T> Object.
 4)Using the Defered<T> object we can
    cancel,
    wait
    finish
    retrive the value
 */