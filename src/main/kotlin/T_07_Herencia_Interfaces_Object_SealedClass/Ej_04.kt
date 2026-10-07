package T_07_Herencia_Interfaces_Object_SealedClass

// 4. Modela con sealed class el resultado de un inicio de sesión
// (éxito, credenciales incorrectas, sin conexión) y escribe el when correspondiente.

sealed class ResultadoLogin {
    // Éxito transporta datos (el token y el usuario logueado) -> data class
    data class Exito(val usuario: String, val token: String) : ResultadoLogin()

    // Credenciales incorrectas transporta el motivo del error -> data class
    data class CredencialesIncorrectas(val mensaje: String) : ResultadoLogin()

    // Sin conexión no necesita transportar ningún dato extra -> object (ahorra memoria)
    object SinConexion : ResultadoLogin()
}

fun gestionarLogin(resultado: ResultadoLogin) {
    // Al ser una sealed class, el 'when' cubre todas las ramas y NO necesita 'else'
    when (resultado) {
        is ResultadoLogin.Exito -> {
            println("Inicio de sesión correcto. Bienvenido, ${resultado.usuario}!")
            println("Token de sesión: ${resultado.token}")
        }
        is ResultadoLogin.CredencialesIncorrectas -> {
            println("Error de acceso: ${resultado.mensaje}")
        }
        ResultadoLogin.SinConexion -> {
            println("No se pudo conectar: comprueba tu conexión a internet.")
        }
    }
}

fun main() {
    val intento1: ResultadoLogin = ResultadoLogin.Exito("Adrian", "tk_987abc")
    val intento2: ResultadoLogin = ResultadoLogin.CredencialesIncorrectas("Contraseña errónea")
    val intento3: ResultadoLogin = ResultadoLogin.SinConexion

    gestionarLogin(intento1)
    println("---")
    gestionarLogin(intento2)
    println("---")
    gestionarLogin(intento3)
}