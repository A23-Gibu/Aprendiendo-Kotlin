package Contenido_1_4_Lambda

/*
10. Elaborar un programa que pida cual es el radio de una circunferencia
y nos calcule cual es la longitud y el área.
(Notas: Longitud = 2 * PI * r, Área = PI * r^2)
*/

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Introduce el radio de la circunferencia: ")
    val radio = readln().toDoubleOrNull() ?: 0.0

    val longitud = 2 * PI * radio
    val area = PI * radio.pow(2)

    println("Longitud: %.4f".format(longitud))
    println("Área: %.4f".format(area))
}