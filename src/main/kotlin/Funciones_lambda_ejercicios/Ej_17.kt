package Funciones_lambda_ejercicios

/*
Ejercicio 17. Lambdas y nulabilidad: let
Escribir buscarAlumno(nombre: String): Alumno?, que devuelva el alumno o null. Usando ?.let { } y el operador Elvis
?:, muestra "Nombre tiene un nota" si existe o "Alumno no encontrado" si no existe. Prueba con "Carla" y con "Zoe".
*/

fun buscarAlumno(nombre: String): Alumno? = alumnos.find { it.nombre.equals(nombre, ignoreCase = true) }

fun comprobarYMostrar(nombre: String) {
    val mensaje = buscarAlumno(nombre)?.let {
        "${it.nombre} tiene un ${it.nota}"
    } ?: "Alumno no encontrado"

    println("$nombre: $mensaje")
}

fun main() {
    comprobarYMostrar("Carla")
    comprobarYMostrar("Zoe")
}