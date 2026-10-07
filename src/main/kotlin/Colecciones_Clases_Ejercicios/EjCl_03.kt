package Colecciones_Clases_Ejercicios

/*
3. Convertir un POJO Empleado (nombre, puesto, salario) a data class y usa copy()
para aplicar una subida de sueldo del 5% sin modificar el objeto original.
*/

data class EmpleadoData(val nombre: String, val puesto: String, val salario: Double)

fun main() {
    val empleadoOriginal = EmpleadoData("Adrian", "Desarrollador Junior", 20000.0)

    // copy() crea un clon inmutable alterando solo las propiedades indicadas
    val empleadoConSubida = empleadoOriginal.copy(salario = empleadoOriginal.salario * 1.05)

    println("Original: $empleadoOriginal")
    println("Con subida: $empleadoConSubida")
}