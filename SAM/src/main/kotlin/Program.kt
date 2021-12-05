fun main(args: Array<String>) {
    var user = User("Wesley")

    var count = 0

    var eventListener = Created({ u: User -> println("User $u has been created: ${++count} times") })

    user.create(eventListener)

    user.create { println("User $it has been created: ${++count} times") }
}