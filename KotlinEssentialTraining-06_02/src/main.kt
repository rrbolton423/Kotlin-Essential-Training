fun main(args: Array<String>) {

    // Create a immutable list using Kotlin's built in functions
    val colorList = listOf("Red", "Green", "Blue")
    println(colorList)

    // Find out the number of items in the list
    println("Number of colors: ${colorList.size}")

    // Find out concrete class
    println(colorList::class.simpleName)

    // If you want to be able to add or remove items from the list
    // at runtime, you need to make is a mutable list
    val colorList2 = mutableListOf<String>()
    colorList2.add("Red")
    colorList2.add("Green")
    colorList2.add("Blue")

    // Because it's a mutable list, it's resizable. But
    // because it is a list, the items will be kept in the
    // same order in which I declared them
    println(colorList2)

    // Sort a list in ascending order by default
    colorList2.sort()
    println(colorList2)

    // Sort a list in descending order by default
    val sortedList = colorList2.sortedDescending()
    println(sortedList)

    // Remove items from a list using the removeAt() function,
    // and passing an index of the list
    colorList2.removeAt(0)
    println(colorList2)

    // Remove items from a list using the remove() function,
    // and passing an element that matches an item from the list
    colorList2.remove("Red")
    println(colorList2)
}
