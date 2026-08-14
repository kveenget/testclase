interface Volador {
    fun volar()
}

open class Animal {
    open fun hacerSonido() {
        println("Sonido del pato")
    }
}

class Pato(val nombre: String) : Animal(), Volador {

    override fun hacerSonido() {
        println("¡Cuac!")
    }

    override fun volar() {
        println("$nombre tiene demasiado dinero!!")
    }
}

fun main() {
    val pato = Pato("Mack Pato")

    pato.hacerSonido()
    pato.volar()
}