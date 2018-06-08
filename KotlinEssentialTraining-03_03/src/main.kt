fun main(args: Array<String>) {

    val myInt = 42

    // Kotlin doesn't do automatic conversion
    // of numeric types like Java. Use the Classes
    // built-in functions to convert
    val myLong: Long = myInt.toLong()

    // You can find out the type of the variable using
    // an expression that relies on reflection. Reflection
    // looks as an object and determines dynamically what its
    // type is
    println("the type of myLong is ${myLong::class.qualifiedName}")

    val myLong2 = 42.9
    var myInt2 = myLong2.toInt()
    println("the value of myLong2 is $myLong2")
    println("the value of myInt2 is $myInt2")

    val myInt3 = 568
    val myDouble3 = myInt3.toDouble()
    println("the value of myDouble3 is $myDouble3")
}