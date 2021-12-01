package dev.tokoi

fun main(args: Array<String>) {
    val wesley = Student("Wesley", "Tokoi", 1)
    val tokoi = Student("Wesley", "Tokoi", 1, "Some tutor")
    print(wesley.id)
}

abstract class Person(var firsName: String, var lastName: String) {
    open fun getName(): String = "$firsName $lastName"
    abstract fun getAddress(): String
}

class Student(firsName: String, lastName: String, _id: Int, tutor: String = "") : Person(firsName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enrole(courseName: String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }
}