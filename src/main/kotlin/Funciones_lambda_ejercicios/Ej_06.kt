package Funciones_lambda_ejercicios

/*
Ejercicio 6. filter
Dada la lista listOf(3, 12, 7, 18, 22, 9, 14, 5, 30), obtener una nueva lista con los números que sean pares y mayores
que 10.
Salida esperada: [12, 18, 22, 14, 30]
*/

fun main() {
    val lista = listOf(3, 12, 7, 18, 22, 9, 14, 5, 30)
    val filtrados = lista.filter { it % 2 == 0 && it > 10 }
    println(filtrados)
}