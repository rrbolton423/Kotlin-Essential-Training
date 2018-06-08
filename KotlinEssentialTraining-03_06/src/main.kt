import kotlin.math.*

//import java.lang.Math.abs
//import java.lang.Math.round

fun main(args: Array<String>) {
    val num1 = 15
    val num2 = 10

    val sum = num1.plus(num2)
    println("sum=$sum")

    val difference = num1.minus(num2)
    println("difference=$difference")

    val product = num1.times(num2)
    println("product=$product")

    val quotient:Double = num1.toDouble().div(num2)
    println("quotient=$quotient")

    val remainder = num1.rem(num2)
    println("remainder=$remainder")

    /**
     * In addition to the math functions that are implemented
     * in the built-in number classes, you also have access to
     * many functions and constants that are inherited from Java's
     * "Math" class.
     */

    val neg = -152.5
    val absolute = abs(neg)
    println("absolute=$absolute")
    println("rounded=${round(absolute)}")

    println("Have a piece of $PI")
}