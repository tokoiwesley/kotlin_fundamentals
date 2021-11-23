import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {

    var numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Wesley"] = 31
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
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