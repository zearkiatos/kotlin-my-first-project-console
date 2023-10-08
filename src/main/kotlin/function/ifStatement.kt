package function.ifStatement

fun ifStatement(name:String) {
    if (name.isNotEmpty())
        println("The length of the variable name is ${name.length}")
    else
        println("Error, the variable is empty")


    val message: String = if (name.length > 4) {
        "Your name is long"
    }
    else if (name.isEmpty()) {
        "The name is empty"
    } else {
       "you have a short name"
    }

    println(message)
} 