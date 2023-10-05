package function.cycles

fun forStatement(fruitsList:List<String>) {
    for (fruit in fruitsList)
        println("I will eat $fruit today")

    fruitsList.forEach {
        fruit -> println("I will eat a new $fruit today")
    }

    val fruitsCountCharacters: List<Int> = fruitsList.map {
        fruit -> fruit.length
    }
    println(fruitsCountCharacters)

    val listFiltered = fruitsCountCharacters.filter {characterQuantity->characterQuantity > 5}
    println(listFiltered)
}