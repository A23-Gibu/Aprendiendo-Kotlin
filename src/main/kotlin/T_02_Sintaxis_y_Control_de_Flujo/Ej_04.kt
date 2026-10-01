package T_02_Sintaxis_y_Control_de_Flujo

fun main() {
    val msg = calorOFrio(57)
    print(msg)
}

/* Reescribe en Kotlin este código Java, eliminando toda variable mutable innecesaria:
String msg;
if (temp > 30) { msg = "Calor"; } else { msg = "Templado"; } */

fun calorOFrio(temp: Int) = if(temp > 30) "Calor" else "Templado"

