package dev.tokoi

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    var largeInts = ints.all { it > 6 }

    println(largeInts)

    largeInts = ints.any { it > 3 }

    println(largeInts)
}