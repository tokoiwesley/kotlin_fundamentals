package dev.tokoi

open class Person {
    var firsName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firsName $lastName"
}

class Student() : Person() {
    override fun getName(): String {
        return ""
    }
}