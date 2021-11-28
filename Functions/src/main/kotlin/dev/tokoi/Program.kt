@file:JvmName("DisplayFunctions")

package dev.tokoi

fun main(args: Array<String>) {
    log(loglevel = 2, message = "Hello, World!")
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}