package Colecciones_Clases_Ejercicios

/*
2. A partir de una lista de nombres, crear una lista con la longitud de cada nombre
usando map, y mostrar el nombre más largo.
*/

fun main() {
    val nombres = listOf("Adrian", "Alejandro", "Ana", "Constantino", "Eva")

    val longitudes = nombres.map { it.length }
    val nombreMasLargo = nombres.maxByOrNull { it.length }

    println("Longitudes: $longitudes")
    println("Nombre más largo: $nombreMasLargo")
}