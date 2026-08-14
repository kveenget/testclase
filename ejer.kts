#!/usr/bin/env kotlin

fun main (){
    println("Digite el primer numero")
    val num1: Int =  readln().toInt()
    println("Digite el segundo numero")
    val num2: Int =  readln().toInt()
    println("Digite el tercer numero")
    val num3: Int =  readln().toInt()
    println("Digite la ops a realizar")
    val operetion: Char = readln().first()

    var result: Int = 0

    if (operetion == '+') {
        result = num1 + num2
    }

    if (operetion == '-') {
        result = num1 - num2

    }

    if (operetion == '*') {
        result = num1 * num2
    }

    if (operetion == '/') {
        if (num2 == 0) {
            println("ERROR: no se puede dividir por 0")
        }
        result = num1 / num2
    }


}