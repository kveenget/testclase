fun main() {


    // LIST (Colecciones ordenadas)

    // Lista inmutable de números enteros
    // No se puede modificar después de crearla
    val myList: List<Int> = listOf(1, 2, 3, 4, 5)


    // Lista inmutable con inferencia de tipo
    // Kotlin detecta automáticamente que es List<Int>
    val myList2 = listOf(1, 2, 3, 4, 5)


    // Otra lista inmutable
    val myList3 = listOf(1, 2, 3, 4, 5)


    // Lista mutable
    // Permite agregar, eliminar o modificar elementos
    val myList4 = mutableListOf(1, 2, 3, 4, 5)

    // Agrega un elemento al final de la lista
    myList4.add(4)


    // Lista mutable vacía donde después podemos agregar elementos
    val myList5 = mutableListOf<Int>()




    // SET (Colecciones sin repetidos)


    // Un Set no permite elementos duplicados
    val mySet = setOf(1, 2, 3, 4, 5)


    // Declarando explícitamente el tipo
    val mySet2 = setOf<Int>(1, 2, 3, 4, 5)


    // Otro Set
    val mySet3 = setOf(1, 2, 3)


    // Muestra la cantidad de elementos del Set
    println("Cantidad del Set: ${mySet.size}")




    // MAP (Clave - Valor)


    // Un Map almacena datos en pares clave y valor
    val myMap: Map<Boolean, Int> = mapOf(
        true to 1,
        false to 2
    )



    // CICLO FOR CON ÍNDICES

    // Recorremos la lista utilizando la posición del elemento
    for (i in 0 until myList.size) {

        // Accedemos al elemento usando el índice
        println(myList[i])
    }



    // CICLO FOR CON ELEMENTOS


    // Recorre directamente cada elemento de la lista
    for (number in myList) {
        println(number)
    }



    // FOREACH


    // Forma funcional de recorrer una colección
    myList.forEach { number ->

        // "number" representa cada elemento de la lista
        println(number)
    }




    // FOREACH INDEXED


    // Permite obtener el índice y el valor
    myList.forEachIndexed { index, number ->

        println("Elemento $number tiene el índice $index")
    }




    // WHILE


    var number = 5


    // Mientras la condición sea verdadera ejecuta el código
    // En este caso no entra porque 5 < 3 es falso
    while (number < 3) {

        number++

        println(number)
    }



    // DO WHILE


    // El bloque se ejecuta al menos una vez
    do {

        // Aumenta el valor en 3
        number += 3

        println(number)

    } while (number < 3)



    // MAP()


    // map transforma cada elemento de una colección

    // Convierte cada número Int a String
    val number1 = myList.map { "$it" }

    println(number1)



    // Multiplica cada elemento por 2
    val doubles = myList.map { it * 2 }

    println(doubles)




    // FUNCIONES CON COLECCIONES

    // Lista de calificaciones
    val grades = listOf(
        4.5,
        3.8,
        2.9,
        5.0,
        3.2
    )


    // Ordena las notas de mayor a menor
    val orderedList = orderList(grades)


    // Calcula el promedio
    val average = getAverage(grades)


    // Obtiene la cantidad de notas aprobadas
    val approved = getApprovedNumber(grades)


    println("Calificaciones ordenadas: $orderedList")

    println("Promedio: $average")

    println("Cantidad de aprobados: $approved")



    // Convierte una colección Int en una colección String
    println(convertCollectionToString(myList))
}




// FUNCIÓN MAP PARA CONVERTIR ELEMENTOS


// Recibe una lista de enteros
// Devuelve una lista de Strings

fun convertCollectionToString(list: List<Int>): List<String> {

    // map transforma cada Int en String
    return list.map { "$it" }
}



// FUNCIÓN PARA ORDENAR UNA LISTA


fun orderList(list: List<Double>): List<Double> {

    // sortedDescending ordena de mayor a menor
    return list.sortedDescending()
}




// FUNCIÓN PARA CALCULAR PROMEDIO


fun getAverage(list: List<Double>): Double {

    var sum = 0.0


    // Recorremos la lista y acumulamos los valores
    list.forEach { grade ->

        sum += grade
    }


    // Retorna la suma dividida entre la cantidad de notas
    return sum / list.size
}



// FUNCIÓN PARA CONTAR APROBADOS


fun getApprovedNumber(list: List<Double>): Int {

    var count = 0


    // Recorremos las notas
    list.forEach { grade ->


        // Si la nota es mayor o igual a 3 aumenta el contador
        if (grade >= 3.0) {

            count++
        }
    }


    // Devuelve la cantidad de aprobados
    return count
}