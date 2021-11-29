package dev.tokoi

abstract class Person {
    var firsName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firsName $lastName"
    abstract fun getAddress(): String
}

class Student() : Person() {
    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }
}