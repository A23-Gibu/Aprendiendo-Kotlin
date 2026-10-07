package T_07_Herencia_Interfaces_Object_SealedClass

// 3. object GestorUsuarios que mantenga una lista y ofrezca alta, baja y consulta.

data class Usuario(val id: Int, val nombre: String)

object GestorUsuarios {
    // Lista interna privada para que nadie la modifique sin pasar por los métodos
    private val usuarios = mutableListOf<Usuario>()

    // ALTA
    fun alta(usuario: Usuario): Boolean {
        // Evitamos duplicar por ID
        if (usuarios.any { it.id == usuario.id }) {
            println("Aviso: Ya existe un usuario con el ID ${usuario.id}")
            return false
        }
        usuarios.add(usuario)
        println("Usuario añadido: ${usuario.nombre}")
        return true
    }

    // BAJA (por ID)
    fun baja(id: Int): Boolean {
        val eliminado = usuarios.removeIf { it.id == id }
        if (eliminado) {
            println("Usuario con ID $id eliminado correctamente.")
        } else {
            println("No se encontró ningún usuario con el ID $id.")
        }
        return eliminado
    }

    // CONSULTA (por ID, devuelve Usuario? o null si no existe)
    fun consultar(id: Int): Usuario? {
        return usuarios.find { it.id == id }
    }

    // CONSULTA GENERAL (devuelve una copia inmutable de la lista)
    fun listarTodos(): List<Usuario> = usuarios.toList()
}

fun main() {
    // Se invoca directamente por su nombre, SIN usar GestorUsuarios()
    GestorUsuarios.alta(Usuario(1, "Adrian"))
    GestorUsuarios.alta(Usuario(2, "Carlos"))
    GestorUsuarios.alta(Usuario(1, "Duplicado")) // No lo permite

    println("\n--- Consultar ID 2 ---")
    val encontrado = GestorUsuarios.consultar(2)
    println(encontrado)

    println("\n--- Baja ID 1 ---")
    GestorUsuarios.baja(1)

    println("\n--- Lista actual ---")
    println(GestorUsuarios.listarTodos())
}