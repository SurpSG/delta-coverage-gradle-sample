package io.github.surpsg.deltacovsample

object BranchesCoverage {

    fun partiallyCovered(args: Array<String>) {
        JavaClass().javaMethod()
        if (args.isEmpty()) {
            println("args is empty")
        } else {
            println("args is not empty")
        }
    }
}

fun main(args: Array<String>) {
    BranchesCoverage.partiallyCovered(args)
}

