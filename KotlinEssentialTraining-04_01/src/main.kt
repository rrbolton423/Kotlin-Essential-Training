fun main(args: Array<String>) {
    val num1 = 4.0
    val num2 = 3.5

    // You can assign param names to arguments passed into
    // Kotlin methods
    val result = addValues(param2 = num2, param1 = num1)
    println("the result is $result")

    val result2 = calcValues(num1, num2, "-")
    println("Result 2 is $result2")

    // I can pass in a series of values in a comma delimited String
    changeSomething(5.0)

    val sum: Int = addValues(1, 3, 5, 7)
    println("Sum=$sum")
}

fun addValues(param1: Double, param2: Double): Double {
    return param1 + param2
}

// Can provide default param in Kotlin method if none is provided
fun calcValues(param1: Double, param2: Double, op: String = "+"): Double {

    if (op.equals("+")) {
        return param1 + param2
    } else if (op.equals("-")) {
        return param1 - param2
    } else {
        return -1.0
    }

}

// Parameters in Kotlin are always immutable, they
// cannot be changed
fun changeSomething(param: Double) {
//    param ++
    var copy = param
    copy++
    println("Copy is $copy")
}

// You can create functions that receive variable
// numbers of arguments as long as they're all the same type
// The vararg keyword makes this happen
fun addValues(vararg numbers: Int): Int {
    var result = 0

    // Loop through the array of numbers
    // Create a variable named i each time
    // through the loop
    for (i in numbers) {
        result += i
    }
    return result
}

