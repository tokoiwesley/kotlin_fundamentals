package dev.tokoi

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)
    val greaterThanThree = { v: Int -> v > 3 }

    var largeInts = ints.all(greaterThanThree)

    println(largeInts)

    largeInts = ints.any(greaterThanThree)

    println(largeInts)

    var numberOfLargeInts = ints.count(greaterThanThree)

    println(numberOfLargeInts)

    var found = ints.find(greaterThanThree)
    println(found)
}