package function.applyScopeFunction

fun applyFunction() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Raomi", "Xiaomi m1 a3")
        .apply{
            removeIf { movil -> movil.contains("Google") }
        }

    println(mobiles)
    
    val colors: MutableList<String>? = mutableListOf("Yellow", "Blue", "Red")
    colors?.apply{
        println("Our colors are $this")
        println("The quantity of colors is $size")
    }
}