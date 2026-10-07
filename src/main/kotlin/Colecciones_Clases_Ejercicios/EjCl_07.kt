package Colecciones_Clases_Ejercicios

/*
7. Crear data class Alumno(val nombre: String, val notas: List<Double>)
con una propiedad calculada media que devuelva el promedio de las notas.
*/

data class AlumnoNotas(val nombre: String, val notas: List<Double>) {
    val media: Double
        get() = if (notas.isNotEmpty()) notas.average() else 0.0
}

fun main() {
    val alumno = AlumnoNotas("Adrian", listOf(7.5, 8.0, 9.5, 6.0))
    println("Alumno: ${alumno.nombre}")
    println("Promedio: %.2f".format(alumno.media))
}