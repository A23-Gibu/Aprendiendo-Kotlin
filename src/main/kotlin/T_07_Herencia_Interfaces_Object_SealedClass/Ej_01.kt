package T_07_Herencia_Interfaces_Object_SealedClass

//Jerarquía Empleado → Comercial / Tecnico
// con un método calcularSueldo() redefinido.

fun main() {

}

open class Empleado(nombre: String,
                    sueldoBase: Double) {
    open fun calcularSueldo(){
    }
}

class Comercial(nombre: String, sueldoBase: Double, val comision: Double
    ) : Empleado(nombre, sueldoBase){
    override fun calcularSueldo(){
        print("1500")
    }
}

class Tecnico() : Empleado(){
    override fun calcularSueldo(){
        print("2000")
    }
}