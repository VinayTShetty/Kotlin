import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
   runBlocking {
      println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
       /**
        * launch{} function return type is Job Object.
        */
  var job:Job=launch { // main Thread
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
         delay(5000)

         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      }
       /**
        * By using this job Object.
        * we can call join() function.
        * This join function dosen t allow next line to execute untill the previous coroutines are finished with the work
        */
      job.join()
      println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }

}