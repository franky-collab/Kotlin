fun main() {
    //Arithmetic operators
    var a = 10
    var b = 5

    println(a + b)
    println(a - b)
    println(a / b)
    println(a % b)

    //comparison operators
    var x = 89
    var y = 100

    println( x < y)
    println( x > y)
    println( x <= y)
    println( x >= y)
    println( x == y)
    println( x != y)

    // Assignment OPerators
    var number = 26
    println(number)

    number += 2
    println(number)

    // Operator precedence
    var result = 5 + (10 * 2) -3
    println("Result is $result")

    // Logical Operators - && || !
    var num = 56
    println( num > 100 && num < 80)
    println( num > 100 || num < 80)
    println(!( num > 100 || num < 80))

}