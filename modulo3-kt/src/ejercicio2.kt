data class Estudiante(
    val nombre: String,
    val edad: Int,
    val notas: List<Double>,
){
    val promedio = "%.1f".format(calcularPromedios())
    fun calcularPromedios(): Double {
        return notas.average()
    }
}

fun List<Estudiante>.imprimirResultado(verbo: String){
    this.forEach {
        println("${it.nombre} $verbo con ${it.promedio}")
    }
}
private  fun estudiantesAprobados(estudiantes: List<Estudiante>): List<Estudiante>{
    return estudiantes.filter {
        it.calcularPromedios() >= 3.0
    }
}

private  fun analizarEstudiante(
    estudiantes: List<Estudiante>,
    criterio: (Estudiante) -> Boolean
): List<Estudiante>{
    return estudiantes.filter { criterio(it) }
}

fun main(){
    val estudiantes = listOf(
        Estudiante("Kevin", 17, listOf(4.2, 4.4, 4.5)),
        Estudiante("Juan", 46, listOf(3.8, 2.4, 3.5)),
        Estudiante("Martin", 47, listOf(1.2, 2.4, 3.5)),
        Estudiante("Pedro", 40, listOf(1.2, 2.4, 3.5)),

    )
    estudiantes.forEach { estudiante ->
        println("El promedio de ${estudiante.nombre} es de ${estudiante.promedio}")
    }
    println("-------------------------------------------------")
    println("Estudiantes Aprobados: ")
    analizarEstudiante(estudiantes) { estudiante -> estudiante.calcularPromedios() >= 3.0

    }.imprimirResultado( "Aprobó")
    println("-------------------------------------------------")

    println("Estudiantes Destacados:")
    analizarEstudiante(estudiantes) {estudiante -> estudiante.calcularPromedios() > 4.0
    }.imprimirResultado( "Destacados")
    println("----------------------------------------------")

    println("Estudiantes Reaprobados:")
    analizarEstudiante(estudiantes) {estudiante -> estudiante.calcularPromedios() < 3.0
    }.imprimirResultado( "Reprobó")
}
