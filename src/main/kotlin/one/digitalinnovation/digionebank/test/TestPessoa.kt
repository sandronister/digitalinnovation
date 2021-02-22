package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Pessoa


fun main() {
    val p = Pessoa("Julio Sandroni","123.123.123-23")

    println(p.nome)
    println(p.cpf)
}