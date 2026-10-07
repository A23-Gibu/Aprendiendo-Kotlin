package Contenido_1_4_Lambda

/*
8. Desarrollar un programa que solicite 3 números y compruebe si están ordenados.
*/

fun main() {
    print("Introduce el primer número: ")
    val n1 = readln().toDoubleOrNull() ?: 0.0
    print("Introduce el segundo número: ")
    val n2 = readln().toDoubleOrNull() ?: 0.0
    print("Introduce el tercer número: ")
    val n3 = readln().toDoubleOrNull() ?: 0.0

    if (n1 <= n2 && n2 <= n3) {
        println("Los números están ordenados de menor a mayor.")
    } else if (n1 >= n2 && n2 >= n3) {
        println("Los números están ordenados de mayor a menor.")
    } else {
        println("Los números NO están ordenados.")
    }
}