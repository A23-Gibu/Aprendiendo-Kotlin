package Funciones_lambda_ejercicios

/*
Ejercicio 12. Agrupar y calcular
Agrupa los alumnos por ciclo con groupBy y, a partir del resultado, obtén un Map<String, Double> con la nota media
de cada ciclo (mapValues). Muestra cada ciclo con su media redondeada a dos decimales.
*/

fun main() {
    val mediasPorCiclo: Map<String, Double> = alumnos
        .groupBy { it.ciclo }
        .mapValues { (_, alumnosCiclo) ->
            alumnosCiclo.map { it.nota }.average()
        }

    mediasPorCiclo.forEach { (ciclo, media) ->
        println("$ciclo: %.2f".format(media))
    }
}