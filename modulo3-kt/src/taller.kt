enum class EstadoVehiculo {
    APAGADO,
    ENCENDIDO,
    EN_MOVIMIENTO
}

interface Conducible {
    fun conducir()
}

class Vehiculo(
    val marca: String,
    private var velocidadActual: Int = 0,
    val velocidadMaxima: Int,
    private var estado: EstadoVehiculo = EstadoVehiculo.APAGADO
) : Conducible {

    fun encender() {
        estado = EstadoVehiculo.ENCENDIDO
        println("El vehículo de marca $marca está encendido.")
    }

    fun apagar() {
        estado = EstadoVehiculo.APAGADO
        println("El vehículo de marca $marca está apagado.")
    }

    fun mostrarInfo() {
        println("Marca: $marca")
        println("Velocidad actual: $velocidadActual km/h")
        println("Velocidad máxima: $velocidadMaxima km/h")
    }

    fun mostrarEstado() {
        println("Estado actual: $estado")
    }

    fun cambiarVelocidad(nuevaVelocidad: Int) {
        if (estado == EstadoVehiculo.APAGADO) {
            println("No puedes cambair la velocidad porque el vehículo está apagado")


        }

        if (nuevaVelocidad > velocidadMaxima) {
            println("La velocidad supera el límite de $velocidadMaxima km/h")
        } else {
            velocidadActual = nuevaVelocidad
            estado = if (nuevaVelocidad > 0)
                EstadoVehiculo.EN_MOVIMIENTO
            else
                EstadoVehiculo.ENCENDIDO

            println("La velocidad actual del vehículo $marca es de $velocidadActual km/h")
        }
    }

    override fun conducir() {
        if (estado == EstadoVehiculo.ENCENDIDO) {
            estado = EstadoVehiculo.EN_MOVIMIENTO
            println("El vehículo de marca $marca está en movimiento.")
        } else if (estado == EstadoVehiculo.EN_MOVIMIENTO) {
            println("El vehículo ya está en movimiento.")
        } else {
            println("El vehículo de marca $marca no se puede conducir porque está apagado.")
        }
    }
}

fun main() {
    val ferrari = Vehiculo("Ferrari", 120, 240)
    val bmw = Vehiculo("BMW", 120, 190)
    val mazda = Vehiculo("Mazda", 120, 200)
    val vehiculos = listOf(ferrari, bmw, mazda)

    vehiculos.forEach { vehiculo -> vehiculo.mostrarInfo() }

//mosatra info
    mostrarInfovehiculos(vehiculos)

    //encedemos vehiculos
    bmw.encender()
    ferrari.encender()


    //mosatra info
    mostrarInfovehiculos(vehiculos)

    //conduccion
    bmw.conducir()
    ferrari.conducir()
    mazda.conducir()

    //mosatra info
    mostrarInfovehiculos(vehiculos)

    //Vehiculos apagados
    mazda.apagar()

    ferrari.cambiarVelocidad(230)
    bmw.cambiarVelocidad(190)
    mazda.cambiarVelocidad(50)

}

private fun mostrarInfovehiculos(vehiculos: List<Vehiculo>) {
    println("-----------------------------------------------")
    vehiculos.forEach { vehiculo ->
        vehiculo.mostrarEstado()
    }

    println("---------------------------------------")
}