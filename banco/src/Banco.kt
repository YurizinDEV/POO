class Banco(val nome: String) {
    private val agencias: MutableList<Agencia> = mutableListOf()
    // Lista de agências deve ser privada.

    fun adicionarAgencia(agencia: Agencia) {
        agencias.add(agencia)
    }
    // Público para adicionar agências externamente.

    fun removerAgencia(agencia: Agencia) {
        agencias.remove(agencia)
    }
    // Público para permitir remoção de agências.

    fun obterAgencia(nome: String): Agencia? {
        return agencias.find { it.nome == nome }
    }
// Público, pois permite consulta de agências.
}