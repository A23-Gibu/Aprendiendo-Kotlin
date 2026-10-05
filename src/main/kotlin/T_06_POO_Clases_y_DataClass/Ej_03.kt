package T_06_POO_Clases_y_DataClass

// Clase CuentaBancaria con saldo privado,
// métodos ingresar/retirar y validación con require.

fun main() {
    val adrian = CuentaBancaria(2000.0)
    println(adrian.getSaldo())

    adrian.retirar(500.0)
    println(adrian.getSaldo())

    adrian.ingresar(1000.0)
    println(adrian.getSaldo())
}

class CuentaBancaria(private var saldo: Double) {
    fun ingresar(cantidad: Double){
        require(cantidad > 0) {"La cantidad a ingresar debe ser mayor que 0"}
        saldo += cantidad
    }

    fun retirar(cantidad: Double){
        require(cantidad > 0) {"La cantidad a retirar debe ser mayor que 0"}
        saldo -= cantidad
    }

    fun getSaldo(): Double = saldo
}