package Funciones_lambda_ejercicios

/*
Ejercicio 2. Lambda sin parámetros
Crear una lambda saludar de tipo () -> Unit que imprima un saludo. Invócala de las dos formas posibles: con
paréntesis y con invoke().
*/

fun main() {
    val saludar: () -> Unit = { println("¡Hola desde Kotlin!") }

    saludar()
    saludar.invoke()
}