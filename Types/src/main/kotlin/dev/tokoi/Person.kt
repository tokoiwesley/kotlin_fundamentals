package dev.tokoi

fun main(args: Array<String>) {
    val wesley = Student("Wesley", "Tokoi", 1)
    print(wesley.id)

}

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val wesley = Student("Wesley", "Tokoi", 1)
            print(wesley.id)
        }
    }
}

abstract class Person(var firsName: String, var lastName: String) {
    open fun getName(): String = "$firsName $lastName"
    abstract fun getAddress(): String
}

open class Student(firsName: String, lastName: String, _id: Int, tutor: String = "") : Person(firsName, lastName) {
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

    companion object : XmlSerializer<Student> {
        fun createUndergraduate(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgraduate(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {

        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1) {}

class Postgraduate(firsName: String) : Student(firsName, "", 1)

interface XmlSerializer<T> {
    fun toXml(item: T)
}