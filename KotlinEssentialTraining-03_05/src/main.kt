fun main(args: Array<String>) {
    var num1 = 15
    val num2 = 10

    /**
     * You can execute standard mathematical operations
     * in Kotlin using either conventional operators, or
     * in some cases you can use functions that are implemented
     * in each of the built-in number types
     */
    val sum = num1 + num2
    println("sum=$sum")

    val sum2 = num1.plus(num2)
    println("sum2=$sum2")

    val diff = num1 - num2
    println("diff=$diff")

    num1 ++
    println("num1=$num1")

    val num3 = num1.inc()
    println("num3=$num3")

    println("The value of n1 is ${++num1}")
    println("num1=$num1")
}