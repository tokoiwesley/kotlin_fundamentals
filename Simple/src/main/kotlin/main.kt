import dev.tokoi.Person

fun main(args: Array<String>) {
    println("Hello, World")

    val wesley = Person("Wesley")

    println("Name is ${wesley.Name}")

    wesley.Name = "Steve"

    println("Name is ${wesley.Name}")

    wesley.display()
}