package function.runFunction

fun runFunction() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Raomi", "Xiaomi m1 a3")
    .run{
        removeIf { movil -> movil.contains("Google") }
        this
    }

    println(mobiles)
}