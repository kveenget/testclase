fun main() {

    println("Digite el primer número:")
    val num1 = readln().toInt()

    println("Digite el segundo número:")
    val num2 = readln().toInt()

    println("Digite la operación a realizar (+, -, *, /):")
    val operation = readln().first()

    var result = 0

    if (operation == '+') {
        result = num1 + num2
    }

    if (operation == '-') {
        result = num1 - num2
    }

    if (operation == '*') {
        result = num1 * num2
    }

    if (operation == '/') {
        if (num2 == 0) {
            println("ERROR: no se puede dividir por 0")
            return
        } else {
            result = num1 / num2
        }
    }

    println("El resultado es: $result")
}