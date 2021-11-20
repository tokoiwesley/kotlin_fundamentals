fun main(args: Array<String>) {
    println("Hello, World")
    val q = Question()
//    q = Question()
    q.Answer = "42"
//    q.Question = ""
    q.display()

    println("The answer to ${q.Question} is ${q.Answer}")
}

class Question {
    var Answer: String = ""
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }
}