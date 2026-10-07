package Contenido_1_4_Lambda

/*
4. Crear un programa que compruebe si un año es bisiesto.
"Año bisiesto es el divisible entre 4, salvo que sea año secular -último de
cada siglo, terminado en «00»-, en cuyo caso también ha de ser divisible entre 400."
*/

fun main() {
    print("Introduce un año: ")
    val anio = readln().toIntOrNull() ?: 0

    val esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)

    if (esBisiesto) {
        println("El año $anio es bisiesto.")
    } else {
        println("El año $anio NO es bisiesto.")
    }
}