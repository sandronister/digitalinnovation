package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf:String,
    val salario: Double
):Pessoa(nome,cpf){
    abstract fun calculaAuxilio():Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculaAuxilio()}
        """.trimIndent()
    
}