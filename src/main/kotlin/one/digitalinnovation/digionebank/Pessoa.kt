package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String=""

    var cpf:String="999.999.99-99"
    private set

}


fun main() {
    val p = Pessoa()
    p.nome = "Júlio Sandroni"


    println(p.nome)
    println(p.cpf)
}