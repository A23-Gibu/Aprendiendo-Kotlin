package T_03_Null_Safety

// Programa que pida un número por consola y muestre su cuadrado;
// si la entrada no es válida, debe mostrar Entrada no válida sin romperse.

fun main() {
    println("Introduce tu numero: ")
    val numero = readlnOrNull()?.toIntOrNull()
    if (numero != null) {
        println("El cuadrado es: ${numero * numero}")
    }
    else println("Entrada no válida")
}

