package function.highOrderFunction

fun superFunction(initialValue:String, block: (String)->Int): Int {
    return block(initialValue)
}

fun functionInception(name: String, ): () -> String {
    return {
        "Hello front the lambda $name"
    }
}