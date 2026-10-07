package Colecciones_Clases_Ejercicios

/*
5. Crear una clase Empleado con salario privado y un método subirSalario(porcentaje: Double)
que valide con require que el porcentaje esté entre 0 y 100.
*/

class EmpleadoConSalario(val nombre: String, private var salario: Double) {

    init {
        require(salario >= 0) { "El salario inicial no puede ser negativo" }
    }

    fun subirSalario(porcentaje: Double) {
        require(porcentaje in 0.0..100.0) {
            "El porcentaje debe estar entre 0 y 100 (recibido: $porcentaje)"
        }
        salario += salario * (porcentaje / 100.0)
    }

    fun consultarSalario(): Double = salario
}

fun main() {
    val emp = EmpleadoConSalario("Carlos", 1500.0)
    emp.subirSalario(10.0)
    println("Salario tras subida: ${emp.consultarSalario()} €")
}