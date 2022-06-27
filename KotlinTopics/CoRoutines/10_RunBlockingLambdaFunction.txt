Run Blocking

RunBlocking Creates a new Coroutine and Block the Thread in which its running.


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   runBlocking {  //Created a co-routine that blocks the main Thread / Curret Thread in which its running.
      GlobalScope.launch { // Creates a new Coroutine with New Thread T1
         println("RunBlocking Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")  // Thread T1
         delay(200) // Coroutine is suspended ,But Thread T1 is free and not Blocked
         println("RunBlocking Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")// Eiether T1 or someother Thread
      }
   }
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}