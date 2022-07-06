launch

launch will run on the Thread,From where the scope is defined.
It will copy the scope of the immediate parent co-routine.


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
      launch { // main Thread
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
         println("Fake Work  Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      }
      println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }

}


/**
  launch coroutine builder (Fire and Forget)
1)launch coroutine creates a new coroutines without blocking the current Thread
2)inherits the Threads and coroutine scope of the immediate parent coroutine.
3)Returs a reference of the Job Object.
  Using the job object we can cancel() and join() the coroutine.
 Using the job coroutine we can cancel the coroutine and wait () for the coroutine to finish.

 4)launch coroutine is inside the scope of runBlocking bcoz of that,In inherits the Thread scope i.e

Example 1 :- 
 If the runBlocking{} scope is running on Main Thread
 launch {} coroutine within the scope will also run on the MainThread.

Example 2 :- 
 If the runBlocking{} scope is running on Thread T1
 launch {} coroutine within the scope will also run on the Thread T1.

 */