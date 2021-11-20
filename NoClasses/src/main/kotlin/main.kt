fun main(args: Array<String>) {
    println("Hello, World")
    val q = Question()
//    q = Question()
    q.Answer = "42"
//    q.Question = ""
    q.display()

    println("The answer to ${q.Question} is ${q.Answer}")
    
    if (q.Answer == q.CorrectAnswer) {
        println("You were correct")
    } else {
        println("Try again")
    }
}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }
}