package T_03_Null_Safety

/*Dada data class Alumno(val nombre: String, val tutor: Tutor?) y data class
Tutor(val email: String?), escribe una función que devuelva el email del tutor o "desconocido".*/

fun main() {
    val Silvia = Tutor("silvia@gmail.com")
    val Adrian = Alumno("Adrian", Silvia)

    println("El email de tu tutora es: ${email(Adrian)}")
}

data class Tutor (val email: String?)
data class Alumno(val nombre: String, val tutor: Tutor?)

fun email(alumno: Alumno?): String = alumno?.tutor?.email ?: "Desconocido"