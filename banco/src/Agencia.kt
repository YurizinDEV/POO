internal class Agencia(private val nome: String) {
    // Apenas o banco deve manipulá-la diretamente

    private val contas: MutableList<Conta> = mutableListOf()
    // Lista de contas deve ser privada

    fun adicionarConta(conta: Conta) {
        contas.add(conta)
    }
    // Público para permitir adição de contas

    fun removerConta(conta: Conta) {
        contas.remove(conta)
    }
    // Público para permitir remoção de contas

    fun obterConta(numero: String): Conta? {
        return contas.find { it.numeroConta == numero }
    }
    // Público para permitir consulta de contas
}