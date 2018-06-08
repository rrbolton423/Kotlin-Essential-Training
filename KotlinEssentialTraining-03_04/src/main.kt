fun main(args: Array<String>) {

    // You can compare numeric values to each other
    // using operators or functions that are members of the
    // built-in types
    val num1 = 10
    val num2 = 15

    // This returns a true or false value,
    // and is more efficient
    val match = (num1 == num2)
    println("Match = $match")

    // This returns a true or false value
    // and is less efficient
    val match2 = num1.equals(num2)
    println("Match = $match2")

    // Compare something and get back a variety
    // of results. For that purpose you can use
    // the compareTo() function. It returns zero
    // if the value is a match, a positive value
    // or negative value if the value is greater
    // than or less than the value being compared to
    println("Comparison result = ${num1.compareTo(num2)}")


}