package T_01_Entorno_y_primer_programa

fun main() {
    //println("Hola mundo")

    val nombre = readlnOrNull() ?: "invitado"
    println("Bienvenido $nombre")

    /*Al compilar una función de nivel superior, Kotlin la convierte normalmente en un método static de una clase Java generada.
    El nombre de esa clase suele derivarse del nombre del archivo, por ejemplo, Main.kt → MainKt.
    Así, una función fun saludar() puede terminar como public static final void saludar() dentro de MainKt.*/
}