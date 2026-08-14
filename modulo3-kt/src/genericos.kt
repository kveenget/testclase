fun <T> obtenePrimerElemento(lista: List<T>): T{
    return lista.first()
}

fun <T> mifuncion(elemento: T): T{
    return elemento
}

fun main(){
    val nombres = listOf("Juan", "Manuel")
    val numeros = listOf(3,5,6,67,7,5,)

    val primerNombre = obtenePrimerElemento(nombres)
    val primerNumero = obtenePrimerElemento(numeros)
}