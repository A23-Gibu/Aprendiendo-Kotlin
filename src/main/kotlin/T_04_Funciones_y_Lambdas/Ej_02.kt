package T_04_Funciones_y_Lambdas

// Función de orden superior repetir(veces: Int, accion: (Int) -> Unit)
// que ejecute accion pasándole el número de iteración.

fun main() {
    repetir(3) {
        println("Hola")
    }
}

fun repetir(veces: Int, accion: (Int) -> Unit) {
    for (i in 0 until veces) {
        accion(i)
    }
}