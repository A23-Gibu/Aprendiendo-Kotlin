package Funciones_lambda_ejercicios

/*
Ejercicio 4. Lambda con varias líneas
Crear una lambda calificar: (Double) -> String que reciba una nota y devuelva su calificación: "Insuficiente" (< 5),
"Suficiente" (< 6), "Bien" (< 7), "Notable" (< 9) o "Sobresaliente". Si la nota está fuera del rango 0-10, debe devolver
"Nota no válida".
Recuerda: en una lambda no se usa return; el valor devuelto es el de la última expresión.
*/

fun main() {
    val calificar: (Double) -> String = { nota ->
        if (nota !in 0.0..10.0) {
            "Nota no válida"
        } else {
            when {
                nota < 5.0 -> "Insuficiente"
                nota < 6.0 -> "Suficiente"
                nota < 7.0 -> "Bien"
                nota < 9.0 -> "Notable"
                else -> "Sobresaliente"
            }
        }
    }

    println(calificar(4.5))
    println(calificar(7.8))
    println(calificar(9.5))
    println(calificar(11.0))
}