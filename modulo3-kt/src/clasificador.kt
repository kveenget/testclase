fun main() {

    println("Ingrese la edad de la persona")
    val edad = readln().toInt()

    val clas = when (edad) {
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..59 -> "Adulto"
        else -> "Adulto mayor"
    }

    println("La persona es: $clas")
}