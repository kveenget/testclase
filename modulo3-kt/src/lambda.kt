fun main() {
    val resultadoSuma = operar(a = 5, b = 10) { a, b ->
        a + b
    }

    val lambdaMultiplicacion = { a: Int, b: Int -> a * b }
    val resultadoMultiplicacion = operar(
        5,
        10,
        operacion = lambdaMultiplicacion
    )
}

fun operar(
    a: Int,
    b: Int,
    operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}