package contitionals

fun main(){
    println (getMonthFromNumber(4))
    println (getQuarterFromNumber(14))
    println (getTypeVariable(true))
}

fun getMonthFromNumber(month:Int):String{
    return when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Is not a month"
    }
}

fun getQuarterFromNumber(month:Int):String{
    return when (month) {
        !in 1..12 -> "Is not a valid month"
        in 1..3-> "Fist Quarter"
        in 4..6 -> "Second Quarter"
        in 7..9 -> "Third Quarter"
        in 10..12 -> "Fourth Quarter"
        else -> "Unexpexted case"
    }
}

fun getTypeVariable(type:Any):String{
    return when (type) {
        is String -> "String"
        is Int -> "Int"
        is Long -> "Long"
        is Boolean -> "Boolean"
        is Float -> "Float"
        is Double -> "Double"
        else -> "Is not a valid type"
    }
}