package Coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
   runBlocking {
       println("Start RunBlocking- ${Thread.currentThread().name}-${Thread.currentThread().id}")
       GlobalScope.launch {
           println("GlobalScope-launch - ${Thread.currentThread().name}-${Thread.currentThread().id}")
       }
       println("End RunBlocking- ${Thread.currentThread().name}-${Thread.currentThread().id}")
   }
}
/**
 *  runBlocking --> GlobalScope.launch   
 *  GlobalScope.launch will run on the Worker Thread.
 *
 *  runBlocking -->launch
 *  launch will run on the Main Theread.i.e(Thread on which runBlocking is executed.
 *  launch will run the thread in which the Parent Coroutine is running.(Reason for running on main Thread)
 */