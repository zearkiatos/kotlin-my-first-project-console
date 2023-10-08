package function.functions

fun randomCase(phrase: String) : String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    return if (randomResult.rem(2) == 0) {
        phrase.toUpperCase()
    }
    else {
        phrase.toLowerCase()
    }
}

fun String.extendRandomCase() : String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    return if (randomResult.rem(2) == 0) {
        this.toUpperCase()
    }
    else {
        this.toLowerCase()
    }
}

fun printPhrase(phrase: String) : Unit {
    println("Your phrase is: $phrase")
}