fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    println(words.filter { it.startsWith("a") })
    println(words.filter { it.startsWith("b") })
    println(words.filter { it.startsWith("a") }.shuffled())
    println(words.filter { it.startsWith("b") }.shuffled())

    println(words.filter { it.startsWith("a") }
        .shuffled()
        .take(2))
    println(words.filter { it.startsWith("b") }
        .shuffled()
        .take(2))

    println(words.filter { it.startsWith("a") }
        .shuffled()
        .take(2)
        .sorted())
    println(words.filter { it.startsWith("b") }
        .shuffled()
        .take(2)
        .sorted())
}