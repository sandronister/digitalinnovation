package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object{
        fun exec(funcionario:Funcionario) = println(funcionario.toString())
    }
}