import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
   runBlocking {
      println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      /**
       *  launch function is present inside the scope of the runBlocking coroutines.
       *  runBlocking coroutines is running on the main Thread.
       *  as launch{} is inside the scope of the runBlocking,so it will run on the main Thread.
       */
      GlobalScope.launch { // main Thread
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
         delay(10000)
         /**
          * This statement can be executed from main Thread or any other Thread as this is the call next to supsending function.
          */
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}") 
      }
      println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }

}