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