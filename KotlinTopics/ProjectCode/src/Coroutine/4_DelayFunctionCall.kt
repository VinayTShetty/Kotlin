
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
         * if we use join() function then ,It will wait untill the coroutine is finished.
         * If we use join() function() then we cannot use the value
         */
        var name= jobDefered.join()
        println("Obtained Value = ${name}")
    }

}