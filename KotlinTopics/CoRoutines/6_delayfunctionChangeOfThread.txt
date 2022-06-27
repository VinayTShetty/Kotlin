import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")

   /**
    * Creates a background coroutine that runs on a background Thread.
    * Assume Thread T1.
    */
   GlobalScope.launch { // Thread T1
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      delay(1000) // This is pause/suspend the coroutines.i.e Thread T1 becomes free to run/associate with other coroutines.
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}") // This statement is not mandatory that it should run on T1 Thread. Eiether T1 or some other Thread
   }
   Thread.sleep(2000)
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}


   /**
    * This change of Thread is applicable to all suspending function.
    * After the suspend function call,the next line of code will be executed from the same Thread or another Thread
    */