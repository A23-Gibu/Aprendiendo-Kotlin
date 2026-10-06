package T_07_Herencia_Interfaces_Object_SealedClass

// Interfaz Almacenable con guardar() y cargar(),
// implementada por dos clases distintas.

interface Almacenable {
    fun guardar()

    fun cargar()
}

class Documento(val titulo:String, val contenido:String) : Almacenable {
    override fun guardar() {
        println("Guardando el documento $titulo en disco...")
    }
    override fun cargar() {
        println("Cargando el documento $titulo desde disco...")
    }
}

class PartidaJuego(val usuario: String, val nivel: Int):Almacenable {
    override fun guardar() {
        println("Guardando partida de $usuario de nivel $nivel." )
    }
    override fun cargar() {println("Descargando partida de $usuario")}
}

