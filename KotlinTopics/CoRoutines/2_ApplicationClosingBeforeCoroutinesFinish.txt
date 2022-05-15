import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")

   /**
    * Creates a background coroutines that runs on a background Thread.
    */
   GlobalScope.launch {
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      Thread.sleep(1000) // Sleep the Thread for 1 seconds
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}

/**
 * when a co-routine is launched by default the application don t know it has to wait untill the co-routine has finished.
 * It will end the application before the co-routines has finished its task.
 */
