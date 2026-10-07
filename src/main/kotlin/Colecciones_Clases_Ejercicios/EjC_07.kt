package Colecciones_Clases_Ejercicios

/*
7. Dada una lista de edades, comprobar si todos los alumnos son mayores de edad con all,
si hay alguno menor con any, y contar cuántos son menores con count.
*/

fun main() {
    val edades = listOf(19, 21, 17, 25, 16, 20)

    val todosMayores = edades.all { it >= 18 }
    val hayAlgunMenor = edades.any { it < 18 }
    val cantidadMenores = edades.count { it < 18 }

    println("¿Todos son mayores de edad?: $todosMayores")
    println("¿Hay algún menor de edad?: $hayAlgunMenor")
    println("Cantidad de menores de edad: $cantidadMenores")
}