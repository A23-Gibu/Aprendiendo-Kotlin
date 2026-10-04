package T_06_POO_Clases_y_DataClass

// Crea la clase Libro con título, autor, año y disponibilidad;
// añade un método prestar () que cambie el estado.

class Libro(val titulo: String,
            val autor: String,
            val ano: Int,
            var disponibilidad: Boolean) {

    fun prestar(){
        disponibilidad = false
    }

    fun devolver() {
        disponibilidad = true
    }
}

