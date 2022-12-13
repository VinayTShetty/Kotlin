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
      delay(1000)
      /**
       * The change of Thread is applicable.
       * After a suspend call
       */
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}") // This statement is not mandatory that it should run on T1 Thread. Eiether T1 or some other Thread
   }
   Thread.sleep(2000)
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}