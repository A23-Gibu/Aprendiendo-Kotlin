package Colecciones_Clases_Ejercicios

/*
2. Diseñar una clase Vehiculo con marca, modelo y velocidad actual;
añadir métodos acelerar(cantidad: Int) y frenar(cantidad: Int)
que no permitan que la velocidad baje de 0.
*/

class Vehiculo(val marca: String, val modelo: String, var velocidadActual: Int = 0) {

    fun acelerar(cantidad: Int) {
        require(cantidad > 0) { "La aceleración debe ser positiva" }
        velocidadActual += cantidad
        println("Acelerando a $velocidadActual km/h")
    }

    fun frenar(cantidad: Int) {
        require(cantidad > 0) { "La frenada debe ser positiva" }
        velocidadActual = maxOf(0, velocidadActual - cantidad)
        println("Frenando hasta $velocidadActual km/h")
    }
}

fun main() {
    val coche = Vehiculo("Toyota", "Corolla", 50)
    coche.acelerar(30)
    coche.frenar(100) // Se queda en 0 y no en negativo
}