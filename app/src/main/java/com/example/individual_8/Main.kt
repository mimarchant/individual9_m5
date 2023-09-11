package com.example.individual_8

fun main(){
    println("Ingresar el valor en Celsius : ")
    val input = readLine()!!.toDouble()

    val celciusToFarenheit = (9.0/5.0) * (input) + 32

    println("$input° Celcius is $celciusToFarenheit degrees Farenheit.")

    val celciusToKelvin = input + 273.15

    println("$input° Celcius is $celciusToKelvin degrees Kelvin.")

    val farenheitToKelvin = (5.0/9.0) * (celciusToFarenheit - 32) + 273.15
    println("$celciusToFarenheit° Farenheint is $farenheitToKelvin degrees Kelvin.")


}

fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}