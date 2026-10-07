package Colecciones_Clases_Ejercicios

/*
5. Dada una lista de productos con nombre y precio
(data class Producto(nombre: String, precio: Double)),
ordenarla de menor a mayor precio usando sortedBy, y mostrar también el más caro con maxBy.
*/

data class Producto(val nombre: String, val precio: Double)

fun main() {
    val productos = listOf(
        Producto("Ratón", 25.50),
        Producto("Portátil", 899.99),
        Producto("Teclado", 45.00),
        Producto("Monitor", 199.90)
    )

    val ordenadosPorPrecio = productos.sortedBy { it.precio }
    val masCaro = productos.maxByOrNull { it.precio }

    println("Productos ordenados por precio: $ordenadosPorPrecio")
    println("Producto más caro: $masCaro")
}