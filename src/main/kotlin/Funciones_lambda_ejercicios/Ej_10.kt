package Funciones_lambda_ejercicios

/*
Ejercicio 10. Funciones de consulta
Responde con una lambda cada pregunta sobre alumnos:
¿Hay algún alumno con un 10? (any)
¿Todos tienen al menos un 3? (all)
¿Ninguno tiene nota negativa? (none)
¿Cuántos han aprobado? (count)
¿Cuál es el primer suspenso de la lista? (find). Si no hay ninguno, muestra "Ninguno".
*/

fun main() {
    println("¿Hay algún 10?: ${alumnos.any { it.nota == 10.0 }}")
    println("¿Todos tienen al menos un 3?: ${alumnos.all { it.nota >= 3.0 }}")
    println("¿Ninguno tiene nota negativa?: ${alumnos.none { it.nota < 0.0 }}")
    println("¿Cuántos han aprobado?: ${alumnos.count { it.nota >= 5.0 }}")

    val primerSuspenso = alumnos.find { it.nota < 5.0 }?.nombre ?: "Ninguno"
    println("Primer suspenso: $primerSuspenso")
}