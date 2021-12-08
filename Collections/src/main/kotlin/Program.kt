fun main(args: Array<String>) {
    var people: List<Person?>? = null

    people = listOf(Person(23), Person(23), null)

    for (person: Person? in people) {
        println(person?.age)
    }
}

class Person(val age: Int) {
}