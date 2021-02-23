package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Analista


fun main() {
    val joao = Analista("João Silva","123.123.123-99",9400.00 )
    ImprimeRelatorioFuncionario.exec(joao)
}

