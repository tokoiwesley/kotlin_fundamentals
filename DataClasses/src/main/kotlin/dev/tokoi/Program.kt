package dev.tokoi

fun main(args: Array<String>) {
    var wesley = Student(1, "Wesley")
    var tokoi = Student(1, "Wesley")

    println(wesley)

    if (wesley == tokoi) {
        println("Equal")
    } else {
        println("Not equal")
    }

    var newWesley = wesley.copy(name = "Robert")
    println(newWesley)
}

data class Student(val id: Int, val name: String)