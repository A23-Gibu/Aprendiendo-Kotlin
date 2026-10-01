package T_03_Null_Safety

//Función longitudNombre(nombre: String?): Int que devuelva 0 si es null, sin usar if.

fun main() {
    println(longitudNombre(null))
}

fun longitudNombre(nombre: String?): Int = nombre?.length ?: 0