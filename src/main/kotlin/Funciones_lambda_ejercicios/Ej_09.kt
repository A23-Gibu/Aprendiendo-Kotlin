package Funciones_lambda_ejercicios

/*
Ejercicio 9. Ordenación con lambdas
Con la lista alumnos, muestra:
1. Los alumnos ordenados por nota de mayor a menor (sortedByDescending).
2. Los alumnos ordenados alfabéticamente por nombre (sortedBy).
3. Los alumnos ordenados por ciclo y, dentro de cada ciclo, por nota descendente (sortedWith + compareBy +
thenByDescending).
*/

fun main() {
    // 1. Por nota descendente
    val porNotaDesc = alumnos.sortedByDescending { it.nota }
    println("1. Por nota desc: $porNotaDesc")

    // 2. Alfabéticamente por nombre
    val porNombre = alumnos.sortedBy { it.nombre }
    println("2. Por nombre: $porNombre")

    // 3. Por ciclo y nota descendente
    val porCicloYNota = alumnos.sortedWith(
        compareBy<Alumno> { it.ciclo }.thenByDescending { it.nota }
    )
    println("3. Por ciclo y nota desc: $porCicloYNota")
}