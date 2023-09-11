package com.example.individual_8

fun main(){
    println("Ingresar el valor en Celsius : ")
    val input = readLine()!!.toDouble()

    val celciusToFarenheint = (9.0/5.0) * (input) + 32

    println("$input° Celcius is $celciusToFarenheint degrees Farenheit.")

    val celciuToKelvin = input + 273.15

    println("$input° Celcius is $celciuToKelvin degrees Kelvin.")

    val farenheintToKelvin = (5.0/9.0) * (celciusToFarenheint - 32) + 273.15
    println("$celciusToFarenheint° Farenheint is $farenheintToKelvin degrees Kelvin.")


}

fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}