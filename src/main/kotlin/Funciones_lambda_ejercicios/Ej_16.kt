package Funciones_lambda_ejercicios

/*
Ejercicio 16. Implementa tu propio filter y map
Sin usar las funciones de la biblioteca estándar, implementa como funciones de extensión genéricas:
fun <T> List<T>.miFiltro(predicado: (T) -> Boolean): List<T>
fun <T, R> List<T>.miMap(transformar: (T) -> R): List<R>
Compruébalas con la lista alumnos obteniendo los nombres de los aprobados.
*/

fun <T> List<T>.miFiltro(predicado: (T) -> Boolean): List<T> {
    val resultado = mutableListOf<T>()
    for (elemento in this) {
        if (predicado(elemento)) {
            resultado.add(elemento)
        }
    }
    return resultado
}

fun <T, R> List<T>.miMap(transformar: (T) -> R): List<R> {
    val resultado = mutableListOf<R>()
    for (elemento in this) {
        resultado.add(transformar(elemento))
    }
    return resultado
}

fun main() {
    val nombresAprobados = alumnos
        .miFiltro { it.nota >= 5.0 }
        .miMap { it.nombre }

    println("Nombres aprobados (con extensiones propias): $nombresAprobados")
}