package T_02_Sintaxis_y_Control_de_Flujo

fun main() {
    println("¿De que numero quieres obtener la tabla?")
    val numero = readlnOrNull()
    if (numero == null) {
        println("No has introducido ningun numero")
    }
    else{
        for (i in 1..10) {
            println("($numero x $i) = ${numero.toInt() * i}")
        }
    }
}