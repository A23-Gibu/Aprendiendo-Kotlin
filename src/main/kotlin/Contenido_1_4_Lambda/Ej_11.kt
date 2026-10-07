package Contenido_1_4_Lambda

/*
11. Crear un programa para convertir un entero a un char.
Nota: comprobarlo con la tabla ASCII.
*/

fun main() {
    print("Introduce un número entero (código ASCII): ")
    val numero = readln().toIntOrNull() ?: 0

    val caracter = numero.toChar()
    println("El entero $numero corresponde al carácter ASCII: '$caracter'")
}