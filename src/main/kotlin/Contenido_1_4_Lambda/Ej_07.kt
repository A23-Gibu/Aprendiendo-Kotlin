package Contenido_1_4_Lambda

/*
7. Realizar un programa que cuando un cliente de un banco quiere sacar una cantidad de
dinero de su cuenta, calcule cuantos billetes tenemos que darle. Siempre calcularemos la
mínima cantidad de billetes.
Teclea la cantidad de euros: 3475
La cantidad de billetes que te tengo que dar es:
6 billetes de 500€
2 billetes de 200€
0 billetes de 100€
1 billetes de 50€
1 billetes de 20€
0 billetes de 10€
1 billetes de 5€
*/

fun main() {
    print("Teclea la cantidad de euros: ")
    var cantidad = readln().toIntOrNull() ?: 0

    val denominaciones = listOf(500, 200, 100, 50, 20, 10, 5)

    println("La cantidad de billetes que te tengo que dar es:")
    for (billete in denominaciones) {
        val numBilletes = cantidad / billete
        println("$numBilletes billetes de $billete€")
        cantidad %= billete
    }

    if (cantidad > 0) {
        println("Sobrante no retirable en billetes: $cantidad€")
    }
}