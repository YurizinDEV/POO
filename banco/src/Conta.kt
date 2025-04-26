class Conta(val numeroConta: String, private var saldo: Double, private val cliente: Cliente) {
    fun depositar(valor: Double) {
        saldo += valor
    }  // Público para permitir depósitos.

    fun sacar(valor: Double) {
        saldo -= valor
    }  // Público para permitir saques.

    fun obterSaldo(): Double {
        return saldo
    }  // Público, pois permite consulta ao saldo.
}