private val lambdaExample:(id:Int,Name:String)->String={id,Name->
    val personDetails=id.toString()+Name
    personDetails
}

private val lambda={salary:Int,hike:Int->
    hike*salary
}


private fun name(salary:Int,hike:Int,lamda:(Int,Int)->Int){
    val salarayDetails=lamda(salary,hike)
}



private val lambdadfd:(a:Int,b:Int)->Int={a,b->a+b}
private val lasdsmbda={a:Int,bn:Int->a*bn}


private fun dhigher(num1:Int,num2:Int,lambdadfd:(Int,Int)->Int){
    val process=lambdadfd(num1,num2);
    println(process)
}

fun main() {
//    dhigher(25,50,lambdadfd)
    highOrderExample(2500,250,sumvariable)
}

val sumvariable=fun (num1:Int,num2:Int):Int{
    println(num1/num2)
    return num1/num2
}

fun highOrderExample(num1:Int,num2:Int,sumVariable:(Int,Int)->Int){
sumVariable(num1,num2)
}