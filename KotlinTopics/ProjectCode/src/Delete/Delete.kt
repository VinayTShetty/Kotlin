import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main Start ${Thread.currentThread().name}")
    delay(100)
    launch(Dispatchers.Unconfined) {
        println("Parent-Start- ${Thread.currentThread().name}")
        delay(100)
        /**
         *  'coroutineContext' will take the Context of the immediate Parent.i.e Dispatchers.Unconfined
         */
        launch(coroutineContext) {
            println("Child-Start  ${Thread.currentThread().name}")

            delay(100)
            println("Child-End  ${Thread.currentThread().name}") // its like a confined Dispatcher.So right after the delay().It will execute on the Main Thread only.

        }
        println("Parent-End- ${Thread.currentThread().name}")
   }
    println("Main End ${Thread.currentThread().name}")
}