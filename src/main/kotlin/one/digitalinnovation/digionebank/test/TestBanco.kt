package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digioneBank = Banco("DigiOneBank",27)

    println(digioneBank.nome)
    println(digioneBank.numero)

    val banco2 = digioneBank.copy("Banco2",9)

    println(banco2.nome)
    println(banco2.numero)

    println(digioneBank.info())
    println(banco2.info())
}