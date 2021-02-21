package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String=""
    var cpf:String=""

    inner class Endereco{
        var rua:String="Av Tambaqui"
        var numero:Number=999
    }
}


fun main() {
    val p = Pessoa()
    p.nome = "Júlio Sandroni"
    p.cpf = "123.123.123-23"


    println(p.nome)
    println(p.cpf)
    println(p.Endereco().rua)
    println(p.Endereco().numero)
}