package Funciones_lambda_ejercicios

/*
Ejercicio 3. El parámetro implícito it
Declarar dos lambdas de un solo parámetro usando it:
cuadrado: recibe un Int y devuelve su cuadrado.
esPar: recibe un Int y devuelve true si es par.
Probarlas con varios valores.
*/

fun main() {
    val cuadrado: (Int) -> Int = { it * it }
    val esPar: (Int) -> Boolean = { it % 2 == 0 }

    println("Cuadrado de 4: ${cuadrado(4)}")
    println("Cuadrado de 7: ${cuadrado(7)}")
    println("¿Es 6 par?: ${esPar(6)}")
    println("¿Es 9 par?: ${esPar(9)}")
}