fun main(args: Array<String>) {
    val colors = arrayOf("Red", "Green", "Blue")
    val values = intArrayOf(1, 3, 5, 7, 9)

    printHeader("For each loop")
    for (color in colors) {
        println(color)
    }
    for (value in values) {
        println(value)
    }

    printHeader("For loop with indices")
    // indices returns the index of an item in the array
    // step controls the counter variable incrementation
    for (i in values.indices step 2){
        println(values[i])
    }
    // until = keep on iterating just before the max value
    for (i in 0 until colors.size) {
        println(colors[i])
    }
}

fun printHeader(label: String) {
    println("***************")
    println(label)
    println("***************")
}