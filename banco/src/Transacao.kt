internal class Transacao(private val idTransacao: String, private val valor: Double, private val data: Date) {
    //Faz parte da mecânica interna de Conta/Agência

   fun executar(): Boolean {

        return true
    }
    // Público para permitir a execução da transação
}