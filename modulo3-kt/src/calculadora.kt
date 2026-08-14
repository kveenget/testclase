fun main() {

    println("Ingrese el primer número:")
    val num1 = readln().toDouble()

    println("Ingrese el segundo número:")
    val num2 = readln().toDouble()

    println("Ingrese la operación (+, -, *, /):")
    val operacion = readln()

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Error: no se puede dividir entre cero")
                return
            }
        }
        else -> {
            println("Operación no válida")
            return
        }
    }

    println("El resultado es: $resultado")
}