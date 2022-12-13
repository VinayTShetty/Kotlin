import javafx.application.Application.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        /**
         * async coroutine will inherit scope form the parent coroutines.
         *  async{} will return a defered Object.
         *  We can get the Job Object also.
         *  Defered Object is subclass of the Job class.
         *  This Defered<> is of Generic type
         */
        var jobDefered:Deferred<String> = async {
            "Vinay T Shetty"
        }

        /**
         * if we want to use the return value then we need to use the await() function.
    	 *  It s similar to Future and promise in case of JS.
         *  await() and join() both are suspend function.It should be called from another suspending function
         */
       var name= jobDefered.await()
        println("Obtained Value = ${name}")
    }

}