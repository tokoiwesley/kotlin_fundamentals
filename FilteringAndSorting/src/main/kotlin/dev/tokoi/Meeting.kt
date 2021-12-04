package dev.tokoi

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Wes"), Person("Alex"))
}

data class Person(val name: String) {}