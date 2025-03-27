import java.util.*

fun main() {
    var firstname = "frank"
    var lastname = "Njoki"
    var text = "Hello there"


    println(firstname)
    println(lastname)
    println(firstname + " " + lastname) //String Concatination
    println(text[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println(text + " joe")
    println("My firstname is $firstname")
    println("My fullname is $firstname $lastname")

}