package io.github.surpsg.deltacovsample

object BranchesCoverage {

    fun partiallyCovered(args: Array<String>) {
        JavaClass().javaMethod()
        println("1") // added line
        if (args.isEmpty()) { // changed line 1
            println("args is empty") // changed line 2
        } else {
            println("args is not empty")
        }
    }
}

fun main(args: Array<String>) {
    BranchesCoverage.partiallyCovered(args)
}

