package function.whenStatement

fun whenStatement(colorName:String) {
    when(colorName) {
        "Yellow" -> println("The yellow is the color of the happiness")
        "Red", "Carmesi" -> println("The red is the color of the hot")
        else -> println("Error: I do not have information of this color")
    }
}

fun whenWithIntegers(code: Int) {
    when(code) {
        in 200..299-> println("Everything has gone ok")
        in 400..500-> println("Something is wrong 🤯")
        else->println("Code unknown, something was wrong")
    }
}

fun searchSizeShoes(size: Int) {
    val message = when(size) {
        41,43-> "We have the size available"
        42,44-> "Almost we don't have"
        45 -> "Sorry, we don't have available"
        else -> "These shoes only come in 41,42,43,44 and 45"
    }

    println(message)
}