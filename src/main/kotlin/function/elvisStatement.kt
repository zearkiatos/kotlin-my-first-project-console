package function.elvisStatement

fun elvisStatement(name:String?) {
    val charactersName: Int = name?.length ?: 0
    println(charactersName)
}