package T_04_Funciones_y_Lambdas

fun main() {
    // Creamos el diccionario de operaciones
    val operaciones: Map<String, (Double, Double) -> Double> = mapOf(
        "+" to { a, b -> a + b },
        "-" to { a, b -> a - b },
        "*" to { a, b -> a * b },
        "/" to { a, b -> a / b }
    )

    print("Introduce el primer número: ")
    val n1 = readln().toDoubleOrNull() ?: 0.0

    print("Introduce la operación (+, -, *, /): ")
    val simbolo = readln()

    print("Introduce el segundo número: ")
    val n2 = readln().toDoubleOrNull() ?: 0.0

    // Buscamos la receta en el mapa
    val accion = operaciones[simbolo]

    // Si existe, la ejecutamos; si no, avisamos
    if (accion != null) {
        val resultado = accion(n1, n2) // Ejecutamos la lambda recuperada
        println("Resultado: $n1 $simbolo $n2 = $resultado")
    } else {
        println("Operación '$simbolo' no válida.")
    }
}