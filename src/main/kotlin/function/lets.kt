package function.lets

fun tryLet() {
    var name: String? = null
    name?.let {
        value -> println("The name is not null, is $value")
    }

    name = "Capriles"

    name?.let {
        value -> println("The name is not null, is $value")
    }


}