Suspend Function call

Suspend function can be called from a coroutine or another suspend function.


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")

   GlobalScope.launch { // Thread T1
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      delay(1000)
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }
   delay(1000)
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}

Error
Suspend function 'delay' should be called only from a coroutine or another suspend function

