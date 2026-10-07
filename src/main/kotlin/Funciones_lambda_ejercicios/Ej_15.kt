package Funciones_lambda_ejercicios

/*
Ejercicio 15. Clausuras (closures)
Escribe crearContador(): () -> Int. Cada vez que se invoque la lambda devuelta, debe devolver el siguiente número (1,
2, 3...). Crea dos contadores y demuestra que cada uno mantiene su propia cuenta.
Pregunta de reflexión: ¿dónde "vive" la variable de la cuenta si la función crearContador ya ha terminado?
*/

fun crearContador(): () -> Int {
    var contador = 0
    return {
        contador++
        contador
    }
}

fun main() {
    val c1 = crearContador()
    val c2 = crearContador()

    println("Contador 1: ${c1()}") // 1
    println("Contador 1: ${c1()}") // 2
    println("Contador 2: ${c2()}") // 1
    println("Contador 1: ${c1()}") // 3
    println("Contador 2: ${c2()}") // 2
}

/*
RESPUESTA A LA PREGUNTA DE REFLEXIÓN:
La variable 'contador' vive en la memoria Heap (montículo).
Al ser capturada por la clausura (closure), el compilador empaqueta la variable primitiva dentro de una
instancia envoltorio (Ref object) que sobrevive en memoria mientras la lambda referenciada siga existiendo.
*/