class Dog(var name:String, var breed :String, var age:Int){

}

fun main() {
    var dog1 = Dog("Bright","chihuahua",3)
    println(dog1.name)

    var dog2 = Dog("Jerry","Pitbull",1)
    println(dog2.breed)

    var dog3 = Dog("Tina","Siberian Husky",6)
    println(dog3.age)

    var dog4 = Dog("Perps","Siberian Husky",2)
    println(dog4.breed)
}