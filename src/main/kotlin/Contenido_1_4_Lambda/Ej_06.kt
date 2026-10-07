package Contenido_1_4_Lambda

/*
6. Elaborar un programa que nos pida cuantos segundos duró un concierto,
y nos calcule cuantas horas, minutos y segundos son. Ejemplo:
Cuántos segundos duró el concierto?: 8479
Equivale a 2:21:19
*/

fun main() {
    print("¿Cuántos segundos duró el concierto?: ")
    val totalSegundos = readln().toIntOrNull() ?: 0

    val horas = totalSegundos / 3600
    val minutos = (totalSegundos % 3600) / 60
    val segundos = totalSegundos % 60

    println("Equivale a $horas:$minutos:$segundos")
}