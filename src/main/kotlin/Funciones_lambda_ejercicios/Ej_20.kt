package Funciones_lambda_ejercicios

/*
Ejercicio 20. Simular un listener de Android
Crear una clase Boton(val texto: String) que:
guarde un listener opcional de tipo ((Boton) -> Unit)?,
tenga un método setOnClickListener(listener: (Boton) -> Unit),
tenga un método click() que ejecute el listener si existe o imprima "El botón texto no tiene listener" si no
existe.
Crear dos botones, asigna un listener a solo uno de ellos con sintaxis de lambda final y simula varias pulsaciones.
Añadir un contador de pulsaciones capturado por la lambda.
Pregunta de reflexión: comparar tu código con binding.boton.setOnClickListener {...} en una actividad de Android.
¿Qué es exactamente lo que va entre las llaves?
*/

class Boton(val texto: String) {
    private var listener: ((Boton) -> Unit)? = null

    fun setOnClickListener(listener: (Boton) -> Unit) {
        this.listener = listener
    }

    fun click() {
        val clickAction = listener
        if (clickAction != null) {
            clickAction(this)
        } else {
            println("El botón '$texto' no tiene listener")
        }
    }
}

fun main() {
    val btnEnviar = Boton("Enviar")
    val btnCancelar = Boton("Cancelar")

    var contadorPulsaciones = 0

    // Asignación con sintaxis trailing lambda y clausura sobre contadorPulsaciones
    btnEnviar.setOnClickListener { boton ->
        contadorPulsaciones++
        println("Pulsado botón '${boton.texto}' (Total pulsaciones: $contadorPulsaciones)")
    }

    btnEnviar.click()
    btnEnviar.click()
    btnCancelar.click()
}

/*
RESPUESTA A LA PREGUNTA DE REFLEXIÓN:
Lo que va entre las llaves en Android es el cuerpo de una función lambda anónima que implementa la interfaz
View.OnClickListener (conversión SAM - Single Abstract Method).
Recibe como parámetro implícito la vista pulsada (it: View) y se ejecuta de forma asíncrona cada vez que el sistema detecta el evento de pulsación.
*/