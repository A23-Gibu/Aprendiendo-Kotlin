package T_02_Sintaxis_y_Control_de_Flujo

fun main() {
    clasificarEdad(139)
}

fun clasificarEdad(edad: Int){
    val resultado = when (edad){
        in 0..17 -> "Menor"
        in 18..66 -> "Adulto"
        in 67..130 -> "Jubilado"
        else -> "Nadie puede vivir tanto"
    }
    print (resultado)
}