package Funciones_lambda_ejercicios

/*
Ejercicio 5. Función de orden superior
Escribe una función operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int que aplique la operación recibida. Llámala:
pasando la lambda suma del ejercicio 1,
pasando una lambda escrita directamente entre los paréntesis,
usando la sintaxis de lambda final (trailing lambda), fuera de los paréntesis.
*/

fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int = operacion(a, b)

fun main() {
    val suma: (Int, Int) -> Int = { x, y -> x + y }

    // 1. Pasando la lambda como variable
    val r1 = operar(5, 3, suma)

    // 2. Directamente entre los paréntesis
    val r2 = operar(5, 3, { x, y -> x * y })

    // 3. Con sintaxis trailing lambda (fuera de los paréntesis)
    val r3 = operar(5, 3) { x, y -> x - y }

    println("r1: $r1 | r2: $r2 | r3: $r3")
}