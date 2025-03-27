fun main() {
    //satndard library functions/Predefined functions

    var output = Math.sqrt(81.0)
    println("The square root of 81 is $output")

    var roundedvalue = Math.round(34.78)
    println(roundedvalue)

    name() //Calling a function
    add()
    employee("John",90000,true)
    employee("Martha",60000,false)
    student("Brian",23,"software engineering")

}

//User-defined functions
fun name(){
    println("frank")
}

fun add(){
    var x = 20
    var y = 30
    println(x + y)
}

//Parameter/Variable and Argument/Value
fun employee(name:String, salary:Int, disability:Boolean){
    println("$name is earning $salary.Disability :$disability")
}

fun student(name:String, age:Int, course:String){
    println("$name is $age years old.$name is studying $course")

}

