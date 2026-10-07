package T_07_Herencia_Interfaces_Object_SealedClass

// 5. Conversión de constantes static final a enum class
enum class EstadoPedido(val codigo: Int, val descripcion: String) {
    PENDIENTE(1, "Pedido recibido, pendiente de pago"),
    EN_PREPARACION(2, "Preparando el paquete en el almacén"),
    ENVIADO(3, "En reparto con la empresa de transporte"),
    ENTREGADO(4, "Entregado con éxito al cliente"),
    CANCELADO(5, "Pedido anulado");

    // Método que evalúa si el pedido ya está en un estado inmutable
    fun esFinal(): Boolean = this == ENTREGADO || this == CANCELADO
}

fun procesarPedido(estado: EstadoPedido) {
    // Al ser un enum, el compilador verifica todos los casos sin necesidad de 'else'
    when (estado) {
        EstadoPedido.PENDIENTE -> println("Cobrando pedido...")
        EstadoPedido.EN_PREPARACION -> println("Empaquetando productos...")
        EstadoPedido.ENVIADO -> println("Generando código de seguimiento...")
        EstadoPedido.ENTREGADO -> println("Encuesta de satisfacción enviada.")
        EstadoPedido.CANCELADO -> println("Devolviendo el importe al cliente.")
    }
}

fun main() {
    val estadoActual = EstadoPedido.ENVIADO

    println("Estado: ${estadoActual.name}")             // ENVIADO
    println("Código: ${estadoActual.codigo}")           // 3
    println("Detalle: ${estadoActual.descripcion}")     // En reparto con la empresa de transporte
    println("¿Es estado final?: ${estadoActual.esFinal()}") // false

    println("\n--- Procesando ---")
    procesarPedido(estadoActual)
}