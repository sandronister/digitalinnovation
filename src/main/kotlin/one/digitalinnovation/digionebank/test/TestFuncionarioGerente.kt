package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo","234.234.234-29",15000.00)
    ImprimeRelatorioFuncionario.exec(maria)
}