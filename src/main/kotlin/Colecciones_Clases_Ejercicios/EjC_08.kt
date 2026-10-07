package Colecciones_Clases_Ejercicios

/*
8. Dada una lista de números del 1 al 20, dividirla en dos listas -pares e impares-
en una sola operación usando partition.
*/

fun main() {
    val numeros = (1..20).toList()

    // partition devuelve un Pair<List<T>, List<T>>
    val (pares, impares) = numeros.partition { it % 2 == 0 }

    println("Pares: $pares")
    println("Impares: $impares")
}