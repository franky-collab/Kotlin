//Parent Class/Base Class/Super class
open class Animal{
    var age = 12
    var gender = "Male"

    fun makesound(){
        println("Animal is speaking")
    }
}
open class dog:Animal(){
    fun bark(){
        println("Dog is woofing")
    }
}

class Cat:Animal(){
    fun meow(){
        println("Cat is meowing")
    }
}

fun main() {
    var a = Animal()
//Child class/Derived class/Sub class
    var d = dog()
    d.makesound()

    var c = Cat()

}