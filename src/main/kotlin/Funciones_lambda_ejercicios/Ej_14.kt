package Funciones_lambda_ejercicios

/*
Ejercicio 14. Una función que devuelve una lambda
Escribe crearMultiplicador(factor: Int): (Int) -> Int, que devuelva una lambda que multiplique su argumento por
factor. Crea con ella doble y triple, y aplica triple a todos los elementos de listOf(1, 2, 3, 4) con map.
*/

fun crearMultiplicador(factor: Int): (Int) -> Int = { it * factor }

fun main() {
    val doble = crearMultiplicador(2)
    val triple = crearMultiplicador(3)

    println("Doble de 5: ${doble(5)}")
    println("Triple de 5: ${triple(5)}")

    val transformados = listOf(1, 2, 3, 4).map(triple)
    println("Aplicando triple a la lista: $transformados")
}