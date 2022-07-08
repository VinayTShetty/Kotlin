/**
 Kotlin Coroutine Scope
 */
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    println("this ${this}")
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=63284:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
this BlockingCoroutine{Active}@4ccabbaa
Main Program Ends : main

Process finished with exit code 0
//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    println("runBlocking this ${this}")
    launch {
        println("Launch Coroutine :${this}")
    }
    async {
        println("Async Coroutine :${this}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=63299:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
runBlocking this BlockingCoroutine{Active}@4ccabbaa
Main Program Ends : main
Launch Coroutine :StandaloneCoroutine{Active}@2957fcb0
Async Coroutine :DeferredCoroutine{Active}@1376c05c

Process finished with exit code 0
//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    println("runBlocking ${this}")
    launch {
        println("Launch :${this}")
        launch {
            println("Nested Launch : ${this}")
        }
    }
    async {
        println("Async :${this}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=63593:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
runBlocking BlockingCoroutine{Active}@4ccabbaa
Main Program Ends : main
Launch :StandaloneCoroutine{Active}@2957fcb0
Async :DeferredCoroutine{Active}@1376c05c
Nested Launch : StandaloneCoroutine{Active}@51521cc1

Process finished with exit code 0
//-----------------------------------------------------------------------------------------------------
/**
Dispatcher descides on which Thread the coroutine will run.
 */

 import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}") // Thread Main
    /**
     * To access the scope with in the runBlcoking use coroutineContext
     */


    /**
     * Confied coroutine
     * without parameter
     * Below launch lambda function will inherit the coroutine Context from the parent.
     * Hence the Thread is also inherited from the parent.
     * so its a main Thread, In launch block
     */
    launch {
        println("Launch ${Thread.currentThread().name}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=63683:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
Main Program Ends : main
Launch main

Process finished with exit code 0
//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}") // Thread Main
    /**
     * with parameter
     * Its similar to GlobalScope.launch{}
     * It will create a coroutine on a separate Thread.
     */
    launch(Dispatchers.Default) {
        println("Launch Start ${Thread.currentThread().name}")
        delay(1000)
        /**
         * after any suspend call.
         * The next line of code will be executed on the Different Thread or Same Thread
         */
        println("Launch End ${Thread.currentThread().name}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=63838:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
Main Program Ends : main
Launch Start DefaultDispatcher-worker-1
Launch End DefaultDispatcher-worker-1

Process finished with exit code 0

//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}") // Thread Main

    launch(Dispatchers.Unconfined) {
        /**
         * Since its a Dispather.Unconfined ,
         * It will be executed on the main Thread.
           It will inherit context from the parent.
         */
        println("Launch Start ${Thread.currentThread().name}") // Main Thread.
        delay(1000)
        /**
         * Dispathcher.confined will inherit the Context from the parent,that s y the frist statement is executed in the main Thread.
         * after suspend call.,i.e delay(1000)
         * The next line of code will be executed compulsary on a different Thread.
         */
        println("Launch End ${Thread.currentThread().name}")// On a Different Thread.
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}") // Thread Main
    /**
     * Confied coroutine
     * without parameter
     * Below launch lambda function will inherit the coroutine Context from the parent.
     * Hence the Thread is also inherited from the parent.
     * so its a main Thread, In launch block
     */
    launch {
        println("Launch Start ${Thread.currentThread().name}")
        delay(1000)
        println("Launch End  ${Thread.currentThread().name}")
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//-----------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}") // main Thread

    launch(coroutineContext) {
        println("Launch Start ${Thread.currentThread().name}")  // Thread Main
        delay(1000)
        println("Launch End  ${Thread.currentThread().name}")  // Thread Main
    }
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------