package Colecciones_Clases_Ejercicios

/*
10. Diseñar una clase Temperatura que almacene grados en Celsius internamente,
con propiedades calculadas fahrenheit y kelvin, y validar con require que no se pueda
crear una temperatura por debajo del cero absoluto (-273.15 ºC).
*/

class Temperatura(celsiusInicial: Double) {

    init {
        require(celsiusInicial >= CERO_ABSOLUTO_CELSIUS) {
            "Temperatura inválida: $celsiusInicial ºC está por debajo del cero absoluto ($CERO_ABSOLUTO_CELSIUS ºC)"
        }
    }

    val celsius: Double = celsiusInicial

    val fahrenheit: Double
        get() = (celsius * 9 / 5) + 32

    val kelvin: Double
        get() = celsius + 273.15

    companion object {
        const val CERO_ABSOLUTO_CELSIUS = -273.15
    }
}

fun main() {
    val ambiente = Temperatura(25.0)
    println("Celsius: ${ambiente.celsius} ºC")
    println("Fahrenheit: ${ambiente.fahrenheit} ºF")
    println("Kelvin: ${ambiente.kelvin} K")

    // La siguiente línea lanzaría una IllegalArgumentException por validación con require:
    // val imposible = Temperatura(-300.0)
}