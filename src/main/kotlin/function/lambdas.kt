package function.lambdas

fun lambda() {
    val myLambda: (String) -> Int = {
        value -> value.length
    }
    val value = myLambda("Hello world!")
    println(value)

    val greetings = listOf("Hello", "Hola", "Ciao")
    val longOfGreetings = greetings.map(myLambda)
    println(longOfGreetings)
}