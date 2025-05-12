package Operations

fun main() {

    //Arithmetic Operations

    var age:Int = 29
    var favoriteNumber:Int = 19

    println("Sum:")
    println(age + favoriteNumber)

    println("Subtract:")
    println(age - favoriteNumber)

    println("Multiplication:")
    println(age * favoriteNumber)

    println("Division:")
    println(age / favoriteNumber)

    println("Module:")
    println(age % favoriteNumber)

    //Convert to Int

    var age2:String = "29"
    var favoriteNumber2:Int = 19

    println("Sum:")
    println(age2.toInt() + favoriteNumber2)

    //String Operations

    var name:String = "Alfredo"
    println("My name is $name am I am $age")

}