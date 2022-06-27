import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")

   GlobalScope.launch { // T1
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}") // Thread T1
      /**
       * delay(1000)
       * delay function will just delay the current co-routine.
       * It will not block the entire Thread.
       */
      delay(1000)   // Coroutine is suspended but Thread :T1 is free (not blocked)
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}") //Eiether Thread T1 or someother Thread.
   }
   Thread.sleep(2000)
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}

