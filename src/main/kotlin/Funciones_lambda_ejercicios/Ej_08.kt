package Funciones_lambda_ejercicios

/*
Ejercicio 8. Encadenar filter y map
Usando la lista alumnos, obtén los nombres de los alumnos de DAM que han aprobado (nota ≥ 5), en una sola
expresión.
Salida esperada: [Ana, Carla]
*/

fun main() {
    val aprobadosDAM = alumnos
        .filter { it.ciclo == "DAM" && it.nota >= 5.0 }
        .map { it.nombre }

    println(aprobadosDAM)
}