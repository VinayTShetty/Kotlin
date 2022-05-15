Variable declaration in Kotlin can be done in 2 ways
1)Val
2)var


We don't require specifying the type of variable explicitly
Kotlin complier knows this by initilizer expression ("Vinay T Shetty" is a String and 28 is an Int value). 
This is called type inference in programming


fun main(args: Array<String>) {
    val age=28
    var name="Vinay T Shetty"
    println("Name=${name}\nage=${age}")
}

*******************************************************************************************************************
Explicity Declaring the type of the variable while decalring it

fun main(args: Array<String>) {
    val age:Int=28
    var name:String="Vinay T Shetty"
    println("Name=${name}\nage=${age}")
}
*******************************************************************************************************************
