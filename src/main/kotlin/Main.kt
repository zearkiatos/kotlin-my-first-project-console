import function.ifStatement.ifStatement
import function.whenStatement.*
import function.whileDoWhile.whileDoWhile
import function.cycles.forStatement

const val PI:Double = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    var money:Int = 10
    println(money)
    money = 5
    println(money)
    val name = "Maria"
    println(name)
    println(PI)

    val boolean: Boolean = true
    val longNumber: Long = 3L
    val double: Double = 2.7182
    val float: Float = 1.1f

    val firstValue = 20
    val secondValue = 10
    val thirdValue = firstValue.minus(secondValue)
    val forthValue = firstValue - secondValue

    println(thirdValue)
    println(forthValue)

    val lastname = "Capriles"
    val myName = "Pedro"
    val fullName = "$myName $lastname"
    println(fullName)
    ifStatement("Maria")
    ifStatement("")
    ifStatement("Pepe")
    whenStatement("Yellow")
    whenStatement("Green")
    whenStatement("Carmesi")

    whenWithIntegers(200)
    whenWithIntegers(501)
    whenWithIntegers(404)
    searchSizeShoes(41)
    searchSizeShoes(45)
    whileDoWhile(10)
    val fruitsList = listOf("Apple", "Pear", "Raspberry", "Peach")
    forStatement(fruitsList)
}