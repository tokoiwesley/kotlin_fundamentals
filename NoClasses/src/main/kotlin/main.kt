fun main(args: Array<String>) {
    println("Hello, World")
    val q = Question()
//    q = Question()
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
}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }
}