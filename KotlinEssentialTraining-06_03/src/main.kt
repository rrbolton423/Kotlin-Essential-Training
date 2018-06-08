import model.ClothingItem

fun main(args: Array<String>) {

    // A set is an unordered collection of data where each
    // item is unique. To create a set in Kotlin, use one
    // of the variations of the setOf() function. As with lists,
    // you can choose either mutable or immutable sets.

    var colorSet = mutableSetOf("Red", "Green", "Blue")
    println(colorSet)

    colorSet.add("Purple")
    colorSet.remove("Green")

    // In a set, you can't remove items by the index because
    // the order of items isn't guaranteed. The set interface
    // doesn't have a removeAt() function.

    // If you want to work with the set's data as an ordered collection,
    // you can create a list that gets it's items from the set.
    var colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    println(colorList)
    colorSet.add("Purple")
    println(colorSet)

    // Create a new mutable set from the list,
    // deleting any duplicates
    val newSet = colorList.toMutableSet()
    println(newSet)

    // Set guarantees uniqueness, even with Objects
    // in a set. Sets ensure that you don't have any duplicate
    // items in the collection.
    val itemSet = mutableSetOf<ClothingItem>()
    itemSet.add(ClothingItem("Shirt", "XL", 14.99))
    itemSet.add(ClothingItem("Shirt", "M", 14.99))
    println(itemSet)

}
