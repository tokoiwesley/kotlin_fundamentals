fun main(args: Array<String>) {
    println("Hello, World")
    val q = Question()
//    q = Question()
    q.Answer = "42"
    q.Question = ""
}

class Question {
    var Answer: String = ""
    val Question: String = "What is the answer to life, the universe and everything?"
}