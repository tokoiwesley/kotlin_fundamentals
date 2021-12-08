fun main(args: Array<String>) {
    var names: List<String> = listOf<String>("Wesley", "Alex")

    val name = names.itemAt(0)
    println(name)

    val n: Node<Int> = Node(2)
    println(n.value())
}

fun <T> List<T>.itemAt(ndx: Int): T {
    return this[ndx]
}

class Node<T>(private val item: T) {
    fun value(): T {
        return item
    }
}