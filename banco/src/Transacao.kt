class Transacao(private val idTransacao: String, private val valor: Double, private val data: Date) {
    fun executar(): Boolean {
        // implementação da execução da transação
        return true
    }  // Público para permitir a execução da transação.
}