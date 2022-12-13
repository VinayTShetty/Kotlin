import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")

   GlobalScope.launch {
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      /**
       * Thread.sleep(1000)
       * will block the entire Thread and all the coroutines operation in that Thread.
       */
      Thread.sleep(1000)
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }
   Thread.sleep(2000)
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}