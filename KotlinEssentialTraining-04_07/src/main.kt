fun main(args: Array<String>) {

    /**
     * Just like in Java, an exception in Kotlin is an object
     * that can be thrown when your code encounters a problem.
     * And like in Java, you can use structured exception handling
     * to anticipate and handle expected conditions
     */

    try {
        print("Value 1: ")
        val value1 = readLine()
        val d1 = value1!!.toDouble()
        print("Value 2: ")
        val value2 = readLine()
        val d2 = value2!!.toDouble()

        val sum = d1 + d2
        println("Answer: $sum")
    } catch (e: KotlinNullPointerException) {
        println("Value was null")
    } catch (e: NumberFormatException) {
        print("${e.message} is not a number")
    }
}