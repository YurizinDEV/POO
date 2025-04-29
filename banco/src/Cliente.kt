public class Cliente(private val nome: String, private var endereco: String, val idCliente: String) {
    // Precisa ser acessível

    fun obterNome(): String {
        return nome
    }
    // Público para permitir acesso ao nome do cliente

    fun definirEndereco(endereco: String) {
        this.endereco = endereco
    }
    // Público para definir um novo endereço
}