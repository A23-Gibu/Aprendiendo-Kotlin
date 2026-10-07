package Contenido_1_4_Lambda

/*
2. Crear un programa que compruebe si eres mayor de edad.
*/

fun main() {
    print("Introduce tu edad: ")
    val edad = readln().toIntOrNull() ?: 0

    if (edad >= 18) {
        println("Eres mayor de edad.")
    } else {
        println("Eres menor de edad.")
    }
}