fun main() {
    println("Return Type 1 "+lambda_return_1(20,40))
    println("Return Type 2 "+lamda_return_2(25,50))
    println("Return Type 3 "+lambda_return_3(25,50))
    println("Return Type 4 "+lambda_return_4(100,200))
}


val lambda_return_1:(a:Int,b:Int)->Int={a,b->a+b}
val lamda_return_2:(a:Int,b:Int)->Unit={a,b->a*b}


val lambda_return_3={a:Int,b:Int->a*b}
val lambda_return_4={a:Int,b:Int->
    val totalSum=a*b;
    totalSum
}
