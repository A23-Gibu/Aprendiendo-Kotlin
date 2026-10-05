package T_06_POO_Clases_y_DataClass

// Convierte a data class un POJO Producto de tus prácticas de 1º
// y comprueba equals, toString y copy.

data class Producto(val producto: String,
                    val marca: String,
                    val precio: Double)

fun main() {
    val p1 = Producto("Hp101", "HP", 500.0)
    val p2 = Producto("Lenovo102", "Lenovo", 499.99)
    val p3 = Producto("Hp101", "HP", 500.0)

    println(p1.equals(p2))
    println(p1.equals(p3))

    println(p2.toString())
    println(p2.producto)

    val p4 = p1.copy(precio = 600.0)
    println(p4)
}