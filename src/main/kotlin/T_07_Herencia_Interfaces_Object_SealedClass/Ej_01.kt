package T_07_Herencia_Interfaces_Object_SealedClass

//Jerarquía Empleado → Comercial / Tecnico
// con un método calcularSueldo() redefinido.

fun main() {

}

open class Empleado(val nombre: String,
                    val sueldoBase: Double) {
    open fun calcularSueldo(){
    }
}

class Comercial(nombre: String, sueldoBase: Double, val comision: Double
    ) : Empleado(nombre, sueldoBase){
    override fun calcularSueldo(){
        println("Tu sueldo es: ${sueldoBase + comision}")
    }
}

class Tecnico(nombre: String,
              sueldoBase: Double, val plusGuardia: Double) : Empleado(nombre, sueldoBase){
    override fun calcularSueldo(){
        println("Tu sueldo es: ${sueldoBase + plusGuardia}")
    }
}