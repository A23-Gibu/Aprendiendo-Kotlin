package Contenido_1_4_Lambda

/*
9. Crear un programa que pida los coeficientes de una ecuación de 2º grado,
y muestre sus soluciones reales. Si no existen, debe indicarlo.
ax^2 + bx + c = 0
x = (-b ± sqrt(b^2 - 4ac)) / (2a)
*/

import kotlin.math.sqrt

fun main() {
    print("Introduce el coeficiente a: ")
    val a = readln().toDoubleOrNull() ?: 0.0
    print("Introduce el coeficiente b: ")
    val b = readln().toDoubleOrNull() ?: 0.0
    print("Introduce el coeficiente c: ")
    val c = readln().toDoubleOrNull() ?: 0.0

    if (a == 0.0) {
        println("No es una ecuación de segundo grado (a no puede ser 0).")
        return
    }

    val discriminante = (b * b) - (4 * a * c)

    when {
        discriminante > 0 -> {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Existen dos soluciones reales:")
            println("x1 = $x1")
            println("x2 = $x2")
        }
        discriminante == 0.0 -> {
            val x = -b / (2 * a)
            println("Existe una única solución real doble:")
            println("x = $x")
        }
        else -> {
            println("No existen soluciones reales (discriminante negativo: $discriminante).")
        }
    }
}