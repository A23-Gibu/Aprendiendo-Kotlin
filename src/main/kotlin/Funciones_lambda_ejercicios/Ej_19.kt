package Funciones_lambda_ejercicios

/*
Ejercicio 19. Lambdas con receptor
Escribir una función construirLista(titulo: String, bloque: MutableList<String>.() -> Unit): String que:
1. cree una lista mutable vacía,
2. ejecute el bloque sobre ella (dentro del bloque se puede llamar a add(...) directamente, sin nombrar la lista),
3. devuelva un texto con el título y los elementos numerados, construido con buildString.
*/

fun construirLista(titulo: String, bloque: MutableList<String>.() -> Unit): String {
    val lista = mutableListOf<String>()
    lista.bloque() // Se ejecuta con la lista como receptor (this)

    return buildString {
        appendLine(titulo)
        lista.forEachIndexed { index, elemento ->
            appendLine("${index + 1}. $elemento")
        }
    }
}

fun main() {
    val texto = construirLista("Contenidos de la unidad") {
        add("Sistema operativo Android")
        add("Kotlin")
        add("Ciclo de vida de la actividad")
    }

    println(texto)
}