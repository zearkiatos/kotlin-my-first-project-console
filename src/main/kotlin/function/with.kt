package function.with

fun withStatement() {
    val colors = listOf("Blue", "Yellow", "Red")
    with(colors) {
        println("Our colors are $this")
        println("This list has a quantity of colors $size")
    }
}