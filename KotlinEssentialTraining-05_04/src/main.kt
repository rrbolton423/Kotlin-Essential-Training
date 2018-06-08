fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    // Prints automatic toString() function
    println(item)

    item.price = 15.99
    println(item)
}
