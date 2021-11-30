package dev.tokoi

fun main(args: Array<String>) {
    val wesley = Student(1)
    print(wesley.id)
}

abstract class Person {
    var firsName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firsName $lastName"
    abstract fun getAddress(): String
}

class Student(_id: Int) : Person() {
    val id: Int

    init {
        id = _id
    }
    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }
}