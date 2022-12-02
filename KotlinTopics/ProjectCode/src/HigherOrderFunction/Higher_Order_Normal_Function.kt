fun main() {
    processDetails(25,"Vinay T Shetty ", personDetails)
}


private fun processDetails (id:Int,phon:String,getPersonDetails:(Int,String)->String){
    val personDetails=getPersonDetails(id,phon)
    println(personDetails)
}

val personDetails=fun  (id:Int,name:String): String {
    return "Person Details= "+id+" Name= "+name
}