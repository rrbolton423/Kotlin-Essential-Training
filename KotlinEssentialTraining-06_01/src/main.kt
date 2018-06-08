fun main(args: Array<String>) {

    // Create a simple array in Kotlin using built-in
    // functions
    val array1 = arrayOf("Red", "Green", "Blue")

    // Loop through the array and create an element
    // for each item in the array
    for (element in array1) {

        // Print each element
        println(element)
    }

    // Create a mixed-type array
    val mixed = arrayOf("A String", 12)

    for (element in mixed) {
        println(element)
    }

    // Create an array of null values
    val nulls = arrayOfNulls<String>(3)
    for (element in nulls) {
        println(element)
    }

    // Set the null values explicitly
    nulls[0] = "Red"
    nulls[1] = "Blue"
    nulls[2] = "Green"
    for (element in nulls) {
        println(element)
    }

    // Create an Array of Ints
    val intArray = intArrayOf(3, 4, 5)
    for (element in intArray) {
        println(element)
    }

    // Sort an Array containing simple values
    array1.sort()
    for (element in array1) {
        println(element)
    }

    // Sort an Array in descending order
    val array4 = array1.sortedArrayDescending()
    for (element in array4) {
        println(element)
    }
}
