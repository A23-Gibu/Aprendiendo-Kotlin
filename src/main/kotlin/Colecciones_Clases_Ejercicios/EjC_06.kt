package Colecciones_Clases_Ejercicios

/*
6. A partir de una lista de frases (List<String>), obtener una única lista con todas
las palabras de todas las frases usando flatMap.
*/

fun main() {
    val frases = listOf(
        "Aprender Kotlin es divertido",
        "Colecciones y programación funcional",
        "Desarrollo de aplicaciones multiplataforma"
    )

    val todasLasPalabras = frases.flatMap { it.split(" ") }

    println("Lista aplanada de palabras: $todasLasPalabras")
}