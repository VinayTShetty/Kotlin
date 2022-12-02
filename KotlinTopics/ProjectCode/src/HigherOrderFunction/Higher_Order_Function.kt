fun main() {
    getNameFrom_Database(100, "Vinay","Shetty",nameFindOut)
}

val nameFindOut: (fristname: String, LastName: String) -> String = { Fristname, Lastname ->
    val name = Fristname +" "+ Lastname
    name
}


fun getNameFrom_Database(rollNo: Int,Fristname:String,Lastname:String, nameFindOut: (String, String) -> String) {
    val personDetails = "Roll Number= " + rollNo + "\n" +nameFindOut(Fristname,Lastname)
    println(personDetails)
}
