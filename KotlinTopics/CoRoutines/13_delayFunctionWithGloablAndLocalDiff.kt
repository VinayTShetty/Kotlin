

In case of launch with delay,
the application will wait untill all the co-routines are finshed.


import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
   runBlocking {
      println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      /*
      * Application will wait untill the launch function finishes the task.
      */
      launch { // main Thread
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
         delay(10000)
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      }
      println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }

}
********************************************************************************************************************************
import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
   runBlocking {
      println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      /*
      * Application will not wait untill the launch function finishes the task.
      * It will end the application without waiting
      */
      GlobalScope.launch { // main Thread
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
         delay(10000)
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      }
      println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }

}