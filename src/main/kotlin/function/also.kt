package function.alsoScopeFunction

fun alsoFunction() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Raomi", "Xiaomi m1 a3")
        .also {
            list -> println("The original value is $list")
        }
        .asReversed()

    println(mobiles)
}