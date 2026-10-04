package T_05_Colecciones

//Implementa un pequeño inventario con MutableMap<String,
// Int> que permita añadir, restar y listar existencias.

fun main() {
    val inventario = mutableMapOf(
        "CocaCola" to 3,
        "Zumo de naranja" to 7,
        "Brugal" to 2
    )

    // Añadir inventario
    inventario["Agua"] = 10
    inventario["CocaCola"] = (inventario["Cocacola"] ?: 0) + 5

    // Restar existencias
    inventario["Brugal"] = (inventario["Brugal"] ?: 0) - 1

    // Listar existencias
    println("--- INVENTARIO ---")
    for((producto, cantidad) in inventario) {
        println("Producto: ${producto} \n Cantidad: $cantidad" )
    }
}