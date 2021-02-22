package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.ClienteTipoEnum

fun main() {
    ClienteTipoEnum.values().forEach { el->
        println("${el.name}  - ${el.description}")
    }

    ClienteTipoEnum.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pf = ClienteTipoEnum.PF
    val pj = ClienteTipoEnum.PJ

    println(">> ${pf.name} - ${pf.description}")
    println(">> ${pj.name} - ${pj.description}")
}