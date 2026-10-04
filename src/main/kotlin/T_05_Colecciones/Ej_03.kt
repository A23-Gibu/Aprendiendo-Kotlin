package T_05_Colecciones

// Dada una lista de precios, obtén la suma total aplicando
// un 21 % de IVA, en una única cadena de operadores.

fun main() {
    val precios = listOf(21.06, 75.04, 87.9, 2.0)

    val sumaTotal = precios.map { it * 1.21 }.sum()

    println(sumaTotal)
}

