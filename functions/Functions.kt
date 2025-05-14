package functions

fun main() {
    add(29,4)
    add2(favoriteNumber = 3)
    subtract(29,5)
    val result = subtract(20,5)
    println(result)

    val result2 = add3(3,3)
    println(result2)

}


fun add(age:Int, favoriteNumber:Int){
    val result:Int = age + favoriteNumber
    println(result)
}

fun add2(age:Int = 29, favoriteNumber: Int){
    val result:Int = age + favoriteNumber
    println(result)
}

fun subtract(age:Int, favoriteNumber:Int):Int{
    val result:Int = age - favoriteNumber
    return result
}

fun add3(age:Int, favoriteNumber: Int):Int = age + favoriteNumber