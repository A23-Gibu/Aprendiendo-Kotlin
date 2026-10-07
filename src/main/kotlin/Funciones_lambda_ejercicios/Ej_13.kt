package Funciones_lambda_ejercicios

/*
Ejercicio 13. Referencias a funciones
1. Escribe una función normal esPrimo(n: Int): Boolean.
2. Filtra los primos de (1..50).toList() pasando una referencia a función (::esPrimo) en lugar de una lambda.
3. Imprime cada primo usando forEach(::println).
4. Convierte listOf("uno", "dos", "tres") a mayúsculas usando la referencia String::uppercase.
*/

fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    // 2. Filtrar primos con ::esPrimo
    val primos = (1..50).toList().filter(::esPrimo)

    // 3. Imprimir cada uno con ::println
    println("Primos:")
    primos.forEach(::println)

    // 4. Mayúsculas con String::uppercase
    val mayusculas = listOf("uno", "dos", "tres").map(String::uppercase)
    println("Mayúsculas: $mayusculas")
}