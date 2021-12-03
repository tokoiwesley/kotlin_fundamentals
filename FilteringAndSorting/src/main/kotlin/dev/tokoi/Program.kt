package dev.tokoi

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 4 }

    for (i: Int in smallInts) println(i)

    var squaredInts = ints.map { it * it }

    for (i: Int in squaredInts) println(i)
}
