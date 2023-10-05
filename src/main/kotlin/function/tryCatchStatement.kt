package function.tryCatchStatement
import java.lang.Exception

fun tryCatchStatement(name:String?) {
    try {
        throw NullPointerException("Null reference")
    }
    catch(exception: NullPointerException) {
        println("Some error occurred")
    }
    finally {
        println("Closing the application")
    }

    val firstValue = 10
    val secondValue = 0
    val result: Int = try {
        firstValue / secondValue
    }
    catch(exception: Exception) {
        0
    }

    println(result)
}