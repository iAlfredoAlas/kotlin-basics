package contitionals

fun main(){

    var isDog:Boolean = true

    if (isDog){
        bark()
    } else {
        println("It is not a dog")
    }

    var result:Int = 20+20

    if (result == 40) {
        println("Result is 40")
    } else {
        println("Result is not 40, is $result")
    }

    val age:Int = 29
    val hasLicense:Boolean = true

    if (age >= 18 && hasLicense) {
        println("You are allowed to drive")
    } else {
        println("You are not allowed to drive")
    }

    val isWeekend:Boolean = false
    val hasDayOff:Boolean = true

    if (isWeekend || hasDayOff) {
        println("You can rest today")
    } else {
        println("You have to work today")
    }

    val isStudent:Boolean = true
    val age2:Int = 17
    val hasScholarship:Boolean = true

    if ((isStudent && age < 18) || hasScholarship) {
        println("You qualify for a discount")
    } else {
        println("You must pay full price")
    }



}

fun bark(){
    println("The dog is barking")
}