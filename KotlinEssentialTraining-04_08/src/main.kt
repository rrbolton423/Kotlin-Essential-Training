fun main(args: Array<String>) {

    try {

        print("Number 1: ")
        val number1 = readLine()
        val d1 = number1!!.toDouble()

        print("Number 2: ")
        val number2 = readLine()
        val d2 = number2!!.toDouble()

        print("Operation: (+,-,*,/)")
        val operation: String? = readLine()

        val answer = doMath(d1, d2, operation)

        println("Answer: $answer")

    } catch (e: KotlinNullPointerException) {
        println("Value was null")
    } catch (e: NumberFormatException) {
        print("${e.message} is not a number")
    } catch (e: Exception) {
        print("${e.message}")
    }

}

fun doMath(d1: Double, d2: Double, operation: String?): Double {

    val result: Double = when (operation) {
        "+" -> add(d1, d2)
        "-" -> subtract(d1, d2)
        "*" -> multiply(d1, d2)
        "/" -> divide(d1, d2)
        else -> throw Exception("Enter a valid operation (+,-,*,/)")
    }

    return result
}

fun add(d1: Double, d2: Double): Double = d1 + d2

fun subtract(d1: Double, d2: Double): Double = d1 - d2

fun multiply(d1: Double, d2: Double): Double = d1 * d2

fun divide(d1: Double, d2: Double): Double = d1 / d2
