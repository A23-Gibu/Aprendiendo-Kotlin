package Contenido_1_4_Lambda

/*
3. Desarrollar un programa que compruebe si un número introducido por teclado es múltiplo de 7.
*/

fun main() {
    print("Introduce un número entero: ")
    val numero = readln().toIntOrNull() ?: 0

    if (numero % 7 == 0) {
        println("El número $numero es múltiplo de 7.")
    } else {
        println("El número $numero NO es múltiplo de 7.")
    }
}