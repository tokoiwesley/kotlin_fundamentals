@file:JvmName("DisplayFunctions")

package dev.tokoi

fun main(args: Array<String>) {
    log("Hello, World!", 2)
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}