package T_05_Colecciones

//Agrupa una lista de palabras por su primera letra (groupBy).

fun main() {
    val frutas = listOf("Platano", "Mango", "Fresa", "Pera", "Manzana")
    val frutasOrdenadas = frutas.groupBy { it[0] }

    println(frutasOrdenadas)
}