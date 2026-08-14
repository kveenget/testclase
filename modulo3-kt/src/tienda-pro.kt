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

//crterio
fun buscarCriterio(
    productos: List<Producto>,
    criterio: (Producto) -> Boolean
): List<Producto>{
    return productos.filter { criterio(it) }
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
    buscarCriterio(productos){ producto -> producto.precio > 100000
    }.forEach {
        println("El producto con mayor precio: ${it.precio}")
    }

}