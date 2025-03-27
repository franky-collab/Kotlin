import java.util.Scanner

fun main() {
    var num = Scanner(System.`in`)

    println("Enter first number :")
    var num1 = num.nextInt()

    println("Enter second number :")
    var num2 = num.nextInt()

    println("Enter third number :")
    var num3 = num.nextInt()

    if (num1 > num2 && num1> num3){
        println("$num1 is the largest number")
    }
    else if (num2 > num1 && num2> num3){
        println("$num2 is the largest number")
    }
    else {
        println("$num3 is the largest number")
    }



}