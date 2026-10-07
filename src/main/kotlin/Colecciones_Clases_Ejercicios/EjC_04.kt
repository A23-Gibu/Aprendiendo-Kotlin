package Colecciones_Clases_Ejercicios

/*
4. Implementar la misma suma acumulada del ejercicio anterior, pero con fold,
partiendo de un valor inicial de 100, y explicar la diferencia con reduce.

DIFERENCIA:
- reduce: Toma el primer elemento de la lista como acumulador inicial y lanza
  NoSuchElementException si la lista está vacía. Su resultado siempre es del mismo
  tipo que los elementos de la lista.
- fold: Exige un valor semilla/inicial explícito (aquí 100). Funciona incluso con
  listas vacías (devolviendo el valor inicial) y permite transformar el tipo acumulado.
*/

fun main() {
    val numeros = listOf(2, 3, 4, 5)

    // Suma acumulada con fold arrancando en 100
    val sumaConFold = numeros.fold(100) { acumulador, numero -> acumulador + numero }

    println("Resultado fold partiendo de 100: $sumaConFold")
}