package T_06_POO_Clases_y_DataClass

import kotlin.math.sqrt

// data class Punto(val x: Int, val y: Int)
// con una propiedad calculada distanciaAlOrigen.

fun main() {
    val punto1 = Punto(1.0, 1.0)
    println(punto1.distanciaAlOrigen())
}

data class Punto(val x: Double, val y: Double) {
    fun distanciaAlOrigen(): Double {
        return sqrt((x * x) + (y * y))
    }
}