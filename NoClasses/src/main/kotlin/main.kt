fun main(args: Array<String>) {
    println("Hello, World")
    val q: Question = Question()
//    q = Question()
    q.Answer = null
    if (q.Answer != null) {
    }
    q.Answer = "42"
//    q.Question = ""
    q.display()

    println("The answer to ${q.Question} is ${q.Answer}")
    val message: String = if (q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again"
    }

    println(message)

    q.printResult()
}

class Question {
    var Answer: String? = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        if (Answer == CorrectAnswer) {
            print("You were correct")
        } else {
            print("Try again")
        }
    }
}