// Top level variable available to functions within
// this code file
val myName = "David"

fun main(args: Array<String>) {

    // val is immutable, value cannot be changed
    // var is mutable, value can be changed
    // Kotlin is inferring the type from the literal value
    // If you want to explicitly declare a type you can
    var num1 = 45.0
    println("The initial value of num1 is $num1")
    num1 ++
    println("The new value of num1 is $num1")

    val num2:Double = 5.toDouble()
    println("The value of num2 is $num2")

    println("My name is $myName")
}