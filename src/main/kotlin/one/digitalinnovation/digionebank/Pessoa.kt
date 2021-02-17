package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String=""
    var cpf:String=""
}


fun main() {
    val p = Pessoa()
    p.nome = "Júlio Sandroni"
    p.cpf = "123.123.123-23"

    println(p.nome)
    println(p.cpf)
}