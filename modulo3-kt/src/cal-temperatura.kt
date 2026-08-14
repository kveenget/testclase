fun main() {

    println("=== Calculadora de Temperatura ===")
    println("1. Celsius a Fahrenheit")
    println("2. Fahrenheit a Celsius")
    println("3. Celsius a Kelvin")
    println("4. Kelvin a Celsius")

    print("Seleccione una opción: ")
    val opcion = readln().toInt()

    print("Ingrese la temperatura: ")
    val temperatura = readln().toDouble()

    val resultado = when (opcion) {

        1 -> {
            (temperatura * 9 / 5) + 32
        }

        2 -> {
            (temperatura - 32) * 5 / 9
        }

        3 -> {
            temperatura + 273.15
        }

        4 -> {
            temperatura - 273.15
        }

        else -> {
            println("Opción incorrecta")
            return
        }
    }

    println("Resultado: $resultado grados")
}