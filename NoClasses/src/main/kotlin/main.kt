import java.lang.NumberFormatException

fun main(args: Array<String>) {

    for (i in 1..10) {
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