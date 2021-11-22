import java.lang.NumberFormatException

fun main(args: Array<String>) {

    var numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println(i)
    }
}

class Question {
    var Answer: String? = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> {
                println("You were correct")
            }
            else -> {
                println("Try again")
            }
        }
    }
}