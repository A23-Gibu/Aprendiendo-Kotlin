package Funciones_lambda_ejercicios

/*
Ejercicio 18. Funciones de ámbito: apply, also y run
Dada la clase:
class ConfiguracionApp {
var tema = "claro"
var idioma = "es"
var notificaciones = true
}
1. Crear un objeto y configúralo en una sola expresión con apply (tema oscuro, idioma gallego, sin
notificaciones).
2. Encadenar un also que imprima un mensaje de registro con el objeto creado.
3. Usar run sobre el objeto para devolver un String resumen de la configuración.
Explicar en un comentario qué diferencia hay entre this e it en cada caso y qué devuelve cada función.
*/

class ConfiguracionApp {
    var tema = "claro"
    var idioma = "es"
    var notificaciones = true
}

fun main() {
    val resumen = ConfiguracionApp()
        .apply {
            tema = "oscuro"
            idioma = "gl"
            notificaciones = false
        }
        .also {
            println("Log: Configuración instanciada con idioma ${it.idioma}")
        }
        .run {
            "Resumen: Tema=$tema, Idioma=$idioma, Notificaciones=$notificaciones"
        }

    println(resumen)
}

/*
EXPLICACIÓN DE THIS / IT Y RETORNO:
- apply: Receptor 'this' (acceso directo a miembros). Devuelve el propio objeto receptor.
- also: Argumento 'it' (ideal para efectos secundarios/logs). Devuelve el propio objeto receptor.
- run: Receptor 'this'. Devuelve el resultado de la última expresión evaluada en su bloque lambda.
*/