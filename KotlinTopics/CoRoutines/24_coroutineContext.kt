import kotlinx.coroutines.*

fun main() = runBlocking {

    /**
     * Using 'coroutineContext' keyword we can access the  current coroutineContext object.
     */
    println(coroutineContext)
}
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Launch ${Thread.currentThread().name}")
    /**
     * This launch will inherit the 'coroutineContext' from the runBlocking coroutine.
     * 
     * withoutParameter: A coroutine without any parameter is called Confined Coroutine
     * This will inherit the 'coroutineContext' fromt the immediagte parent.
     */
    launch {
        println("Launch ${Thread.currentThread().name}")
    }
    println()
}
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Launch ${Thread.currentThread().name}")
    /**
     * This launch will inherit the 'coroutineContext' from the runBlocking coroutine.
     *
     * withoutParameter: A coroutine without any parameter is called Confined Coroutine
     * This will inherit the 'coroutineContext' fromt the immediagte parent.
     * This is called a Confined dispatacher as its confined to Single Thread.
     */
    launch {
        println("Start Launch ${Thread.currentThread().name}") // MainThread
        delay(100)
        println("End Launch ${Thread.currentThread().name}") // MainThread only for the Confined Parameter, It will be using MainThread only.
    }
    println()
}
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("RunBlocking ${Thread.currentThread().name}")
    /**
     * With Parameter:- This property will be similar as GlobalScop.launch{}
     * This will create a coroutine on the application level.
     * This will create a coroutine on the background Thread.
     */
    launch(Dispatchers.Default) {
        println("Launch->Dispatchers.Default ${Thread.currentThread().name}")
    }
    println()
}


/**
RunBlocking main
Launch->Dispatchers.Default DefaultDispatcher-worker-1
 */
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("RunBlocking ${Thread.currentThread().name}")
    /**
     * With Parameter:- This property will be similar as GlobalScop.launch{}
     * This will create a coroutine on the application level.
     * This will create a coroutine on the background Thread.
     */
    launch(Dispatchers.Default) {
        println(" Start Launch->Dispatchers.Default ${Thread.currentThread().name}") // T1
        delay(100)
        println("End Launch->Dispatchers.Default ${Thread.currentThread().name}") // T1 or Some Other Thread
    }
    println()
}


/**
RunBlocking main
Start Launch->Dispatchers.Default DefaultDispatcher-worker-2
End Launch->Dispatchers.Default DefaultDispatcher-worker-2
 */
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("RunBlocking-->${Thread.currentThread().name}")
    /**
     * This will create a CoroutineContext from the immediate Parent . i.e In this case runBlocking i.e Main.
     * UnConfined means It can change to someOther Thread
     */
    launch(Dispatchers.Unconfined) {
        println(" Start Launch_ Dispatchers.Unconfined--> ${Thread.currentThread().name}") // Main Thread
        delay(100)
        println("End Launch_ Dispatchers.Unconfined--> ${Thread.currentThread().name}") // After Delay , Main Thread or Some Other Thread. UnConfined means It can change to someOther Thread
    }
    println()
} 
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main Start ${Thread.currentThread().name}")
   launch(coroutineContext) {
       println("Start_Launch_coroutineContext  ${Thread.currentThread().name}")
       /**
        * This coroutineContext is the property of runBlocking coroutine.
        */
       println("End_Launch_coroutineContext  ${Thread.currentThread().name}")
   }
    println("Main End ${Thread.currentThread().name}")
}
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main Start ${Thread.currentThread().name}")
   launch(coroutineContext) {
       println("Start_Launch_coroutineContext  ${Thread.currentThread().name}")
       /**
        * This coroutineContext is the property of runBlocking coroutine.
        * 'coroutineContext' will take the context from the Parent
        */
       delay(100)
       println("End_Launch_coroutineContext  ${Thread.currentThread().name}") // its like a confined Dispatcher.So right after the delay().It will execute on the Main Thread only.
   }
    println("Main End ${Thread.currentThread().name}")
}
//---------------------------------------------------------------------------------------------------------------------------
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
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
