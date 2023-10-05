package function.whileDoWhile

fun whileDoWhile(counter:Int) {
    var count = counter
    while (count > 0) {
        println("The counter value is $count")
        count--
    }

    do {
        println("Genering a random number...")
        val randomNumber = (0..100).random()
        println("The generated number is $randomNumber")
    }
    while(randomNumber<50)
}