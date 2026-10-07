package Colecciones_Clases_Ejercicios

/*
1. Dada una lista de números enteros, obtener una nueva lista solo con los pares
y calcula su suma usando filter y sum.
*/

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }
    val sumaPares = pares.sum()

    println("Pares: $pares")
    println("Suma de los pares: $sumaPares")
}