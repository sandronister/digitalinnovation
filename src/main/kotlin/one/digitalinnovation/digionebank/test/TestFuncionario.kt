package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val funcionario1 = Funcionario("João Silva","123.123.123-99", BigDecimal.valueOf(15000))

    println(funcionario1.nome)
    println(funcionario1.cpf)
    println(funcionario1.salario)
}