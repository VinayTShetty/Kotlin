val (Immutable Mutable)

We cannot change the value of variable which is declared using val keyword.

Programe

fun main(args: Array<String>) {
    val name:String="Vinay T Shetty"
    /**
     * Changing the value of the variable
     */
    name="Lakshmi"
    println("Name=${name}")
}

Val cannot be reassigned
*******************************************************************************************************************
Assigining later in the programe is allowed


fun main(args: Array<String>) {
    val name:String
    /**
     * Assigining Later is valid
     */
    name="Vinay T Shetty"
    println("Name=${name}")
}
*******************************************************************************************************************
fun main(args: Array<String>) {
   val name="Vinay T Shetty"
    name="Vinay"
}
/***
 *  Error :- Val cannot be reassigned
 */

*******************************************************************************************************************
*******************************************************************************************************************
*******************************************************************************************************************
*******************************************************************************************************************
*******************************************************************************************************************
*******************************************************************************************************************
*******************************************************************************************************************