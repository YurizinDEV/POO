class Pessoa(val nome: String, val idade: Int) {
    fun apresentar() {
        if (idade < 0)
            println("Idade inválida!")
        else
        println("Olá, meu nome é $nome e eu tenho $idade anos de idade.")
    }
}