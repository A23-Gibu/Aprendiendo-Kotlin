package Funciones_lambda_ejercicios

/*
Ejercicio 7. map
Dada la lista listOf("ana", "brais", "carla"), obtén una lista de cadenas con el formato "ANA (3)": el nombre en
mayúsculas seguido de su número de letras.
*/

fun main() {
    val nombres = listOf("ana", "brais", "carla")
    val formateados = nombres.map { "${it.uppercase()} (${it.length})" }
    println(formateados)
}