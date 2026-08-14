data class Producto(
    val nombre: String,
    val categoria: String,
    val precio: Int,
    val stock: Int,
)

//disponible
fun productosDisponibles(productos: List<Producto> ): List<Producto>{
    return productos.filter {
        it.stock > 0
    }
}

//costoso
fun productoCostoso(productos: List<Producto> ): List<Producto>{
    return productos.filter { it.precio > 100000
    }
}

//criterio
fun buscarCriterio(
    productos: List<Producto>,
    criterio: (Producto) -> Boolean
): List<Producto>{
    return productos.filter (criterio)
}



fun main(){
    val productos = listOf(
        Producto("Manzana", "Frutas", 2000, 30),
        Producto("Escalera", "Herramientas", 70000, 10),
        Producto("Iphone 12", "Celulares", 10000, 0),
        Producto("Macbook", "Computadores",2000000,5)

    )

    productosDisponibles(productos).forEach { producto ->
        println("PRODUCTO DISPONIBLE: ${producto.nombre} Precio: ${producto.precio} Categoria: ${producto.categoria}")
    }

    println("-----------------------------------------------------------")
    productoCostoso(productos).forEach { producto ->
        println("PRODUCTO COSTOSO: ${producto.nombre} Precio: ${producto.precio}")}

    println("----------------------------------------------")
    buscarCriterio(productos){ it.categoria == "Herramienta"}.forEach { producto ->
        println("Categoria Herramienta: ${producto.nombre} Precio: ${producto.precio}")
    }

    println("-----------------------------------------------------------")
    buscarCriterio(productos) { it.stock  == 0}.forEach { producto ->
        println("Sin Stock: ${producto.nombre} Precio: ${producto.precio}") }


}