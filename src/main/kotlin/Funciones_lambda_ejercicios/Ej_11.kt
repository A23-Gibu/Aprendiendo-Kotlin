package Funciones_lambda_ejercicios

/*
Ejercicio 11. reduce frente a fold
Dada listOf(2, 3, 4, 5):
1. Calcula la suma con reduce.
2. Calcula el producto con fold.
3. Prueba ambos sobre una lista vacía (emptyList<Int>()). ¿Qué ocurre con cada uno? Explica por qué.
4. Con fold, une las palabras de listOf("Kotlin", "es", "genial") separándolas con guiones: "Kotlin-es-genial".
*/

fun main() {
    val numeros = listOf(2, 3, 4, 5)

    // 1. Suma con reduce
    val suma = numeros.reduce { acc, n -> acc + n }
    println("Suma reduce: $suma")

    // 2. Producto con fold
    val producto = numeros.fold(1) { acc, n -> acc * n }
    println("Producto fold: $producto")

    // 3. Prueba con lista vacía
    val vacia = emptyList<Int>()
    val foldVacia = vacia.fold(1) { acc, n -> acc * n }
    println("Fold en lista vacía devuelve el acumulador inicial: $foldVacia")

    try {
        vacia.reduce { acc, n -> acc + n }
    } catch (e: UnsupportedOperationException) {
        println("Explicación: reduce lanza UnsupportedOperationException porque no tiene un valor inicial que devolver al no haber primer elemento.")
    }

    // 4. Unir palabras con guiones mediante fold
    val palabras = listOf("Kotlin", "es", "genial")
    val texto = palabras.fold("") { acc, palabra ->
        if (acc.isEmpty()) palabra else "$acc-$palabra"
    }
    println("Texto unido: $texto")
}