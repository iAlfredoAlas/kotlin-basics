package example
import kotlin.math.pow

fun main(){
    println("Welcome, please answer the questions: ")
    println("What is your name?")
    val name = readLine()!!
    println("What is your age ?")
    val age = readLine()!!.toInt()
    println("What is your weight in lb?")
    val weight = readLine()!!.toDouble()
    println("What is your height in cm?")
    val height = readLine()!!.toDouble()
    val weightInKg: Double = getWeightInKg(weight)
    val heightInMeters: Double = getHeightInMeter(height)
    val IMC: Double = getIMC(weightInKg, heightInMeters)
    println(IMC)
    print("You are ")
    println(getBMI(IMC))

}

fun getWeightInKg(weight: Double): Double {
    val weightInKg: Double = weight * 0.45359237
    return weightInKg
}

fun getHeightInMeter(height: Double): Double {
    val heightInMeters: Double = height / 100
    return heightInMeters
}

fun getIMC(weight: Double, height: Double): Double {
    val IMC: Double = (weight/(height.pow(2))).let { String.format("%.2f", it) }.toDouble()
    return IMC
}

fun getBMI(IMC: Double): String {
    return when (IMC){
        in 0.0..16.0 -> "Severe Thinness"
        in 16.1..16.9 -> "Moderate Thinness"
        in 17.0..18.4 -> "Mild Thinness"
        in 18.5..24.9 -> "Normal"
        in 25.0..29.9 -> "Overweight"
        in 30.0..34.9 -> "Obese Class I"
        in 35.0..39.9 -> "Obese Class II"
        in 40.0..80.00 -> "Obese Class III"
        else -> "Incorrect value"
    }
}