package function.lists

fun lists() {
    val namesList = listOf<String>("Juan", "Enrique", "Camila")
    println(namesList)

    // Mutable list
    val emptyList = mutableListOf<String>()
    println(emptyList)
    emptyList.add("Juan")
    println(emptyList)

    // get a value
    val name = emptyList.get(0)
    println(name)

    // index
    val valueIndexed = emptyList[0]
    println(valueIndexed)

    // first value
    val firstValue = namesList.first()
    println(firstValue)

    // first or null value
    val firsOrNullValue: String? = namesList.firstOrNull()
    println(firsOrNullValue)

    // Remove element
    emptyList.removeAt(0)
    println(emptyList)
    
    // Remove if
    emptyList.add("Enrique")
    emptyList.add("Joe")
    emptyList.removeIf { element->element.length > 3 }
    println(emptyList)

    // Arrays
    val myArray = arrayOf(1,2,3,4)
    println(myArray)
    println("Array as list ${myArray.toList()}")
}

fun orderFunction() {
    val randomNumbers = listOf(11,22,43,56,78,66)
    println(randomNumbers)
    val randomNumbersSorted = randomNumbers.sorted()
    println(randomNumbersSorted)

    val randomNumbersDesc = randomNumbersSorted.sortedDescending()
    println(randomNumbersDesc)

    // order by condition
    val orderByCondition = randomNumbers.sortedBy { number -> number < 50 }
    println(orderByCondition)

    val randomSorted = randomNumbers.shuffled()
    println(randomSorted)

    val numbersInReverse = randomNumbers.reversed()
    println(numbersInReverse)

    // use map
    val messagenumbers = randomNumbers.map{number->"Your number is $number"}
    println(messagenumbers)

    // filter function
    val numberFiltered = randomNumbers.filter{number-> number>50}
    println(numberFiltered)

}