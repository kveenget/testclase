class Moto(
    val marca: String,
    val placa: String
)

fun Moto.obtenerInfo(){
    this?.let{
        println("Moto de placa ${this.placa} y marca ${this.marca}")
    } ?: println("No es posible obtener info de moto")

}

fun String.saludar(edad: Int) {
    println("Hola $this de $edad años, tu nombre contiene ${this.length} caracteres")
}

fun String?.saludarSeguro(){
    this?.let{
        println("Hola $this, tu nombre contiene ${this.length} caracteres")

    } ?: println("No te puedo saludar si no tienes nombre")
}

fun main(){
    val moto = Moto("YZT", "65656")
    moto.obtenerInfo()

    val nombre = "Kevin"
    nombre.saludar(40)
    nombre.saludarSeguro()

    val nombre2: String? = null
    nombre2?.saludarSeguro()
    nombre2?.saludar(40)
}