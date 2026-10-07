package Colecciones_Clases_Ejercicios

/*
3. Dada una lista de números, calcular su producto total usando reduce (sin usar bucles for).
*/

fun main() {
    val numeros = listOf(2, 3, 4, 5)

    // reduce acumula los elementos operando secuencialmente (acc * elem)
    val productoTotal = numeros.reduce { acumulador, numero -> acumulador * numero }

    println("Producto total: $productoTotal")
}