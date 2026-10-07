package Colecciones_Clases_Ejercicios

/*
4. Crear data class Rectangulo(val base: Double, val altura: Double)
con propiedades calculadas area y perimetro.
*/

data class Rectangulo(val base: Double, val altura: Double) {
    val area: Double
        get() = base * altura

    val perimetro: Double
        get() = 2 * (base + altura)
}

fun main() {
    val rect = Rectangulo(5.0, 3.0)
    println("Base: ${rect.base}, Altura: ${rect.altura}")
    println("Área: ${rect.area}")
    println("Perímetro: ${rect.perimetro}")
}