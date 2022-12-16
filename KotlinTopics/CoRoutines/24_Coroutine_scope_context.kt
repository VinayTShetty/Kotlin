Coroutine Scope

launch{
 /**
   'this' keyword referes to the coroutine scope in kotlin.
  */   
}


same for 'async' and 'runBlocking'

//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main() = runBlocking {
   println("Run Blocking= ${this}")
    launch {
        println("Launch Coroutine= ${this}")
        launch {
            println("Child Launch Coroutine= ${this}")
        }
    }
    async {
        println("Async Coroutine= ${this}")
    }
    println("")
}


/**
 Run Blocking= BlockingCoroutine{Active}@6d7b4f4c
 Launch Coroutine= StandaloneCoroutine{Active}@57855c9a
Async Coroutine= DeferredCoroutine{Active}@3224f60b
Child Launch Coroutine= StandaloneCoroutine{Active}@1efed156
 */

 // Each Coroutine has its own Coroutinescope.

/**
  Explanation:- Run Blocking= BlockingCoroutine{Active}@6d7b4f4c 
  Name shows that its a Blocking Coroutine. As we are using runBlocking.
  And it was in active state when the coroutine was executed.

Async Coroutine= DeferredCoroutine{Active}@3224f60b
 This returns a defered Object.

 */
//---------------------------------------------------------------------------------------------------------------------------

import kotlinx.coroutines.*
fun main() = runBlocking {
   println("Run Blocking= ${this}")
    launch {
        println("Launch Coroutine= ${this}")
        launch {
            println("Child Launch Coroutine= ${this}")
        }
    }
    async {
        println("Async Coroutine= ${this}")
    }
    println("")
}


/**
 Run Blocking= BlockingCoroutine{Active}@6d7b4f4c
 Launch Coroutine= StandaloneCoroutine{Active}@57855c9a
Async Coroutine= DeferredCoroutine{Active}@3224f60b
Child Launch Coroutine= StandaloneCoroutine{Active}@1efed156
 */

//---------------------------------------------------------------------------------------------------------------------------

CoroutineScope    
Coroutine Scope is Unique for each Coroutine.
Even though its Parent ->Child coroutines.

CoroutineContext
CoroutineContext is inherited from Parent to Child.
There are 2 Major Components in CoroutineContext
1)Job:- Control the Coroutine.
2)Dispatcher :- Dispatcher descides on which Thread the coroutine should run.
3)Coroutinename:- Using Coroutine name we can name the coroutine.


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
