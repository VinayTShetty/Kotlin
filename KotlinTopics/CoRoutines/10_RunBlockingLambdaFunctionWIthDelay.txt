import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
fun main() {
    println("Main Program Starts = "+Thread.currentThread().name+" "+Thread.currentThread().id)
    /**
     * Creates a coroutine that Blocks the Current Thread in which its running.
     */
    runBlocking {
        println("Fake Work Start = "+Thread.currentThread().name+" "+Thread.currentThread().id)
        /**
         * calling a delay() inside the runBlocking coroutine will wait for the previous coroutine to finish.
         */
        delay(1000) 
        println("Fake Work End = "+Thread.currentThread().name+" "+Thread.currentThread().id)
    }
    println("Main Programe Ends = "+Thread.currentThread().name+" "+Thread.currentThread().id)
}