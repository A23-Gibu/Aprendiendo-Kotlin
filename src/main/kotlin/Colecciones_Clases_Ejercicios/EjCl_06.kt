package Colecciones_Clases_Ejercicios

/*
6. Diseñar una jerarquía sencilla: clase abierta Figura con un método abstracto calcularArea(),
y dos subclases Circulo y Cuadrado que lo implementen.
Nota: En Kotlin, una clase con método abstracto debe declararse como 'abstract class'.
*/

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}

class Circulo(val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = Math.PI * radio * radio
}

class Cuadrado(val lado: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double = lado * lado
}

fun main() {
    val figuras: List<FiguraGeometrica> = listOf(Circulo(3.0), Cuadrado(4.0))

    figuras.forEach { figura ->
        println("Área de la figura: %.2f".format(figura.calcularArea()))
    }
}