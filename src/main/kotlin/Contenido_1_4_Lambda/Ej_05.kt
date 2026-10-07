package Contenido_1_4_Lambda

/*
5. Desarrollar un programa que indique el peso que tienes en la luna.
Gravedad en la tierra 9.8 y en la luna 1.62.
*/

fun main() {
    val gravedadTierra = 9.8
    val gravedadLuna = 1.62

    print("Introduce tu peso en la Tierra (kg): ")
    val pesoTierra = readln().toDoubleOrNull() ?: 0.0

    // Masa = Peso / GravedadTierra; PesoLuna = Masa * GravedadLuna
    val pesoLuna = (pesoTierra / gravedadTierra) * gravedadLuna

    println("Tu peso en la Luna sería de: %.2f kg".format(pesoLuna))
}