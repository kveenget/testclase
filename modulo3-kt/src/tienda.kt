fun main(){
    val frutas = listOf("Pera", "Manazana", "Uva", "Pera")

    val frutasU = frutas.distinct()

    println("Lista de frutas:")
    frutasU.forEachIndexed { index, fruta -> println("${index + 1}. $fruta")  }

    println("Ingrese el número de la fruta a consultar: ")
    val numero = readLine()!!.toInt()

    if (numero == 1) {
        println(frutasU[0])
    }

    if (numero == 2) {
        println(frutasU[1])
    }

    if (numero == 3) {
        println(frutasU[2])
    }

    else {
        println("Fruta no encontrado")
    }


}