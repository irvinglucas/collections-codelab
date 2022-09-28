fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   $numbers")
    println("sorted: ${numbers.sorted()}")
    println("set: ${numbers.toSet()}")

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2 -> ${set1 == set2}")

    val peopleAges = mutableMapOf(
        "Fred" to 30,
        "Ann" to 23
    )

    println(peopleAges)

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)


}