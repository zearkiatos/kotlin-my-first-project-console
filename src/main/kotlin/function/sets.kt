package function.sets

fun sets() {
    val vowels = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vowels)

    val favoritesNumbers = mutableSetOf(1,2,3,4)
    println(favoritesNumbers)
    favoritesNumbers.add(5)
    favoritesNumbers.add(5)
    println(favoritesNumbers)

    favoritesNumbers.remove(5)
    println(favoritesNumbers)

    val value: Int? = favoritesNumbers.firstOrNull() { number->number>2}
    println(value)
}