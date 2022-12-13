import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlin.concurrent.thread

fun main() = runBlocking {
    withTimeout(200) {
        for (i in 0..200){
            print(i)
            delay(100)
        }
    }
}

/**
 * Output
"C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=57296:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath "D:\Tutorials\KotlinTutorials\Kotlin\KotlinTopics\ProjectCode\out\production\ProjectCode;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\plugins\Kotlin\kotlinc\lib\kotlin-stdlib.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\plugins\Kotlin\kotlinc\lib\kotlin-reflect.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\plugins\Kotlin\kotlinc\lib\kotlin-test.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlinx\kotlinx-coroutines-core\1.6.4\kotlinx-coroutines-core-1.6.4.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlinx\kotlinx-coroutines-core-jvm\1.6.4\kotlinx-coroutines-core-jvm-1.6.4.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.6.21\kotlin-stdlib-jdk8-1.6.21.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.6.21\kotlin-stdlib-1.6.21.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.6.21\kotlin-stdlib-jdk7-1.6.21.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.6.21\kotlin-stdlib-common-1.6.21.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlinx\kotlinx-coroutines-android\1.5.1\kotlinx-coroutines-android-1.5.1.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlinx\kotlinx-coroutines-core-jvm\1.5.1\kotlinx-coroutines-core-jvm-1.5.1.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.20\kotlin-stdlib-common-1.5.20.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.20\kotlin-stdlib-jdk8-1.5.20.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.20\kotlin-stdlib-1.5.20.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.20\kotlin-stdlib-jdk7-1.5.20.jar" DeleteKt
01Exception in thread "main" kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 200 ms
at kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(Timeout.kt:184)
at kotlinx.coroutines.TimeoutCoroutine.run(Timeout.kt:154)
at kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask.run(EventLoop.common.kt:508)
at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:284)
at kotlinx.coroutines.DefaultExecutor.run(DefaultExecutor.kt:108)
at java.base/java.lang.Thread.run(Thread.java:829)

Process finished with exit code 1
 */

//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    /**
     * This is a coroutine builder.
     * The logic inside the withTimeout() should be completed within 100 millisecond.
     * If its not completed within that time.
     * It will throw a exception compulsary
     */
    withTimeout(100){
        println("With Time Out Start ${Thread.currentThread().name}")
        try {
            for (i in 0..50){
                println(i)
                delay(100)
            }
        }catch (ex:TimeoutCancellationException){
            println("Exception Error ${ex.stackTrace}")
        }finally {
            println("Finally Blocks Executed")
        }
        println("With Time Out Start ${Thread.currentThread().name}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=50712:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
With Time Out Start main
0
Exception Error [Ljava.lang.StackTraceElement;@4c98385c
Finally Blocks Executed
With Time Out Start main
Exception in thread "main" kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 100 ms
	at kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(Timeout.kt:184)
	at kotlinx.coroutines.TimeoutCoroutine.run(Timeout.kt:154)
	at kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask.run(EventLoop.common.kt:502)
	at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:279)
	at kotlinx.coroutines.DefaultExecutor.run(DefaultExecutor.kt:108)
	at java.lang.Thread.run(Thread.java:748)

Process finished with exit code 1
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    /**
     * This is a coroutine builder.
     * The logic inside the withTimeout() should be completed within 100 millisecond.
     * If its not completed within that time.
     * It will not throw a expection
     */
    withTimeoutOrNull(100){
        println("With Time Out Start ${Thread.currentThread().name}")
        try {
            for (i in 0..50){
                println(i)
                delay(100)
            }
        }catch (ex:TimeoutCancellationException){
            println("Exception Error ${ex.stackTrace}")
        }finally {
            println("Finally Blocks Executed")
        }
        println("With Time Out Start ${Thread.currentThread().name}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=50770:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
With Time Out Start main
0
Exception Error [Ljava.lang.StackTraceElement;@53e25b76
Finally Blocks Executed
With Time Out Start main
Main Program Ends : main

Process finished with exit code 0
//---------------------------------------------------------------------------------------------------------------------------

/*
  We can remove try catch block from withTimeoutOrnull as it wont throw any exception.
  If the task is not finished within the specified time.
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    withTimeoutOrNull(50) {
        for (i in 0..500) {
            delay(100)
            println(i)
        }
    }
    println("Main Function ${Thread.currentThread().id} ${Thread.currentThread().name}")
}

//---------------------------------------------------------------------------------------------------------------------------

/**
   if using runBlocking,then in the main Function we need to return something.
   If not retured willl get a error message
 */

 // Valid Case
 import kotlinx.coroutines.*
fun main()= runBlocking{
    withTimeoutOrNull(500){
    }
    println("Main Function ${Thread.currentThread().id} ${Thread.currentThread().name}")
}

// Invalid Case
import kotlinx.coroutines.*
fun main()= runBlocking{
    withTimeoutOrNull(500){
    }
 
}

/**
 * o/p
D:\Tutorials\KotlinTutorials\Kotlin\KotlinTopics\ProjectCode\src\Delete\Delete.kt:2
Kotlin: Conflicting overloads: public fun main(): Unit? defined in root package in file Delete.kt, public fun main(): Unit defined in root package, public fun main(): Unit defined in root package, public fun main(): Unit defined in root package, public fun main(): Unit defined in root package
 */

//---------------------------------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    /**
     * The result will be null, if the coroutine withTimeoutOrNull won t finish the job within 100 millisecond.
     */
   val result:String?= withTimeoutOrNull(5000){
        println("withTimeoutOrNull Start ${Thread.currentThread().name}")
        for (i in 0..50){
            println(i)
            delay(10)
        }
        println("withTimeoutOrNull End ${Thread.currentThread().name}")
        /**
         * we can return some value from the coroutine.
         */
        "Return Some Value"
    }
    println("Result=  ${result}")
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    /**
     * The result will be null, if the coroutine withTimeoutOrNull won t finish the job within 100 millisecond.
     */
   val result:String?= withTimeoutOrNull(100){
        println("withTimeoutOrNull Start ${Thread.currentThread().name}")
        for (i in 0..50){
            println(i)
            delay(500)
        }
        println("withTimeoutOrNull End ${Thread.currentThread().name}")
        /**
         * we can return some value from the coroutine.
         */
        "Return Some Value"
    }
    println("Result=  ${result}")
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=50966:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
withTimeoutOrNull Start main
0
Result=  null
Main Program Ends : main

Process finished with exit code 0
//---------------------------------------------------------------------------------------------------------------------------
/**
 *  withTimeoutOrNull
 *  This will return a value from the coroutine from the Lambda Result.
 *  If the result is not Obtained with the specified time ,then the result will be null.   
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
  val resutl:String?=  withTimeoutOrNull(500) {
        for (i in 0..10) {
            println(i)
        }
        "I am Finsihed"
    }
    println("Main Function ${Thread.currentThread().id} ${Thread.currentThread().name}")
    println("WithTimeOutOrNull= ${resutl}")
}


//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
