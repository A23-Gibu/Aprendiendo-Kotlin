package Colecciones_Clases_Ejercicios

/*
9. Crear dos data class (Direccion con calle y ciudad, y Cliente con nombre y una Direccion)
y comprobar cómo equals() y toString() se comportan con objetos anidados.
*/

data class Direccion(val calle: String, val ciudad: String)

data class Cliente(val nombre: String, val direccion: Direccion)

fun main() {
    val dir1 = Direccion("Gran Vía 12", "Madrid")
    val dir2 = Direccion("Gran Vía 12", "Madrid")

    val c1 = Cliente("Adrian", dir1)
    val c2 = Cliente("Adrian", dir2)

    // toString() genera la representación legible desglosando los objetos internos
    println("Representación toString():")
    println(c1)

    // equals() compara estructuralmente por contenido recursivo
    println("\nComparación estructural con equals (c1 == c2):")
    println(c1 == c2) // true
}