fun main() {
   println(lambda_1(10,20))
   println(lambda_2(20,30))
}


val lambda_1:(Int,Int)->Int={X,Y->X+Y}
val lambda_2={a:Int,b:Int->a+b}