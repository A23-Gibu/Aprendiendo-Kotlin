package Colecciones_Clases_Ejercicios

/*
10. Dada una lista de transacciones bancarias
(data class Transaccion(tipo: String, importe: Double), donde tipo puede ser "ingreso" o "gasto"),
calcular el balance final encadenando filter, map y sum (o sumOf) sin bucles explícitos.
*/

data class Transaccion(val tipo: String, val importe: Double)

fun main() {
    val transacciones = listOf(
        Transaccion("ingreso", 1200.0),
        Transaccion("gasto", 45.50),
        Transaccion("ingreso", 300.0),
        Transaccion("gasto", 150.0)
    )

    val totalIngresos = transacciones.filter { it.tipo.equals("ingreso", ignoreCase = true) }.map { it.importe }.sum()
    val totalGastos = transacciones.filter { it.tipo.equals("gasto", ignoreCase = true) }.map { it.importe }.sum()
    val balanceFinal = totalIngresos - totalGastos

    // Alternativa directa con sumOf:
    // val balanceFinal = transacciones.sumOf { if (it.tipo == "ingreso") it.importe else -it.importe }

    println("Ingresos: $totalIngresos €")
    println("Gastos: $totalGastos €")
    println("Balance final: $balanceFinal €")
}