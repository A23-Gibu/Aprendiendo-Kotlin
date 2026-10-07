package Colecciones_Clases_Ejercicios

/*
9. A partir de una lista de alumnos con nota (data class Alumno(nombre: String, nota: Double)),
agrupar las notas por rango (por ejemplo "Suspenso", "Aprobado", "Notable", "Sobresaliente")
usando groupBy con una función auxiliar que calcule el rango.
*/

data class AlumnoCalificacion(val nombre: String, val nota: Double)

fun calcularRango(nota: Double): String = when {
    nota < 5.0 -> "Suspenso"
    nota < 7.0 -> "Aprobado"
    nota < 9.0 -> "Notable"
    else -> "Sobresaliente"
}

fun main() {
    val alumnos = listOf(
        AlumnoCalificacion("Adrian", 8.5),
        AlumnoCalificacion("Beatriz", 4.2),
        AlumnoCalificacion("Carlos", 6.0),
        AlumnoCalificacion("Diana", 9.7),
        AlumnoCalificacion("Elena", 7.5)
    )

    val agrupadosPorRango = alumnos.groupBy { calcularRango(it.nota) }

    agrupadosPorRango.forEach { (rango, lista) ->
        println("$rango: ${lista.map { "${it.nombre} (${it.nota})" }}")
    }
}