package T_05_Colecciones

import kotlin.math.max

// A partir de una lista de 10 alumnos, calcula:
// media de la clase, porcentaje de aprobados y nombre del mejor alumno.

data class Alumno(val nombre: String, val clase: String, val nota: Int)

fun main() {
    val alumnos = listOf(
        Alumno("Adrian", "DAM2B", 10),
        Alumno("Lucia", "DAM2B", 8),
        Alumno("Carlos", "DAM2A", 6),
        Alumno("Marta", "DAM2B", 4),
        Alumno("Javier", "DAM2A", 9),
        Alumno("Elena", "DAM2B", 7),
        Alumno("Marcos", "DAM2A", 5),
        Alumno("Sara", "DAM2B", 3),
        Alumno("David", "DAM2A", 8),
        Alumno("Paula", "DAM2B", 6)
    )

    //MEDIA
    println("La media es ${media(alumnos)}")
    // Otra forma
    //println("La media es ${alumnos.map {it.nota}.average()}")

    //PORCENTAJE APROBADOS
    println("El porcentaje de aprobados es: ${porcentajeAprobados(alumnos)} %")

    //NOMBRE DEL MEJOR ALUMNO
    val mejorAlumno = alumnos.sortedByDescending { it.nota }.first()

    println("El nombre del mejor alumno es: ${mejorAlumno.nombre}")

}

fun media(lista: List<Alumno>): Double{
    if (lista.isEmpty()) return 0.0

    var suma = 0.0
    for(alumno in lista){
        suma += alumno.nota
    }
    return suma / lista.size
}

fun porcentajeAprobados(lista: List<Alumno>): Double{
    val aprobados = lista.filter { it.nota >= 5 }.size
    return (aprobados.toDouble() / lista.size) * 100
}