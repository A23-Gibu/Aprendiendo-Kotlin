package T_04_Funciones_y_Lambdas

// Función aplicarDescuento(precio: Double, porcentaje: Double = 10.0): Double.

fun main() {
    print(aplicarDescuento(100.0))
}

fun aplicarDescuento(precio: Double, porcentaje: Double = 10.0): Double = precio - (precio * (porcentaje/100))
