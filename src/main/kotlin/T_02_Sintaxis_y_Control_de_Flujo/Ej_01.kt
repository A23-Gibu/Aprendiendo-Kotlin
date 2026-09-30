package T_02_Sintaxis_y_Control_de_Flujo

fun main() {
    println("Introduce el número del mes:")
    val mes = readlnOrNull() ?: "Mes incorrecto"

    val tu_mes = when (mes.toInt()) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "mes invalido"
    }

    println("Tu mes es $tu_mes")
}