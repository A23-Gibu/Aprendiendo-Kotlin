package Colecciones_Clases_Ejercicios

/*
8. Diseñar una clase ListaReproduccion con una lista privada de canciones (MutableList<String>)
y métodos añadirCancion(), eliminarCancion() y mostrarCanciones().
*/

class ListaReproduccion(val nombre: String) {
    private val canciones = mutableListOf<String>()

    fun anadirCancion(cancion: String) {
        canciones.add(cancion)
        println("Añadida: $cancion")
    }

    fun eliminarCancion(cancion: String): Boolean {
        val eliminada = canciones.remove(cancion)
        if (eliminada) {
            println("Eliminada: $cancion")
        } else {
            println("No se encontró la canción: $cancion")
        }
        return eliminada
    }

    fun mostrarCanciones() {
        println("--- Lista de reproducción: $nombre ---")
        if (canciones.isEmpty()) {
            println("(Vacía)")
        } else {
            canciones.forEachIndexed { index, item ->
                println("${index + 1}. $item")
            }
        }
    }
}

fun main() {
    val playlist = ListaReproduccion("Favoritas")
    playlist.anadirCancion("Bohemian Rhapsody")
    playlist.anadirCancion("Hotel California")
    playlist.mostrarCanciones()
    playlist.eliminarCancion("Hotel California")
    playlist.mostrarCanciones()
}