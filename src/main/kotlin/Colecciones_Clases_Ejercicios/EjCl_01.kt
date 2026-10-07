package Colecciones_Clases_Ejercicios

/*
1. Crear una clase Persona con nombre y fecha de nacimiento,
y añadir un método calcularEdad() que la calcule a partir del año actual.
*/

import java.time.LocalDate

class Persona(val nombre: String, val fechaNacimiento: LocalDate) {
    fun calcularEdad(): Int {
        val anioActual = LocalDate.now().year
        return anioActual - fechaNacimiento.year
    }
}

fun main() {
    val persona = Persona("Adrian", LocalDate.of(2003, 5, 14))
    println("${persona.nombre} tiene ${persona.calcularEdad()} años.")
}