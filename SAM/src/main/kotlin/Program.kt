fun main(args: Array<String>) {
    var user = User("Wesley")

    var count = 0

    user.create { println("User $it has been created: ${++count} times") }

    user.create { println("User $it has been created: ${++count} times") }
}