package function.maps

fun maps() {
    val superHeroesAges = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(superHeroesAges)

    val superHeroesAgesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Captain America" to 99
    )
    println(superHeroesAgesMutable)
    superHeroesAgesMutable.put("Wolverine", 45)
    println(superHeroesAgesMutable)
    superHeroesAgesMutable["Storm"] = 30
    println(superHeroesAgesMutable)

    val ironmanAge = superHeroesAgesMutable["Ironman"]
    println(ironmanAge)

    // Remove element from map
    superHeroesAgesMutable.remove("Wolverine")
    println(superHeroesAgesMutable)

    println(superHeroesAgesMutable.keys)
    println(superHeroesAgesMutable.values)
}