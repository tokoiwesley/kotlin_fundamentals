package dev.tokoi

fun main(args: Array<String>) {
    val text = "With     multiple \t white spaces"
//    println(text)
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

fun replaceMultipleWhiteSpace(value: String): String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceEx(): String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}