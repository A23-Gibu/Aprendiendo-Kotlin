package Funciones_lambda_ejercicios

/*
Ejercicio 1. Declarar una lambda
Declarar una lambda suma que reciba dos Int y devuelva su suma, indicando explícitamente el tipo de función (Int,
Int) -> Int. Después, declarar una lambda resta dejando que el compilador infiera el tipo (indicando el tipo solo en los
parámetros). Mostrar el resultado de suma(3, 4) y resta(10, 4).
*/

fun main() {
    val suma: (Int, Int) -> Int = { a, b -> a + b }
    val resta = { a: Int, b: Int -> a - b }

    println("Suma: ${suma(3, 4)}")
    println("Resta: ${resta(10, 4)}")
}